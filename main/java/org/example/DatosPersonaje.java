package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.Scanner;

@Data
public class DatosPersonaje {
    private String nombre;
    private String jugador;
    private String cronica;
    private String conducta;
    private String concepto;
    private final int generacion = 13;
    private String clan;
    private String refugio;

    public void datosPersonaje(){
        datosManuales();
        nombre();
        naturalezaYConducta();
    }

    public void datosManuales(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica tu nombre: ");
        jugador = sc.nextLine();
        System.out.println("Indica el nombre de la partida: ");
        cronica = sc.nextLine();
        System.out.println("Indica donde esta situado tu refugio: ");
        refugio = sc.nextLine();
        System.out.println();
        System.out.println("*******==============DATOS DE PERSONAJE================*******");

        System.out.println();
        System.out.println("Jugador: " + jugador);
        System.out.println("Cronica: " + cronica);
        System.out.println("Refugio: " + refugio);
        System.out.println("Generacion: " + getGeneracion());
    }

    public void nombre(){

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Erik Borghan");
        nombres.add("Alexa Calie");
        nombres.add("Winter Collins");
        nombres.add("Maxim Blair");
        nombres.add("Bradley Hars");
        nombres.add("Daniel Abney");
        nombres.add("Allan Ashton");
        nombres.add("Rafaela De Lucas");
        nombres.add("Fabio Minguez");
        nombres.add("Marcos Barrientos");

        for (int i = 0; i < nombres.size() ; i++) {
            int index = (int)(Math.random() * nombres.size());
            nombre = nombres.get(index);
        }

        System.out.println("Nombre: " + nombre);
    }

    public void naturalezaYConducta(){

        ArrayList<String> naturalezasyconductas = new ArrayList<>();

        naturalezasyconductas.add("Adicto");
        naturalezasyconductas.add("Ansioso de emociones");
        naturalezasyconductas.add("Arquitecto");
        naturalezasyconductas.add("Autocrata");
        naturalezasyconductas.add("Bellaco");
        naturalezasyconductas.add("Bizarro");
        naturalezasyconductas.add("Bravucon");
        naturalezasyconductas.add("Bufon");
        naturalezasyconductas.add("Competidor");
        naturalezasyconductas.add("Confabulador");
        naturalezasyconductas.add("Conformista");
        naturalezasyconductas.add("Director");
        naturalezasyconductas.add("Fanatico");
        naturalezasyconductas.add("Hosco");
        naturalezasyconductas.add("Juez");
        naturalezasyconductas.add("Jugador");
        naturalezasyconductas.add("Martir");
        naturalezasyconductas.add("Masoquista");
        naturalezasyconductas.add("Monstruo");
        naturalezasyconductas.add("Ninio");
        naturalezasyconductas.add("Pedagogo");
        naturalezasyconductas.add("Penitente");
        naturalezasyconductas.add("Perfeccionista");
        naturalezasyconductas.add("Pervertido");
        naturalezasyconductas.add("Protector");
        naturalezasyconductas.add("Rebelde");
        naturalezasyconductas.add("Solitario");
        naturalezasyconductas.add("Superviviente");
        naturalezasyconductas.add("Tradicionalista");
        naturalezasyconductas.add("Visionario");
        naturalezasyconductas.add("Vividor");

        for (int i = 0; i < naturalezasyconductas.size() ; i++) {
            int index = (int)(Math.random() * naturalezasyconductas.size());
            conducta = naturalezasyconductas.get(index);
                for (int j = 0; j < naturalezasyconductas.size(); j++) {
                    int index2 = (int)(Math.random() * naturalezasyconductas.size());
                    concepto = naturalezasyconductas.get(index2);
            }

        }

        System.out.println("Conducta: " + conducta);
        System.out.println("Concepto: " + concepto);
    }
}


