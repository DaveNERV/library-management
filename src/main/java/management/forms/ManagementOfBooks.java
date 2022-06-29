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
 * @author User
 */
public class ManagementOfBooks extends javax.swing.JFrame {
    private int number;
    private Integer book_id;
    private String book_name, editura, gen, ISBN; 
    private List<String> authors;
    private DefaultTableModel tableModel;

    /**
     * Creates new form ManagementOfBooks
     */
    public ManagementOfBooks() {
        initComponents();
        changeComponents();
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.ORANGE));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/50px-frameIcon.png")));
        setDefaultValuesOfComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setTableModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        ISBNField = new javax.swing.JTextField();
        loginLabel1 = new javax.swing.JLabel();
        denumireField = new javax.swing.JTextField();
        loginLabel2 = new javax.swing.JLabel();
        loginLabel3 = new javax.swing.JLabel();
        loginLabel4 = new javax.swing.JLabel();
        loginLabel5 = new javax.swing.JLabel();
        edituraField = new javax.swing.JTextField();
        nr_carti = new javax.swing.JSpinner();
        genres = new javax.swing.JComboBox<>();
        update_btn = new rojerusan.RSMaterialButtonCircle();
        addBook_btn = new rojerusan.RSMaterialButtonCircle();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListOfAuthors = new javax.swing.JList<>();
        idField = new javax.swing.JTextField();
        loginLabel6 = new javax.swing.JLabel();
        findByIdOrISBNBtn = new rojerusan.RSMaterialButtonCircle();
        delete_btn = new rojerusan.RSMaterialButtonCircle();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOfBooks = new rojerusan.RSTableMetro();
        jPanel3 = new javax.swing.JPanel();
        backLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(java.awt.Color.darkGray);

        loginLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        loginLabel.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel.setText("Numele autorului:");

        ISBNField.setBackground(java.awt.SystemColor.controlHighlight);
        ISBNField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ISBNField.setToolTipText("");
        ISBNField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        ISBNField.setMargin(new java.awt.Insets(4, 6, 4, 6));
        ISBNField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISBNFieldActionPerformed(evt);
            }
        });

        loginLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        loginLabel1.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel1.setText("ISBN:");

        denumireField.setBackground(java.awt.SystemColor.controlHighlight);
        denumireField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        denumireField.setToolTipText("");
        denumireField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        denumireField.setMaximumSize(new java.awt.Dimension(100, 100));

        loginLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        loginLabel2.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel2.setText("Denumirea cărtii:");

        loginLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        loginLabel3.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel3.setText("Editor:");

        loginLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        loginLabel4.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel4.setText("Genul:");

        loginLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        loginLabel5.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel5.setText("Numărul:");

        edituraField.setBackground(java.awt.SystemColor.controlHighlight);
        edituraField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        edituraField.setToolTipText("");
        edituraField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        nr_carti.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        genres.setBackground(java.awt.SystemColor.controlHighlight);
        genres.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        genres.setPreferredSize(new java.awt.Dimension(90, 40));

        update_btn.setBackground(new java.awt.Color(204, 102, 0));
        update_btn.setText("Modifică");
        update_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
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

        ListOfAuthors.setBackground(java.awt.SystemColor.controlHighlight);
        ListOfAuthors.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ListOfAuthors.setVisibleRowCount(1);
        jScrollPane1.setViewportView(ListOfAuthors);

        idField.setBackground(java.awt.SystemColor.controlHighlight);
        idField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idField.setToolTipText("");
        idField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        idField.setMargin(new java.awt.Insets(4, 6, 4, 6));

        loginLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        loginLabel6.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel6.setText("Id-ul cărtii:");

        findByIdOrISBNBtn.setBackground(new java.awt.Color(204, 102, 0));
        findByIdOrISBNBtn.setText("Caută după Id/ISBN");
        findByIdOrISBNBtn.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        findByIdOrISBNBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findByIdOrISBNBtnActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addBook_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginLabel4)
                            .addComponent(loginLabel3)
                            .addComponent(loginLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(loginLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(loginLabel2)
                                .addComponent(loginLabel1)
                                .addComponent(loginLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edituraField)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(nr_carti, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ISBNField, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                                    .addComponent(idField))
                                                .addGap(18, 18, 18)
                                                .addComponent(findByIdOrISBNBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                            .addComponent(genres, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane1))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(denumireField, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ISBNField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(findByIdOrISBNBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginLabel2)
                    .addComponent(denumireField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginLabel4)
                            .addComponent(genres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginLabel5)
                            .addComponent(nr_carti, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(loginLabel3))
                    .addComponent(edituraField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBook_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel2.setBackground(java.awt.SystemColor.inactiveCaption);

        tableOfBooks.setBackground(new java.awt.Color(102, 102, 102));
        tableOfBooks.setForeground(java.awt.SystemColor.controlHighlight);
        tableOfBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "ISBN", "Denumire", "Autor", "Genul", "Editura", "Nr"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableOfBooks.setColorBackgoundHead(new java.awt.Color(102, 102, 102));
        tableOfBooks.setColorFilasBackgound1(new java.awt.Color(153, 0, 0));
        tableOfBooks.setColorFilasBackgound2(new java.awt.Color(153, 0, 0));
        tableOfBooks.setColorFilasForeground1(java.awt.SystemColor.controlHighlight);
        tableOfBooks.setColorFilasForeground2(java.awt.SystemColor.controlHighlight);
        tableOfBooks.setFuenteFilas(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tableOfBooks.setFuenteHead(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableOfBooks.setRowHeight(35);
        tableOfBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOfBooksMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableOfBooks);
        if (tableOfBooks.getColumnModel().getColumnCount() > 0) {
            tableOfBooks.getColumnModel().getColumn(0).setResizable(false);
            tableOfBooks.getColumnModel().getColumn(0).setPreferredWidth(24);
            tableOfBooks.getColumnModel().getColumn(1).setResizable(false);
            tableOfBooks.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableOfBooks.getColumnModel().getColumn(2).setResizable(false);
            tableOfBooks.getColumnModel().getColumn(2).setPreferredWidth(120);
            tableOfBooks.getColumnModel().getColumn(3).setResizable(false);
            tableOfBooks.getColumnModel().getColumn(3).setPreferredWidth(140);
            tableOfBooks.getColumnModel().getColumn(4).setResizable(false);
            tableOfBooks.getColumnModel().getColumn(4).setPreferredWidth(100);
            tableOfBooks.getColumnModel().getColumn(5).setPreferredWidth(120);
            tableOfBooks.getColumnModel().getColumn(6).setResizable(false);
            tableOfBooks.getColumnModel().getColumn(6).setPreferredWidth(4);
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
                .addContainerGap(295, Short.MAX_VALUE))
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
        jLabel2.setText("Gestionarea cărtilor");

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
    
    private Integer getRowByValue(Object value) {
        for (int i = tableModel.getRowCount() - 1; i >= 0; --i) {
            for (int j = tableModel.getColumnCount() - 1; j >= 0; --j) {
                if (tableModel.getValueAt(i, j).equals(value)) {
                    return i;
                }
            }
        }
        return null;
     }
    
    public void setValuesToFields(int row){
        TableModel model = tableOfBooks.getModel();
        DefaultListModel demoListAuthors = new DefaultListModel();
        genres.removeAllItems();
        int count = 0;
        
        String autor_nume = model.getValueAt(row, 3).toString();
        String[] authorsArray = autor_nume.split(", ");
        
        idField.setText(model.getValueAt(row, 0).toString());
        ISBNField.setText(model.getValueAt(row, 1).toString());
        denumireField.setText(model.getValueAt(row, 2).toString());
        
        for(String author : authorsArray){
            //System.out.println(author);
            demoListAuthors.addElement(author);
            count++;
        }
        
        genres.addItem(model.getValueAt(row, 4).toString());
        edituraField.setText(model.getValueAt(row, 5).toString());
        nr_carti.setValue(model.getValueAt(row, 6));
        
        try(Connection connection = BDConnection.getConnection()){
            Statement st = connection.createStatement();
            PreparedStatement prepst = connection.prepareStatement("SELECT denumire_gen from genuri WHERE denumire_gen != ?");
            prepst.setString(1,model.getValueAt(row, 4).toString() );
            ResultSet rs = prepst.executeQuery();
            
            while (rs.next()){
                genres.addItem(rs.getString("denumire_gen"));
            }
            genres.setSelectedItem(model.getValueAt(row, 4).toString());
            
            
            for(String author : authorsArray){
                prepst = connection.prepareStatement("SELECT CONCAT(nume_autor, ' ', prenume_autor) as autor "
                        + "FROM autori where nume_autor != ? and prenume_autor != ?");
                prepst.setString(1, author.split(" ")[0]);
                prepst.setString(2, author.split(" ")[1]);
            }
            
            
            rs = prepst.executeQuery();
            while(rs.next()){
                demoListAuthors.addElement(rs.getString("autor"));
            }
            ListOfAuthors.setModel(demoListAuthors);
            
            ListOfAuthors.addSelectionInterval(0, count-1);
            
          
        }catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    private void tableOfBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOfBooksMouseClicked
        int row = tableOfBooks.getSelectedRow();
        setValuesToFields(row);
    }//GEN-LAST:event_tableOfBooksMouseClicked

    private void addBook_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBook_btnActionPerformed
        if(addBook() == true){
            JOptionPane.showMessageDialog(this, "Cartea a fost adăugată.");
            clearTable();
            setTableModel();
        }else{
            JOptionPane.showMessageDialog(this, "Eroare de adăugare a cărtii."); 
        }
    }//GEN-LAST:event_addBook_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        if(updateBook() == true){
            JOptionPane.showMessageDialog(this, "Cartea a fost modificată.");
            clearTable();
            setTableModel();
        }else{
            JOptionPane.showMessageDialog(this, "Eroare de modificare a cărtii."); 
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void findByIdOrISBNBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findByIdOrISBNBtnActionPerformed
        Integer idx;
        setInfoBook();
        
        if(book_id != null){
            idx = getRowByValue(book_id);
        }else if(ISBN != null){
            idx = getRowByValue(ISBN);
        }else{
             JOptionPane.showMessageDialog(this, "Ambele campuri sunt pustie.");
             return;
        }
        tableOfBooks.setRowSelectionInterval(idx, idx);
        int row = tableOfBooks.getSelectedRow();
        setValuesToFields(row);
    }//GEN-LAST:event_findByIdOrISBNBtnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        if(deleteBook() == true){
            JOptionPane.showMessageDialog(this, "Cartea a fost stearsă.");
            clearTable();
            setTableModel();
        }else{
            JOptionPane.showMessageDialog(this, "Eroare de stergere a cărtii."); 
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void ISBNFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISBNFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISBNFieldActionPerformed
    
    private void setTableModel(){
        StringJoiner str_authors = new StringJoiner(", ");
        
        try(Connection connection = BDConnection.getConnection()){
            Statement st1 = connection.createStatement();
            ResultSet rsBooks = st1.executeQuery("SELECT c.id_carte, c.ISBN, c.denumire_carte, g.denumire_gen, c.editor, c.nr_carti "
                    + "FROM carti c INNER JOIN genuri g USING(id_gen)");
            PreparedStatement prepstAuthors = connection.prepareStatement("SELECT CONCAT(a.nume_autor, ' ', a.prenume_autor) as autor "
                    + "FROM carti c INNER JOIN autorii_cartilor ac ON c.id_carte = ac.id_carte "
                    + "INNER JOIN autori a ON a.id_autor = ac.id_autor WHERE ac.id_carte = ?");
            while(rsBooks.next()){
                int book_id = rsBooks.getInt("id_carte");
                String ISBN = rsBooks.getString("ISBN");
                String book_name = rsBooks.getString("denumire_carte");
                String gen = rsBooks.getString("denumire_gen");
                String editura = rsBooks.getString("editor");
                int nr_carti = rsBooks.getInt("nr_carti");
                
                prepstAuthors.setInt(1, book_id);
                ResultSet rsAuthors = prepstAuthors.executeQuery();
                while(rsAuthors.next()){
                    str_authors.add(rsAuthors.getString("autor"));
                }

                Object[] obj = {book_id, ISBN, book_name, str_authors, gen, editura, nr_carti};
                
                tableModel = (DefaultTableModel)tableOfBooks.getModel();
                tableModel.addRow(obj);
                
                str_authors = new StringJoiner(", ");
            }   
           
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean addBook(){
        setInfoBook();
        int rowCount1, rowCount2 = 0;
        
        try(Connection connection = BDConnection.getConnection()){
            PreparedStatement prepst1;
            if(book_id == null){
                prepst1 = connection.prepareStatement("INSERT INTO carti(denumire_carte, id_gen, nr_carti, editor, ISBN) VALUES(?, (SELECT id_gen FROM genuri WHERE denumire_gen = ?), ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
                prepst1.setString(1, book_name);
                prepst1.setString(2, gen);
                prepst1.setInt(3, number);
                prepst1.setString(4, editura);
                prepst1.setString(5, ISBN);
            }else{
                prepst1 = connection.prepareStatement("INSERT INTO carti VALUES(?, ?, (SELECT id_gen FROM genuri WHERE denumire_gen = ?), ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
                prepst1.setObject(1, book_id, Types.INTEGER);
                prepst1.setString(2, book_name);
                prepst1.setString(3, gen);
                prepst1.setInt(4, number);
                prepst1.setString(5, editura);
                prepst1.setString(6, ISBN);  
            }
            
            if(!authors.isEmpty()){
                rowCount1 = prepst1.executeUpdate(); 
                
                ResultSet rs = prepst1.getGeneratedKeys();
                if (rs.next()){
                    this.book_id = Integer.parseInt(rs.getString(1));
                }
                
                PreparedStatement prepst2 = connection.prepareStatement("INSERT INTO autorii_cartilor VALUES(?, (SELECT id_autor FROM autori WHERE nume_autor = ? AND prenume_autor = ?))");

                for(String author : authors){
                    prepst2.setObject(1, book_id, Types.INTEGER);
                    prepst2.setString(2, author.split(" ")[0]);
                    prepst2.setString(3, author.split(" ")[1]);
                    rowCount2 += prepst2.executeUpdate();
                }
                if(rowCount1 > 0 && rowCount2 > 0){
                   return true;
                 }else{
                    return false;
                 }
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean updateBook(){
        int rowCount1, rowCount2 = 0;
        
        setInfoBook();
        
        try(Connection connection = BDConnection.getConnection()){
            //if(!gen.equals)

            PreparedStatement prepst1 = connection.prepareStatement("UPDATE carti SET denumire_carte = ?, "
                    + "id_gen = (SELECT id_gen FROM genuri WHERE denumire_gen = ?), nr_carti = ?, editor = ? WHERE id_carte = ?");
            prepst1.setString(1, book_name);
            prepst1.setString(2, gen);
            prepst1.setInt(3, number);
            prepst1.setString(4, editura);
            prepst1.setObject(5, book_id, Types.INTEGER);
            
            if(!authors.isEmpty()){
                rowCount1 = prepst1.executeUpdate();       
                PreparedStatement prepst2 = connection.prepareStatement("DELETE FROM autorii_cartilor WHERE id_carte = ?;");
                
                prepst2.setObject(1, book_id, Types.INTEGER);
                prepst2.executeUpdate();
                
                prepst2 = connection.prepareStatement("INSERT INTO autorii_cartilor VALUES(?, (SELECT id_autor FROM autori WHERE nume_autor = ? AND prenume_autor = ?))");

                for(String author : authors){
                    prepst2.setObject(1, book_id, Types.INTEGER);
                    prepst2.setString(2, author.split(" ")[0]);
                    prepst2.setString(3, author.split(" ")[1]);
                    rowCount2 += prepst2.executeUpdate();
                }
                if(rowCount1 > 0 && rowCount2 > 0){
                   return true;
                 }else{
                    return false;
                 }
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteBook(){
        int rowCount;
        
        setInfoBook();
        
        try(Connection connection = BDConnection.getConnection()){

            PreparedStatement prepst = connection.prepareStatement("DELETE FROM carti WHERE id_carte = ?");
            prepst.setObject(1, book_id, Types.INTEGER);
            prepst.setObject(2, ISBN, Types.VARCHAR);
            
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
    
    
    public void setInfoBook(){
        try{   
            this.book_id = Integer.parseInt(idField.getText());
        }catch(NumberFormatException e){
            System.out.print(e.getMessage());
            this.book_id = null; 
        }
        this.gen = (String)genres.getSelectedItem();
        
        this.editura = edituraField.getText();
        this.book_name = denumireField.getText();
        if(this.editura.equals("")){
            this.editura = null;
        }
        if(this.book_name.equals("")){
            book_name = null;
        }
        this.number = (Integer)nr_carti.getValue();
        
        if(ISBNField.getText().equals("")){
            this.ISBN = null;
        }else{
            this.ISBN = ISBNField.getText();
        }
    }
    
    private void changeComponents(){
        ListOfAuthors.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        ListOfAuthors.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
		authors = ListOfAuthors.getSelectedValuesList();
            }
	}); 
    }
    
    private void setDefaultValuesOfComponents(){
        DefaultListModel demoListAuthors = new DefaultListModel();
        
        try(Connection connection = BDConnection.getConnection()){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT denumire_gen from genuri");
           
            while (rs.next()){
                genres.addItem(rs.getString("denumire_gen"));
            }
            
            rs = st.executeQuery("SELECT CONCAT(nume_autor, ' ', prenume_autor) as autor "
                    + "FROM autori");
           
            while (rs.next()){
                demoListAuthors.addElement(rs.getString("autor"));
            }
            ListOfAuthors.setModel(demoListAuthors);
        }catch (SQLException ex) {
            ex.printStackTrace();
        }  
        authors = new ArrayList<>();
    }
    
    public void clearTable(){
        tableModel.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ISBNField;
    private javax.swing.JList<String> ListOfAuthors;
    private rojerusan.RSMaterialButtonCircle addBook_btn;
    private javax.swing.JLabel backLabel;
    private rojerusan.RSMaterialButtonCircle delete_btn;
    private javax.swing.JTextField denumireField;
    private javax.swing.JTextField edituraField;
    private rojerusan.RSMaterialButtonCircle findByIdOrISBNBtn;
    private javax.swing.JComboBox<String> genres;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel loginLabel1;
    private javax.swing.JLabel loginLabel2;
    private javax.swing.JLabel loginLabel3;
    private javax.swing.JLabel loginLabel4;
    private javax.swing.JLabel loginLabel5;
    private javax.swing.JLabel loginLabel6;
    private javax.swing.JSpinner nr_carti;
    private rojerusan.RSTableMetro tableOfBooks;
    private rojerusan.RSMaterialButtonCircle update_btn;
    // End of variables declaration//GEN-END:variables
}

