package examenii_p2_tatianagarcia;

import java.util.ArrayList;

public class Torneo {
    private String nombre; 
    private ArrayList<Equipos> equipos = new ArrayList();
    private ArrayList<Deporte> deportes = new ArrayList();
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

    public void setEquipos(ArrayList<Equipos> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Deporte> getDeportes() {
        return deportes;
    }

    public void setDeportes(ArrayList<Deporte> deportes) {
        this.deportes = deportes;
    }

    public Object getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Object periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Torneo{" + "nombre=" + nombre + ", equipos=" + equipos + ", deportes=" + deportes + '}';
    }
    
    
}
