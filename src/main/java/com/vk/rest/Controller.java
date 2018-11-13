package org.lm.rest;

import org.apache.log4j.Logger;
import org.lm.service.APIService;
import org.lm.util.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for Service
 * Created by vkalakotahe7160 on 10/17/2018
 */
@RestController
@RequestMapping("/")
public class Controller {

    private static final Logger logger = Logger.getLogger(Controller.class.getName());

    @Autowired
    APIService service;

    @Autowired
    Environment sysEnvironment;

}
