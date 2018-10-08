package com.example.scheduletask.task;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Jobs {
    public final static long ONE_Minute =  60 * 1000;
    SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss ");

    @Scheduled(fixedDelay=ONE_Minute)
    public void fixedDelayJob(){
        System.out.println(format.format(new Date()) +" >>fixedDelay执行....");
    }

    @Scheduled(fixedRate=ONE_Minute)
    public void fixedRateJob(){
        System.out.println(format.format(new Date()) +" >>fixedRate执行....");
    }

    @Scheduled(cron="0 15 16 * * ?")
    public void cronJob(){
        System.out.println(format.format(new Date()) +" >>cron执行....");
    }
}
