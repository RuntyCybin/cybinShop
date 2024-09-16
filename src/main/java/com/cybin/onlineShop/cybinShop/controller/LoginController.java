package com.cybin.onlineShop.cybinShop.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    private static final Logger LOGGER = LogManager.getLogger("LoginController");

    @GetMapping("/login")
    public String login() {
        LOGGER.info("LLEGO");
        return "login";
    }

}
