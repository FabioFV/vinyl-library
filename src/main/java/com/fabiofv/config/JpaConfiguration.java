package com.fabiofv.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by fabioferreras on 7/9/17.
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.fabiofv.repository")
public class JpaConfiguration
{
    
}
