package com.example.springjpa.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeDTO {
    private Long noticeSeq;
    private String title;
    private String noticeYn;
    private String contents;
    private String userId;
    private String readCnt;

    private String regDt;
    private String regId;
    private String chgId;
    private String chgDt;
    private String userName;

}
