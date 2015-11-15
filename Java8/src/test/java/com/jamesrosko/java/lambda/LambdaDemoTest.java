package com.jamesrosko.java.lambda;

import java.util.stream.IntStream;

import org.junit.Test;

public class LambdaDemoTest {

  @Test
  public void test_3() {
    IntStream.range(1, 10)
    .parallel()
    .forEach(System.out::println);
  }
  
  @Test
  public void test_1() {
    IntStream.range(1, 10)
    .forEach(System.out::println);
  }
  @Test
  public void test_2() {
    IntStream.range(1, 10)
    .forEach(x -> System.out.println(x));
  }
}
