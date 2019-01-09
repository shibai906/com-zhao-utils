package com.zhao.annotation;

@MyAnnotation
public class AnnotationTest {
    public static void main(String[] args) {
        if(AnnotationTest.class.isAnnotationPresent(MyAnnotation.class)) {

            MyAnnotation annotation = AnnotationTest.class.getAnnotation(MyAnnotation.class);
            System.out.println(annotation);
            System.out.println(annotation.arrayAttr());

        }
    }
}
