package com.zhao.utils.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.expression.BeanFactoryAccessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

import java.util.List;

public class Test {

    public static void main(String[] args) {
/*            ApplicationContext applicationContext = BeanFactory*/

//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        GenericGroovyApplicationContext context = new GenericGroovyApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("applicationContext.xml");
        context.refresh();
        Class1 class1 = context.getBean("haha",Class1.class);
        class1.test();

        Class2.Class3 class3 = context.getBean("Class3", Class2.Class3.class);
        class3.test();



    }

}
