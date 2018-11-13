package com.vk.service;

import org.apache.log4j.Logger;

import com.vk.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class APIService {

    private static final Logger logger = Logger.getLogger(APIService.class.getName());

    @Autowired
    Dao dao;

}
