package com.glo.q2.app;

import com.glo.q2.beans.BusDetails;
import com.glo.q2.beans.JavaConfig;
import com.glo.q2.beans.Passenger;
import com.glo.q2.beans.Ticket;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
        Ticket ticket = context.getBean(Ticket.class);

        BusDetails busDetails = new BusDetails("267/A", "2022-01-10", "09:00am", "11:00am", "Bangalore", "Trivandrum",
                2700);

        List<Passenger> passengers = Arrays.asList(new Passenger("Amit", "Rt5678YH", "7866784567", "TY7678UU"),

                new Passenger("Miraz", "EYJPM1234", "7866567867", "TY7473890KKJ"));

        ticket.displayTicketInformation(busDetails,passengers);
    }
}
