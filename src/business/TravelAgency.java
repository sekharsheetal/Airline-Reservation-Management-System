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
public class TravelAgency {
    
    private AirlineDirectory airlineDirectory;
    private ArrayList<TravelOffice> travelOffice;
    private MasterSchedule ms;
    private CustomerDirectory customerDirectory;
    private Airlines airlines;
    private Airplane airplane;
    
public TravelAgency(){
        

        travelOffice = new ArrayList<>();
        airlineDirectory = new AirlineDirectory();
        ms = new MasterSchedule();
        customerDirectory = new CustomerDirectory();
        Airlines airlines = new Airlines();
        Airplane airplane = new Airplane();
    }


    public ArrayList<TravelOffice> getTravelOffice() {
        return travelOffice;
    }

    public void setTravelOffice(ArrayList<TravelOffice> travelOffice) {
        this.travelOffice = travelOffice;
    }

    public MasterSchedule getMs() {
        return ms;
    }

    public void setMs(MasterSchedule ms) {
        this.ms = ms;
    }

    public AirlineDirectory getAirlineDirectory() {
        return airlineDirectory;
    }

    public void setAirlineDirectory(AirlineDirectory airlineDirectory) {
        this.airlineDirectory = airlineDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
  
    public int numberOfFlights(String airlines){
        int i= 0;
        
        for(Airlines airline :ms.getFs().getArlineDirectory().getAirlinesList()){
            if(airline.getName().equals(airlines)){ 
            for(Airplane airplane :airline.getAirplaneFleet().getAirplaneFleet()){
                
             i += airplane.getFlight().size();
             
            }
            }
        }
        return i;
    }
    
}
