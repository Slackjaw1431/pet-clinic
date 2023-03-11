package com.tmportfolio.petclinic.controllers;

import com.tmportfolio.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("/owners")/adding a prefix for the entire class
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners/index/","owners","/owners","/owners/"})
    public String listOwners(Model model){
        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }

    @RequestMapping("/owners/find")
    public String findOwners(Model model){
//        model.addAttribute("")
        return "notimplemented";
    }

    @RequestMapping("oops")
    public String error(){
        return "error";
    }

}