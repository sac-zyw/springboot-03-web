package com.sac.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//如果我们要扩展SpringMVC，官方建议我们这样去做
@Configuration
//导入一个类，：DelegatingWebMvcConfiguration：从容器中获取所有的webmvcconfig：
@EnableWebMvc
public class MyMvcConfig implements WebMvcConfigurer {

}
