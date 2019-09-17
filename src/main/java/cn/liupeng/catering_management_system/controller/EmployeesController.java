package cn.liupeng.catering_management_system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

    // 测试
    @RequestMapping("index")
    public String gotoIndex() {
        return "index";
    }

}
