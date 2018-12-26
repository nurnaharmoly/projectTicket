package com.moly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    public String displayhome(){
        return "index";
    }

    @GetMapping(value = "/fo.jsf")
    public String displayFoo(){
        return "fooo/dea";
    }
}
