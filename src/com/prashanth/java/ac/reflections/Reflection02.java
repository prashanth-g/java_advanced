package com.prashanth.java.ac.reflections;


import java.lang.annotation.*;
import java.lang.reflect.*;

// Creating annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ReflectionsAnnotations {
    String value();
}

// Using Annotation
class ReflectionsCall {
    @ReflectionsAnnotations(value = "Reflections-Annotations01")
    public void callRef() {
    }
}

// Accessing annotation through Reflections
class Reflections02 {
    public static void main(String args[]) throws Exception {

        ReflectionsCall rc = new ReflectionsCall();
        Method m = rc.getClass().getMethod("callRef");

        ReflectionsAnnotations reflectionsAnnotations = m.getAnnotation(ReflectionsAnnotations.class);
        System.out.println("Given string: " + reflectionsAnnotations.value());
    }
}
