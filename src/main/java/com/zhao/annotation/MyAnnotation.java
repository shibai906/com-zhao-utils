package com.zhao.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // 决定整个生命周期,SOURCE(源文件),CLASS(编译成class文件中还在),RUNTIME(一直存在)
@Target({ElementType.METHOD,ElementType.TYPE}) // target决定注解可以加载那些成分上，类上、属性、方法等
public @interface MyAnnotation {
    String value() default "";

    int[] arrayAttr() default {1,2,3};

    // 添加枚举类型的属性，并指定枚举属性的缺省值，缺省值只能从枚举类对象中
    EnumAnnotation lamp() default EnumAnnotation.TEST;



}
