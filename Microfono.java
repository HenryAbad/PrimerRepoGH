package com.company.Modelos;

import com.company.Interfaces.Utilizar;

public class Microfono extends Artefacto implements Utilizar {
    public int getVolumen() {
        return volumen;
    }

    public Microfono(String marca, String color, int volumen) {
        super(marca, color);
        this.volumen = volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public void IniciarUso(){
        System.out.println("Empece a utilizar mi Microfono");
    }
    @Override
    public void finalizarUso(){
        System.out.println("Termine de utilizar mi Microfono");
    }

    @Override
    public void ver(){

        System.out.println("Empece a ver el Microfono");
        Microfono.accesorio NuevoAccesorio = new Microfono.accesorio();
        NuevoAccesorio.ejecutar();
        metododefault();
    }

  private int volumen;

    public static class accesorio{
        int numeroSoportes;

        private void ejecutar(){
            System.out.println("metodo ejecutar");
        }


    }



}
