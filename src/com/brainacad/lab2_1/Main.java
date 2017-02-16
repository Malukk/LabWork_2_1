package com.brainacad.lab2_1;

import com.brainacad.lab2_2.*;

public class Main {  public static void main(String[] args) {
    com.brainacad.lab2_2.Computer computer = new com.brainacad.lab2_2.Computer();
    System.out.println(computer.getManufacturer());
    computer.setManufacturer("HP");
    System.out.println(computer.getManufacturer());

    com.brainacad.lab2_2.Computer[] arreyComp = new com.brainacad.lab2_2.Computer[5];
    for (int i = 0; i<arreyComp.length; i++){
        /// arreyComp[i] = new Computer();
        com.brainacad.lab2_2.Computer object = new com.brainacad.lab2_2.Computer();
        object.setManufacturer("ASUS" + (i+1));
        object.setFrequencyCPU(2);
        object.setPrice((float)(Math.random()*1000));
        object.setQuantityCPU(4);
        object.setSerialNumber(2016100 + (i+ 1));
        arreyComp[i] = object;
    }
    for (com.brainacad.lab2_2.Computer element : arreyComp){
        float price = element.getPrice();
        System.out.println("Old price :" + price);
        element.setPrice(price*1.1F);
        System.out.println("New price :" + element.getPrice());
    }
}
}