package com.cybin.onlineShop.cybinShop.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    private static final Logger LOGGER = LogManager.getLogger("MainPageController");

    @GetMapping("/")
    public String index() {
        LOGGER.info("LLEGO AL MAIN");
        return "index";
    }
}
