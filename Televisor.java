package com.company.Modelos;

import com.company.Interfaces.Utilizar;

public class Televisor extends Artefacto implements Utilizar {

  public int getNumerocanales() {
    return numerocanales;
  }

  public Televisor(String marca, String color, int numerocanales, boolean delgado) {
    super(marca, color);
    this.numerocanales = numerocanales;
    this.delgado = delgado;
  }

  public void setNumerocanales(int numerocanales) {
    this.numerocanales = numerocanales;
  }

  public boolean isDelgado() {
    return delgado;
  }

  public void setDelgado(boolean delgado) {
    this.delgado = delgado;
  }

  int numerocanales;
  boolean delgado;

  public void limpiarValores(){
    //This , indica que esta en la clase actual
    this.setDelgado(false);
    this.setNumerocanales(0);
    //super indica que viene de la clase padre
    super.setColor("");
    super.setMarca("");
  }

  @Override
  public String toString() {
    return "Televisor{" +
            "numerocanales=" + numerocanales +
            ", delgado=" + delgado +
            '}';
  }
  @Override
  public void IniciarUso(){
    System.out.println("Empece a utilizar mi tele");
  }

  @Override
  public void finalizarUso(){
    System.out.println("Termine de utilizar mi tele");
  }

  @Override
  public void ver(){
    System.out.println("Empece a ver mi tele");
  }
  /*
  public int indicarnumerocanalessoloLima(){
    return numerocanales - 1 ;
  } */

}
