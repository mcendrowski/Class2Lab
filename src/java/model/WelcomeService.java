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
    
    public int partOfADay(){
        int hour;
       
       hour = this.currentDate.getHour();
       return hour;
    }
    
    
//    date = 
    // method for morning, afternoon and evening returning a string
    // method that takes person's name and returns name and the date result:
    // "Good afternoon, Mariusz. Welcome!"
    
//    <form id=”form1” name=”form1” method=”POST”
//action=”greeter”>
 
    public static void main(String[] args) {
        WelcomeService wc = new WelcomeService();
        System.out.println(wc.partOfADay());
    }
    
}



