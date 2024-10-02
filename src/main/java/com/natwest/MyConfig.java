package com.natwest;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public DbConnection getInstanceOfBdConnection(){
        DbConnection dbConnection=new DbConnection();
        dbConnection.setUsername("Riti s");
        dbConnection.setPassword("040800");
        return  dbConnection;
    }
    @Bean
    public DbConnection getInstanceByConstrecter(){
        return new DbConnection("Lata Rani","02038");
    }
    @Bean
    public DbConnection getDetails(){
        return new DbConnection();
    }
}
