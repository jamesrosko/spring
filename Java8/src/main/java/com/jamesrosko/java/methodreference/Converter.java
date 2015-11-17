package com.jamesrosko.java.methodreference;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
