package org.example;

import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        applicationContext.registerShutdownHook();

        MyBean myBean = applicationContext.getBean(MyBean.class);
        MyApplicationContextAware applicationContextAware = (MyApplicationContextAware) applicationContext.getBean(ApplicationContextAware.class);


        myBean.print();

        System.out.println(applicationContextAware.getApplicationContext().equals(applicationContext));

    }
}