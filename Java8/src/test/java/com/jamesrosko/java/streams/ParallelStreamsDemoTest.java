package com.jamesrosko.java.streams;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;

public class ParallelStreamsDemoTest {

  private List<String> values;

  @Before
  public void setup() {
    int max = 1000000;
    values = new ArrayList<>(max);
    for (int i = 0; i < max; i++) {
      UUID uuid = UUID.randomUUID();
      values.add(uuid.toString());
    }
  }

  @Test
  public void sequentialSort() {

    long t0 = System.nanoTime();
    long count = values.stream().sorted().count();
    long t1 = System.nanoTime();

    long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
    System.out.println(String.format("sequential sort took: %d ms for %d records", millis, count));

  }

  @Test
  public void parallel() {

    long t0 = System.nanoTime();
    long count = values.parallelStream().sorted().count();
    long t1 = System.nanoTime();

    long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
    System.out.println(String.format("sequential sort took: %d ms for %d records", millis, count));

  }

}
