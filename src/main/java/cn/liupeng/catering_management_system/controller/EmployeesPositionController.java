package cn.liupeng.catering_management_system.controller;

import cn.liupeng.catering_management_system.pojo.EmployeesPosition;
import cn.liupeng.catering_management_system.service.Impl.EmployeesPositionServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "员工职位管理器",  description = "提供对员工职位的添加，查看，删除，更新的方法")
@RestController
@RequestMapping(value = "/employeesPosition")
public class EmployeesPositionController {
    
    @Autowired
    private EmployeesPositionServiceImpl employeesPositionMapperService;

    @ApiOperation(value = "获取员工职位管理功能中服务层的服务器")
    public EmployeesPositionServiceImpl getEmployeesPositionMapperService() {
        return employeesPositionMapperService;
    }

    @ApiOperation(value = "添加员工职位信息")
    @ResponseBody
    @RequestMapping(value = "/addTemp")
    public int addEmployeesPositionTemp(EmployeesPosition employeesPosition) {
        System.out.println(employeesPosition.toString());
        return this.getEmployeesPositionMapperService().insert(employeesPosition);
    }

    @ApiOperation(value = "添加员工职位信息")
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public int addEmployeesPosition(@RequestBody EmployeesPosition employeesPosition) {
        return this.getEmployeesPositionMapperService().insert(employeesPosition);
    }

    @ApiOperation(value = "通过员工职位ID删除员工职位信息")
    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public int deleteEmployeesPosition(@RequestBody Integer employeesPositionID) {
        return this.getEmployeesPositionMapperService().deleteByPrimaryKey(employeesPositionID);
    }

    @ApiOperation(value = "更新员工职位信息")
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public void updateEmployeesPosition(@RequestBody EmployeesPosition employeesPosition) {
        this.getEmployeesPositionMapperService().updateByPrimaryKey(employeesPosition);
    }

    @ApiOperation(value = "通过员工职位ID获取员工职位信息")
    @ResponseBody
    @RequestMapping(value = "/findByID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public EmployeesPosition selectEmployeesPosition(@RequestBody Integer imployeesPositionID) {
        return this.getEmployeesPositionMapperService().selectByPrimaryKey(imployeesPositionID);
    }

}
