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
public class AirlineDirectory {
    
    private ArrayList<Airlines> airlinesList;
    
    public AirlineDirectory(){
        
        airlinesList = new ArrayList<>();
    }

    public ArrayList<Airlines> getAirlinesList() {
        return airlinesList;
    }

    public void setAirlinesList(ArrayList<Airlines> airlinesList) {
        this.airlinesList = airlinesList;
    }
    
    
       public Airlines addAirline(){
       
       Airlines airlines = new Airlines();
       this.airlinesList.add(airlines);
       return airlines;
   }
   
   public void deleteAirline(Airlines airline){
       
       airlinesList.remove(airline);
       
   }
   
   public Airlines searchAirlines(String airlineName){
       
       for(Airlines airlines:airlinesList){
           
           if(airlines.getName().equals(airlineName)){
               
               return airlines;
           }
       }
      return null; 
   }
}

