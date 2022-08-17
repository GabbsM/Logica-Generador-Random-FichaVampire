package Atributos;

import lombok.Data;

@Data
public class Atributos {

    private int Fisicos ;
    private int Sociales;
    private int Mentales;

    public Atributos(){

    }

    public void atributos(){
        grupoPuntos();
        repartoPuntosFuerza();
        repartoPuntosSociales();
        repartoPuntosMentales();
    }

    public void grupoPuntos() {

        int numAleatorio = (int)(Math.random()*3+1);
        int siete = 7;
        int cinco = 5;
        int tres = 3;


        if (numAleatorio == 1) {
            setSociales(siete);
            setFisicos(cinco);
            setMentales(tres);
        } else if (numAleatorio == 2) {
            setSociales(cinco);
            setFisicos(tres);
            setMentales(siete);
        } else {
            setSociales(tres);
            setFisicos(siete);
            setMentales(cinco);
        }


    }
    public void repartoPuntosFuerza() {

        int fuerza = 1;
        int destreza = 1;
        int resistencia = 1;


        for (int i = 0; i < getFisicos(); i++) {

            int numRandomFuerza = (int)(Math.random()*3+1);

            if(numRandomFuerza == 1){
                fuerza+=1;

            } else if (numRandomFuerza == 2) {
                resistencia +=3;
            }else {
                destreza+=1;
            }
        }

        System.out.println();
        System.out.println("*******==============ATRIBUTOS================*******");


        System.out.println();
        System.out.println("* FISICO " + getFisicos() + " puntos *");
        System.out.println();
        System.out.println("Fuerza: " + fuerza + "   Resistencia: " + resistencia + "   Destreza: " + destreza);


    }
    public void repartoPuntosSociales (){

    int carisma = 1;
    int manipulacion = 1;
    int apariencia = 1;


        for (int i = 0; i < getSociales(); i++) {

            int numRandomSociales = (int)(Math.random()*3+1);

        if (numRandomSociales == 1) {
            carisma += 1;
        } else if (numRandomSociales == 2) {
            manipulacion += 1;
        } else {
            apariencia += 1;
        }
    }

        System.out.println();
        System.out.println("* SOCIALES " + getSociales() + " puntos *");
        System.out.println();
        System.out.println("Carisma: " + carisma + "   Manipulacion: " + manipulacion + "   Apariencia: " + apariencia);


}
    public void repartoPuntosMentales() {

        int percepcion = 1;
        int inteligencia = 1;
        int astucia = 1;


        for (int i = 0; i < getMentales(); i++) {

            int numRandomMentales = (int)(Math.random()*3+1);

            if (numRandomMentales == 1) {
                percepcion += 1;
            } else if (numRandomMentales == 2) {
                inteligencia += 1;
            } else {
                astucia += 1;
            }
        }


        System.out.println();
        System.out.println("* MENTALES " + getMentales() + " puntos *");
        System.out.println();
        System.out.println("Percepcion: " + percepcion + "   Inteligencia: " + inteligencia + "   Astucia: " + astucia);


    }


}
