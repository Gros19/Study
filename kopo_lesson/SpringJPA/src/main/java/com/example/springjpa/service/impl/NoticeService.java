package com.example.springjpa.service.impl;

import com.example.springjpa.dto.NoticeDTO;
import com.example.springjpa.repository.NoticeRepository;
import com.example.springjpa.repository.entity.NoticeEntity;
import com.example.springjpa.service.INoticeService;
import com.example.springjpa.util.CmmUtil;
import com.example.springjpa.util.DateUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Slf4j
@RequiredArgsConstructor //생성자를 자동 생성
@Service("NoticeService")
public class NoticeService implements INoticeService {

    /*noticeRepository 변수에 NoticeRepository 객체를 넣어줌
     * autowired 어노테이션 대신*/
    private final NoticeRepository noticeRepository;

    /**
     * 공지사항 전체 가져오기
     */
    @Override
    public List<NoticeDTO> getNoticeList() {


        log.info(this.getClass().getName() + " getNoticeList:start");

        /*공지사항 전체 리스트 조회하기*/
        List<NoticeEntity> rList = noticeRepository.findAllByOrderByNoticeSeqDesc();

        /*엔티티의 값들을 DTO에 맞게 넣어주기*/
        List<NoticeDTO> dList = new ObjectMapper().convertValue(rList,
                new TypeReference<List<NoticeDTO>>() {
                });


        log.info(this.getClass().getName() + " getNoticeList:end");
        return dList;
    }

    /**
     * @param pDTO 공지사항 상세 가져오기 위한 정보
     * @param type 조회수 증가여부(true: 증가, false: 증가 안함
     */
    @Transactional
    @Override
    public NoticeDTO getNoticeInfo(NoticeDTO pDTO, boolean type) throws Exception {

        log.info(this.getClass().getName() + " getNoticeInfo:start");
        if (type) {
            /*조회수 증가하기*/
            int res = noticeRepository.updateReadCnt(pDTO.getNoticeSeq());
            /*조회수 증가 성공여부 체크*/
            log.info("res: " + res);
        }

        /*공지사항 상세내역 가져오기*/
        NoticeEntity rEntity = noticeRepository.findByNoticeSeq(pDTO.getNoticeSeq());

        /*엔티티의 값들을 DTO에 맞게 넣어주기*/
        NoticeDTO rDTO = new ObjectMapper().convertValue(rEntity, NoticeDTO.class);

        log.info(this.getClass().getName() + " getNoticeInfo:end");
        return rDTO;
    }

    /**
     * @param pDTO 공지사항 수정을 위한 정보
     */
    @Transactional
    @Override
    public void updateNoticeInfo(NoticeDTO pDTO) throws Exception {


        log.info(this.getClass().getName() + "updateNoticeInfo :start");

        Long noticeSeq = pDTO.getNoticeSeq();
        String title = CmmUtil.nvl(pDTO.getTitle());
        String noticeYn = CmmUtil.nvl(pDTO.getNoticeYn());
        String contents = CmmUtil.nvl(pDTO.getContents());
        String userId = CmmUtil.nvl(pDTO.getUserId());

        log.info(this.getClass().getName() + "updateNoticeInfo noticeSeq = " + noticeSeq);

        log.info(this.getClass().getName() + "updateNoticeInfo title = " + title);

        log.info(this.getClass().getName() + "updateNoticeInfo noticeYn = " + noticeYn);

        log.info(this.getClass().getName() + "updateNoticeInfo contents = " + contents);

        log.info(this.getClass().getName() + "updateNoticeInfo userId = " + userId);

        /*현재 공지사항 조회수 가져오기*/
        NoticeEntity rEntity = noticeRepository.findByNoticeSeq(noticeSeq);

        /*수정할 값들을 빌더를 통해 엔티티에 저장하기*/
        NoticeEntity pEntity = NoticeEntity.builder().
                noticeSeq(noticeSeq).
                title(title).
                noticeYn(noticeYn).
                contents(contents).
                readCnt(rEntity.getReadCnt()).
                userId(userId).build();
        /*데이터 수정하기*/
        noticeRepository.save(pEntity);

        log.info(this.getClass().getName() + "NoticeService :end");
    }

    /**
     * @param pDTO 공지사항 삭제하기 위한 정보
     */
    @Override
    public void deleteNoticeInfo(NoticeDTO pDTO) throws Exception {


        log.info(this.getClass().getName() + "NoticeService :start");

        Long noticeSeq = pDTO.getNoticeSeq();


        log.info(this.getClass().getName() + "NoticeService noticeSeq = " + noticeSeq);

        /*데이터 수정하기*/
        noticeRepository.deleteById(noticeSeq);

        log.info(this.getClass().getName() + "NoticeService :end");
    }

    /**
     * 해당 공지사항 저장하기
     *
     * @param pDTO
     */
    @Override
    public void InsertNoticeInfo(NoticeDTO pDTO) throws Exception {


        log.info(this.getClass().getName() + "NoticeService :start");

        String title = CmmUtil.nvl(pDTO.getTitle());
        String noticeYn = CmmUtil.nvl(pDTO.getNoticeYn());
        String contents = CmmUtil.nvl(pDTO.getContents());
        String userId = CmmUtil.nvl(pDTO.getUserId());


        log.info(this.getClass().getName() + "NoticeService userId = " + userId);

        log.info(this.getClass().getName() + "NoticeService contents = " + contents);

        log.info(this.getClass().getName() + "NoticeService noticeYn = " + noticeYn);

        log.info(this.getClass().getName() + "NoticeService title = " + title);
        /*공지사항 저장을 위해서는 PK값은 빌더에 추가하지 않는다.
        * JPA 자동 증가 설정을 해놨음*/
        NoticeEntity pEntity = NoticeEntity.builder().
                title(title).
                noticeYn(noticeYn).
                contents(contents).
                userId(userId).
                readCnt(0L).
                regId(userId).
                regDt(DateUtil.getDateTime("yyyy-MM-dd hh:mm:ss")).
                chgDt(DateUtil.getDateTime("yyyy-MM-dd hh:mm:ss")).
                build();
        /*공지사항 저장하기*/
        noticeRepository.save(pEntity);

        log.info(this.getClass().getName() + "NoticeService :end");
    }
}
