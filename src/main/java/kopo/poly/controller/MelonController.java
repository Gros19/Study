package kopo.poly.controller;

import kopo.poly.dto.MelonDTO;
import kopo.poly.service.IMeloneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class MelonController {

    @Resource(name = "MelonService")
    private IMeloneService meloneService;

    /*
    * 멜론 노래 리스트 저장하기*/
    @GetMapping(value = "melon/collectMelonSong")
    private String collectMelonRank() throws Exception{
        log.info(this.getClass().getName() + ".collectMelonSong Start!");

        //수집 결과 출력
        String msg;

        int res = meloneService.collectionMelonSong();

        if(res ==1){
            msg = "success";
        }else {
            msg = "falt";
        }

        log.info(this.getClass().getName() + ".collectMelonSong Start!");
        return msg;
    }

  /*
  오늘 수집된 멜론 노래리스트 가져오기
  */
    @GetMapping(value="melon/getSongList")
    public List<MelonDTO> getSongList() throws Exception{
        log.info(this.getClass().getName() + ".getSongList Start!");
        List<MelonDTO> rList = meloneService.getSongList();
        log.info(this.getClass().getName() + ".getSongList End!");
        return rList;
    }

    /*가수별 수집된 노래의 수 가져오기
    * */
    @GetMapping(value = "melon/getSingerSongCnt")
    public List<MelonDTO> getSingerSongCnt() throws Exception{
        log.info(this.getClass().getName() + ".getSingerSongCnt Start!");

        List<MelonDTO> rList = meloneService.getSingerSongCnt();

        log.info(this.getClass().getName() + ".getSongList Start!");

        return rList;
    }


    /*
    * 가수별 수집된 노래의 수 가져오기
    * */
    @GetMapping(value = "melon/getSingerSong")
    public List<MelonDTO> getSingerSong() throws Exception{
        log.info(this.getClass().getName() + ".getSingerSong Start");
        List<MelonDTO> rList = meloneService.getSingerSong();
        log.info(this.getClass().getName() + ".getSingerSong End");
        return rList;
    }

    /*
    * 멜론 노래 리스트 저장하기
    * */
    @GetMapping(value = "melon/collectMelonSongMany")
    public String collectMelonSongMany() throws Exception{
        log.info(this.getClass().getName() + ".collectMelonSongMany Start!");

        //수집 결과 출력
        String msg;

        int res = meloneService.collectMelonSongMany();

        if(res == 1){
            msg = "success";
        }else {
            msg = "fail";
        }
        log.info(this.getClass().getName() + ".collectMelonSongMany end!");
        return msg;
    }
}
