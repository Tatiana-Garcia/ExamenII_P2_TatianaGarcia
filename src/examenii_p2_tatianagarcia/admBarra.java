
package examenii_p2_tatianagarcia;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class admBarra extends Thread{
    private JProgressBar barra;

    public admBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    @Override
    public void run(){
        try {
            Thread.sleep(7000);
        } catch (InterruptedException ex) {
            //Logger.getLogger(admBarra.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(barra.getValue()!=barra.getMaximum()){
            
            barra.setValue(barra.getValue()+1);
            try {
                Thread.sleep(7000);
                    
            } catch (InterruptedException ex) {
            }
            
        }
        barra.setValue(0);
        JOptionPane.showMessageDialog(barra, "Archivo Guardado");
    }
}
