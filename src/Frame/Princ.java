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
        btn02.setMaximumSize(new java.awt.Dimension(64,64));
        btn02.setMinimumSize(new java.awt.Dimension(64,64));
        btn02.setPreferredSize(new java.awt.Dimension(64,64));
        btn02.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                btn02MouseClicked(evt);
            }
        });
        btn03.setForeground(new java.awt.Color(240,240,240));
        btn03.setMaximumSize(new java.awt.Dimension(64,64));
        btn03.setMinimumSize(new java.awt.Dimension(64,64));
        btn03.setPreferredSize(new java.awt.Dimension(64,64));
        btn03.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                btn03MouseClicked(evt);
            }
        });
        btn04.setForeground(new java.awt.Color(240,240,240));
        btn04.setMaximumSize(new java.awt.Dimension(64,64));
        btn04.setMinimumSize(new java.awt.Dimension(64,64));
        btn04.setPreferredSize(new java.awt.Dimension(64,64));
        btn04.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                btn04MouseClicked(evt);
            }
        });
        btn05.setForeground(new java.awt.Color(240,240,240));
        btn05.setMaximumSize(new java.awt.Dimension(64,64));
        btn05.setMinimumSize(new java.awt.Dimension(64,64));
        btn05.setPreferredSize(new java.awt.Dimension(64,64));
        btn05.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                btn05MouseClicked(evt);
            }
        });
        btn06.setForeground(new java.awt.Color(240,240,240));
        btn06.setMaximumSize(new java.awt.Dimension(64,64));
        btn06.setMinimumSize(new java.awt.Dimension(64,64));
        btn06.setPreferredSize(new java.awt.Dimension(64,64));
        btn06.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                btn06MouseClicked(evt);
            }
        });
        btn07.setForeground(new java.awt.Color(240,240,240));
        btn07.setMaximumSize(new java.awt.Dimension(64,64));
        btn07.setMinimumSize(new java.awt.Dimension(64,64));
        btn07.setPreferredSize(new java.awt.Dimension(64,64));
        btn07.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                btn07MouseClicked(evt);
            }
        });
        btn08.setForeground(new java.awt.Color(240,240,240));
        btn08.setMaximumSize(new java.awt.Dimension(64,64));
        btn08.setMinimumSize(new java.awt.Dimension(64,64));
        btn08.setPreferredSize(new java.awt.Dimension(64,64));
        btn08.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                btn08MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
        );
    }
}
