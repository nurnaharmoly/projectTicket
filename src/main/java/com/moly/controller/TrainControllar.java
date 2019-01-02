package com.moly.controller;

import com.moly.entity.AvailableSeats;
import com.moly.entity.Train;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/train/")
public class TrainControllar {
    @GetMapping(value = "create.jsf")
    public String displayTrain(Model model){
        model.addAttribute("obj", new Train());
        return "train/create";

    }

    @GetMapping(value = "list.jsf")
    public String getList(){
        return "train/list";

    }
}
