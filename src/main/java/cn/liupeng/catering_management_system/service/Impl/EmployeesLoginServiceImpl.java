package cn.liupeng.catering_management_system.service.Impl;

import cn.liupeng.catering_management_system.mapper.EmployeesLoginMapper;
import cn.liupeng.catering_management_system.pojo.EmployeesLogin;
import cn.liupeng.catering_management_system.service.EmployeesLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesLoginServiceImpl implements EmployeesLoginService {

    @Autowired
    private EmployeesLoginMapper employeesLoginMapper;

    public EmployeesLoginMapper getEmployeesLoginMapper() {
        return employeesLoginMapper;
    }

    public void setEmployeesLoginMapper(EmployeesLoginMapper employeesLoginMapper) {
        this.employeesLoginMapper = employeesLoginMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer employeesloginid) {
        return 0;
    }

    // 添加员工登录信息
    @Override
    public int insert(EmployeesLogin record) {
        return this.getEmployeesLoginMapper().insert(record);
    }

    @Override
    public int insertSelective(EmployeesLogin record) {
        return 0;
    }

    // 获取登录记录
    @Override
    public EmployeesLogin selectByPrimaryKey(Integer employeesloginid) {
        return this.getEmployeesLoginMapper().selectByPrimaryKey(employeesloginid);
    }

    @Override
    public int updateByPrimaryKeySelective(EmployeesLogin record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(EmployeesLogin record) {
        return 0;
    }
}
