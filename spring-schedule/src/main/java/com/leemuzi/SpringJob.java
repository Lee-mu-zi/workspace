package com.leemuzi;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SpringJob {

    /**
     * 每5分钟跑一次
     */
//    @Scheduled(cron = "0 */5 * * * ?")
//    @SchedulerLock(name = "SpringJob.job1", lockAtMostFor = "2m", lockAtLeastFor = "1m")
//    public void job1() {
//        System.out.println("time=" + DateTime.now().toString("YYYY-MM-dd HH:mm:ss") + " do job1...");
//    }

    /**
     * 每5秒跑一次
     */
    @Scheduled(fixedRate = 5000)
//    @SchedulerLock(name = "SpringJob.job2", lockAtMostFor = "4s", lockAtLeastFor = "4s")
    public void job2() {
//        System.out.println("time=" + DateTime.now().toString("YYYY-MM-dd HH:mm:ss") + " do job2...");
        System.out.println("time=" + LocalDateTime.now() + " do job2...");
    }



}