package cn.liupeng.catering_management_system.service.Impl;

import cn.liupeng.catering_management_system.mapper.EmployeesSettingPasswordMapper;
import cn.liupeng.catering_management_system.pojo.Employees;
import cn.liupeng.catering_management_system.pojo.EmployeesSettingPassword;
import cn.liupeng.catering_management_system.service.EmployeesSettingPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesSettingPasswordServiceImpl implements EmployeesSettingPasswordService {

    @Autowired
    private EmployeesSettingPasswordMapper employeesSettingPasswordMapper;

    // 添加员工登录信息
    @Override
    public int insert(EmployeesSettingPassword record) {
        return this.employeesSettingPasswordMapper.insert(record);
    }

    @Override
    public int insertSelective(EmployeesSettingPassword record) {
        return 0;
    }

    // 获取用户的修改密码记录
    @Override
    public EmployeesSettingPassword selest(Employees employees) {
        return this.employeesSettingPasswordMapper.selest(employees);
    }
}
