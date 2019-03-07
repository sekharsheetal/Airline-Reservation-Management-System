package business;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.Scanner;
import business.Person;
import business.Airlines;
/**
 *
 * @author Sheetal Sekhar
 * 
 * 
 */

public class Functions {
    
    
private AirlineDirectory airlineDirectory ;
private FlightSchedule fs ;    
private CustomerDirectory cd ;
public TravelAgency tag ;
private Airlines ar;
private AirplaneFleet apf ;
private MasterSchedule ms;
private TravelOffice tOffice;

    public Functions() {
        

        
 airlineDirectory = new AirlineDirectory();
 fs = new FlightSchedule();    
 cd = new CustomerDirectory();
 tag = new TravelAgency();
 ar = new Airlines();
 apf = new AirplaneFleet();
 ms = new MasterSchedule();
 tOffice = new TravelOffice();
 
        
        FlightAirplane();
        SeatsAllocation();
        
        
        
    }

public Date dateFormatter(String args)
    {
        
      try{
          SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
          Date date = format.parse(args);
          return date;
      }catch(ParseException Ex){
          
          JOptionPane.showMessageDialog(null, "Date Format - MM/dd/yyyy hh:mm:ss");
      } 
     return null;   
    }

  
public void FlightAirplane()
    {

       ArrayList<Flight> fl = new ArrayList<>();

          
          ArrayList<Airplane> allAirplaneFleet = new ArrayList<>();
          for(Airlines a : fs.getArlineDirectory().getAirlinesList()){
              

             for(Airplane ap : a.getAirplaneFleet().getAirplaneFleet()){
              
                 allAirplaneFleet.add(ap);
             }
          }
      }
          

          
          
          int i=0;

          
           Person personInfo = new Person();
              Flight p  = new Flight();
              Airlines airline = new  Airlines();
             

  
 public void SeatsAllocation()
    {

       ArrayList<Seat> seat = new ArrayList<>();

      

          
          ArrayList<Flight> allFlights = new ArrayList<>();
          for(Airlines a : fs.getArlineDirectory().getAirlinesList()){
             for(Airplane ap : a.getAirplaneFleet().getAirplaneFleet()){
              for(Flight f : ap.getFlight()){
               
                  allFlights.add(f);
              }
          }

          
          
          int i=+1;

              Seat p  = new Seat();
             
              p.setTypeOfSeat("0");
              
              
              for(Person ps :cd .getCustomerDirectory()){
                  
                  if(personInfo.equals(ps.getPersonId())){
                      
                      p.setPerson(ps);
                  }
              }
              
              seat.add(p);
              if(seat.size()==6 && i< allFlights.size()){
                allFlights.get(i).setSeat(seat);
                
               seat = new ArrayList<>();
               i++;   
              }
          }fs.setFlight(allFlights);
          ms.setFs(fs);
          tag.setMs(ms);
          
          for(TravelOffice tof :tag.getTravelOffice()){
              tof.setMs(ms);
              tof.setCd(cd);
          }
    }
}

 


