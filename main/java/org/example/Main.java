package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {


    public static void main(String[] args) {

        Atributos atributos = new Atributos();
        Habilidades habilidades = new Habilidades();
        DatosPersonaje datospj = new DatosPersonaje();
        Ventajas ventajas = new Ventajas();
        Clan clan = new Clan();

        datospj.datosPersonaje();
        clan.clan();
        atributos.atributos();
        habilidades.habilidades();
        ventajas.ventajas();




    }
}