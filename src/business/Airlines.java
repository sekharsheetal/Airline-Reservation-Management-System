/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 *@author Sheetal Sekhar 
 */
public class Airlines {
    
    private String name;
    private String country;
    private AirplaneFleet airplaneFleet = new AirplaneFleet();
    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public AirplaneFleet getAirplaneFleet() {
        return airplaneFleet;
    }

    public void setAirplaneFleet(AirplaneFleet airplaneFleet) {
        this.airplaneFleet = airplaneFleet;
    }
    
    @Override
    public String toString()
    {
    
    return name;
    }
    
    
}
