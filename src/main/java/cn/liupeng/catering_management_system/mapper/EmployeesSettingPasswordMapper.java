package cn.liupeng.catering_management_system.mapper;

import cn.liupeng.catering_management_system.pojo.EmployeesSettingPassword;

public interface EmployeesSettingPasswordMapper {
    int insert(EmployeesSettingPassword record);

    int insertSelective(EmployeesSettingPassword record);
}