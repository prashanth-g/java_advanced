package com.prashanth.java.ac.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class Reflections01 {

    public static void main(String[] args) {
        // get methods
        final Method[] methods = Objects.class.getMethods();
        for( final Method method: methods ) {
            System.out.println(method.getName());
        }

        // get fields
        final Field[] fields = String.class.getFields();
        for( final Field field: fields ) {
            System.out.println( field.getName() );
        }
    }
}
