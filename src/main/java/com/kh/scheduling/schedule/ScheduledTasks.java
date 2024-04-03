package com.kh.scheduling.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Slf4j
public class ScheduledTasks {

    @Scheduled(fixedRate = 5000)
    public void fixedRate() {
        log.info("fixedRate ===== " + LocalDate.now());
    }

    @Scheduled(cron = "*/15 * * * * *")
    public void cron() {
        log.info("cron ===== " + LocalDate.now());
    }
}
