package cn.liupeng.catering_management_system.service.Impl;

import cn.liupeng.catering_management_system.mapper.EmployeesPositionMapper;
import cn.liupeng.catering_management_system.pojo.EmployeesPosition;
import cn.liupeng.catering_management_system.service.EmployeesPositionMapperService;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Service;

@Service
public class EmployeesPositionMapperServiceImpl implements EmployeesPositionMapperService {

    // 员工职位Mapper
    private EmployeesPositionMapper employeesPositionMapper;

    // 获取员工职位Mapper对象
    public EmployeesPositionMapper getEmployeesPositionMapper() {
        return employeesPositionMapper;
    }

    public void setEmployeesPositionMapper(EmployeesPositionMapper employeesPositionMapper) {
        this.employeesPositionMapper = employeesPositionMapper;
    }

    // 根据职位ID删除职位
    @Override
    public int deleteByPrimaryKey(Integer positionid) {
        return this.getEmployeesPositionMapper().deleteByPrimaryKey(positionid);
    }

    // 添加职位
    @Override
    public int insert(EmployeesPosition record) {
        return this.getEmployeesPositionMapper().insert(record);
    }

    // 添加职位
    @Override
    public int insertSelective(EmployeesPosition record) {
        return this.getEmployeesPositionMapper().insertSelective(record);
    }

    // 根据职位ID获取职位信息
    @Override
    public EmployeesPosition selectByPrimaryKey(Integer positionid) {
        return this.getEmployeesPositionMapper().selectByPrimaryKey(positionid);
    }

    // 更新职位信息
    @Override
    public int updateByPrimaryKeySelective(EmployeesPosition record) {
        return this.getEmployeesPositionMapper().updateByPrimaryKeySelective(record);
    }

    // 更新职位信息
    @Override
    public int updateByPrimaryKey(EmployeesPosition record) {
        return this.getEmployeesPositionMapper().updateByPrimaryKey(record);
    }
}
