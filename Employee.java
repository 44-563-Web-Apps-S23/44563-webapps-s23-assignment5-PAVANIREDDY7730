/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.spring23Sec01.KarumuriPavaniEng01;

/**
 *
 * @author  PavaniKarumuri
 */
public class Employee {
    // Declared variables in Employee class
   private String firstName;
   private String lastName;
   private double salPerAnnum ;
   private static final double BONUS_PERCENTAGE = 10.8;
   //  constructor with three parameters,
   public Employee (String firstName,String lastName,double salPerAnnum){
        this.firstName =firstName;
        this.lastName=lastName;
        this.salPerAnnum=salPerAnnum;
       }
   // method with name calculateBonus()
    public double calculateBonus(){
        return (this.salPerAnnum * BONUS_PERCENTAGE)/100;
    }
    // toString() method
    public String toString(){
        return firstName+" "+lastName+" "+"bonus amount per Annum is "+ calculateBonus();
    }
   
   
   
    
}
