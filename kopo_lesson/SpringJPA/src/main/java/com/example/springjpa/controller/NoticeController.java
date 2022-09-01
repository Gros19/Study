package com.example.springjpa.controller;

import com.example.springjpa.dto.NoticeDTO;
import com.example.springjpa.service.INoticeService;
import com.example.springjpa.util.CmmUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequestMapping(value = "/notice")
@Controller
public class NoticeController {
    /*비즈니스 로직(중요 로직을 수행하기 위해 사용되는 서비스)를 메모리에 적재 싱글톤패턴 적용됨*/
    @Resource(name = "NoticeService")
    private INoticeService iNoticeService;

    @GetMapping(value = "index")
    public String index(){
        return "/index";
    }

    /**
     * 게시판 작성 페이지 이동
     * WEB-INF 하위 JSP는 직접 호출 불가
     * 컨드롤러에 등록해야 JSP 호출 가능*/
    @GetMapping(value="noticeReg")
    public String noticeReg(){


        log.info(this.getClass().getName() + "noticeReg :start");

        log.info(this.getClass().getName() + "noticeReg :end");
        return "/notice/NoticeReg";
    }

    /**
     * 게시글 등록
     */
    @PostMapping(value="noticeInsert")
    public String noticeInsert(HttpSession session, HttpServletRequest request, ModelMap model){

        log.info(this.getClass().getName() + "noticeInsert :start");
        String msg = "";

        try{
            String user_id = CmmUtil.nvl((String) session.getAttribute("SESSION_USER_ID"));
            String title = CmmUtil.nvl(request.getParameter("title"));
            String noticeYn = CmmUtil.nvl(request.getParameter("noticeYn"));
            String contents = CmmUtil.nvl(request.getParameter("contents"));

            log.info(this.getClass().getName() + "NoticeController user_id = " + user_id);
            log.info(this.getClass().getName() + "NoticeController title = " + title);
            log.info(this.getClass().getName() + "NoticeController noticeYn = " + noticeYn);
            log.info(this.getClass().getName() + "NoticeController contents = " + contents);


            NoticeDTO pDTO = new NoticeDTO();
            pDTO.setUserId(user_id);
            pDTO.setTitle(title);
            pDTO.setNoticeYn(noticeYn);
            pDTO.setContents(contents);

            iNoticeService.InsertNoticeInfo(pDTO);
            msg ="등록되었습니다.";


        }catch (Exception e){
            msg = "실패했습니다.";

            log.info(this.getClass().getName() + "noticeInsert e.getMessage() = " + e.getMessage());
        }finally {
            model.addAttribute("msg", msg);
            log.info(this.getClass().getName() + "noticeInsert :end");
            return "/notice/MsgToList";
        }
    }

    /**
     * 게시판 리스트 보여주기
     */
    @GetMapping(value = "noticeList")
    public String notice(ModelMap model) {

        log.info(this.getClass().getName() + "noticeList :start");

        List<NoticeDTO> rList = iNoticeService.getNoticeList();

        if (rList == null) {
            rList = new ArrayList<NoticeDTO>();
        }

        /*조회된 리스트 결과값 넣어주기*/
        model.addAttribute("rList", rList);

        /*변수 초기화(메모리 효율화 시키기 위해 사용함)*/
        rList = null;

        log.info(this.getClass().getName() + "noticeList :end");
        return "/notice/NoticeList";
    }

    @GetMapping(value = "noticeInfo")
    public String noticeInfo(HttpServletRequest request, ModelMap model) throws Exception {

        log.info(this.getClass().getName() + "noticeInfo :start");

        String nSeq = CmmUtil.nvl(request.getParameter("nSeq"));

        log.info(this.getClass().getName() + "noticeInfo nSeq = " + nSeq);

        NoticeDTO pDTO = new NoticeDTO();
        pDTO.setNoticeSeq(Long.parseLong(nSeq));

        /*공지사항 상세 정보 가져오기*/
        NoticeDTO rDTO = iNoticeService.getNoticeInfo(pDTO, true);

        if (rDTO == null) {
            rDTO = new NoticeDTO();
        }

        /*조회된 리스트 결과값 넣어주기*/
        model.addAttribute("rDTO", rDTO);

        log.info(this.getClass().getName() + "noticeInfo :end");
        return "/notice/NoticeInfo";
    }

    /**
     * 게시판 수정 보기
     */
    @GetMapping(value = "noticeEditInfo")
    public String noticeEditInfo(HttpServletRequest request, ModelMap model) {

        log.info(this.getClass().getName() + "noticeEditInfo :start");

        String msg = "";

        try {
            String nSeq = CmmUtil.nvl(request.getParameter("nSeq"));

            log.info(this.getClass().getName() + "noticeEditInfo nSeq = " + nSeq);

            NoticeDTO pDTO = new NoticeDTO();

            pDTO.setNoticeSeq(Long.parseLong(nSeq));

            NoticeDTO rDTO = iNoticeService.getNoticeInfo(pDTO, false);

            if (rDTO == null) {
                rDTO = new NoticeDTO();
            }

            model.addAttribute("rDTO", rDTO);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("msg", msg);
        }

        log.info(this.getClass().getName() + "noticeEditInfo :end");
        return "/notice/NoticeEditInfo";
    }

    /**
     * 게시판 글 수정
     */
    @PostMapping(value = "noticeUpdate")
    public String NoticeUpdate(HttpSession session, HttpServletRequest request, ModelMap model) {

        log.info(this.getClass().getName() + "noticeUpdate :start");

        String msg = "";

        try {

            String user_id = CmmUtil.nvl((String) session.getAttribute("SESSION_USER_ID"));
            String nSeq = CmmUtil.nvl(request.getParameter("nSeq"));
            String title = CmmUtil.nvl(request.getParameter("title"));
            String noticeYn = CmmUtil.nvl(request.getParameter("noticeYn"));
            String contents = CmmUtil.nvl(request.getParameter("contents"));

            log.info(this.getClass().getName() + "noticeUpdate user_id = " + user_id);
            log.info(this.getClass().getName() + "noticeUpdate nSeq = " + nSeq);
            log.info(this.getClass().getName() + "noticeUpdate title = " + title);
            log.info(this.getClass().getName() + "noticeUpdate noticeYn = " + noticeYn);
            log.info(this.getClass().getName() + "noticeUpdate contents = " + contents);

            NoticeDTO pDTO = new NoticeDTO();
            pDTO.setUserId(user_id);
            pDTO.setNoticeSeq(Long.parseLong(nSeq));
            pDTO.setTitle(title);
            pDTO.setNoticeYn(noticeYn);
            pDTO.setContents(contents);

            iNoticeService.updateNoticeInfo(pDTO);

            msg = "수정되었습니다.";
        } catch (Exception e) {
            log.info(this.getClass().getName() + "noticeUpdate e.getClass() = " + e.getMessage());
            msg = "실패했습니다.";
        }finally {
            model.addAttribute("msg", msg);
            log.info(this.getClass().getName() + "noticeUpdate :end");
            return "notice/MsgToList";
        }
    }

    /**
     * 게시판 글 삭제
     */
    @GetMapping(value = "noticeDelete")
    public String noticeDelete(HttpServletRequest request, ModelMap model){

        log.info(this.getClass().getName() + "noticeDelete :start");

        String msg = "";
        try{
            String nSeq = CmmUtil.nvl(request.getParameter("nSeq"));


            log.info(this.getClass().getName() + "noticeDelete nSeq = " + nSeq);

            NoticeDTO pDTO = new NoticeDTO();

            pDTO.setNoticeSeq(Long.parseLong(nSeq));

            /*게시글 삭제하기 DB*/
            iNoticeService.deleteNoticeInfo(pDTO);
            msg = "삭제되었습니다.";

        } catch (Exception e) {
            msg = "실패하였습니다.";

            log.info(this.getClass().getName() + "noticeDelete e.getMessage() = " + e.getMessage());

            log.info(this.getClass().getName() + "noticeDelete e.getStackTrace() = " + e.getStackTrace());
            e.printStackTrace();
        }finally {

            log.info(this.getClass().getName() + "noticeDelete :end");
            return "/notice/MsgToList";
        }
    }

}
