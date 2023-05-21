package br.com.cbgomes.application.utils;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class ConfigMessageProperties {

    @Bean
    public static MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource
                = new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames("classpath:/messages/errors_messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
