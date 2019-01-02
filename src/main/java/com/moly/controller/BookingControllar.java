package com.moly.controller;

import com.moly.entity.Role;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/booking/")
public class BookingControllar {
    @GetMapping(value = "create.jsf")
    public String displayBooking(Model model){
        model.addAttribute("obj", new Role());
        return "booking/create";

    }

    @GetMapping(value = "list.jsf")
    public String getList(){
        return "booking/list";

    }
}
