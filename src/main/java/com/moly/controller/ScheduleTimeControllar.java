package com.moly.controller;

import com.moly.entity.AvailableSeats;
import com.moly.entity.ScheduleTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/scheduleTime/")
public class ScheduleTimeControllar {
    @GetMapping(value = "create.jsf")
    public String displayScheduleTime(Model model){
        model.addAttribute("obj", new ScheduleTime());
        return "scheduleTime/create";

    }

    @GetMapping(value = "list.jsf")
    public String getList(){
        return "scheduleTime/list";

    }
}
