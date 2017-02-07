package Classes;

import Interfaces.IEquipo;

/**
 * Created by hambicho on 2/7/17.
 */
public class Jugador {

    private IEquipo equipo;

    public Jugador(IEquipo equipo){
        this.equipo = equipo;
    }

    public void mostrarEquipo(){
        this.equipo.mostrar();
    }
}
