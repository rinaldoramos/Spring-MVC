package com.simplilearn.workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {

    @ResponseBody
    @RequestMapping("/makeup")
    public String giveMakeUp() {
        return "Hi sis....do th emake up";
    }

    @ResponseBody
    @RequestMapping("/book")
    public String giveBooks() {
        return "Give...books";
    }
}
