package com.brainacad.lab2_2;

/**
 * Created by Bulik on 11.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.getManufacturer());
        computer.setManufacturer("HP");
        System.out.println(computer.getManufacturer());
    }
}
