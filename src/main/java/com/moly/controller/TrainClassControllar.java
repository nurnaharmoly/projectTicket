package com.moly.controller;

import com.moly.entity.TrainClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/trainClass/")
public class TrainClassControllar {
    @GetMapping(value = "create.jsf")
    public String displayClass(Model model){
        model.addAttribute("obj", new TrainClass());
        return "trainClass/create";

    }

    @GetMapping(value = "list.jsf")
    public String getList(){
        return "trainClass/list";

    }
}
