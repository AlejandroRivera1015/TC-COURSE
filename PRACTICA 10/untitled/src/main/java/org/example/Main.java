package org.example;

import org.example.EdadExcepcion.EdadExcepcion;

public class Main {
    public static void main(String[] args) {
        int edad = 12;
        EdadExcepcion edadEx = new EdadExcepcion();
        try {
            edadEx.validarEdad(edad); //hasta al final porque esto termina la ejecución
        } catch (EdadExcepcion ex) {
            System.out.println(ex);
        }finally{
        }
    }



}