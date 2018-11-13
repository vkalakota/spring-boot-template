package com.vk.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;
import com.vk.util.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


@Configuration
public class DataSourceConfig {

    @Autowired
    private Environment environment;
    private static final Logger logger = Logger.getLogger(DataSourceConfig.class.getName());

    @Bean(name = "ds")
    public DataSource edmDataSource() {

        BasicDataSource edm = new BasicDataSource();
        edm.setUrl(environment.getPropertyValue("spring.ds.url"));
        edm.setDriverClassName(environment.getPropertyValue("spring.ds.driver.class.name"));
        edm.setUsername(environment.getPropertyValue("spring.ds.username"));
        edm.setPassword(environment.getPropertyValue("spring.ds.password"));

        return edm;
    }

    @Bean(name = "jdbc")
    @Autowired
    public JdbcTemplate edmJdbcTemplate(@Qualifier("ds") DataSource datasource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }
}
