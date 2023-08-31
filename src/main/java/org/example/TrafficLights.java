package org.example;

import org.w3c.dom.css.Counter;

public class TrafficLights {

    String color;
    int duration;

    public TrafficLights(String color,int duration){
        this.color = color;
        this.duration = duration;
    }
    public void changeColor(String newColor){
        color = newColor;
    }
    public boolean isRed(){
        return color.equals("red");

    }
    public boolean isGreen(){
        return color.equals("green");
    }
    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }

    public static void main(String[] args) {

        TrafficLights trafficLights = new TrafficLights("red", 1000);

        System.out.println("The light is red: " + trafficLights.isRed());
        System.out.println("The light is green: " + trafficLights.isGreen());

        trafficLights.changeColor("green");

        System.out.println("The light is now green: " + trafficLights.isGreen());
        System.out.println("The light duration is: " + trafficLights.getDuration());
        trafficLights.setDuration(20);
        System.out.println("The light duration is now: " + trafficLights.getDuration());
    }
}
