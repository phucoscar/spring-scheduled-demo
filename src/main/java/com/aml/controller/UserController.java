package com.aml.controller;

import com.aml.service.RabbitMQSender;
import com.aml.service.SinhVienService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private SinhVienService sinhVienService;

    @Autowired
    private RabbitMQSender sender;

    @PostMapping("/test")
    public ResponseEntity<?> test() {
        logger.info("Start send message");
        sender.send();
        logger.info("Message sent at: " + System.currentTimeMillis());
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }


}
