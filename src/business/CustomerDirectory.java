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
public class CustomerDirectory {
    
    //ArrayList for Customer Class
    
    private ArrayList<Person> customerDirectory;
    
    public CustomerDirectory()
    {
        customerDirectory = new ArrayList<>();
        
    }
    
    public ArrayList<Person> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Person> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    
       public Person addPerson(){
       Person person = new Person();
       this.customerDirectory.add(person);
       return person;
   }
}
