
package examenii_p2_tatianagarcia;

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
        while(barra.getValue()!=barra.getMaximum()){
            barra.setValue(barra.getValue()+1);
            
            try {
                Thread.sleep(7000);
                    
            } catch (InterruptedException ex) {
            }
            
        }
        barra.setValue(0);
    }
}
