package com.ninjashore.actual;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class EndpointController {

    @RequestMapping("/presentTime")
    public String store() {

        Date date = new Date();
        return date.toString();

    }

}
