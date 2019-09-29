package cn.liupeng.catering_management_system.controller;


import cn.liupeng.catering_management_system.pojo.Dishes;
import cn.liupeng.catering_management_system.service.Impl.DishesMapperServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/dishes")
@Api(tags = "菜品管理控制器", description = "提供菜品的增删改查方法")
public class DishesController {

    @Autowired
    private DishesMapperServiceImpl dishesMapperService;

    public DishesMapperServiceImpl getDishesMapperService() {
        return dishesMapperService;
    }

    @ApiOperation("新增菜品接口")
    @RequestMapping(value = "/add")
    public int addDishes(Dishes dishes) {
        return this.getDishesMapperService().insert(dishes);
    }

    @ApiOperation("删除菜品接口")
    @RequestMapping(value = "/add")
    public int deleteDishes(String dishesID) {
        return this.getDishesMapperService().deleteByPrimaryKey(dishesID);
    }

    @ApiOperation("更新菜品接口")
    @RequestMapping(value = "/add")
    public int updateDishes(Dishes dishes) {
        return this.getDishesMapperService().updateByPrimaryKey(dishes);
    }

    @ApiOperation("查找菜品接口")
    @RequestMapping(value = "/add")
    public Dishes findDishes(String dishesID) {
        return this.getDishesMapperService().selectByPrimaryKey(dishesID);
    }
}
