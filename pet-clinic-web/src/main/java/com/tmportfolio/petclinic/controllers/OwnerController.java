package com.tmportfolio.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")//adding a prefix for the entire class
@Controller
public class OwnerController {

    @RequestMapping("")
    public String getOwners(){
        return "index";
    }
}