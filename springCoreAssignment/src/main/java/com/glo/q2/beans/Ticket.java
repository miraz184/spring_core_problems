package com.glo.q2.beans;

import java.time.LocalDate;
import java.util.List;

public class Ticket {

    private BusDetails busDetails;
    private int noOfSeats;
    private List<Passenger> passengerList;
    private double totalAmount;


    public Ticket() {
    }

    public Ticket(BusDetails busDetails, int noOfSeats, List<Passenger> passengerList, double totalAmount) throws Exception {
        this.busDetails = busDetails;
        this.noOfSeats = noOfSeats;
        this.passengerList = passengerList;
        this.totalAmount = calculateTotalAmount(noOfSeats, busDetails);
    }


    public double calculateTotalAmount(int noOfSeats, BusDetails busDetails) throws Exception {
        if(noOfSeats !=0 && busDetails!=null){
            return noOfSeats*busDetails.getRateOfTicket();
        }
        throw new Exception();
    }

    public void selectAppropriateBus(String from, String to, String arrivalTime, String departureTime, List<BusDetails> busDetails){
        busDetails.stream().filter(b->b.getFrom().equalsIgnoreCase(from) && b.getTo().equalsIgnoreCase(to)
        && b.getArrivalTime().equalsIgnoreCase(arrivalTime) && b.getDepartureTime().equalsIgnoreCase(departureTime)).map(b ->this.busDetails);
    }

    public void displayTicketInformation( BusDetails busDetails, List<Passenger> passengers) throws Exception {

        System.out.println("Ticket Details: "+"\n"+" Bus Id: "+busDetails.getBusId());
        System.out.println("From: "+ busDetails.getFrom());
        System.out.println("To: "+busDetails.getTo());
        System.out.println("Departure Date: "+ LocalDate.now());
        System.out.println("****************************************************************************************************************");
        System.out.println("************************************");
        System.out.println("List Of Passengers: ");
        passengers.stream().forEach(System.out::println);
        System.out.println("****************************************************************************************************************");
        System.out.println("************************************");
        System.out.println("Total Amount: "+ calculateTotalAmount(56,busDetails));
        System.out.println("-----------------------------------------------------------------------------------------------------------------");

    }

}
