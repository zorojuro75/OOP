/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.util.Random;

/**
 *
 * @author anikb
 */
public class Campus {
    private Address address;
    private int campusNumber;
    private int staffNumber;

    public Campus() {
        Random r= new Random();
        this.address = setAddress();
        this.campusNumber = r.nextInt(5);
        this.staffNumber = r.nextInt(50);
    }
    
    private Address setAddress(){
        return new Address();
    }

    @Override
    public String toString() {
        return "Campus{" + "address=" + address + ", campusNumber=" + campusNumber + ", staffNumber=" + staffNumber + '}';
    }
}
