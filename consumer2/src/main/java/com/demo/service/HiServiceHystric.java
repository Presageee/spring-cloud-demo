package com.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by LJT on 17-4-26.
 * email: linjuntan@sensetime.com
 */
@Component
public class HiServiceHystric implements HiService{

    @Override
    public String sayHi(String name) {
        return "err " + name;
    }
}
