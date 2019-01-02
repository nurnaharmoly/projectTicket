package com.moly.controller;

import com.moly.entity.AvailableSeats;
import com.moly.entity.SeatOrCabin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/seatOrCabin/")
public class SeatOrCabinControllar {
    @GetMapping(value = "create.jsf")
    public String displaySeatOrCabin(Model model){
        model.addAttribute("obj", new SeatOrCabin());
        return "seatOrCabin/create";

    }

    @GetMapping(value = "list.jsf")
    public String getList(){
        return "seatOrCabin/list";

    }
}
