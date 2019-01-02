package com.moly.controller;

import com.moly.entity.AvailableSeats;
import com.moly.entity.Station;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/station/")
public class StationControllar {
    @GetMapping(value = "create.jsf")
    public String displayStation(Model model){
        model.addAttribute("obj", new Station());
        return "station/create";

    }

    @GetMapping(value = "list.jsf")
    public String getList(){
        return "station/list";

    }
}
