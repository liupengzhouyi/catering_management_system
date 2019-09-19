package cn.liupeng.catering_management_system.controller;

import cn.liupeng.catering_management_system.pojo.Employees;
import cn.liupeng.catering_management_system.pojo.EmployeesSettingPassword;
import cn.liupeng.catering_management_system.service.EmployeesSettingPasswordService;
import cn.liupeng.catering_management_system.service.Impl.EmployeesSettingPasswordServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "员工记录修改密码相关接口", description = "提供员工添加修改密码的添加方法")
@RequestMapping(value = "/employeesSettingPassword")
public class EmployeesSettingPasswordController {

    @Autowired
    private EmployeesSettingPasswordServiceImpl employeesSettingPasswordService;

    public EmployeesSettingPasswordServiceImpl getEmployeesSettingPasswordService() {
        return employeesSettingPasswordService;
    }

    public void setEmployeesSettingPasswordService(EmployeesSettingPasswordServiceImpl employeesSettingPasswordService) {
        this.employeesSettingPasswordService = employeesSettingPasswordService;
    }

    @ApiOperation("添加员工修改密码记录")
    @ResponseBody
    @PostMapping(value = "/add")
    public int addEmployeesSettingPassword(EmployeesSettingPassword employeesSettingPassword) {
        return this.getEmployeesSettingPasswordService().insert(employeesSettingPassword);
    }


    @ApiOperation("获取员工修改密码记录")
    @ResponseBody
    @PostMapping(value = "/get")
    public EmployeesSettingPassword getEmployeesSettingPassword(Employees employees) {
        return this.getEmployeesSettingPasswordService().selest(employees);
    }
}
