package com.gf.dspn.config;

import com.gf.dspn.configimpl.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * .
 *
 * @author : doublej
 * @Date : 2021-12-15 14:49
 */

@Configuration
public class MyConfigurer implements WebMvcConfigurer {

    @Bean
    public MyInterceptor getMyInterceptor() {
        return new MyInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.getMyInterceptor())
            //.addPathPatterns("/abc", "/configurePathMatch", "/dspn");
            .addPathPatterns("/**");
    }
}

