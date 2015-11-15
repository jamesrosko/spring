package com.jamesrosko.java.defaultmethod;

public class MathImpl implements Formula, Formula2{

  @Override
  public double calculate(int a) {
    return 0;
  }

  @Override
  public double sqrt(int a) {
    // TODO Auto-generated method stub
    return Formula.super.sqrt(a);
  }

}
