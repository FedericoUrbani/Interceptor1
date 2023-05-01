package com.example.interceptor1.configuration;

import com.example.interceptor1.interceptors.ApiLoggingInterceptor;
import com.example.interceptor1.interceptors.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {
    @Autowired
    private ApiLoggingInterceptor apiLoggingInterceptor;

    @Autowired
    private LegacyInterceptor legacyInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(apiLoggingInterceptor);
        registry.addInterceptor(legacyInterceptor);
    }

}
