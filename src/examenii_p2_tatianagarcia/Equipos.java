
package examenii_p2_tatianagarcia;

public class Equipos {
    private String nombre; 
    private int puntos; 

    public Equipos() {
    }

    public Equipos(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Equipos{" + "nombre=" + nombre + ", puntos=" + puntos + '}';
    }
   
}
