package com.jamesrosko.java.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import org.junit.Test;
import org.springframework.util.StringUtils;

public class StreamDemoTest {

  @Test
  public void testPath() throws IOException {
    Files.lines(
    Paths.get("/", "usr", "share", "dict", "words"))
      .filter(s -> s.length() > 10)
//      .sorted(...)
      .forEach(System.out::println);
  }

  @Test
  public void testReduce() {
    Stream<Double> sampleDouble = Stream.generate(Math::random).limit(1000);
    Optional<Double> reduce = sampleDouble.reduce((x, y) -> x + y);
    System.out.println(reduce.orElse(0.0));
  }
  
  
  
  @Test
  public void testFilter() {
    Stream.of("aatest1", "", "aatest3")
    .filter(x -> !StringUtils.isEmpty(x))
    .map(String::toUpperCase)
    .forEach(System.out::println);
    
    long count = Stream.of("aatest1", "", "aatest3")
    .filter(x -> !StringUtils.isEmpty(x))
    .map(String::toUpperCase)
    .count();
    System.out.println("count: " + count);

  }
  
  
  @Test
  public void testString() {
    Stream.of("xtest1", "xtest2", "xtest3").map(String::toUpperCase).forEach(System.out::println);
  }

  @Test
  public void testDouble() {
    Stream<Double> sampleDouble = Stream.generate(Math::random).limit(1000);

    double sum = Stream.generate(Math::random).limit(1000).mapToDouble(Double::doubleValue).sum();
    System.out.println(sum);

    OptionalDouble average = sampleDouble.mapToDouble(Double::doubleValue).average();
    if (average.isPresent()) {
      System.out.println(average.getAsDouble());
    }
  }

  @Test
  public void test() {

    List<String> sample = new ArrayList<>();
    sample.add("test1");
    sample.add("test2");
    sample.add("test3 test4");

    sample.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
    // .forEach(System.out::println);

  }

}
