package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws GastoException {

        Scanner entradaScanner = new Scanner(System.in);
        char [] dniarray;


        System.out.println("Escribe el nombre del usuario");
        String nombre = entradaScanner.nextLine();

        System.out.println("Introduce tu edad");
        int edad = entradaScanner.nextInt();
        entradaScanner.nextLine();

        Usuario user = new Usuario(nombre, edad);

        boolean comprobacion = false;

        do {

            System.out.println("Introduce tu DNI");
            String dni = entradaScanner.nextLine();
            dniarray = dni.toCharArray();
            user.setDNI(dniarray);
            comprobacion = user.setDNI(dniarray);

        }while(!comprobacion);

        Cuenta nueva = new Cuenta(user);
        int menu;
        do {
            System.out.println("Realiza una nueva acción");
            System.out.println("1 Introduce un nuevo gasto");
            System.out.println("2 Introduce un nuevo ingreso");
            System.out.println("3 Mostrar gastos");
            System.out.println("4 Mostrar ingresos");
            System.out.println("5 Mostrar saldo");
            System.out.println("0 Salir");
            menu = entradaScanner.nextInt();
            entradaScanner.nextLine();


            switch (menu) {
                case 1:
                    try {
                        System.out.println("Introduce la descripcion del gasto");
                        String desGasto = entradaScanner.nextLine();
                        System.out.println("Introduce el importe");
                        int gasto = entradaScanner.nextInt();
                        entradaScanner.nextLine();
                        nueva.addGastos(desGasto, gasto);
                    }catch (GastoException e){
                        System.out.println("Saldo insuficiente o cero, verifique saldo primero ");
                    }


                    break;
                case 2:
                    System.out.println("Introduce la descripcion del ingreso");
                    String desIngreso = entradaScanner.nextLine();
                    System.out.println("Introduce el importe");
                    int ingreso = entradaScanner.nextInt();
                    entradaScanner.nextLine();
                    nueva.addIngresos(desIngreso, ingreso);
                    break;
                case  3:
                    System.out.println(nueva.getGastos());
                    break;
                case 4:
                   System.out.println(nueva.getIngresos());
                   break;
                case 5:
                    System.out.println(nueva.getSaldo());
                    break;
            }
        }while(menu != 0);





    }
}
