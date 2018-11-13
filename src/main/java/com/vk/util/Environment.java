package org.lm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * System environment to access properties
 * Created by vkalakotahe7160 on 10/17/2018
 */
@Configuration("sysEnvironment")
@PropertySource(value = "classpath:application.properties")
public class Environment {

    @Autowired
    private org.springframework.core.env.Environment sysEnvironment;

    public String getPropertyValue(String key) {
        return sysEnvironment.getProperty(key);
    }
}
