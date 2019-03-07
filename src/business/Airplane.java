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
public class Airplane {
    
    private String manufacturer;
    private int manufacturerYear;
    private String modelNum;
    private String serialNum;
    private int NumOfSeats =150;
    private String airlinerName;
    private ArrayList<Flight> flight;
     
    

    public Airplane() {
        flight = new ArrayList<>();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufacturerYear() {
        return manufacturerYear;
    }

    public void setManufacturerYear(int manufacturerYear) {
        this.manufacturerYear = manufacturerYear;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public int getNumOfSeats() {
        return NumOfSeats;
    }

    public void setNumOfSeats(int NumOfSeats) {
        this.NumOfSeats = NumOfSeats;
    }


    public ArrayList<Flight> getFlight() {
        return flight;
    }

    public void setFlight(ArrayList<Flight> flight) {
        this.flight = flight;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }
    
     @Override
    public String toString()
    {
    
    return serialNum;
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
