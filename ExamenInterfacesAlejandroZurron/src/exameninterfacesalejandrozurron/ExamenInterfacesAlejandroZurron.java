/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exameninterfacesalejandrozurron;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

/**
 *
 * @author Manana
 */
public class ExamenInterfacesAlejandroZurron extends javax.swing.JFrame {
    StringBuilder contenido= new StringBuilder();
    DefaultMutableTreeNode raiz;
    DefaultMutableTreeNode division;
    DefaultMutableTreeNode division1;
    DefaultMutableTreeNode division2;
    int cont = 0;
    int cont1 = 0;
    int cont2 = 0;
    
    ArrayList<Libro> listalibros = new ArrayList<>();

    /**
     * Creates new form ExamenInterfacesAlejandroZurron
     */
    public ExamenInterfacesAlejandroZurron() {
        initComponents();
        autor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        isbn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        isbn.setText("");
        editorial.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        titulo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        nombreisbn = new javax.swing.JLabel();
        nombretitulo = new javax.swing.JLabel();
        nombreautor = new javax.swing.JLabel();
        nombreditorial = new javax.swing.JLabel();
        isbn = new javax.swing.JFormattedTextField();
        titulo = new javax.swing.JTextField();
        autor = new javax.swing.JTextField();
        editorial = new javax.swing.JTextField();
        nombregenero = new javax.swing.JLabel();
        genero = new javax.swing.JComboBox<>();
        papel = new javax.swing.JRadioButton();
        electronico = new javax.swing.JRadioButton();
        año = new javax.swing.JSpinner();
        nombreaño = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        tareas = new javax.swing.JToolBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree(crearArbol());
        exportar2 = new javax.swing.JButton();
        barra = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();
        exportar = new javax.swing.JMenuItem();
        vista = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca");
        setResizable(false);

        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nombreisbn.setText("ISBN");

        nombretitulo.setText("Titulo");

        nombreautor.setText("Autor");

        nombreditorial.setText("Editorial");

        try {
            isbn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        isbn.setToolTipText("");
        isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnActionPerformed(evt);
            }
        });

        nombregenero.setText("Genero");

        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciencia ficción", "Misterio", "Poesía" }));

        buttonGroup1.add(papel);
        papel.setText("Papel");

        buttonGroup1.add(electronico);
        electronico.setText("Electronico");

        año.setModel(new javax.swing.SpinnerNumberModel(0, null, 2024, 1));

        nombreaño.setText("Año");

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(nombreaño)
                        .addGap(23, 23, 23)
                        .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(nombregenero)
                        .addGap(18, 18, 18)
                        .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(nombreditorial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreautor)
                            .addComponent(nombretitulo)
                            .addComponent(nombreisbn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(registrar)
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addComponent(papel)
                            .addGap(18, 18, 18)
                            .addComponent(electronico))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreisbn)
                    .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombretitulo)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreautor)
                    .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreditorial)
                    .addComponent(editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombregenero)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(papel)
                    .addComponent(electronico))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreaño))
                .addGap(28, 28, 28)
                .addComponent(registrar)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tareas.setRollover(true);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Ciencia ficción",  new Integer(0)},
                {"Misterio",  new Integer(0)},
                {"Poesia",  new Integer(0)}
            },
            new String [] {
                "Categoria", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.setToolTipText("");
        jScrollPane1.setViewportView(tabla);

        arbol.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                arbolValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(arbol);

        exportar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exameninterfacesalejandrozurron/exportar.png"))); // NOI18N
        exportar2.setText("Exportar");
        exportar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exportar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exportar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(exportar2))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tareas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exportar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(tareas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        archivo.setText("Archivo");

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        archivo.add(salir);

        exportar.setText("Exportar");
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarActionPerformed(evt);
            }
        });
        archivo.add(exportar);

        barra.add(archivo);

        vista.setText("Vista");
        vista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vistaMouseClicked(evt);
            }
        });
        barra.add(vista);

        setJMenuBar(barra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarActionPerformed
        // TODO add your handling code here:
        JFileChooser fichero= new JFileChooser();
        int resp= fichero.showSaveDialog(this);
        String content= contenido.toString();
        if (resp==JOptionPane.YES_OPTION) {
            try {
                BufferedWriter bw= new BufferedWriter(new FileWriter(fichero.getSelectedFile()));
                
                bw.write(content);
            } catch (IOException ex) {
                Logger.getLogger(ExamenInterfacesAlejandroZurron.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_exportarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this, "Salir", "¿Estas seguro?", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_salirActionPerformed

    private void vistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vistaMouseClicked
        // TODO add your handling code here:
        Color color = JColorChooser.showDialog(this, "Color", Color.yellow);
        panel.setBackground(color);


    }//GEN-LAST:event_vistaMouseClicked

    private void exportar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportar2ActionPerformed
        // TODO add your handling code here:
        JFileChooser fichero= new JFileChooser();
        int resp= fichero.showSaveDialog(this);
        if (resp==JOptionPane.YES_OPTION) {
            try {
                BufferedWriter bw= new BufferedWriter(new FileWriter(fichero.getSelectedFile()));

                bw.write(contenido.toString());
                System.out.println("contenido escrito");

            } catch (IOException ex) {
                Logger.getLogger(ExamenInterfacesAlejandroZurron.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_exportar2ActionPerformed

    private void arbolValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_arbolValueChanged
        // TODO add your handling code here:
        String ISBNA="";
        String tituloA="";
        String autorA="";
        String editorialA="";
        String generoA="";
        String formatoA="";
        int añoA=0;
        DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode)arbol.getLastSelectedPathComponent();
        if (nodoSeleccionado.isLeaf()) {
            for (Libro listalibro : listalibros) {
                if (nodoSeleccionado.getUserObject().equals(listalibro.getTitulo())) {
                    ISBNA=listalibro.getISBN();
                    tituloA=listalibro.getTitulo();
                    autorA=listalibro.getAutor();
                    editorialA=listalibro.getEditorial();
                    generoA=listalibro.getGenero();
                    formatoA=listalibro.getFormato();
                    añoA=listalibro.getAño();

                }
            }
            String cont="Esta es la informacion del libro \n"
            + "ISBN"+ISBNA+"\n"
            + "ISBN"+tituloA+"\n"
            + "ISBN"+autorA+"\n"
            + "ISBN"+editorialA+"\n"
            + "ISBN"+generoA+"\n"
            + "ISBN"+formatoA+"\n"
            + "ISBN"+añoA+"\n"
            ;
            JOptionPane.showMessageDialog(this, cont, "Informacion", HEIGHT);
        }

    }//GEN-LAST:event_arbolValueChanged

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:

        if (isbn.getText().equalsIgnoreCase("            ") || autor.getText().equalsIgnoreCase("") || editorial.getText().equalsIgnoreCase("") || titulo.getText().equalsIgnoreCase("") || genero.getSelectedItem().equals("")) {

            if (editorial.getText().equalsIgnoreCase("")) {
                editorial.setBorder(BorderFactory.createLineBorder(Color.RED));
                editorial.requestFocus();
            }
            if (autor.getText().equalsIgnoreCase("")) {
                autor.setBorder(BorderFactory.createLineBorder(Color.RED));
                autor.requestFocus();
            }
            if (titulo.getText().equalsIgnoreCase("")) {
                titulo.setBorder(BorderFactory.createLineBorder(Color.RED));
                titulo.requestFocus();
            }
            if (isbn.getText().equalsIgnoreCase("")) {
                isbn.setBorder(BorderFactory.createLineBorder(Color.RED));
                isbn.requestFocus();
            }
            if (genero.getSelectedItem().equals("")) {
                genero.setBorder(BorderFactory.createLineBorder(Color.RED));
                genero.requestFocus();
            }
            JOptionPane.showMessageDialog(this, "Tienes que rellenar todos los datos", "Advertencia", HEIGHT);

        }
        if (!editorial.getText().equals("")) {
            editorial.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        }
        if (!autor.getText().equals("")) {
            autor.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        }
        if (!titulo.getText().equals("")) {

            SwingUtilities.updateComponentTreeUI(titulo);
        }
        if (!isbn.getText().equals("")) {
            isbn.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        }
        if (!isbn.getText().equalsIgnoreCase("            ") || !autor.getText().equalsIgnoreCase("") || !editorial.getText().equalsIgnoreCase("") || !titulo.getText().equalsIgnoreCase("") || !genero.getSelectedItem().equals("")) {
            String formato = "";
            if (papel.isSelected()) {
                formato = "papel";
            }
            if (electronico.isSelected()) {
                formato = "electronico";
            }
            String gen = (String) genero.getSelectedItem();
            int añO = (Integer) año.getValue();
            Libro lib = new Libro(isbn.getText(), añO, titulo.getText(), autor.getText(), editorial.getText(), gen, formato);
            contenido.append(lib);
            listalibros.add(lib);
            DefaultTreeModel  root=(DefaultTreeModel) arbol.getModel();
            if (gen.equalsIgnoreCase("Poesía")) {
                cont++;
                ((DefaultTableModel) tabla.getModel()).setValueAt(cont, 2, 1);
                DefaultMutableTreeNode subdivision = new DefaultMutableTreeNode(lib.getTitulo());
                division2.add(subdivision);
            }
            if (gen.equalsIgnoreCase("Ciencia ficción")) {
                cont1++;
                ((DefaultTableModel) tabla.getModel()).setValueAt(cont1, 0, 1);
                DefaultMutableTreeNode subdivision = new DefaultMutableTreeNode(lib.getTitulo());
                division.add(subdivision);
            }
            if (gen.equalsIgnoreCase("Misterio")) {
                cont2++;
                ((DefaultTableModel) tabla.getModel()).setValueAt(cont2, 1, 1);
                DefaultMutableTreeNode subdivision = new DefaultMutableTreeNode(lib.getTitulo());
                division1.add(subdivision);

            }

            isbn.setText("");
            autor.setText("");
            editorial.setText("");
            titulo.setText("");
            año.setValue(0);
            genero.setSelectedIndex(0);
            root.reload();
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbnActionPerformed
    private TreeNode crearArbol() {
        raiz = new DefaultMutableTreeNode("Biblioteca");
        division = new DefaultMutableTreeNode("Ciencia Ficción");
        division1 = new DefaultMutableTreeNode("Misterio");
        division2 = new DefaultMutableTreeNode("Poesia");
        raiz.add(division);
        raiz.add(division1);
        raiz.add(division2);
        
        return raiz;
    }
    public void imagen(){
    s}
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
            java.util.logging.Logger.getLogger(ExamenInterfacesAlejandroZurron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamenInterfacesAlejandroZurron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamenInterfacesAlejandroZurron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamenInterfacesAlejandroZurron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamenInterfacesAlejandroZurron().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbol;
    private javax.swing.JMenu archivo;
    private javax.swing.JTextField autor;
    private javax.swing.JSpinner año;
    private javax.swing.JMenuBar barra;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField editorial;
    private javax.swing.JRadioButton electronico;
    private javax.swing.JMenuItem exportar;
    private javax.swing.JButton exportar2;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JFormattedTextField isbn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombreautor;
    private javax.swing.JLabel nombreaño;
    private javax.swing.JLabel nombreditorial;
    private javax.swing.JLabel nombregenero;
    private javax.swing.JLabel nombreisbn;
    private javax.swing.JLabel nombretitulo;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JRadioButton papel;
    private javax.swing.JButton registrar;
    private javax.swing.JMenuItem salir;
    private javax.swing.JTable tabla;
    private javax.swing.JToolBar tareas;
    private javax.swing.JTextField titulo;
    private javax.swing.JMenu vista;
    // End of variables declaration//GEN-END:variables
}
