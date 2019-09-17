package cn.liupeng.catering_management_system.service;

import cn.liupeng.catering_management_system.pojo.Employees;

public interface EmployeesService {

    // 通过员工ID删除员工信息
    int deleteByPrimaryKey(Integer employeesid);

    // 插入员工信息
    int insert(Employees record);

    int insertSelective(Employees record);

    // 通过员工ID查询员工
    Employees selectByPrimaryKey(Integer employeesid);

    int updateByPrimaryKeySelective(Employees record);

    // 更新员工信息
    int updateByPrimaryKey(Employees record);

}
