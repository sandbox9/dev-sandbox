package sandbox9.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorldController {

    @RequestMapping(value = "/hello")
    public String greeting() {
        return "hello";
    }
}
