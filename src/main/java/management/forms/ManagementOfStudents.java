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
import management.utils.BDConnection;

/**
 *
 * @author Murasov David
 */
public class ManagementOfStudents extends javax.swing.JFrame {
    private Integer studentId;
    private String studentFirstName, studentLastName, genre, group, faculty, email; 
    private DefaultTableModel tableModel;

    /**
     * Creates new form ManagementOfBooks
     */
    public ManagementOfStudents() {
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
        loginLabel3 = new javax.swing.JLabel();
        loginLabel4 = new javax.swing.JLabel();
        loginLabel5 = new javax.swing.JLabel();
        genres = new javax.swing.JComboBox<>();
        update_btn = new rojerusan.RSMaterialButtonCircle();
        delete_btn = new rojerusan.RSMaterialButtonCircle();
        addBook_btn = new rojerusan.RSMaterialButtonCircle();
        groupField = new javax.swing.JTextField();
        prenumeField = new javax.swing.JTextField();
        loginLabel6 = new javax.swing.JLabel();
        facultyField = new javax.swing.JComboBox<>();
        emailField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOfStudents = new rojerusan.RSTableMetro();
        jPanel3 = new javax.swing.JPanel();
        backLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(java.awt.Color.darkGray);

        loginLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 23)); // NOI18N
        loginLabel.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel.setText("Prenumele studentului:");

        idField.setBackground(java.awt.SystemColor.controlHighlight);
        idField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idField.setToolTipText("");
        idField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        idField.setMargin(new java.awt.Insets(4, 6, 4, 6));

        loginLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        loginLabel1.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel1.setText("Id-ul studentului:");

        numeField.setBackground(java.awt.SystemColor.controlHighlight);
        numeField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numeField.setToolTipText("");
        numeField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        loginLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 23)); // NOI18N
        loginLabel2.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel2.setText("Numele studentului:");

        loginLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        loginLabel3.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel3.setText("Grupa:");

        loginLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        loginLabel4.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel4.setText("Genul:");

        loginLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        loginLabel5.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel5.setText("E-mail:");

        genres.setBackground(java.awt.SystemColor.controlHighlight);
        genres.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        genres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        genres.setPreferredSize(new java.awt.Dimension(90, 40));

        update_btn.setBackground(new java.awt.Color(204, 102, 0));
        update_btn.setText("Modifică");
        update_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        delete_btn.setBackground(new java.awt.Color(153, 0, 0));
        delete_btn.setText("Sterge");
        delete_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        addBook_btn.setBackground(new java.awt.Color(0, 102, 255));
        addBook_btn.setText("Adaugă");
        addBook_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        addBook_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBook_btnActionPerformed(evt);
            }
        });

        groupField.setBackground(java.awt.SystemColor.controlHighlight);
        groupField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        groupField.setToolTipText("");
        groupField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        prenumeField.setBackground(java.awt.SystemColor.controlHighlight);
        prenumeField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prenumeField.setToolTipText("");
        prenumeField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        loginLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        loginLabel6.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel6.setText("Facultatea:");

        facultyField.setBackground(java.awt.SystemColor.controlHighlight);
        facultyField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        emailField.setBackground(java.awt.SystemColor.controlHighlight);
        emailField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailField.setToolTipText("");
        emailField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBook_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(loginLabel1)
                                                .addComponent(loginLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(loginLabel4))
                                            .addGap(34, 34, 34))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(loginLabel3)
                                            .addComponent(loginLabel5)
                                            .addComponent(loginLabel6))
                                        .addGap(135, 135, 135)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(genres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numeField)
                                    .addComponent(prenumeField)
                                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(groupField)
                                    .addComponent(facultyField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginLabel4))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginLabel5)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginLabel3)
                    .addComponent(groupField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel6)
                    .addComponent(facultyField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBook_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel2.setBackground(java.awt.SystemColor.inactiveCaption);

        tableOfStudents.setBackground(new java.awt.Color(102, 102, 102));
        tableOfStudents.setForeground(java.awt.SystemColor.controlHighlight);
        tableOfStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Numele", "Prenumele", "E-mail", "Grupa", "Facultate", "Genul"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableOfStudents.setColorBackgoundHead(new java.awt.Color(102, 102, 102));
        tableOfStudents.setColorFilasBackgound1(new java.awt.Color(153, 0, 0));
        tableOfStudents.setColorFilasBackgound2(new java.awt.Color(153, 0, 0));
        tableOfStudents.setColorFilasForeground1(java.awt.SystemColor.controlHighlight);
        tableOfStudents.setColorFilasForeground2(java.awt.SystemColor.controlHighlight);
        tableOfStudents.setFuenteFilas(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tableOfStudents.setFuenteHead(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableOfStudents.setRowHeight(35);
        tableOfStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOfStudentsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableOfStudents);
        if (tableOfStudents.getColumnModel().getColumnCount() > 0) {
            tableOfStudents.getColumnModel().getColumn(0).setPreferredWidth(24);
            tableOfStudents.getColumnModel().getColumn(1).setPreferredWidth(120);
            tableOfStudents.getColumnModel().getColumn(2).setPreferredWidth(140);
            tableOfStudents.getColumnModel().getColumn(3).setPreferredWidth(100);
            tableOfStudents.getColumnModel().getColumn(4).setPreferredWidth(120);
            tableOfStudents.getColumnModel().getColumn(6).setPreferredWidth(4);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1078, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jLabel2.setText("Gestionarea studentilor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(380, 380, 380)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setBounds(0, 0, 1800, 754);
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
    
    private void tableOfStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOfStudentsMouseClicked
        int row = tableOfStudents.getSelectedRow();
        setValuesToFields(row);
    }//GEN-LAST:event_tableOfStudentsMouseClicked

    public void setValuesToFields(int row){
        TableModel model = tableOfStudents.getModel();
        
        idField.setText(model.getValueAt(row, 0).toString());
        numeField.setText(model.getValueAt(row, 1).toString());
        prenumeField.setText(model.getValueAt(row, 2).toString());
        genres.setSelectedItem(model.getValueAt(row, 6).toString());
        emailField.setText(model.getValueAt(row, 3).toString());
        groupField.setText(model.getValueAt(row, 4).toString());
        facultyField.addItem(model.getValueAt(row, 5).toString());
        
        try(Connection connection = BDConnection.getConnection()){
            Statement st = connection.createStatement();
            PreparedStatement prepst = connection.prepareStatement("SELECT numele_facultate from facultati WHERE numele_facultate != ?");
            prepst.setString(1,model.getValueAt(row, 5).toString());
            ResultSet rs = prepst.executeQuery();
            
            while (rs.next()){
                facultyField.addItem(rs.getString("numele_facultate"));
            }
            
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        facultyField.setSelectedItem(model.getValueAt(row, 5).toString());
    }
    
    private void addBook_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBook_btnActionPerformed
        if(addStudent() == true){
            JOptionPane.showMessageDialog(this, "Studentul a fost adăugat.");
            clearTable();
            setTableModel();
        }else{
            JOptionPane.showMessageDialog(this, "Eroare de adăugare a studentului."); 
        }
    }//GEN-LAST:event_addBook_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        if(updateStudent() == true){
            JOptionPane.showMessageDialog(this, "Studentul a fost modificat.");
            clearTable();
            setTableModel();
        }else{
            JOptionPane.showMessageDialog(this, "Eroare de modificare a studentului."); 
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        if(deleteStudent() == true){
            JOptionPane.showMessageDialog(this, "Studentul a fost stears.");
            clearTable();
            setTableModel();
        }else{
            JOptionPane.showMessageDialog(this, "Eroare de stergere a studentului."); 
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementOfStudents().setVisible(true);
            }
        });
    }
    
    
    private void setTableModel(){  
        try(Connection connection = BDConnection.getConnection()){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM studenti s INNER JOIN facultati f USING(id_facultate)");
            while(rs.next()){
                int studentId = rs.getInt("id_studentului");
                String firstName = rs.getString("numele");
                String lastName = rs.getString("prenumele");
                String email = rs.getString("email");
                String group = rs.getString("grupa");
                String faculty = rs.getString("numele_facultate");
                String genre = rs.getString("genul");

                Object[] obj = {studentId, firstName, lastName, email, group, faculty, genre};
                
                tableModel = (DefaultTableModel)tableOfStudents.getModel();
                tableModel.addRow(obj);
            }      
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean addStudent(){
        setInfoStudent();
        int rowCount;
        
        try(Connection connection = BDConnection.getConnection()){
            PreparedStatement prepst;
            if(studentId == null){
                prepst = connection.prepareStatement("INSERT INTO studenti(numele, prenumele, email, grupa, genul, id_facultate) VALUES(?, ?, ?, "
                        + "?, ?, (SELECT id_facultate FROM facultati WHERE numele_facultate = ?))", Statement.RETURN_GENERATED_KEYS);
                prepst.setString(1, studentFirstName);
                prepst.setString(2, studentLastName);
                prepst.setString(3, email);
                prepst.setString(4, group);
                prepst.setString(5, genre);
                prepst.setString(6, faculty);
            }else{
                prepst = connection.prepareStatement("INSERT INTO studenti VALUES(?, ?, ?, ?, "
                        + "?, ?, (SELECT id_facultate FROM facultati WHERE nume_facultate = ?))", Statement.RETURN_GENERATED_KEYS);
                prepst.setObject(1, studentId, Types.INTEGER);
                prepst.setString(2, studentFirstName);
                prepst.setString(3, studentLastName);
                prepst.setString(4, email);
                prepst.setString(5, group);
                prepst.setString(6, genre);
                prepst.setString(7, faculty);
            }
            
            rowCount = prepst.executeUpdate(); 
            
            if(rowCount > 0){
               return true;
            }else{
               return false;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean updateStudent(){
        int rowCount;
        
        setInfoStudent();
        
        try(Connection connection = BDConnection.getConnection()){
            PreparedStatement prepst = connection.prepareStatement("UPDATE studenti SET numele = ?, prenumele = ?, "
                    + "email = ?, grupa = ?, genul = ?, id_facultate = (SELECT id_facultate FROM facultati WHERE numele_facultate = ?) WHERE id_studentului = ?");
            prepst.setString(1, studentFirstName);
            prepst.setString(2, studentLastName);
            prepst.setString(3, email);
            prepst.setString(4, group);
            prepst.setString(5, genre);
            prepst.setString(6, faculty);
            prepst.setObject(7, studentId, Types.INTEGER);
            
            rowCount = prepst.executeUpdate();  
            
            if(rowCount > 0){
                return true;
            }else{
                return false;
            }  
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteStudent(){
        int rowCount;
        
        setInfoStudent();
        
        try(Connection connection = BDConnection.getConnection()){

            PreparedStatement prepst = connection.prepareStatement("DELETE FROM studenti WHERE id_studentului = ?");
            prepst.setObject(1, studentId, Types.INTEGER);
            
            rowCount = prepst.executeUpdate();       
           
            if(rowCount > 0){
                return true;
            }else{
                return false;
            }   
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return false;
    }
    
    
    public void setInfoStudent(){
        try{   
            this.studentId = Integer.parseInt(idField.getText());
        }catch(NumberFormatException e){
            System.out.print(e.getMessage());
            this.studentId = null; 
        }
        this.genre = (String)genres.getSelectedItem();
        this.group = (String)groupField.getText();
        this.faculty = (String)facultyField.getSelectedItem();
        this.studentFirstName = numeField.getText();
        this.studentLastName = prenumeField.getText();
        this.email = emailField.getText();
    }
    
    public void clearTable(){
        tableModel.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle addBook_btn;
    private javax.swing.JLabel backLabel;
    private rojerusan.RSMaterialButtonCircle delete_btn;
    private javax.swing.JTextField emailField;
    private javax.swing.JComboBox<String> facultyField;
    private javax.swing.JComboBox<String> genres;
    private javax.swing.JTextField groupField;
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
    private javax.swing.JLabel loginLabel3;
    private javax.swing.JLabel loginLabel4;
    private javax.swing.JLabel loginLabel5;
    private javax.swing.JLabel loginLabel6;
    private javax.swing.JTextField numeField;
    private javax.swing.JTextField prenumeField;
    private rojerusan.RSTableMetro tableOfStudents;
    private rojerusan.RSMaterialButtonCircle update_btn;
    // End of variables declaration//GEN-END:variables
}

