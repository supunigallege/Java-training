/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author user
 */
public class serviceI {
    public int calculateBD(int year, int month, int day) {
        
        boolean isleap=isLeap(year);
        int date;
        
        if(isleap==true){
        
           date= findLeapDate(month, day);
        }else{
        date=findDate(month, day);
        }

        return date;
    }

    private boolean isLeap(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            return true;
        } else {
            return false;
        }

    }
    
    private int findDate(int month,int day){
    
        switch (month){
            case 1:
                return day;
            case 2:
                return 31+day;
            case 3: 
                return 31+28+day;
                
        }
                  
    return 0;
    }
    
    private int findLeapDate(int month,int day){
    
        switch (month){
            case 1:
                return day;
            case 2:
                return 31+day;
            case 3: 
                return 31+29+day;
                
        }
                  
    return 0;
    }
    
}
