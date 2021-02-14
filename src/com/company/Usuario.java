package com.company;

import java.util.Arrays;

public class Usuario {

    private String nombre;
    private int edad;
    private char [] DNI;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;


    }

    public char[] getDNI() {
        return DNI;
    }
    // Introducimos el valor del DNI y comprobamos si es correcto.
    public boolean setDNI(char[] DNI) {
        this.DNI = DNI;
        int ultimaPosicion = this.DNI[this.DNI.length -1];

        for (char a = 0;a < 7 ;a++){
            if (!Character.isDigit(this.DNI[a])){
                return false;
            }
        }

        if(Character.isDigit(ultimaPosicion)){

            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + Arrays.toString(DNI) +
                '}';
    }


}
