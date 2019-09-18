package cn.liupeng.catering_management_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;

@SpringBootApplication
@MapperScan("cn.liupeng.catering_management_system.mapper")
@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class})
public class CateringManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CateringManagementSystemApplication.class, args);
    }

}
