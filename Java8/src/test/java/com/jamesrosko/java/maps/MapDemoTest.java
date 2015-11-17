package com.jamesrosko.java.maps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MapDemoTest {

  @Test
  public void computeIfPresent() {
    Map<Integer, String> map = new HashMap<>();
    for (int i = 0; i < 10; i++) {
      map.putIfAbsent(i, "val" + i);
    }

    map.computeIfPresent(3, (key, val) -> val + key);
    assertThat(map.get(3), equalTo("val33"));
  }

  @Test
  public void forEach() {
    Map<Integer, String> map = new HashMap<>();
    for (int i = 0; i < 10; i++) {
      map.putIfAbsent(i, "val" + i);
    }

    map.forEach((key, val) -> System.out.println(val));
  }

}
