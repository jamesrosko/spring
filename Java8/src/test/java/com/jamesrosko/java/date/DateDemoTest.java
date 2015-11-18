package com.jamesrosko.java.date;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

import org.hamcrest.Matchers;
import org.junit.Test;

public class DateDemoTest {

  @Test
  public void localDateTime() {
    LocalDateTime sylvester = LocalDateTime.of(2014, Month.DECEMBER, 31, 23, 59, 59);
    DayOfWeek dayOfWeek = sylvester.getDayOfWeek();
    assertThat(dayOfWeek, equalTo(DayOfWeek.WEDNESDAY));
  }
  
  
  @Test
  public void localTime() {

    ZoneId paris = ZoneId.of("Europe/Paris");
    ZoneId seattle = ZoneId.of("America/Los_Angeles");
    LocalTime nowParis = LocalTime.now(paris);
    LocalTime nowSeattle = LocalTime.now(seattle);

    assertThat(nowParis.isBefore(nowSeattle), equalTo(false));
  }

  @Test
  public void clock() throws InterruptedException {
    Clock clock = Clock.systemDefaultZone();
    long t0 = clock.millis();
    Thread.sleep(100);
    long t1 = clock.millis();
    long diff = t1 - t0;

    System.out.println(String.format("diff %d", diff));
    assertThat(diff, Matchers.greaterThanOrEqualTo(100L));
  }

}
