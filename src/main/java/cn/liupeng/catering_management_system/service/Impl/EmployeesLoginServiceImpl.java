package cn.liupeng.catering_management_system.service.Impl;

import cn.liupeng.catering_management_system.pojo.EmployeesLogin;
import cn.liupeng.catering_management_system.service.EmployeesLoginService;
import org.springframework.stereotype.Service;

@Service
public class EmployeesLoginServiceImpl implements EmployeesLoginService {

    @Override
    public int deleteByPrimaryKey(Integer employeesloginid) {
        return 0;
    }

    // 添加员工登录信息
    @Override
    public int insert(EmployeesLogin record) {
        return 0;
    }

    @Override
    public int insertSelective(EmployeesLogin record) {
        return 0;
    }

    // 获取登录记录
    @Override
    public EmployeesLogin selectByPrimaryKey(Integer employeesloginid) {
        return null;
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
