package cn.liupeng.catering_management_system.mapper;

import cn.liupeng.catering_management_system.pojo.Employees;
import cn.liupeng.catering_management_system.pojo.EmployeesSettingPassword;

/**
 * 员工修改密码记录表
 */
public interface EmployeesSettingPasswordMapper {
    // 添加员工修改密码表
    int insert(EmployeesSettingPassword record);

    int insertSelective(EmployeesSettingPassword record);

    // 获取用户的修改密码记录
    EmployeesSettingPassword selest(Employees employees);

}