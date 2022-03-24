package com.simplilearn.workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {

    @ResponseBody
    @RequestMapping("/sugar")
    public String giveSugar() {
        return "OKay...Here is your sugar";
    }
}
