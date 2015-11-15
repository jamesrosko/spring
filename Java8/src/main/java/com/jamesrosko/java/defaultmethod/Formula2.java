package com.jamesrosko.java.defaultmethod;

public interface Formula2 {
  double calculate(int a);

  default double sqrt(int a) {
    return Math.sqrt(a);
  }
}
