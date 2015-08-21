package com.jamesrosko.spring;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;

public class Greeter {

  public String sayHello() {
    DateTime.Property pDoW = new DateTime().dayOfWeek();
    String dayOfWeekAsText = pDoW.getAsText();
    return "Hello World - " + dayOfWeekAsText;
  }

}
