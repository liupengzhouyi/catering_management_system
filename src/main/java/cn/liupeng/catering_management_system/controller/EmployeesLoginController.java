package cn.liupeng.catering_management_system.controller;

import cn.liupeng.catering_management_system.pojo.EmployeesLogin;
import cn.liupeng.catering_management_system.service.Impl.EmployeesLoginServiceImpl;
import cn.liupeng.catering_management_system.service.Impl.EmployeesServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(tags = "员工登陆相关接口", description = "提供员工登陆的添加与查看方法")
@Controller
@RequestMapping("/employeesLogin")
public class EmployeesLoginController {

    @Autowired
    private EmployeesLoginServiceImpl employeesLoginService;

    public EmployeesLoginServiceImpl getEmployeesLoginService() {
        return employeesLoginService;
    }

    public void setEmployeesLoginService(EmployeesLoginServiceImpl employeesLoginService) {
        this.employeesLoginService = employeesLoginService;
    }

    @ApiOperation("添加员工登陆")
    @ResponseBody
    @RequestMapping("/add")
    public void addEmployeesLogoin(EmployeesLogin employeesLogin) {
        this.getEmployeesLoginService().insert(employeesLogin);
    }

    @ApiOperation("h获取员工登陆")
    @ResponseBody
    @RequestMapping("/get")
    public EmployeesLogin getEmployeesLogoinBy(Integer employeesLoginID) {
        return this.getEmployeesLoginService().selectByPrimaryKey(employeesLoginID);
    }
}
