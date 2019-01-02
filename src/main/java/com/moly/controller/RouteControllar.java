package com.moly.controller;

import com.moly.entity.AvailableSeats;
import com.moly.entity.Route;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/route/")
public class RouteControllar {
    @GetMapping(value = "create.jsf")
    public String displayRoute(Model model){
        model.addAttribute("obj", new Route());
        return "route/create";

    }

    @GetMapping(value = "list.jsf")
    public String getList(){
        return "route/list";

    }
}
