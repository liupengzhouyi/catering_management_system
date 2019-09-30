package cn.liupeng.catering_management_system.service.Impl;

import cn.liupeng.catering_management_system.mapper.DishesMapper;
import cn.liupeng.catering_management_system.pojo.Dishes;
import cn.liupeng.catering_management_system.service.DishesMapperService;
// import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishesMapperServiceImpl implements DishesMapperService {

    @Autowired
    private DishesMapper dishesMapper;

    // 获取Mapper
    public DishesMapper getDishesMapper() {
        return dishesMapper;
    }

    // 注销菜品
    @Override
    public int deleteByPrimaryKey(String dishesid) {
        return this.getDishesMapper().deleteByPrimaryKey(dishesid);
    }

    // 添加菜品
    @Override
    public int insert(Dishes record) {
        return this.getDishesMapper().insert(record);
    }

    // 添加菜品
    @Override
    public int insertSelective(Dishes record) {
        return this.getDishesMapper().insertSelective(record);
    }

    // 查询菜品
    @Override
    public Dishes selectByPrimaryKey(String dishesid) {
        return this.getDishesMapper().selectByPrimaryKey(dishesid);
    }

    // 更新菜品
    @Override
    public int updateByPrimaryKeySelective(Dishes record) {
        return this.getDishesMapper().updateByPrimaryKeySelective(record);
    }

    // 更新菜品
    @Override
    public int updateByPrimaryKey(Dishes record) {
        return this.getDishesMapper().updateByPrimaryKey(record);
    }
}
