package com.demo.controller;

import com.demo.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LJT on 17-4-26.
 * email: linjuntan@sensetime.com
 */
@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi(@RequestParam String name) {
        return hiService.hiService(name);
    }
}
