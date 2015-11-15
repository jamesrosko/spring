package com.jamesrosko.java.time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.junit.Test;

public class TimeDemoTest {

  @Test
  public void test() {
    
    System.out.println(Instant.EPOCH);
    
    System.out.println(Instant.MAX);
    
    Duration thenToNow = Duration.between(Instant.EPOCH, Instant.now());
    System.out.println(thenToNow);
   
    System.out.println(LocalTime.now());
    Instant now = Instant.now();
    Instant tomorrow = Instant.now().plus(1, ChronoUnit.DAYS);
    System.out.println(now);
    System.out.println(tomorrow);
    
    String formattedNow = DateTimeFormatter.BASIC_ISO_DATE.format();
    System.out.println(formattedNow);
  }

}
