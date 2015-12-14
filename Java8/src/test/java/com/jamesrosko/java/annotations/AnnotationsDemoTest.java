package com.jamesrosko.java.annotations;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;

public class AnnotationsDemoTest {

  
  @Hint("hint1")
  @Hint("hint2")
  class DemoPerson {}
  
  
  @Test
  public void hints() {
    Hints expected = DemoPerson.class.getAnnotation(Hints.class);
    
    assertThat(expected, nullValue());
//    assertThat(expected.value().length, equalTo(2));
  }


  @Test
  public void hint() {
    Hint[] expected = DemoPerson.class.getAnnotationsByType(Hint.class);
    
//    assertThat(expected, nullValue());
    assertThat(expected.length, equalTo(2));
  }
}
