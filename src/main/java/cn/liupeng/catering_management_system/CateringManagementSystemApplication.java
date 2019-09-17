package cn.liupeng.catering_management_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.liupeng.catering_management_system.mapper")
public class CateringManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CateringManagementSystemApplication.class, args);
    }

}
