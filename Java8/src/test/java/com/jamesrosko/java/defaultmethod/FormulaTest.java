package com.jamesrosko.java.defaultmethod;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FormulaTest {

  private Formula formula = new Formula() {
    @Override
    public double calculate(int a) {
      return sqrt(a * 100);
    }
  };
  @Test
  public void test2() {
  }
  
  @Test
  public void test() {
    assertThat(formula.calculate(100), equalTo(100.0));
    assertThat(formula.sqrt(16), equalTo(4.0));
  }

}
