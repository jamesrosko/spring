package com.jamesrosko.java.maps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class MapDemoTest {

  private Map<Integer, String> map;

  @Before
  public void setup() {
    map = new HashMap<>();
    // for (int i = 0; i < 10; i++) {
    // map.putIfAbsent(i, "val" + i);
    // }
    IntStream.range(0, 10) //
        .forEach(i -> map.putIfAbsent(i, "val" + i));
  }

  @Test
  public void getOrDefault() {
    String actual = map.getOrDefault(55, "not found");
    assertThat(actual, equalTo("not found"));
  }

  @Test
  public void remove() {
    map.remove(3, "asdf");
    assertThat(map.get(3), equalTo("val3"));

    map.remove(3, "val3");
    assertThat(map.get(3), nullValue());

    map.remove(4);
    assertThat(map.get(4), nullValue());
  }

  @Test
  public void verifyMap() {
    assertThat(map.size(), equalTo(10));
    assertThat(map.values(), hasItem("val1"));
    assertThat(map.values(), hasItem("val2"));
    assertThat(map.values(), hasItem("val3"));
  }

  @Test
  public void computeIfPresent() {

    map.computeIfPresent(3, (key, val) -> val + key);
    assertThat(map.get(3), equalTo("val33"));
  }

  @Test
  public void forEach() {
    String[] expectedArray = { "val0", "val1", "val2", "val3", "val4", "val5", "val6", "val7", "val8", "val9" };
    List<String> expected = Arrays.asList(expectedArray);

    List<String> actual = new ArrayList<>();
    map.forEach((key, val) -> actual.add(val));
    
    assertThat(actual, equalTo(expected));
  }

}
