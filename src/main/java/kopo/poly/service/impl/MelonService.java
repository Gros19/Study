package kopo.poly.service.impl;

import kopo.poly.dto.MelonDTO;
import kopo.poly.persistance.mapper.mongodb.IMelonMapper;
import kopo.poly.service.IMeloneService;
import kopo.poly.util.CmmUtil;
import kopo.poly.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@Slf4j
@Service("MelonService")
public class MelonService implements IMeloneService {

    @Resource(name = "MelonMapper")
    private IMelonMapper meloneMapper; //MongoDB에 저장할 Mapper
    @Override
    public int collectionMelonSong() throws Exception {

        //로그 찍기(추후 찍은 로그를 통해 이 함수에 접근했는지 파악하기 용이하다.)
        log.info(this.getClass().getName() + ".collectionMelonRank Start!");

        int res = 0;
        List<MelonDTO> pList = new LinkedList<>();

        //멜론 Top100 중 50위까지 정보 가져오는 페이지
        String url = "https://www.melon.com/chart/index.htm";

        //JSOUP 라이브러리를 통해 사이트 접속되면, 그 사이트의 전체 HTML 소스 저장할 변수

        try {
            log.info("111111111111111111111111");
            String headers = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36";
            Document doc = Jsoup.connect(url).get();
            log.info("222222222222222222222222");
            Elements element = doc.select("div.service_list_song");
            log.info("333333333333333333333333");
            //멜론 100위까지 차트
            for(Element songInfo: element.select("div.wrap_song_info")){

                //크롤링을 통해 데이터 저장하기
                String song = CmmUtil.nvl(songInfo.select("div.ellipsis.rank01 a").text());
                String singer = CmmUtil.nvl(songInfo.select("div.ellipsis.rank02 a").eq(0).text());

                log.info("song : " + song);
                log.info("singer : " + singer);

                //가수와 노래 정보가 모두 수집되었으면 저장함
                if((song.length() > 0) && (singer.length() >0)){
                    MelonDTO pDTO = new MelonDTO();
                    pDTO.setCollectTime(DateUtil.getDateTime("yyyyMMddhhmmss"));
                    pDTO.setSong(song);
                    pDTO.setSinger(singer);

                    //한번에 여러개의 데이터를 MongoDB에 저장할 List 형태의 데이터 저장하기
                    pList.add(pDTO);

                }
            }

            //생성할 컬렉션명
            String colNm = "MELON_" + DateUtil.getDateTime("yyyyMMdd");

            // MongoDB에 데이터 저장하기
            res = meloneMapper.insertSong(pList,colNm);

        } catch (IOException e) {
            e.printStackTrace();
        }


        log.info(this.getClass().getName() + ".collectionMelonRank End!");
        return res;
    }

    @Override
    public List<MelonDTO> getSongList() throws Exception {

        log.info(this.getClass().getName() + ".getSongList Start!");

        // MongDB에 저장될 컬렉션 이름
        String colNm = "MELON_" + DateUtil.getDateTime("yyyyMMdd");

        List<MelonDTO> rList = new LinkedList<>();

        rList = meloneMapper.getSongList(colNm);

        if(rList == null){
            rList = new LinkedList<>();
        }

        log.info(this.getClass().getName() + ".getSongList End!");
        return rList;
    }

    @Override
    public List<MelonDTO> getSingerSongCnt() throws Exception {

        log.info(this.getClass().getName() + ".getStringSongCnt Start!");

        String colNm = "MELON_" + DateUtil.getDateTime("yyyyMMdd");

        List<MelonDTO> rList = meloneMapper.getStringSongCnt(colNm);

        if(rList == null){
            rList = new LinkedList<>();
        }

        log.info(this.getClass().getName() + ".getStringSongCnt End!");
        return rList;
    }

    @Override
    public List<MelonDTO> getSingerSong() throws Exception {
        log.info(this.getClass().getName() + ".getSingerSong Start!");

        //mongoDB에 저장된 컬렉션 이름
        String colNm = "MELON_" + DateUtil.getDateTime("yyyyMMdd");

        //수집된 데이터로부터 검색할 가수명
        String singer = "방탄소년단";

        //결과값
        List<MelonDTO> rList;

        //Melon 노래 수집하기
        if (this.collectionMelonSong()==1){
            rList = meloneMapper.getSingerSong(colNm, singer);
            if(rList == null){
                rList = new LinkedList<>();
            }
        }else {
            rList = new LinkedList<>();
        }

        log.info(this.getClass().getName() + ".getSingerSong End!");
        return rList;
    }

    /*
    * 멜론 노래 리스트 한번에 저장하기
    * */
    @Override
    public int collectMelonSongMany() throws Exception {
        log.info(this.getClass().getName() + ".collectMelonSongMany Start!");

        int res = 0;

        List<MelonDTO> pList = new LinkedList<>();

        //멜론 Top100 중 100위까지 정보 가져오는 페이지지
        String url = "https://www.melon.com/chart/index.htm";

        //JSOUP 라이브러리를 통해 사이트 접속되면, 그 사이트의 전체 HTML소스 저장할 변수
        Document doc = Jsoup.connect(url).get();

        //<div class="service_list_song"> 이 태그 내에서 있는 HTML소스만 element에 저장
        Elements elements = doc.select("div.service_list_song");


        log.info("여기가 맛집인가?");
        //Iterator을 사용하여 멜론차트 정보 가져오기
        //멜론 100위까지 차트
        for (Element songInfo :elements.select("div.wrap_song_info")){

            //크롤링을 통해 데이터 저장하기
            String song = CmmUtil.nvl(songInfo.select("div.ellipsis.rank01 a").text());
            String singer = CmmUtil.nvl(songInfo.select("div.ellipsis.rank02 a").eq(0).text());

            log.info("song :" + song);
            log.info("singer :" + singer);

            //가수와 노래 정보가 모두 수집되었다면, 저장함
            if((song.length() > 0) && (singer.length() > 0)){
                MelonDTO pDTO = new MelonDTO();
                pDTO.setCollectTime(DateUtil.getDateTime("yyyyMMddhhmmss"));
                pDTO.setSong(song);
                pDTO.setSinger(singer);

                //한번에 여러개의 데이터를 MongoDB에 저장할 List 형태의 데이터 저장하기
                pList.add(pDTO);
            }
        }
        //생성할 컬렉션명
        String colNm = "MELON_" + DateUtil.getDateTime("yyyyMMdd");

        //MongoDB에 데이터 저장하기
        res = meloneMapper.insertSongMany(pList, colNm);

        log.info(this.getClass().getName() + ".collectMelonSongMany End!");

        return res;
    }
}
