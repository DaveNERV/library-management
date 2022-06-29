package management.forms;

import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringJoiner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import management.utils.BDConnection;

/**
 *
 * @author Murasov David
 */
public class ViewRecords extends javax.swing.JFrame {
    private DefaultTableModel tableModel;

    /**
     * Creates new form ViewRecords
     */
    public ViewRecords() {
        initComponents();
        setTableModel("Toate");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.ORANGE));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/50px-frameIcon.png")));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOfRecords = new rojerusan.RSTableMetro();
        jPanel3 = new javax.swing.JPanel();
        viewDefaultBtn = new rojerusan.RSMaterialButtonCircle();
        issueDateCalendar = new datechooser.beans.DateChooserCombo();
        dueDateCalendar = new datechooser.beans.DateChooserCombo();
        Label18 = new javax.swing.JLabel();
        Label19 = new javax.swing.JLabel();
        viewCombo = new javax.swing.JComboBox<>();
        Label20 = new javax.swing.JLabel();
        searchBtn = new rojerusan.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Vizualizarea înregistrărilor");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabel)
                .addGap(395, 395, 395)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);

        tableOfRecords.setBackground(new java.awt.Color(102, 102, 102));
        tableOfRecords.setForeground(java.awt.SystemColor.controlHighlight);
        tableOfRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nr", "Denumirea cărtii", "Studentul", "Data oferirii", "Termenul", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableOfRecords.setColorBackgoundHead(new java.awt.Color(102, 102, 102));
        tableOfRecords.setColorFilasBackgound1(new java.awt.Color(153, 0, 0));
        tableOfRecords.setColorFilasBackgound2(new java.awt.Color(153, 0, 0));
        tableOfRecords.setColorFilasForeground1(java.awt.SystemColor.controlHighlight);
        tableOfRecords.setColorFilasForeground2(java.awt.SystemColor.controlHighlight);
        tableOfRecords.setFuenteFilas(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tableOfRecords.setFuenteHead(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableOfRecords.setRowHeight(35);
        jScrollPane3.setViewportView(tableOfRecords);
        if (tableOfRecords.getColumnModel().getColumnCount() > 0) {
            tableOfRecords.getColumnModel().getColumn(0).setPreferredWidth(2);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(132, 0, 0));

        viewDefaultBtn.setBackground(new java.awt.Color(51, 51, 51));
        viewDefaultBtn.setText("Toate");
        viewDefaultBtn.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        viewDefaultBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDefaultBtnActionPerformed(evt);
            }
        });

        issueDateCalendar.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    issueDateCalendar.setLocale(new java.util.Locale("ro", "", ""));
    try {
        issueDateCalendar.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
    } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
        e1.printStackTrace();
    }
    issueDateCalendar.setCalendarPreferredSize(new java.awt.Dimension(320, 180));
    issueDateCalendar.setWeekStyle(datechooser.view.WeekDaysStyle.SHORT);
    issueDateCalendar.setCalendarBackground(new java.awt.Color(153, 0, 0));
    issueDateCalendar.setFieldFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));
    issueDateCalendar.setNavigateFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 11));

    dueDateCalendar.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
dueDateCalendar.setLocale(new java.util.Locale("ro", "", ""));
try {
    dueDateCalendar.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
    } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
        e1.printStackTrace();
    }
    dueDateCalendar.setCalendarPreferredSize(new java.awt.Dimension(320, 180));
    dueDateCalendar.setWeekStyle(datechooser.view.WeekDaysStyle.SHORT);
    dueDateCalendar.setCalendarBackground(new java.awt.Color(153, 0, 0));
    dueDateCalendar.setFieldFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));
    dueDateCalendar.setNavigateFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 11));

    Label18.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    Label18.setForeground(java.awt.SystemColor.controlHighlight);
    Label18.setText("Data oferirii:");

    Label19.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    Label19.setForeground(java.awt.SystemColor.controlHighlight);
    Label19.setText("Afisează:");

    viewCombo.setBackground(java.awt.SystemColor.controlHighlight);
    viewCombo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    viewCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toate", "In asteptare", "Returnat" }));
    viewCombo.setMinimumSize(new java.awt.Dimension(142, 40));
    viewCombo.setPreferredSize(new java.awt.Dimension(90, 40));

    Label20.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    Label20.setForeground(java.awt.SystemColor.controlHighlight);
    Label20.setText("Data oferirii:");

    searchBtn.setBackground(new java.awt.Color(0, 0, 153));
    searchBtn.setText("Caută");
    searchBtn.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
    searchBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            searchBtnActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(Label18)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(issueDateCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
            .addComponent(Label20, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(dueDateCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(43, 43, 43)
            .addComponent(Label19)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(viewCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(66, 66, 66)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(viewDefaultBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(15, 15, 15))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap(15, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dueDateCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(issueDateCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Label18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label19)
                            .addComponent(viewCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Label20))
                    .addGap(54, 54, 54))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(viewDefaultBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8))))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
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
    
    private void viewDefaultBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDefaultBtnActionPerformed
        clearTable();
        setTableModel("Toate");
        
    }//GEN-LAST:event_viewDefaultBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        Calendar date1, date2;
        String viewType = (String)viewCombo.getSelectedItem();
        
        date1 = issueDateCalendar.getSelectedDate();
        date2 = dueDateCalendar.getSelectedDate();
        
        if(date1 != null && date2 != null){
            clearTable();
            if(search(date1, date2, viewType) == 0){
                JOptionPane.showMessageDialog(this, "Nu au fost găsite îngeristrări!");
            }
        }else if(date1 == null && date2 == null){
            clearTable();
            if(setTableModel(viewType) == 0){
                JOptionPane.showMessageDialog(this, "Nu au fost găsite îngeristrări!");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Introduceti ambele date!");
        }
    }//GEN-LAST:event_searchBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRecords().setVisible(true);
            }
        });
    }
    
    public int search(Calendar date1, Calendar date2, String viewType){
        SimpleDateFormat smp = new SimpleDateFormat("yyyy-MM-dd");
        String dueDateStr, issueDateStr, bookName, studentName, status;
        int count = 0;
        Long l1, l2;
        Date issueDate = null, dueDate = null;
        java.sql.Date sqlIssueDate = null, sqlDueDate = null;

        issueDateStr = smp.format(date1.getTime());
        dueDateStr = smp.format(date2.getTime());
        try {
            issueDate = smp.parse(issueDateStr);
            dueDate = smp.parse(dueDateStr);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        l1 = issueDate.getTime();
        l2 = dueDate.getTime();
        sqlIssueDate = new java.sql.Date(l1);
        sqlDueDate = new java.sql.Date(l2);
            
        try(Connection connection = BDConnection.getConnection()){
            PreparedStatement prepst;
            if(viewType.equals("Toate")){
                prepst = connection.prepareStatement("SELECT * FROM carti_oferite cf INNER JOIN carti c ON cf.id_carte = c.id_carte "
                        + "INNER JOIN studenti s ON s.id_studentului = cf.id_studentului WHERE cf.data_oferirii BETWEEN ? AND ?");
            }else{
                prepst = connection.prepareStatement("SELECT * FROM carti_oferite cf INNER JOIN carti c ON cf.id_carte = c.id_carte "
                        + "INNER JOIN studenti s ON s.id_studentului = cf.id_studentului WHERE cf.data_oferirii BETWEEN ? AND ? AND status = ?");
                prepst.setString(3, viewType);
            }
            prepst.setDate(1, sqlIssueDate);
            prepst.setDate(2, sqlDueDate);

            ResultSet rs = prepst.executeQuery();

            while(rs.next()){
                count += 1;
                bookName = rs.getString("denumire_carte");
                studentName = rs.getString("numele") + " " + rs.getString("prenumele");
                issueDateStr = rs.getString("data_oferirii");
                dueDateStr = rs.getString("termenul");
                status = rs.getString("status");

                Object[] obj = {count, bookName, studentName, issueDateStr, dueDateStr, status};

                tableModel = (DefaultTableModel)tableOfRecords.getModel();
                tableModel.addRow(obj);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return count;
    }
    
    public int setTableModel(String viewType){
        String dueDate, issueDate, bookName, studentName, status;
        int count = 0;
        ResultSet rs;
                
        try(Connection connection = BDConnection.getConnection()){
            Statement st = connection.createStatement();
            
            if(viewType.equals("Toate")){
                rs = st.executeQuery("SELECT * FROM carti_oferite cf INNER JOIN carti c ON cf.id_carte = c.id_carte "
                        + "INNER JOIN studenti s ON s.id_studentului = cf.id_studentului");
            }else{
                PreparedStatement prepst = connection.prepareStatement("SELECT * FROM carti_oferite cf INNER JOIN carti c ON cf.id_carte = c.id_carte "
                        + "INNER JOIN studenti s ON s.id_studentului = cf.id_studentului WHERE status = ?");
                prepst.setString(1, viewType);
                rs = prepst.executeQuery();
            }
      
            while(rs.next()){
                count += 1;
                bookName = rs.getString("denumire_carte");
                studentName = rs.getString("numele") + rs.getString("prenumele");
                issueDate = rs.getString("data_oferirii");
                dueDate = rs.getString("termenul");
                status = rs.getString("status");

                Object[] obj = {count, bookName, studentName, issueDate, dueDate, status};

                tableModel = (DefaultTableModel)tableOfRecords.getModel();
                tableModel.addRow(obj);  
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return count;
    }
    
    public void clearTable(){
        tableModel.setRowCount(0);
    }
    
    private void changeComponents(){
        for(Component c : dueDateCalendar.getComponents()){
            ((JComponent)c).setBackground(new Color(153, 0, 0)); 
            ((JComponent)c).setForeground(Color.WHITE);
        }
        for(Component c : issueDateCalendar.getComponents()){
            ((JComponent)c).setBackground(new Color(153, 0, 0)); 
            ((JComponent)c).setForeground(Color.WHITE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label18;
    private javax.swing.JLabel Label19;
    private javax.swing.JLabel Label20;
    private javax.swing.JLabel backLabel;
    private datechooser.beans.DateChooserCombo dueDateCalendar;
    private datechooser.beans.DateChooserCombo issueDateCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private rojerusan.RSMaterialButtonCircle searchBtn;
    private rojerusan.RSTableMetro tableOfRecords;
    private javax.swing.JComboBox<String> viewCombo;
    private rojerusan.RSMaterialButtonCircle viewDefaultBtn;
    // End of variables declaration//GEN-END:variables
}
