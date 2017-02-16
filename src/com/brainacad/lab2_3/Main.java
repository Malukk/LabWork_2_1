package com.brainacad.lab2_3;

import com.brainacad.lab2_2.*;
import com.brainacad.lab2_2.Computer;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/**
 * Created by Bulik on 11.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        com.brainacad.lab2_2.Computer computer = new com.brainacad.lab2_2.Computer();
        System.out.println(computer.getManufacturer());
        computer.setManufacturer("HP");
        System.out.println(computer.getManufacturer());

        Computer [] arreyComp = new Computer[5];
        for (int i = 0; i<arreyComp.length; i++){
           /// arreyComp[i] = new Computer();
            Computer object = new Computer();
            object.setManufacturer("ASUS" + (i+1));
            object.setFrequencyCPU(2);
            object.setPrice((float)(Math.random()*1000));
            object.setQuantityCPU(4);
            object.setSerialNumber(2016100 + (i+ 1));
            arreyComp[i] = object;
        }
    }
}
