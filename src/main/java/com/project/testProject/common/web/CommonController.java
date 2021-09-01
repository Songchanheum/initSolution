package com.project.testProject.common.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * CommonController
 */
@RequestMapping(value="/common")
@Controller
public class CommonController {

    @ResponseBody
    @GetMapping(value="/test")
    public String selectBlockList() throws Exception {
    	return "테스트";
    }
}