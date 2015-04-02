
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.Timer;

public class Splash2 extends javax.swing.JFrame {
    
    private Timer t;
    private ActionListener al;
    
    public Splash2() {
        al = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                if(jProgressBar1.getValue()<100){
                    jProgressBar1.setValue(jProgressBar1.getValue()+5);
                }else{
                    t.stop();
                    mostrarventana();
                }
            }
        };
        t = new Timer(300,al);
        initComponents();
        setSize(700,360);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        t.start();
        
        
    }
    
    private void mostrarventana(){
        Interfaz i = new Interfaz();
        i.setLocationRelativeTo(null);
        i.setVisible(true);
        this.dispose();
    }
    
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("fotos/icono.png"));


        return retValue;
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cargando Pista...");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 300, 130, 30);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(280, 300, 200, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/splash2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 698, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
