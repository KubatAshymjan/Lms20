package com.company;

import java.awt.desktop.PrintFilesEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Car implements AutoCloseable {




    public void drive() {
        System.out.println(" Машина журуп жатат");

        }

    @Override
    public void close() throws RuntimeException {
        System.out.println(" Машина жабылып жатат");
    }
}


