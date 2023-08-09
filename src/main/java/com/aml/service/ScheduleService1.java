package com.aml.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Component
public class ScheduleService1 {
    private static final Logger logger = LoggerFactory.getLogger(ScheduleService1.class);
    private static int count = 1;

    @Autowired
    private MailSenderService mailSenderService;
    // Sử dụng fixedDelay: Có 1 khoảng thời gian delay giữa 2 lần thực hiện
//    @Scheduled(initialDelay = 5000, fixedDelay = 10000)
//    //@Scheduled(initialDelayString = "5000", fixedDelayString = "10000")
//    public void send() {
//        logger.info("Send message with fixedDelay: " + count++);
//    }

//    @Scheduled(fixedRate = 4000)
//    public void send1() {
//        System.out.println("hello " + count++);
//    }

    @Scheduled(cron = "0 0/1 * * * *") // send mail vào 10:17:00 am mỗi ngày
    public void send2() {
        System.out.println("hello guy at: " + LocalDateTime.now());
//        System.out.println("Send mail at: " + LocalDateTime.now());
//        mailSenderService.sendMail("phucvk.b19cn506@stu.ptit.edu.vn", "Chào bạn nha");
    }
}
