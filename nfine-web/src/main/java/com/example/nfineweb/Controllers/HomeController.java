package com.example.nfineweb.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Home")
public class HomeController {

    @GetMapping("/Index")
    public String Index(){
        return  "index.html";
    }

}