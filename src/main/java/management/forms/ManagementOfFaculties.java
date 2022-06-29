package management.forms;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import management.elements.*;
import management.utils.BDConnection;

/**
 *
 * @author Murasov David
 */
public class ManagementOfFaculties extends javax.swing.JFrame {
    private DefaultTableModel tableModel;

    public ManagementOfFaculties() {
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
        idField = new javax.swing.JTextField();
        loginLabel1 = new javax.swing.JLabel();
        genreNameLabel = new javax.swing.JLabel();
        updateBtn = new rojerusan.RSMaterialButtonCircle();
        deleteBtn = new rojerusan.RSMaterialButtonCircle();
        addBtn = new rojerusan.RSMaterialButtonCircle();
        facultyNameField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOfFaculties = new rojerusan.RSTableMetro();
        jPanel3 = new javax.swing.JPanel();
        backLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(java.awt.Color.darkGray);

        idField.setBackground(java.awt.SystemColor.controlHighlight);
        idField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idField.setToolTipText("");
        idField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        idField.setMargin(new java.awt.Insets(4, 6, 4, 6));

        loginLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        loginLabel1.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel1.setText("Id-ul facultătii:");

        genreNameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 23)); // NOI18N
        genreNameLabel.setForeground(java.awt.SystemColor.controlHighlight);
        genreNameLabel.setText("Numele facultătii:");

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

        facultyNameField.setBackground(java.awt.SystemColor.controlHighlight);
        facultyNameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        facultyNameField.setToolTipText("");
        facultyNameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginLabel1)
                            .addComponent(genreNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facultyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genreNameLabel)
                            .addComponent(facultyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(loginLabel1)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.SystemColor.inactiveCaption);

        tableOfFaculties.setBackground(new java.awt.Color(102, 102, 102));
        tableOfFaculties.setForeground(java.awt.SystemColor.controlHighlight);
        tableOfFaculties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id-ul facultătii", "Denumirea facultătii"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableOfFaculties.setColorBackgoundHead(new java.awt.Color(102, 102, 102));
        tableOfFaculties.setColorFilasBackgound1(new java.awt.Color(153, 0, 0));
        tableOfFaculties.setColorFilasBackgound2(new java.awt.Color(153, 0, 0));
        tableOfFaculties.setColorFilasForeground1(java.awt.SystemColor.controlHighlight);
        tableOfFaculties.setColorFilasForeground2(java.awt.SystemColor.controlHighlight);
        tableOfFaculties.setFuenteFilas(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tableOfFaculties.setFuenteHead(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableOfFaculties.setRowHeight(35);
        tableOfFaculties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOfFacultiesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableOfFaculties);
        if (tableOfFaculties.getColumnModel().getColumnCount() > 0) {
            tableOfFaculties.getColumnModel().getColumn(0).setResizable(false);
            tableOfFaculties.getColumnModel().getColumn(0).setPreferredWidth(24);
            tableOfFaculties.getColumnModel().getColumn(1).setResizable(false);
            tableOfFaculties.getColumnModel().getColumn(1).setPreferredWidth(120);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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
        jLabel2.setText("Gestionarea facultătilor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabel)
                .addGap(191, 191, 191)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        setBounds(0, 0, 1024, 381);
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
    
    private void tableOfFacultiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOfFacultiesMouseClicked
        int row = tableOfFaculties.getSelectedRow();
        setValuesToFields(row);
    }//GEN-LAST:event_tableOfFacultiesMouseClicked
    
    public void setValuesToFields(int row){
        TableModel model = tableOfFaculties.getModel();
        
        idField.setText(model.getValueAt(row, 0).toString());
        facultyNameField.setText(model.getValueAt(row, 1).toString());
    }
    
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        Integer id = getFacultyIdOrNull();
        String facultyName = facultyNameField.getText();
        Faculty faculty;
        
        if(!facultyName.trim().isEmpty()){
            faculty = new Faculty(id, facultyName);
            if(faculty.addFaculty() > 0){
                JOptionPane.showMessageDialog(this, "Facultatea a fost adăugată.");
                clearTable();
                setTableModel();
            }else{
                JOptionPane.showMessageDialog(this, "Eroare de adăugare a facultătii."); 
            }
        }else{
            JOptionPane.showMessageDialog(this, "Introduceti numele facultătii.");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        Integer id = getFacultyIdOrNull();
        String facultyName = facultyNameField.getText();
        Faculty faculty;
        
        if(id != null && facultyName != null && !facultyName.trim().isEmpty()){
            faculty = new Faculty(id, facultyName);
            if(faculty.updateFaculty() > 0){
                JOptionPane.showMessageDialog(this, "Facultatea a fost modificată.");
                clearTable();
                setTableModel();
            }else{
                JOptionPane.showMessageDialog(this, "Eroare de modificare a facultătii."); 
            }
        }else if(id == null){
            JOptionPane.showMessageDialog(this, "Introduceti id-ul facultătii.");
        }else{
            JOptionPane.showMessageDialog(this, "Introduceti numele facultătii.");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        Integer id = getFacultyIdOrNull();
        String facultyName = facultyNameField.getText();
        Faculty faculty;  
        
        if(id != null && facultyName != null && !facultyName.trim().isEmpty()){
            faculty = new Faculty(id, facultyName);
            if(faculty.deleteFaculty() > 0){
                JOptionPane.showMessageDialog(this, "Facultatea a fost stearsă.");
                clearTable();
                setTableModel();
            }else{
                JOptionPane.showMessageDialog(this, "Eroare de stergere a facultătii."); 
            }
        }else if(id == null){
            JOptionPane.showMessageDialog(this, "Introduceti id-ul facultătii.");
        }else{
            JOptionPane.showMessageDialog(this, "Introduceti numele facultătii.");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private Integer getFacultyIdOrNull(){
        Integer id;
        
        try{   
            id = Integer.parseInt(idField.getText());
        }catch(NumberFormatException e){
            System.out.print(e.getMessage());
            id = null; 
        }
        return id;
    }
    
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementOfFaculties().setVisible(true);
            }
        });
    }
    
    private void setTableModel(){
        List<Faculty> faculties = Manages.getFacultiesListFromBD();
        tableModel = (DefaultTableModel)tableOfFaculties.getModel();
        
        for(Faculty faculty : faculties){
            Object[] obj = {faculty.getIdFaculty(), faculty.getFacultyName()};
            tableModel.addRow(obj); 
        }
    }
    
    public void clearTable(){
        tableModel.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle addBtn;
    private javax.swing.JLabel backLabel;
    private rojerusan.RSMaterialButtonCircle deleteBtn;
    private javax.swing.JTextField facultyNameField;
    private javax.swing.JLabel genreNameLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel loginLabel1;
    private rojerusan.RSTableMetro tableOfFaculties;
    private rojerusan.RSMaterialButtonCircle updateBtn;
    // End of variables declaration//GEN-END:variables
}

