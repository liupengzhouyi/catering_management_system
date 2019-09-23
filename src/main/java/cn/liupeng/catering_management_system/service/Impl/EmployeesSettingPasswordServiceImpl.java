package cn.liupeng.catering_management_system.service.Impl;

import cn.liupeng.catering_management_system.mapper.EmployeesSettingPasswordMapper;
import cn.liupeng.catering_management_system.pojo.EmployeesSettingPassword;
import cn.liupeng.catering_management_system.service.EmployeesSettingPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesSettingPasswordServiceImpl implements EmployeesSettingPasswordService {

    @Autowired
    private EmployeesSettingPasswordMapper employeesSettingPasswordMapper;

    public EmployeesSettingPasswordMapper getEmployeesSettingPasswordMapper() {
        return employeesSettingPasswordMapper;
    }

    public void setEmployeesSettingPasswordMapper(EmployeesSettingPasswordMapper employeesSettingPasswordMapper) {
        this.employeesSettingPasswordMapper = employeesSettingPasswordMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer settingpasswordid) {
        return this.getEmployeesSettingPasswordMapper().deleteByPrimaryKey(settingpasswordid);
    }

    @Override
    public int insert(EmployeesSettingPassword record) {
        return this.getEmployeesSettingPasswordMapper().insert(record);
    }

    @Override
    public int insertSelective(EmployeesSettingPassword record) {
        return 0;
    }

    @Override
    public EmployeesSettingPassword selectByPrimaryKey(Integer settingpasswordid) {
        return this.getEmployeesSettingPasswordMapper().selectByPrimaryKey(settingpasswordid);
    }

    @Override
    public int updateByPrimaryKeySelective(EmployeesSettingPassword record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(EmployeesSettingPassword record) {
        return this.getEmployeesSettingPasswordMapper().updateByPrimaryKey(record);
    }
}
