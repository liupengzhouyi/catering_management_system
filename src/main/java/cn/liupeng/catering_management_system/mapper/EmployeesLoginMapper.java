package cn.liupeng.catering_management_system.mapper;

import cn.liupeng.catering_management_system.pojo.EmployeesLogin;

public interface EmployeesLoginMapper {
    int deleteByPrimaryKey(Integer employeesloginid);

    int insert(EmployeesLogin record);

    int insertSelective(EmployeesLogin record);

    EmployeesLogin selectByPrimaryKey(Integer employeesloginid);

    int updateByPrimaryKeySelective(EmployeesLogin record);

    int updateByPrimaryKey(EmployeesLogin record);
}