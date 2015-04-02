
import static java.lang.Thread.yield;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ProteccionCivil extends Thread{

    String nombre;
    int limite;
    JLabel label;
   
    public ProteccionCivil(String nombre,int limite,JLabel label) {
        
        this.nombre = nombre;
        this.limite=limite;
        this.label=label;
        
        
    }
    
    
    @Override
    public synchronized void run() {

        for (int i = 0; i < limite; i++) {

            //System.out.println(nombre + " avanza");

            label.setLocation(i, 0);
            int x = label.getLocation().x;
            try {
                Thread.sleep(10);

            } catch (InterruptedException ex) {
                Logger.getLogger(Escuderia.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        JOptionPane.showMessageDialog(null,nombre+" a llegado al lugar del accidente","Parte Medico",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/fotos/enfermo.png"));
        try {
            Thread.sleep(2000);
            JOptionPane.showMessageDialog(null,"Resetea la carrera para comenzar de nuevo","Informacion",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/fotos/undo.png"));
            Interfaz.boton3.setEnabled(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProteccionCivil.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
