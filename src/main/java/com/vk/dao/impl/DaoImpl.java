package com.vk.dao.impl;


import com.vk.dao.Dao;
import com.vk.util.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("dao")
public class DaoImpl implements Dao {

    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(DaoImpl.class.getName());

    @Autowired
    @Qualifier("jdbc")
    private JdbcTemplate jdbcTemplate;

    @Autowired
    Environment environment;


}
