import Atributos.Atributos;
import Clan.Clan;
import DatosPJ.DatosPersonaje;
import Habilidades.Habilidades;
import Ventajas.Ventajas;

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