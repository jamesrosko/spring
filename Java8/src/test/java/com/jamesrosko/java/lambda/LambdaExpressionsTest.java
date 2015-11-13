package com.jamesrosko.java.lambda;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class LambdaExpressionsTest {
  private List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
  private List<String> expected = Arrays.asList("xenia", "peter", "mike", "anna");

  @Test
  public void witoutLambda() {

    Collections.sort(names, new Comparator<String>() {
      @Override
      public int compare(String a, String b) {
        return b.compareTo(a);
      }
    });

    assertThat(names, equalTo(expected));
  }

  @Test
  public void withLambda_1() {
    Collections.sort(names, (String a, String b) -> {
      return b.compareTo(a);
    });
    assertThat(names, equalTo(expected));
  };

  @Test
  public void withLambda_2() {
    Collections.sort(names, (String a, String b) -> b.compareTo(a));

    assertThat(names, equalTo(expected));
  };

  @Test
  public void withLambda_3() {
    names.sort((a, b) -> b.compareTo(a));
    assertThat(names, equalTo(expected));
  };

}
