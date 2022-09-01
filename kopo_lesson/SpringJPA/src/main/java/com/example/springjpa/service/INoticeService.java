package com.example.springjpa.service;

import com.example.springjpa.dto.NoticeDTO;

import java.util.List;

public interface INoticeService {
    /**
    공지사항 전체 가져오기 */
    List<NoticeDTO> getNoticeList();


    /**
    @param pDTO 공지사항 상세 가져오기 위한 정보
     @param type 조회수 증가여부(true: 증가, false: 증가 안함
     */
    NoticeDTO getNoticeInfo(NoticeDTO pDTO, boolean type) throws Exception;

    /**
     * @param pDTO 공지사항 수정을 위한 정보
     */
    void updateNoticeInfo(NoticeDTO pDTO) throws Exception;

    /**
     * @param pDTO 공지사항 삭제하기 위한 정보
     */
    void deleteNoticeInfo(NoticeDTO pDTO) throws Exception;

    /**
     * 해당 공지사항 저장하기
     * @param pDTO
     */
    void InsertNoticeInfo(NoticeDTO pDTO) throws Exception;
}
