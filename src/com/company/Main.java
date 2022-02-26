package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws RuntimeException {


        try (Car car = new Car()){
            car.drive();
        } catch (RuntimeException e) {
            e.printStackTrace();

        }


    }
    }



