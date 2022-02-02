/*
 * Name: Isabelle Trask
* Student #: 991644879
*To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        
        Card object = new Card("Clbs", 8);
        object.setSuit("Clubs");   
         System.out.println("your card is a "+object.getSuit());     
    }
}
