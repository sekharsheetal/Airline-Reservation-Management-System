/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;


/**
 *
 * @author Sheetal Sekhar
 */
public class AirplaneFleet {
    
      private ArrayList<Airplane> airplaneFleet;
    
    public AirplaneFleet()
    {
        airplaneFleet = new ArrayList<>();
        
    }

    public ArrayList<Airplane> getAirplaneFleet() {
        return airplaneFleet;
    }

    public void setAirplaneFleet(ArrayList<Airplane> airplaneFleet) {
        this.airplaneFleet = airplaneFleet;
    }
  
    public Airplane addAirplane(){
       
       Airplane airplane = new Airplane();
       this.airplaneFleet.add(airplane);
       return airplane;
   }
   
   public void deleteAirplane(Airlines airplane){
       
       airplaneFleet.remove(airplane);
       
   }
   
   public Airplane searchAirplane(String airlineName){
       
       for(Airplane airplane:airplaneFleet){
           
           if(airplane.getAirlinerName().equals(airlineName)){
               
               return airplane;
           }
       }
      return null; 
   }
    
    
}
