package com.moly.controller;

import com.moly.entity.Compartment;
import com.moly.entity.Role;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/compartment/")
public class CompartmentControllar {
    @GetMapping(value = "create.jsf")
    public String displayCompartment(Model model){
        model.addAttribute("obj", new Compartment());
        return "compartment/create";

    }

    @GetMapping(value = "list.jsf")
    public String getList(){
        return "compartment/list";

    }
}
