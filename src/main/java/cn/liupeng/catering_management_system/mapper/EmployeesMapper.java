package cn.liupeng.catering_management_system.mapper;

import cn.liupeng.catering_management_system.pojo.Employees;

public interface EmployeesMapper {


    int deleteByPrimaryKey(Integer employeesid);

    int insert(Employees record);

    int insertSelective(Employees record);

    Employees selectByPrimaryKey(Integer employeesid);

    int updateByPrimaryKeySelective(Employees record);

    int updateByPrimaryKey(Employees record);
}