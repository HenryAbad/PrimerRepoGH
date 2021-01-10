package com.company.Modelos;

// se coloca la palabra reservada abstract para hacer una clase normal en una clase abstracta
// los metodos que se definen como abstract deben ser de obligatoria implementacion en la clase que hereda
public  abstract class Artefacto {
    private String marca;
    private String color;

    public Artefacto(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void ver();



}
