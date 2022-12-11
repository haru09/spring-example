package com.web.msa.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class ViewController {

    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }
}
