package com.project.testProject.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * MainController
 */
@Controller
public class MainController {

    @RequestMapping(value = {
        "/main"
    })
    public String main() throws Exception {
        
        return "main";
    }
}