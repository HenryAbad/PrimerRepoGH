package com.company;

import com.company.Interfaces.Utilizar2;
import com.company.Modelos.CalculadoraEstatica;
import com.company.Modelos.Microfono;
import com.company.Modelos.Televisor;
import java.io.File;

import java.io.*;
import java.util.*;


public class HolaMundo3 {
    public static void main (String[] args){
x
        double numeroCanales=0;
        String colornuevo;
        double j=1.1;

        Televisor miTele   = new Televisor("Samsung","Azul",3,true);
        Microfono miMicro   = new Microfono("Samsung","Azul",5);

        numeroCanales = miTele.getNumerocanales();
        colornuevo= miTele.getColor();
        System.out.println("valoZ " + numeroCanales + colornuevo);

        miTele.setNumerocanales(6);
        miTele.setColor("Rojo");
        numeroCanales = miTele.getNumerocanales();
        colornuevo= miTele.getColor();
        System.out.println("valoZ " + numeroCanales + colornuevo);
        miTele.ver();
        System.out.println(" --- -----------------");
        miMicro.ver();

        //crear una nueva interface y utilizar una lambda
        String mensaje0 = "cadena 1";
        Utilizar2 U1 = new Utilizar2() {
            @Override
            public void IniciarUso2(String mensaje) {
                System.out.println("probando interface Utilizar" + mensaje );

            }
        };


        Utilizar2 U2 = (String mensaje2) -> {
            System.out.println("Lambda probando interface Utilizar" + mensaje0 );
        };

        U1.IniciarUso2(mensaje0);
        U2.IniciarUso2(mensaje0);
        //agregamos el abrir un archivo y leerlo.

        //CalculadoraEstatica.leerArchivo();

        /*
        miTele.limpiarValores();

        numeroCanales = miTele.getNumerocanales();
        colornuevo= miTele.getColor();
        System.out.println("valoR " + numeroCanales + colornuevo);
        System.out.println(miTele.toString());
        miTele.IniciarUso();
        miTele.finalizarUso();
        */
        //miMicro.IniciarUso();
        //miMicro.finalizarUso();

        // comentado : sobrecarga de funciones.
        // numeroCanalesD= CalculadoraEstatica.sumar(j,j+1,j+2);




    }


}
