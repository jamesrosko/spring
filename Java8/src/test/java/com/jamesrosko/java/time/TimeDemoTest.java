package com.jamesrosko.java.time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
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

  }

  @Test
  public void testFormatter() {
    LocalDate now = LocalDate.now();
    String text = now.format(DateTimeFormatter.BASIC_ISO_DATE);
    LocalDate parsedDate = LocalDate.parse(text, DateTimeFormatter.BASIC_ISO_DATE);
    System.out.println(text);
    System.out.println(parsedDate);

  }

}
