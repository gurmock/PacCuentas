package com.company;

public class Ingreso extends Dinero{

    public Ingreso(double ingreso, String description) {
        this.setDinero(ingreso);
        this.setDescription(description);
    }

    public String toString (){
        return this.getDescription() + this.getDinero();
    }
}
