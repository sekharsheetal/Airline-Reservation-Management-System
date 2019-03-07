/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sheetal Sekhar
 */
public class Flight {
    
    private String source;
    private String destination;
    private Date departureTime;
    private ArrayList<Seat> seat = new ArrayList<>();
    private String flightId;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }
   

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public ArrayList<Seat> getSeat() {
        return seat;
    }

    public void setSeat(ArrayList<Seat> seat) {
        this.seat = seat;
    }
    @Override
    public String toString()
    {
    
    return flightId;
    }
    
    
     public Seat addSeat(){
       
       Seat seat = new Seat();
       this.seat.add(seat);
       return seat;
   }
}
