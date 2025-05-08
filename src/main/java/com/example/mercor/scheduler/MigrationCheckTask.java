package com.example.mercor.scheduler;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class MigrationCheckTask {

  @Scheduled(fixedRate = 10000) //10 secs
  public void checkMigration() {
    log.info("Migration Check Executed !!!");
  }
}
