package cn.liupeng.catering_management_system.controller;

import cn.liupeng.catering_management_system.pojo.Employees;
import cn.liupeng.catering_management_system.service.Impl.EmployeesServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "员工相关接口", description = "提供员工的增删改查方法")
@RestController
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    private EmployeesServiceImpl employeesService;

    // 测试
    @ApiOperation("测试")
    @RequestMapping("/index")
    public String gotoIndex() {
        return "index";
    }

    @ApiOperation("新增用户接口")
    @ResponseBody
    @PostMapping("/add")
    public String addEmployees(Employees employees) {
        this.employeesService.insert(employees);
        return "success";
    }
}
