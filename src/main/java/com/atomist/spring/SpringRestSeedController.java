package com.atomist.spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class SpringRestSeedController {

    @GetMapping("/getUser/{name}")
    public String person(@PathVariable String name) {
        return "Your name is " + name + "!";
    }

}
