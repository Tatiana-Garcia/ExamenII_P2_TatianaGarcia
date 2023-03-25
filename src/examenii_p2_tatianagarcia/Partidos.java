
package examenii_p2_tatianagarcia;

import java.io.Serializable;

public class Partidos implements Serializable{
    private String equipo1; 
    private String equipo2; 
    private int equi1_puntos; 
    private int equi2_puntos;

    public Partidos() {
    }
    

    public Partidos(String equipo1, String equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }
    public Partidos(String equipo1, String equipo2,int equi1_puntos,int equi2_puntos) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.equi1_puntos = equi1_puntos;
        this.equi2_puntos = equi2_puntos;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public int getEqui1_puntos() {
        return equi1_puntos;
    }

    public void setEqui1_puntos(int equi1_puntos) {
        this.equi1_puntos = equi1_puntos;
    }

    public int getEqui2_puntos() {
        return equi2_puntos;
    }

    public void setEqui2_puntos(int equi2_puntos) {
        this.equi2_puntos = equi2_puntos;
    }

    @Override
    public String toString() {
        return equipo1 + " vs " + equipo2 ;
    }
    
}
