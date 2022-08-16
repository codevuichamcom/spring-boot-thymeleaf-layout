package com.codevui.layout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/products")
    public String listProduct() {
        return "product";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}
