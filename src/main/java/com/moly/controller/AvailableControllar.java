package com.moly.controller;

import com.moly.entity.AvailableSeats;
import com.moly.entity.Role;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/availableseat/")
public class AvailableControllar {
    @GetMapping(value = "create.jsf")
    public String displayAvailable(Model model){
        model.addAttribute("obj", new AvailableSeats());
        return "available-seat/create";

    }

    @GetMapping(value = "list.jsf")
    public String getList(){
        return "available-seat/list";

    }
}
