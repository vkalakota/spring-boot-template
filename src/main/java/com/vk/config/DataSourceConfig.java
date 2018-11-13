package org.lm.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;
import org.lm.util.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Data source configuration for Service
 * Created by vkalakotahe7160 on 10/17/2018
 */
@Configuration
public class DataSourceConfig {

    @Autowired
    private Environment environment;
    private static final Logger logger = Logger.getLogger(DataSourceConfig.class.getName());

    @Bean(name = "dsEDM")
    public DataSource edmDataSource() {

        BasicDataSource edm = new BasicDataSource();
        edm.setUrl(environment.getPropertyValue("spring.ds.edm.url"));
        edm.setDriverClassName(environment.getPropertyValue("spring.ds.edm.driver.class.name"));
        edm.setUsername(environment.getPropertyValue("spring.ds.edm.username"));
        edm.setPassword(environment.getPropertyValue("spring.ds.edm.password"));

        return edm;
    }

    @Bean(name = "jdbcEDM")
    @Autowired
    public JdbcTemplate edmJdbcTemplate(@Qualifier("dsEDM") DataSource datasource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }
}
