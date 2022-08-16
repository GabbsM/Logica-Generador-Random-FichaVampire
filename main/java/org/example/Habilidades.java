package org.example;

import lombok.Data;

@Data
public class Habilidades {

    private int talentos;
    private int tecnicas;
    private int conocimientos;

    public Habilidades() {

    }

    public void habilidades() {
        grupoPuntos();
        repartoPuntosTalentos();
        repartoPuntosTecnicas();
        repartoPuntosConocimientos();
    }

    public void grupoPuntos() {

        double numAleatorio = Math.random() * 10 + 1;
        int trece = 13;
        int nueve = 9;
        int cinco = 5;

        if (numAleatorio >= 0.1 && numAleatorio <= 3.3) {
            setTalentos(trece);
            setTecnicas(nueve);
            setConocimientos(cinco);
        } else if (numAleatorio >= 3.4 && numAleatorio <= 6.7) {
            setTalentos(nueve);
            setTecnicas(cinco);
            setConocimientos(trece);
        } else {
            setTalentos(cinco);
            setTecnicas(trece);
            setConocimientos(nueve);
        }
    }


    public void repartoPuntosTalentos() {

        int alerta = 0;
        int atletismo = 0;
        int callejeo = 0;
        int empatica = 0;
        int esquivar = 0;
        int expresion = 0;
        int intimidacion = 0;
        int liderazgo = 0;
        int pelea = 0;
        int subterfugio = 0;

        for (int i = 0; i < getTalentos(); i++) {

            int numRandomTalento = (int) (Math.random() * 10) + 1;

            if (numRandomTalento == 1) {
                alerta += 1;
            } else if (numRandomTalento == 2) {
                atletismo += 1;
            } else if (numRandomTalento == 3) {
                callejeo += 1;
            } else if (numRandomTalento == 4) {
                empatica += 1;
            } else if (numRandomTalento == 5) {
                esquivar += 1;

            } else if (numRandomTalento == 6) {
                expresion += 1;
            } else if (numRandomTalento == 7) {
                intimidacion += 1;
            } else if (numRandomTalento == 8) {
                liderazgo += 1;
            } else if (numRandomTalento == 9) {
                pelea += 1;
            } else {
                subterfugio += 1;
            }

        }

        System.out.println();
        System.out.println();
        System.out.println("*******==============HABILIDADES================*******");

        System.out.println();
        System.out.println("* TALENTOS " + getTalentos() + " puntos *");
        System.out.println();
        System.out.println("Alerta:" + alerta + "   Atletismo:" + atletismo + "   Callejeo:" + callejeo + "   Empatia:" +  empatica + "   Esquivar:" + esquivar);
        System.out.println("Expresion:" + expresion + "   Intimidacion:" + intimidacion + "   Liderazgo:" + liderazgo + "   Pelea:" + pelea + "   Subterfugio:" + subterfugio);

    }
    public void repartoPuntosTecnicas() {

        int armasCC = 0;
        int armasFuego = 0;
        int conducir = 0;
        int etiqueta = 0;
        int interpretacion = 0;
        int pericias = 0;
        int seguridad = 0;
        int sigilo = 0;
        int supervivencia = 0;
        int tratoConAnimales = 0;

        for (int i = 0; i < getTecnicas(); i++) {

            int numRandomTecnicas = (int) (Math.random() * 10) + 1;

            if (numRandomTecnicas == 1) {
                armasCC += 1;
            } else if (numRandomTecnicas == 2) {
                armasFuego += 1;
            } else if (numRandomTecnicas == 3) {
                conducir += 1;
            } else if (numRandomTecnicas == 4) {
                etiqueta += 1;
            } else if (numRandomTecnicas == 5) {
                interpretacion += 1;

            } else if (numRandomTecnicas == 6) {
                pericias += 1;
            } else if (numRandomTecnicas == 7) {
                seguridad += 1;
            } else if (numRandomTecnicas == 8) {
                sigilo += 1;
            } else if (numRandomTecnicas == 9) {
                supervivencia += 1;
            } else {
                tratoConAnimales += 1;
            }
        }

        System.out.println();
        System.out.println("* TECNICAS  " + getTecnicas() + " puntos *");
        System.out.println();
        System.out.println("Armas CC:" + armasCC + "   Armas de fuego:" + armasFuego + "   Conducir:" + conducir + "   Etiqueta:" + etiqueta + "   Interpretacion:" + interpretacion);
        System.out.println("Pericias:" + pericias + "   Seguridad:" + seguridad + "   Sigilo:" + sigilo + "   Supervivencia:" + supervivencia + "   Trato con animales:" + tratoConAnimales);

    }
    public void repartoPuntosConocimientos() {

        int academicismo = 0;
        int ciencias = 0;
        int finanzas = 0;
        int informatica = 0;
        int investigacion = 0;
        int leyes = 0;
        int linguistica = 0;
        int medicina = 0;
        int ocultismo = 0;
        int politica = 0;

        for (int i = 0; i < getTecnicas(); i++) {

            int numRandomConocimientos = (int) (Math.random() * 10) + 1;

            if (numRandomConocimientos == 1) {
                academicismo += 1;
            } else if (numRandomConocimientos == 2) {
                ciencias += 1;
            } else if (numRandomConocimientos == 3) {
                finanzas += 1;
            } else if (numRandomConocimientos == 4) {
                informatica += 1;
            } else if (numRandomConocimientos == 5) {
                investigacion += 1;

            } else if (numRandomConocimientos == 6) {
                leyes += 1;
            } else if (numRandomConocimientos == 7) {
                linguistica += 1;
            } else if (numRandomConocimientos == 8) {
                medicina += 1;
            } else if (numRandomConocimientos == 9) {
                ocultismo += 1;
            } else {
                politica += 1;
            }
        }
        System.out.println();
        System.out.println("* CONOCIMIENTOS  " + getConocimientos() + " puntos *");
        System.out.println();
        System.out.println("Acadecimismo: " + academicismo + "   Ciencias: " + ciencias + "   Finanzas: " + finanzas + "   Informatica: " + informatica + "   Investigacion: " + investigacion);
        System.out.println("Leyes: " + leyes + "   Linguistica: " + linguistica + "   Medicina: " + medicina + "   Ocultimo:" + ocultismo + "   Politica: " + politica);

    }
}
