package Clan;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Clan {

    private String clan = null;
    private String disciplina1;
    private String disciplina2;
    private String disciplina3;


    public void clan() {


        ArrayList<String> clanes = new ArrayList<>();

        clanes.add("Brujah");
        clanes.add("Malkavian");
        clanes.add("Nosferatu");
        clanes.add("Toreador");
        clanes.add("Tremere");
        clanes.add("Ventrue");
        clanes.add("Lasombra");
        clanes.add("Tzimisce");
        clanes.add("Assamita");
        clanes.add("Gangrel");
        clanes.add("Giovanni");
        clanes.add("Seguidores del Set");
        clanes.add("Ravnos");


        for (int i = 0; i < clanes.size(); i++) {
            int index = (int) (Math.random() * clanes.size());
            clan = clanes.get(index);
        }

        System.out.println("Clan: " + clan);


        String elementoClan = clan;
        int indice = clanes.indexOf(elementoClan);

        switch (indice) {


            case 0 -> {
                setDisciplina1("Celeridad");
                setDisciplina2("Potencia");
                setDisciplina3("Presencia");
            }
            case 1 -> {
                setDisciplina1("Dementacion");
                setDisciplina2("Ofuscacion");
                setDisciplina3("Auspex");
            }
            case 2 -> {
                setDisciplina1("Ofuscacion");
                setDisciplina2("Animalismo");
                setDisciplina3("Potencia");
            }
            case 3 -> {
                setDisciplina1("Auspex");
                setDisciplina2("Celeridad");
                setDisciplina3("Presencia");
            }
            case 4 -> {
                setDisciplina1("Taumaturgia");
                setDisciplina2("Auspex");
                setDisciplina3("Ocultacion");
            }
            case 5 -> {
                setDisciplina1("Dominacion");
                setDisciplina2("Fortaleza");
                setDisciplina3("Presenecia");
            }
            case 6 -> {
                setDisciplina1("Obtenebracion");
                setDisciplina2("Potencia");
                setDisciplina3("Presenecia");
            }
            case 7 -> {
                setDisciplina1("Animalismo");
                setDisciplina2("Auspex");
                setDisciplina3("Visicitud");
            }
            case 8 -> {
                setDisciplina1("Celeridad");
                setDisciplina2("Ofuscacion");
                setDisciplina3("Extincion");
            }
            case 9 -> {
                setDisciplina1("Protean");
                setDisciplina2("Fortaleza");
                setDisciplina3("Animalismo");
            }
            case 10 -> {
                setDisciplina1("Dominacion");
                setDisciplina2("Nigromancia");
                setDisciplina3("Potencia");
            }
            case 11 -> {
                setDisciplina1("Ofuscacion");
                setDisciplina2("Presencia");
                setDisciplina3("Serpentis");
            }
            case 12 -> {
                setDisciplina1("Animalismo");
                setDisciplina2("Fortaleza");
                setDisciplina3("Quimerismo");
            }


        }

        int puntos1 = 0;
        int puntos2=0;
        int puntos3=0;

        for (int i = 0; i < 3  ; i++) {

            int numRandomDisciplinas = (int)(Math.random() * 3+1);

            if(numRandomDisciplinas == 1){
                puntos1+=1;
            }else if (numRandomDisciplinas == 2){
                puntos2+=1;
            }else {
                puntos3+=1;
            }
        }

        System.out.println();
        System.out.println("*******==============DISCIPLINAS================*******");
        System.out.println();
        System.out.println(disciplina1 + ": " + puntos1);
        System.out.println(disciplina2 + ": " + puntos2);
        System.out.println(disciplina3 + ": " + puntos3);


    }

}

