package com.zhao.utils.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {

    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DIExample diExample = context.getBean("DI1",DIExample.class);
        System.out.println(diExample.toString());

        System.out.println(context.getBean("DI2",DIExample.class).toString());

        System.out.println(context.getBean("DI3",DIExample.class).toString());
    }

}
