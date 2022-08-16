package org.example;

import lombok.Data;

@Data
public class Ventajas {

    public void ventajas() {
        transfondos();
        virtudes();
    }

    public void transfondos() {

        int alidados = 0;
        int contactos = 0;
        int generacion = 0;
        int criados = 0;
        int influencia = 0;
        int mentor = 0;
        int rebanio = 0;
        int recursos = 0;
        int posicion = 0;
        int puntos = 4;

        for (int i = puntos; i >= 0; i--) {

            int numRandomTransfondos = (int) (Math.random() * 9 + 1);

            if (numRandomTransfondos == 1) {
                alidados += 1;
            } else if (numRandomTransfondos == 2) {
                contactos += 1;
            } else if (numRandomTransfondos == 3) {
                generacion += 1;
            } else if (numRandomTransfondos == 4) {
                criados += 1;
            } else if (numRandomTransfondos == 5) {
                influencia += 1;
            } else if (numRandomTransfondos == 6) {
                mentor += 1;

            } else if (numRandomTransfondos == 7) {
                rebanio += 1;
            } else if (numRandomTransfondos == 8) {
                recursos += 1;
            } else {
                posicion += 1;
            }
        }


        System.out.println();
        System.out.println("*******==============TRANSFONDOS================*******");
        System.out.println();
        System.out.println("Aliados:" + alidados);
        System.out.println("Contactos: " + contactos);
        System.out.println("Generacion: " + generacion);
        System.out.println("Criados: " + criados);
        System.out.println("Influencia: " + influencia);
        System.out.println("Mentor:" + mentor);
        System.out.println("Rebanio: " + rebanio);
        System.out.println("Recursos: " + recursos);
        System.out.println("Posicion: " + posicion);
    }

    public void virtudes() {

        int conciencia = 0;
        int autocontrol = 0;
        int coraje = 0;
        int puntos = 6;

        for (int i = puntos; i >= 0; i--) {

            int numRandomVirtudes = (int) (Math.random() * 3 + 1);
            if (numRandomVirtudes == 1) {
                conciencia += 1;
            } else if (numRandomVirtudes == 2) {
                autocontrol += 1;
            } else {
                coraje = +1;
            }
        }
        int humanidad = conciencia+autocontrol;
        System.out.println();
        System.out.println("*******==============VIRTUDES================*******");
        System.out.println();
        System.out.println("Conciencia: " + conciencia + "       Autocontrol: " + autocontrol + "        Coraje: " + coraje);
        System.out.println();
        System.out.println("Humanidad: " + humanidad + "                  Fuerza de voluntad: " + coraje);
        System.out.println();



    }
}
