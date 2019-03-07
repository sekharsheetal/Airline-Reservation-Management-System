/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Sheetal Sekhar
 */
public class Seat {
    
    private String typeOfSeat;
    private Person person;
    private double ratio;

    public double getRatio() {
        return ratio;
    }

    
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


  
    public String getTypeOfSeat() {
        return typeOfSeat;
    }

    public void setTypeOfSeat(String typeOfSeat) {
        this.typeOfSeat = typeOfSeat;
        
        if ((this.typeOfSeat).equals("W")){
        
            ratio = 1.5;    
        }
        else if((this.typeOfSeat).equals("M")){
        
        ratio = 1;
    }
        else {
            ratio = 1.2;
        }
    }
    
    
}
