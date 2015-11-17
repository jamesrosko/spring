package com.jamesrosko.java.optional;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Optional;

import org.junit.Test;

public class OptionalDemoTest {

  @Test
  public void testNotPresent() {
    Optional<String> empty = Optional.empty();

    assertThat(empty.isPresent(), equalTo(false));
    assertThat(empty.orElse("fallback"), equalTo("fallback"));
  }
  

  @Test
  public void test() {
    Optional<String> optional = Optional.of("bam");

    assertThat(optional.isPresent(), equalTo(true));
    assertThat(optional.get(), equalTo("bam"));
    assertThat(optional.orElse("fallback"), equalTo("bam"));
    
    optional.ifPresent((s) -> System.out.println(s.length()));
  }

}
