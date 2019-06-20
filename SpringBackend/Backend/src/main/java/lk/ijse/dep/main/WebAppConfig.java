package lk.ijse.dep.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(basePackages = "lk.ijse.dep")
@EnableWebMvc
@Configuration
public class WebAppConfig {
}
