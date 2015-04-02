
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author josetaibobueno@hotmail.com
 */


public class Interfaz extends javax.swing.JFrame {
    

    JLabel[] coches = new JLabel[4];
    static JLabel[] personaspista = new JLabel[18];
    Escuderia[] hilos = new Escuderia[4];
    ProteccionCivil [] prote = new ProteccionCivil[1];
    CocheSeguridad [] cs = new CocheSeguridad[1];
    int parada = (int) ((Math.random() * 1) + 3);//Numero aleatorio entre 1 y 4 para a parada aleatoria de los hilos.
    static Semaphore semaphore = new Semaphore (4);//Semaforo con 4 permisos.
    
    
    
    
    public Interfaz() {
        initComponents();
        
        setTitle("FORMULA 1");
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setVisible(true);
        setSize(1305,650);
        setLocationRelativeTo(null);
        setResizable(false);
        boton3.setEnabled(false);
        boton2.setEnabled(false);
              

        for (int i=0; i <=11; i++) {
            personaspista[i]=new JLabel(new ImageIcon(getClass().getResource("/fotos/fotografo2.gif")));
            fondo.add(personaspista[i]);
        }
        
        
        int posicion = 352;//Posicion fija en la interfaz creamos varaibles para no tener que cambiar todas una a una.
        personaspista[0].setBounds(0, 00, 100, posicion);
        personaspista[1].setBounds(0, 00, 200, posicion);
        personaspista[2].setBounds(0, 00, 300, posicion);
        personaspista[3].setBounds(0, 00, 400, posicion);
        personaspista[4].setBounds(0, 00, 500, posicion);
        personaspista[5].setBounds(0, 00, 600, posicion);
        personaspista[6].setBounds(0, 00, 1600, posicion);
        personaspista[7].setBounds(0, 00, 1700, posicion);
        personaspista[8].setBounds(0, 00, 1800, posicion);
        personaspista[9].setBounds(0, 00, 1900, posicion);
        personaspista[10].setBounds(0, 00, 2000, posicion);
        personaspista[11].setBounds(0, 00, 2100, posicion);
       
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Exit");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1110, 560, 34, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reset");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(650, 574, 33, 10);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Iniciar Carrera");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(530, 570, 90, 20);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "1 Vuelta", "2 Vuelta", "3 Vuelta", "4 Vuelta", "5 Vuelta", "6 Vuelta", "7 Vuelta", "8 Vuelta", "9 Vuelta", "10 Vuelta", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jList1.setSelectedIndex(0);
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 570, 80, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("P.Accidente");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 570, 70, 20);

        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nº Vueltas:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 550, 120, 20);

        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/play.png"))); // NOI18N
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton1);
        boton1.setBounds(530, 590, 80, 30);

        boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/stop_sign.png"))); // NOI18N
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(boton2);
        boton2.setBounds(430, 590, 80, 30);

        boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/undo.png"))); // NOI18N
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(boton3);
        boton3.setBounds(630, 590, 80, 30);

        boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/gnome_session_suspend(1).png"))); // NOI18N
        boton4.setMaximumSize(new java.awt.Dimension(18, 18));
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(boton4);
        boton4.setBounds(1090, 580, 60, 30);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/Gradario.PNG"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 1300, 550);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/fondo.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-30, 550, 1330, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        
       
            fondo.setLayout(null);
            boton1.setEnabled(false);
            boton3.setEnabled(false);
            boton2.setEnabled(true);
            
        
            
            //Se crea el juez de meta con la bandera indicando que la carrera comienza
            personaspista[12]=new JLabel(new ImageIcon(getClass().getResource("/fotos/salida.gif")));
            personaspista[12].setBounds(0,00,2490,890);
            fondo.add(personaspista[12]);
            
            
            //Creamos en el arrays de coches los labels con las imagenes de cada coche.
            coches[0]=new JLabel(new ImageIcon(getClass().getResource("/fotos/ferrari.png")));
            coches[1]=new JLabel(new ImageIcon(getClass().getResource("/fotos/redbull.png")));
            coches[2]=new JLabel(new ImageIcon(getClass().getResource("/fotos/mclaren.png")));
            coches[3]=new JLabel(new ImageIcon(getClass().getResource("/fotos/williams.png")));
            
            //Se añade al fondo los distintos labels creados.
            fondo.add(coches[0]);
            fondo.add(coches[1]);
            fondo.add(coches[2]);
            fondo.add(coches[3]);
            
            
            //Ponemos los labels en una posicion.
            coches[0].setBounds(0,0,100,420);
            coches[1].setBounds(0,0,100,500);
            coches[2].setBounds(0,00,100,720);
            coches[3].setBounds(0,00,100,820);
            
            
            
            //Creamos los hilos llamando a sus contrusctor de la clase escuderia que extiende de THREAD.
            hilos[0] =new Escuderia("Williams",1400,coches[0]);//Le pasamos parametros de nombres,limite hasta donde llegan y el lables creado(Imagen).
            hilos[1]=new Escuderia("Ferrari",1400,coches[1]);
            hilos[2]=new Escuderia("Mclaren",1400,coches[2]);
            hilos[3]=new Escuderia("Red Bull",1400,coches[3]);
            
            
            //Corremos cada hilo.
            hilos[0].start();
            hilos[1].start();
            hilos[2].start();
            hilos[3].start();
            
        
        
            
        
        
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        
            close();//Boton de cerrado de la aplicacion
    }//GEN-LAST:event_boton4ActionPerformed

    @SuppressWarnings("deprecation")
    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
         
            
            boton2.setEnabled(false);
            
            
            personaspista[12].setVisible(false);
            
            personaspista[16] = new JLabel(new ImageIcon(getClass().getResource("/fotos/banderita.png")));
            personaspista[16].setBounds(0, 00, 2490, 342);
            fondo.add(personaspista[16]);
            
            personaspista[14] = new JLabel(new ImageIcon(getClass().getResource("/fotos/ambulancia.gif")));
            prote[0] = new ProteccionCivil("Ambulancia", hilos[parada].label.getLocation().x, personaspista[14]);
            personaspista[14].setBounds(0, 00, 190, 1000);
            fondo.add(personaspista[14]);
            
            personaspista[15] = new JLabel(new ImageIcon(getClass().getResource("/fotos/grua.png")));
            cs[0] = new CocheSeguridad("Coche Seguridad", 1311, personaspista[15]);
            personaspista[15].setBounds(0, 00, 190, 595);
            fondo.add(personaspista[15]);
            
            
            hilos[parada].stop();//Paramos un hilo aletoriamente
            
            semaphore.release();
            
            cs[0].start();
            prote[0].start();
        
       
         
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        
        try{
        boton1.setEnabled(true);
        boton2.setEnabled(false);
        
        personaspista[12].setVisible(false);
        personaspista[14].setVisible(false);
        personaspista[15].setVisible(false);
        personaspista[16].setVisible(false);
        
        coches[0].setVisible(false);
        coches[1].setVisible(false);
        coches[2].setVisible(false);
        coches[3].setVisible(false);
        
        hilos[0].destroy();
        hilos[1].destroy();
        hilos[2].destroy();
        hilos[3].destroy();
        }catch(NoSuchMethodError n){
        
            System.out.println("");
        }
        
        
        
    }//GEN-LAST:event_boton3ActionPerformed

    private void close(){
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir de la carrera?",
                "Salir de la carrera", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
    }       
    
    @Override
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("fotos/icono.png"));


        return retValue;
    }
    
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton boton1;
    public static javax.swing.JButton boton2;
    public static javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    public static javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void resucitar(Escuderia escuderia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
