/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import javax.jws.WebMethod;
import javax.jws.WebService;
import service.serviceI;

/**
 *
 * @author user
 */
@WebService
public class CalcFinder {
   serviceI serviceI0=new serviceI();
    @WebMethod
    public int calculateBD(int year,int month,int day){
    
    return serviceI0.calculateBD(year, month, day);
    
    }
    
}
