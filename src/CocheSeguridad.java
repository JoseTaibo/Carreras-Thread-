
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CocheSeguridad extends Thread{

    String nombre;
    int limite;
    JLabel label;
    
    
    public CocheSeguridad(String nombre,int limite,JLabel label) {
        
        this.nombre = nombre;
        this.limite=limite;
        this.label=label;
        
        
    }
    
    
    @Override
    public synchronized  void run() {

        int vuelta = -1;
        int x = label.getLocation().x;

        Integer myint = Interfaz.jList1.getSelectedIndex();
        Interfaz.jList1.setSelectedIndex(myint);

        while (vuelta < myint) {

            //System.out.println(nombre + " avanza");
            label.setLocation(x, 0);
            try {
                Thread.sleep(9);
            } catch (InterruptedException ex) {
                Logger.getLogger(Escuderia.class.getName()).log(Level.SEVERE, null, ex);
            }

            x += 3;
            if (label.getLocation().x == limite) {
                x = 0;
                vuelta++;

            }
        }

        yield();
        

    }
    
}


    

