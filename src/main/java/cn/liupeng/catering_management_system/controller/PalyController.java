package cn.liupeng.catering_management_system.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "PalyController", description = "Controller测试接口")
@RestController
@RequestMapping("/index")
public class PalyController {



    @ApiOperation(value="测试I", notes="返回Hello World")
    @RequestMapping("say")
    public String sayHelloWorld() {
        return "Hello World!";
    }

    @ApiOperation(value="测试II", notes="返回 index")
    @RequestMapping("index")
    public String gotoIndex() {
        return "index";
    }


}
