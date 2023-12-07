package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyBean implements InitializingBean, DisposableBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    private final String name;
    private final Long age;

    public MyBean(String name, Long age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.printf("name = %s\n",name);
    }

}
