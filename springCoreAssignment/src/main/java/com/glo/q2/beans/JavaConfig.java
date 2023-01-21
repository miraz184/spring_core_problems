package com.glo.q2.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public BusDetails busDetails(){
        return new BusDetails();
    }

    @Bean
    public Passenger passenger(){
        return new Passenger();
    }
    @Bean
    public Ticket ticket(){
        return new Ticket();
    }
}
