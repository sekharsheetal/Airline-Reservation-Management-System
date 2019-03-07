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
public class FlightSchedule {
    
   private ArrayList<Flight> flight;
   private AirlineDirectory arlineDirectory;
   
    public FlightSchedule(){
        
        flight = new ArrayList<>();
        arlineDirectory = new AirlineDirectory();
        
    }

    public ArrayList<Flight> getFlight() {
        return flight;
    }

    public void setFlight(ArrayList<Flight> flight) {
        this.flight = flight;
    }

    public AirlineDirectory getArlineDirectory() {
        return arlineDirectory;
    }

    public void setArlineDirectory(AirlineDirectory arlineDirectory) {
        this.arlineDirectory = arlineDirectory;
    }

     public Flight addFlight(){
       
     Flight flight = new Flight();
     this.flight.add(flight);
      return flight;
     }
    
     public void deleteFlight(Flight flight){
       
     this.flight.remove(flight);
       
   }
}
