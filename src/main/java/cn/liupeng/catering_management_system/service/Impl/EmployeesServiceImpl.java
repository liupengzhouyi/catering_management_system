package cn.liupeng.catering_management_system.service.Impl;

import cn.liupeng.catering_management_system.mapper.EmployeesMapper;
import cn.liupeng.catering_management_system.pojo.Employees;
import cn.liupeng.catering_management_system.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    private EmployeesMapper employeesMapper;

    // 通过员工ID删除员工信息
    @Override
    public int deleteByPrimaryKey(Integer employeesid) {
        return this.employeesMapper.deleteByPrimaryKey(employeesid);
    }

    // 插入员工信息
    @Override
    public int insert(Employees record) {
        return this.employeesMapper.insert(record);
    }

    @Override
    public int insertSelective(Employees record) {
        return 0;
    }

    // 通过员工ID查询员工
    @Override
    public Employees selectByPrimaryKey(Integer employeesid) {
        return this.employeesMapper.selectByPrimaryKey(employeesid);
    }

    @Override
    public int updateByPrimaryKeySelective(Employees record) {
        return 0;
    }

    // 更新员工信息
    @Override
    public int updateByPrimaryKey(Employees record) {
        return this.employeesMapper.updateByPrimaryKey(record);
    }
}
