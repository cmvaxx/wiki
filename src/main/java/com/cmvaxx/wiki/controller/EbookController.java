package com.cmvaxx.wiki.controller;

import com.cmvaxx.wiki.domain.Ebook;
import com.cmvaxx.wiki.req.EbookReq;
import com.cmvaxx.wiki.resp.CommonResp;
import com.cmvaxx.wiki.resp.EbookResp;
import com.cmvaxx.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Autowired
    private EbookService ebookService;


    @GetMapping("/list")
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }



}
