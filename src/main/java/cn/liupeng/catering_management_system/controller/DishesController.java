package cn.liupeng.catering_management_system.controller;


import cn.liupeng.catering_management_system.pojo.Dishes;
import cn.liupeng.catering_management_system.service.Impl.DishesMapperServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/dishes")
@Api(tags = "菜品管理控制器", description = "提供菜品的增删改查方法")
public class DishesController {

    @Autowired
    private DishesMapperServiceImpl dishesMapperService;

    public DishesMapperServiceImpl getDishesMapperServiceImpl() {
        return dishesMapperService;
    }

    @ApiOperation("新增菜品接口")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public int addDishes(@RequestBody Dishes dishes) {
        System.out.println("----------------------");
        System.out.println(dishes.toString());
        System.out.println("-----------------------");
        return this.getDishesMapperServiceImpl().insert(dishes);
    }

    @ApiOperation("删除菜品接口")
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public int deleteDishes(@RequestBody String dishesID) {
        return this.getDishesMapperServiceImpl().deleteByPrimaryKey(dishesID);
    }

    @ApiOperation("更新菜品接口")
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public int updateDishes(@RequestBody Dishes dishes) {
        return this.getDishesMapperServiceImpl().updateByPrimaryKey(dishes);
    }

    @ApiOperation("查找菜品接口")
    @RequestMapping(value = "/find", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Dishes findDishes(@RequestBody String dishesID) {
        System.out.println("----------------------");
        System.out.println("dishesID:" + dishesID);
        System.out.println("-----------------------");
        return this.getDishesMapperServiceImpl().selectByPrimaryKey(dishesID);
    }
}
