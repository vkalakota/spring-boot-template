package org.lm.service;

import org.apache.log4j.Logger;

import org.lm.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service implementation for Service
 * Created by vkalakotahe7160 on 10/17/2018
 */
@Service
public class APIService {

    private static final Logger logger = Logger.getLogger(APIService.class.getName());

    @Autowired
    Dao dao;

}
