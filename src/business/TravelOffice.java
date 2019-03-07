
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
public class TravelOffice {
    
    private String officeId;
    private String name;
    private String city;
    private CustomerDirectory cd;
    private MasterSchedule ms;

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CustomerDirectory getCd() {
        return cd;
    }

    public void setCd(CustomerDirectory cd) {
        this.cd = cd;
    }

    public MasterSchedule getMs() {
        return ms;
    }

    public void setMs(MasterSchedule ms) {
        this.ms = ms;
    }
    
    
    
}
