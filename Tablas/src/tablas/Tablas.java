/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tablas;

import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manana
 */
public class Tablas extends javax.swing.JFrame {
    
    private Point puntoPopup;
    
    /**
     * Creates new form Tablas
     */
    public Tablas() {
        initComponents();
        jTable1.getColumnModel().getColumn(1).setCellEditor( new DefaultCellEditor( new JComboBox<>(new String []{"1","2","3"}) ) );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        Exportar = new javax.swing.JMenuItem();
        Seleccionar = new javax.swing.JMenuItem();
        Copiar = new javax.swing.JMenuItem();
        Añadir = new javax.swing.JMenuItem();

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Eliminar);

        Exportar.setText("Exportar");
        Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Exportar);

        Seleccionar.setText("Seleccionar");
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Seleccionar);

        Copiar.setText("Copiar");
        Copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopiarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Copiar);

        Añadir.setText("Añadir");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Añadir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        int[] filas= jTable1.getSelectedRows();
        if (filas.length>0) {
            for (int i=filas.length-1;i>=0;i--) {
                
            ((DefaultTableModel)jTable1.getModel()).removeRow(filas[i]);
            }
        }    
    }//GEN-LAST:event_EliminarActionPerformed

    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
        // TODO add your handling code here:
        jTable1.selectAll();
    }//GEN-LAST:event_SeleccionarActionPerformed

    private void ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarActionPerformed
        JFileChooser fichero= new JFileChooser();
        int resp= fichero.showSaveDialog(this);
        try {
            // TODO add your handling code here:
            int [] row=jTable1.getSelectedRows();
            StringBuilder contenido= new StringBuilder();
            for (int i : row) {
                contenido.append(jTable1.getModel().getValueAt(i, 0));
                contenido.append("-");
                contenido.append(jTable1.getModel().getValueAt(i, 1));
                contenido.append("-");
                contenido.append(jTable1.getModel().getValueAt(i, 2)); 
                contenido.append("-");
                contenido.append(jTable1.getModel().getValueAt(i, 3)); 
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero.getSelectedFile()));
            bw.write(contenido.toString()+"\n");                                    
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
    }//GEN-LAST:event_ExportarActionPerformed

    private void CopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopiarActionPerformed
        // TODO add your handling code here:
                    int [] row=jTable1.getSelectedRows();
            StringBuilder contenido= new StringBuilder();
            for (int i : row) {
                contenido.append(jTable1.getModel().getValueAt(i, 0));
                contenido.append(jTable1.getModel().getValueAt(i, 1)); 
                contenido.append(jTable1.getModel().getValueAt(i, 2)); 
                contenido.append(jTable1.getModel().getValueAt(i, 3)); 
            }

            StringSelection selection = new StringSelection(contenido.toString());
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
    }//GEN-LAST:event_CopiarActionPerformed

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        // TODO add your handling code here:
        String i=(String)JOptionPane.showInputDialog(this, "Añadir en formato E-G-E-P");
        String [] i2=i.split("-");
        
        if(i2.equals("")){
        ((DefaultTableModel)jTable1.getModel()).insertRow(jTable1.rowAtPoint(puntoPopup),new Object[] {null,null,null,null});
            return;
        }
        if (i2.length<4 || i2.length>4) {
            return;
        }
        ((DefaultTableModel)jTable1.getModel()).insertRow(jTable1.rowAtPoint(puntoPopup),new Object[] {i2[0], i2[1], i2[2], i2[3]});
    }//GEN-LAST:event_AñadirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Añadir;
    private javax.swing.JMenuItem Copiar;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Exportar;
    private javax.swing.JMenuItem Seleccionar;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
