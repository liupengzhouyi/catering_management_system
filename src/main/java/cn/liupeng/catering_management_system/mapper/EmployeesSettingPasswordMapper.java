package cn.liupeng.catering_management_system.mapper;

import cn.liupeng.catering_management_system.pojo.EmployeesSettingPassword;

public interface EmployeesSettingPasswordMapper {

    // 删除修改密码的记录
    int deleteByPrimaryKey(Integer settingpasswordid);

    // 插入修改密码的记录
    int insert(EmployeesSettingPassword record);

    // 不采用
    int insertSelective(EmployeesSettingPassword record);

    // 不采用
    EmployeesSettingPassword selectByPrimaryKey(Integer settingpasswordid);

    // 不采用
    int updateByPrimaryKeySelective(EmployeesSettingPassword record);

    // 更新插入密码的记录（不启用）
    int updateByPrimaryKey(EmployeesSettingPassword record);
}