


import static java.lang.Thread.yield;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Escuderia extends Thread{

    String nombre;
    int limite;
    JLabel label;
    
    public Escuderia(String nombre,int limite,JLabel label){
    
        this.nombre = nombre;
        this.limite=limite;
        this.label=label;
    }
    

     @Override
    public void run(){
     
        try {
            Interfaz.semaphore.acquire();//LLama al semaforo piendole permisos.
        } catch (InterruptedException ex) {
            Logger.getLogger(Escuderia.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Thread.sleep(3000);//Tiempo el que el jefe de pista estara con la bandera alzandola,una vez la carrera comenzada despues del tiempo el jefe de pista desapararece.
        } catch (InterruptedException ex) {
            Logger.getLogger(Escuderia.class.getName()).log(Level.SEVERE, null, ex);
        }

        int vuelta = -1; 
        int x = label.getLocation().x;

        Integer myint = Interfaz.jList1.getSelectedIndex();//Lista para poder selecionar las vueltas que el usuario querra dar.
        Interfaz.jList1.setSelectedIndex(myint);

        while (vuelta < myint) {

            //System.out.println(nombre + " avanza");
            label.setLocation(x, 0);
            try {
                Thread.sleep(9);//Puedas ver la ejecucion de carrera

            } catch (InterruptedException ex) {
                Logger.getLogger(Escuderia.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Interfaz.personaspista[12].setVisible(false);

            x += 4;
            if (label.getLocation().x == limite) {
                x = 0;
                vuelta++;

            }

        }
        

        yield();//Se basa en prioridades.
        JOptionPane.showMessageDialog(null,nombre+" a llegado a la meta","Posiciones",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/fotos/bandera.png")); 
        Interfaz.boton2.setEnabled(false);
        Interfaz.boton1.setEnabled(true);
        Interfaz.semaphore.release();
    }
    
    
        
}
    

    


