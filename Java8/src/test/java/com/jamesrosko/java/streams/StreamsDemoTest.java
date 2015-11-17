package com.jamesrosko.java.streams;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

public class StreamsDemoTest {

  private List<String> names;

  @Before
  public void setup() {
    names = new ArrayList<>();
    names.add("ddd2");
    names.add("aaa2");
    names.add("bbb1");
    names.add("aaa1");
    names.add("bbb3");
    names.add("ccc");
    names.add("bbb2");
    names.add("ddd1");
  }

  @Test
  public void reduce() {

    Optional<String> reduced = names.stream()//
        .sorted()//
        .reduce((s1, s2) -> s1 + "#" + s2);

    assertThat(reduced.isPresent(), equalTo(true));
    assertThat(reduced.get(), equalTo("aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2"));
  }

  @Test
  public void count() {

    long actual = names.stream()//
        .filter(s -> s.startsWith("b")) //
        .count();

    assertThat(actual, equalTo(3L));
  }

  @Test
  public void noneMatch() {

    boolean actual = names.stream()//
        .noneMatch(s -> s.startsWith("z"));

    assertThat(actual, equalTo(true));
  }

  @Test
  public void allMatch() {

    boolean actual = names.stream()//
        .allMatch(s -> s.startsWith("a"));

    assertThat(actual, equalTo(false));
  }

  @Test
  public void anyMatch() {

    boolean actual = names.stream()//
        .anyMatch(s -> s.startsWith("a"));

    assertThat(actual, equalTo(true));
  }

  @Test
  public void map() {
    System.out.println("MAP");
    names.stream()//
        .map(String::toUpperCase)//
        .sorted((a, b) -> b.compareTo(a))//
        .forEach(l -> System.out.println(l));
  }

  @Test
  public void sorted() {
    System.out.println("SORTED");
    names.stream()//
        .sorted()//
        .filter(s -> s.startsWith("a"))//
        .forEach(l -> System.out.println(l));
  }

  @Test
  public void filter() {
    System.out.println("FILTER");
    names.stream()//
        .filter(s -> s.startsWith("a"))//
        .forEach(l -> System.out.println(l));
  }

  @Test
  public void stream() {
    System.out.println("STREAM");
    names.stream()//
        .forEach(l -> System.out.println(l));
  }

}
