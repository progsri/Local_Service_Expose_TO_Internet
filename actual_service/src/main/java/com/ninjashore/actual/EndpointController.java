package com.ninjashore.actual;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointController {

    @RequestMapping("/store")
    public String store() {
        return "Store the public ip and port";
    }

    @RequestMapping("/connect")
    public String connect() {
        return "connect to the listen service";
    }
}
