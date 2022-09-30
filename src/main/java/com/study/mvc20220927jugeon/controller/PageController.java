package com.study.mvc20220927jugeon.controller;

import com.study.mvc20220927jugeon.dto.TestReqDto;
import org.apache.logging.log4j.message.StructuredDataId;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @GetMapping("/test1") //uri //요청 메세지
    public String test1() {
        return "test_page1"; //응답 데이터
    }

    @GetMapping("/test2") //uri //요청 메세지
    public String test2() {
        System.out.println("test2");
        return "test/test_page2"; //응답 데이터

    }

    @GetMapping("/test3") //uri //요청 메세지
    public String test3(Model model, @RequestParam String strData, @RequestParam String name) {
        System.out.println(strData);
        System.out.println(name);

        model.addAttribute("data", strData);
        model.addAttribute("name", name);

        return "test/test_page3"; //응답 데이터
    }

    @GetMapping("/test4") //uri //요청 메세지
    public String test4(Model model, TestReqDto testReqDto) {
        System.out.println(testReqDto);

        model.addAttribute("data", testReqDto.getStrData());
        model.addAttribute("name", testReqDto.getName());
        model.addAttribute("number", testReqDto.getNumber());

        return "test/test_page4"; //응답 데이터
    }
}
