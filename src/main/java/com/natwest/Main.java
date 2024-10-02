package com.natwest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
//        DbConnection dbConnection=(DbConnection) applicationContext.getBean("getInstanceOfBdConnection");
//        System.out.println(dbConnection.getUsername());
//        System.out.println(dbConnection.getPassword());

        DbConnection dbc=(DbConnection) applicationContext.getBean("getDetails");
        dbc.setPassword("1234");
        dbc.setUsername("Aniket");
        System.out.println(dbc.getPassword());
        System.out.println(dbc.getUsername());
    }
}