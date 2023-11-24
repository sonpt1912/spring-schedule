package com.example.springschedule.config;

import com.example.springschedule.service.ClearScheduleLog;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@ConditionalOnProperty(value = "schedule.enable", matchIfMissing = true, havingValue = "true")
public class ScheduleConfig {

//    @Scheduled(cron = "0 * * * * *")//Chạy vào 0s của mỗi phút
//    public void showTime() {
//        ShowTime.main(null);
//    }

        @Scheduled(cron = "0 * * * * *")//Chạy vào 0s của mỗi phút
//    @Scheduled(cron = "${schedule.clear.schedule.log}")
    public void clearScheduleLog() {
        new ClearScheduleLog();
    }


}
