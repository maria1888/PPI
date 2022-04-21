package Frame;

import Metodos.Math;
import Metodos.Utilities;

import javax.swing.*;
import javax.swing.text.Utilities;
import java.util.List;

/**
 * Fernanda Alvarez
 * Primer proyecto Datos I
 *
 */
public class Princ extends javax.swing.JFrame {
    /**
     * Creacion del form principal
     */
    init clic= 0;
    Utilities u = new Utilities();
    List<Integer> next = u.rowsTableAll();

    public Princ(){
        initComponentes();
        this.setTitle("Juego de Memoria");
        this.setLocationRelativeTo(this);
        u.imgStart();

    }

    private void initComponentes(){

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn04 = new javax.swing.JButton();
        btn05 = new javax.swing.JButton();
        btn06 = new javax.swing.JButton();
        btn07 = new javax.swing.JButton();
        btn08 = new javax.swing.JButton();

        jButton3.setText('jButton1');
        jButton4.setText('jButton1');
        jButton5.setText('jButton1');

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        btn01.setForeground(new java.awt.Color(240,240,240));
        btn01.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn01.setMaximumSize(new java.awt.Dimension(64,64));
        btn01.setMinimumSize(new java.awt.Dimension(64,64));
        btn01.setPreferredSize(new java.awt.Dimension(64,64));
        btn01.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                btn01MouseClicked(evt);
            }
        });
        btn02.setForeground(new java.awt.Color(240,240,240));
    }
}
