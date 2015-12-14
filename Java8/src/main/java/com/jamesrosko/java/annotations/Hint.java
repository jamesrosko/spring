package com.jamesrosko.java.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Repeatable(Hints.class)
public @interface Hint {
    String value();
}
