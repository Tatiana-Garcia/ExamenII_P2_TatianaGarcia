/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_p2_tatianagarcia;

import java.util.ArrayList;

/**
 *
 * @author tatig
 */
public class Deporte {
    private ArrayList<Torneo> torneos = new ArrayList();

    public Deporte() {
    }
    

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }
    
    @Override
    public String toString() {
        return "Deporte{" + "torneos=" + torneos + '}';
    }
    
}
