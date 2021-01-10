package com.company.Interfaces;

public interface Utilizar {

    final Integer numeroIntentos = 5;

    void IniciarUso();

    void finalizarUso();
    default void metododefault(){
        metodoprivado("Cadena de prueba");

    }

    private void metodoprivado( final String cadena){
        System.out.println(cadena);
    }
}
