/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author mcendrowski
 */
public class WelcomeService {

    private LocalDateTime currentDate;

    public WelcomeService() {
        this.currentDate = LocalDateTime.now();
    }

    private String partOfADay() {
        int hour;
        String partOfADay = "";

        hour = this.currentDate.getHour();
        if (hour < 12) {
            partOfADay = "morning";
        } else if (hour < 17) {
            partOfADay = "afternoon";
        } else {
            partOfADay = "evening";
        }

        return partOfADay;
    }

    public String welcomeMessage(String name) {
        String message = "";
        message = "Good " + this.partOfADay() + ", " + name + ". Welcome!";
        return message;
    }

//    date = 
    // method for morning, afternoon and evening returning a string
    // method that takes person's name and returns name and the date result:
    // "Good afternoon, Mariusz. Welcome!"
//    <form id=”form1” name=”form1” method=”POST”
//action=”greeter”>
    public static void main(String[] args) {
        WelcomeService wc = new WelcomeService();
        System.out.println(wc.welcomeMessage("Mariusz"));
    }

}
