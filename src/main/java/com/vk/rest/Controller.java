package com.vk.rest;

import org.apache.log4j.Logger;
import com.vk.service.APIService;
import com.vk.util.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    private static final Logger logger = Logger.getLogger(Controller.class.getName());

    @Autowired
    APIService service;

    @Autowired
    Environment sysEnvironment;

    @RequestMapping(value="/invoke", method = RequestMethod.GET, produces = "application/json")
    public String invoke(){
        System.out.println(" in invoke");

        return "invoked here";
    }


}
