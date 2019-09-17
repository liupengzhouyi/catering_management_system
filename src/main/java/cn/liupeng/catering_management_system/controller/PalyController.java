package cn.liupeng.catering_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class PalyController {



    @RequestMapping("say")
    public String sayHelloWorld() {
        return "Hello World!";
    }

    @RequestMapping("index")
    public String gotoIndex() {
        return "index";
    }


}
