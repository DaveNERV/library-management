/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package management.forms;

import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import management.elements.Author;
import management.elements.Genre;
import management.elements.Manages;
import management.utils.BDConnection;

/**
 *
 * @author Murasov David
 */
public class ManagementOfAuthors extends javax.swing.JFrame {
    private DefaultTableModel tableModel;

    public ManagementOfAuthors() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.ORANGE));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/50px-frameIcon.png")));
        setTableModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        loginLabel1 = new javax.swing.JLabel();
        numeField = new javax.swing.JTextField();
        loginLabel2 = new javax.swing.JLabel();
        updateBtn = new rojerusan.RSMaterialButtonCircle();
        deleteBtn = new rojerusan.RSMaterialButtonCircle();
        addBtn = new rojerusan.RSMaterialButtonCircle();
        prenumeField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOfAuthors = new rojerusan.RSTableMetro();
        jPanel3 = new javax.swing.JPanel();
        backLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(java.awt.Color.darkGray);

        loginLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 23)); // NOI18N
        loginLabel.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel.setText("Prenumele autorului:");

        idField.setBackground(java.awt.SystemColor.controlHighlight);
        idField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idField.setToolTipText("");
        idField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        idField.setMargin(new java.awt.Insets(4, 6, 4, 6));

        loginLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        loginLabel1.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel1.setText("Id-ul autorului:");

        numeField.setBackground(java.awt.SystemColor.controlHighlight);
        numeField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numeField.setToolTipText("");
        numeField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        loginLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 23)); // NOI18N
        loginLabel2.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel2.setText("Numele autorului:");

        updateBtn.setBackground(new java.awt.Color(204, 102, 0));
        updateBtn.setText("Modifică");
        updateBtn.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(153, 0, 0));
        deleteBtn.setText("Sterge");
        deleteBtn.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(0, 102, 255));
        addBtn.setText("Adaugă");
        addBtn.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        prenumeField.setBackground(java.awt.SystemColor.controlHighlight);
        prenumeField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prenumeField.setToolTipText("");
        prenumeField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginLabel1)
                                    .addComponent(loginLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numeField, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                            .addComponent(prenumeField)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginLabel2)))
                    .addComponent(loginLabel1))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prenumeField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginLabel))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.SystemColor.inactiveCaption);

        tableOfAuthors.setBackground(new java.awt.Color(102, 102, 102));
        tableOfAuthors.setForeground(java.awt.SystemColor.controlHighlight);
        tableOfAuthors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Numele autorului", "Prenumele autorului"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableOfAuthors.setColorBackgoundHead(new java.awt.Color(102, 102, 102));
        tableOfAuthors.setColorFilasBackgound1(new java.awt.Color(153, 0, 0));
        tableOfAuthors.setColorFilasBackgound2(new java.awt.Color(153, 0, 0));
        tableOfAuthors.setColorFilasForeground1(java.awt.SystemColor.controlHighlight);
        tableOfAuthors.setColorFilasForeground2(java.awt.SystemColor.controlHighlight);
        tableOfAuthors.setFuenteFilas(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tableOfAuthors.setFuenteHead(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableOfAuthors.setRowHeight(35);
        tableOfAuthors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOfAuthorsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableOfAuthors);
        if (tableOfAuthors.getColumnModel().getColumnCount() > 0) {
            tableOfAuthors.getColumnModel().getColumn(0).setPreferredWidth(3);
            tableOfAuthors.getColumnModel().getColumn(1).setPreferredWidth(120);
            tableOfAuthors.getColumnModel().getColumn(2).setPreferredWidth(140);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        backLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 32)); // NOI18N
        backLabel.setForeground(new java.awt.Color(255, 153, 0));
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/left-arrow.png"))); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Gestionarea autorilor cărtilor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabel)
                .addGap(325, 325, 325)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setBounds(0, 0, 1420, 448);
    }// </editor-fold>//GEN-END:initComponents

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        redirectTo(new MainPage());
    }//GEN-LAST:event_backLabelMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

     private void redirectTo(JFrame frame){
        frame.setVisible(true);
        dispose();
    }
    
    private void tableOfAuthorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOfAuthorsMouseClicked
        int row = tableOfAuthors.getSelectedRow();
        setValuesToFields(row);
    }//GEN-LAST:event_tableOfAuthorsMouseClicked

    public void setValuesToFields(int row){
        TableModel model = tableOfAuthors.getModel();
        
        idField.setText(model.getValueAt(row, 0).toString());
        numeField.setText(model.getValueAt(row, 1).toString());
        prenumeField.setText(model.getValueAt(row, 2).toString());
    }
    
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        Integer id = getAuthorIdOrNull();
        String firstName = numeField.getText();
        String lastName = prenumeField.getText();
        Author author = new Author(id, firstName, lastName);
        
        if(firstName.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduceti numele autorului.");
        }else if(lastName.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduceti prenumele autorului.");
        }else{
            if(author.addAuthor() > 0){
                JOptionPane.showMessageDialog(this, "Autorul a fost adăugat");
                clearTable();
                setTableModel();
            }else{
                JOptionPane.showMessageDialog(this, "Eroare de adăugare a autorului."); 
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        Integer id = getAuthorIdOrNull();
        String firstName = numeField.getText();
        String lastName = prenumeField.getText();
        Author author = new Author(id, firstName, lastName);
        
        if(id == null){
            JOptionPane.showMessageDialog(this, "Introduceti id-ul autorului.");
        }else if(firstName.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduceti numele autorului.");
        }else if(lastName.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduceti prenumele autorului.");
        }else{
            if(author.updateAuthor() > 0){
                JOptionPane.showMessageDialog(this, "Autorul a fost modificat");
                clearTable();
                setTableModel();
            }else{
                JOptionPane.showMessageDialog(this, "Eroare de modificare a autorului."); 
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        Integer id = getAuthorIdOrNull();
        String firstName = numeField.getText();
        String lastName = prenumeField.getText();
        Author author = new Author(id, firstName, lastName);
        
        if(id == null){
            JOptionPane.showMessageDialog(this, "Introduceti id-ul autorului.");
        }else if(firstName.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduceti numele autorului.");
        }else if(lastName.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduceti prenumele autorului.");
        }else{
            if(author.deleteAuthor() > 0){
                JOptionPane.showMessageDialog(this, "Autorul a fost sters.");
                clearTable();
                setTableModel();
            }else{
                JOptionPane.showMessageDialog(this, "Eroare de stergere a autorului."); 
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementOfAuthors().setVisible(true);
            }
        });
    }
      
    
    private Integer getAuthorIdOrNull(){
        Integer id;
        
        try{   
            id = Integer.parseInt(idField.getText());
        }catch(NumberFormatException e){
            System.out.print(e.getMessage());
            id = null; 
        }
        return id;
    }
    
    public void clearTable(){
        tableModel.setRowCount(0);
    }
    
    private void setTableModel(){
        List<Author> authors = Manages.getAuthorsListFromBD();
        tableModel = (DefaultTableModel)tableOfAuthors.getModel();
        
        for(Author author : authors){
            Object[] obj = {author.getId(), author.getFirstName(), author.getLastName()};
            tableModel.addRow(obj); 
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle addBtn;
    private javax.swing.JLabel backLabel;
    private rojerusan.RSMaterialButtonCircle deleteBtn;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel loginLabel1;
    private javax.swing.JLabel loginLabel2;
    private javax.swing.JTextField numeField;
    private javax.swing.JTextField prenumeField;
    private rojerusan.RSTableMetro tableOfAuthors;
    private rojerusan.RSMaterialButtonCircle updateBtn;
    // End of variables declaration//GEN-END:variables
}

