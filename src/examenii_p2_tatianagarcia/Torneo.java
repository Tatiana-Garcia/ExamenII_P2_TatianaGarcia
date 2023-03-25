package examenii_p2_tatianagarcia;

import java.io.Serializable;
import java.util.ArrayList;

public class Torneo implements Serializable{
    private String nombre; 
    private ArrayList<Equipos> equipos = new ArrayList();
    private ArrayList<Partidos> partidos = new ArrayList();
    private Object periodo; 

    public Torneo() {
    }

    public Torneo(String nombre, Object periodo) {
        this.nombre = nombre;
        this.periodo = periodo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipos> getEquipos() {
        return equipos;
    }

    public ArrayList<Partidos> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partidos> partidos) {
        this.partidos = partidos;
    }
    
    public void setEquipos(ArrayList<Equipos> equipos) {
        this.equipos = equipos;
    }


    public Object getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Object periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return nombre ;
    }

    
    
    
}
