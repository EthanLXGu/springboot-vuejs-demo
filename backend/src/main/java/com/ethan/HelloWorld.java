package com.ethan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ethan L X Gu on 28/03/2017.
 */
@RestController
public class HelloWorld {

    @RequestMapping(value = "/api/hello")
    public String hello() {
        return "hello";
    }
}
