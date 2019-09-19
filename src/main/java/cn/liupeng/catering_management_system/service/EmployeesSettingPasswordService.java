package cn.liupeng.catering_management_system.service;

import cn.liupeng.catering_management_system.pojo.Employees;
import cn.liupeng.catering_management_system.pojo.EmployeesSettingPassword;

// 员工的Service
public interface EmployeesSettingPasswordService {

    // 添加员工修改密码表
    int insert(EmployeesSettingPassword record);

    int insertSelective(EmployeesSettingPassword record);

    // 获取用户的修改密码记录
    EmployeesSettingPassword selest(Employees employees);
}
