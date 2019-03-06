package com.cong.springboot.task;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

    /**
     * second , minute, hour, day of month, month , day of week.
     * @code "0 * * * * MON-FRI" 表示周一到周五每分钟的0秒启动
     */
    @Scheduled(cron = "0 * * * * MON-FRI")
    public void scheduleHello(){
        System.out.println("ScheduleService.");
    }
}
