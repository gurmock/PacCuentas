package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private double saldo;
    private Usuario usuario;
    private List<Gasto> gastos;
    private List<Ingreso> ingresos;

    public Cuenta(Usuario usuario) {
        this.usuario = usuario;
        this.saldo = 0.0;
    //Inicio la listas de gasto e ingreso.
        gastos = new ArrayList<>();
        ingresos = new ArrayList<>();
    }
    public double addIngresos (String description, double ingreso){
        ingresos.add(new Ingreso(ingreso, description));
        this.saldo += ingreso;

        return this.getSaldo();
    }

    public  double addGastos(String description,double gasto) throws  GastoException{

        if(this.getSaldo()<gasto) {
            throw new GastoException();
        }
        gastos.add(new Gasto(gasto,description));
        saldo -= gasto;

        return getSaldo();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public List<Ingreso> getIngresos() {
        return ingresos;
    }
}

