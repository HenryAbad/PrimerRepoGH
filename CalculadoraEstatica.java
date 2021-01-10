package com.company.Modelos;

import java.io.File;
import java.util.Scanner;

public class CalculadoraEstatica {
    public static int sumar(int a , int b){
        return a+b;
    }

    public static void mostrarMenu(){
        System.out.println(" Sumar | ");
        System.out.println(" Restar | ");
        System.out.println(" Multiplicar | ");
        System.out.println(" Dividir | ");
    }

    public static double  sumar( double a1 , double a2 , double a3){
        double result=0;
        result =  a1 + a2 + a3;
        return result;
    }

    public static void leerArchivo() {
        String ruta;
        ruta = "/Users/henryjimenez/IdeaProjects/HolaMundo3/radarANthony.txt";

        System.out.println("---------------");
        System.out.println("Leyendo Archivo");
        System.out.println("---------------");

        try {
            Scanner input = new Scanner(new File(ruta));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
