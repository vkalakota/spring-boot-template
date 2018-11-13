package org.lm.dao.impl;


import org.lm.dao.Dao;
import org.lm.util.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * DAO Implementation for Service
 * Created by vkalakotahe7160 on 10/17/2018
 */
@Repository
@Qualifier("dao")
public class DaoImpl implements Dao {

    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(DaoImpl.class.getName());

    @Autowired
    @Qualifier("jdbcEDM")
    private JdbcTemplate jdbcTemplate;

    @Autowired
    Environment environment;


}
