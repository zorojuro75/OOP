/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author anikb
 */
public class Address implements Serializable{
    private String areaName;
    private int plot;
    private int road;
    private String block;

    public Address(String areaName, int plot, int road, String block) {
        this.areaName = areaName;
        this.plot = plot;
        this.road = road;
        this.block = block;
    }

    public Address() {
        ArrayList<String> area= new ArrayList();
        area.add("bashundhara");
        area.add("Banani");
        area.add("Jatrabari");
        area.add("Motijheel");
        area.add("Dhanmondi");
        ArrayList<String> blocks= new ArrayList();
        blocks.add("A");
        blocks.add("B");
        blocks.add("C");
        blocks.add("D");
        blocks.add("E");
        Random r = new Random();
        int i = r.nextInt(5);
        this.areaName = area.get(i);
        this.plot = r.nextInt(50);
        this.road = r.nextInt(10);
        i = r.nextInt(5);
        this.block = blocks.get(i);
    }

    @Override
    public String toString() {
        return "Address{" + "areaName=" + areaName + ", plot=" + plot + ", road=" + road + ", block=" + block + '}';
    }
}
