package com.example.Clima;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Service service =  new Service();

    @GetMapping("/clima")
    public String preverTempo() {
        return service.preverTempo();
    }


}
