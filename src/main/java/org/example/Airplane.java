package org.example;

import java.time.LocalTime;

public class Airplane {
    String flightNumber;
    String destination;
    LocalTime scheduleDeparture;
    int delay;

    public Airplane(String flightNumber, String destination, LocalTime localTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.scheduleDeparture = localTime;
        this.delay = 0;
    }

    public String getFlightNumber(){
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber){
        this.flightNumber = flightNumber;
    }
    public String getDestination(){
        return destination;
    }
    public void setDestination(){
        this.destination = destination;
    }

    public LocalTime getScheduleDeparture(){
        return scheduleDeparture;
    }
    public int getDelay(){
        return delay;
    }
    public void delay(int minute){
        this.delay = minute;
        this.scheduleDeparture = scheduleDeparture.plusMinutes(minute);
    }
    public void checkStatus() {

        if (delay == 0) {
            System.out.println("Flight " + flightNumber + " is on time.");
        } else {
            System.out.println("Flight " + flightNumber + " is delayed by " + delay + " minutes.");
        }
    }
    public static void main(String[] args) {
        Airplane flight1 = new Airplane("ACD12332", "new york", LocalTime.of(10, 30));
        Airplane flight2 = new Airplane("BFD2322", "karachi", LocalTime.of(14, 0));
        Airplane flight3 = new Airplane("ADR3248", "london", LocalTime.of(14, 0));

        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();
        flight1.delay(40);
        flight2.delay(110);
        System.out.println("\nCurrent Flight Status:");
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();
    }


}
