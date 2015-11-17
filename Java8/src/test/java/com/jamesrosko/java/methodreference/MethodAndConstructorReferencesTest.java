package com.jamesrosko.java.methodreference;

import org.junit.Test;

public class MethodAndConstructorReferencesTest {

  @Test
  public void methodReference() {
    Converter<String,Integer> converter = Integer::valueOf;
    Integer converted = converter.convert("123");
    System.out.println(converted);
  }
  
  @Test
  public void constructorReference() {
    
  }

}
