package com.example.testingApi.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContext;
import java.util.Enumeration;

@Configuration
public class FilterConfig implements javax.servlet.FilterConfig {
    @Bean
    public FilterRegistrationBean<SpecialFilter> loggingFilter(){
        FilterRegistrationBean<SpecialFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new SpecialFilter());
        registrationBean.addUrlPatterns("/intraday/*");
        return registrationBean;
    }

    @Override
    public String getFilterName() {
        return null;
    }

    @Override
    public ServletContext getServletContext() {
        return null;
    }

    @Override
    public String getInitParameter(String s) {
        return null;
    }

    @Override
    public Enumeration<String> getInitParameterNames() {
        return null;
    }
}
