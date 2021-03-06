package cn.liupeng.catering_management_system.mapper;

import cn.liupeng.catering_management_system.pojo.Employees;
import cn.liupeng.catering_management_system.pojo.EmployeesLogin;

import java.util.List;

public interface EmployeesLoginMapper {

    int deleteByPrimaryKey(Integer employeesloginid);

    // 添加员工登录信息
    int insert(EmployeesLogin record);

    int insertSelective(EmployeesLogin record);

    // 获取登录记录
    EmployeesLogin selectByPrimaryKey(Integer employeesloginid);

    int updateByPrimaryKeySelective(EmployeesLogin record);

    int updateByPrimaryKey(EmployeesLogin record);

    // 获取某用户所有登录记录
    // List<EmployeesLogin> listEmployeesLogin(Employees employees);
}