package management.forms.infoCards;

import java.awt.Color;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import management.elements.Book;
import management.elements.Manages;
import management.utils.ManageHelper;

public class BookInfoCard extends javax.swing.JFrame {    
    public BookInfoCard() {
        initComponents();
        changeComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false); 
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/50px-frameIcon.png")));
    }
    
    public void setValuesToFields(Book book){
        idBookLabel.setText(Integer.toString(book.getBookId()));
        denumireField.setText(book.getBookName());
        genreBookLabel.setText(book.getGen());
        edituraLabel.setText(book.getEditura());
        ISBNField.setText(book.getISBN());
        
        authorsField.setText(ManageHelper.toStringJoiner(book.getAuthors(), ", "));
    }
    
    private void changeComponents(){
        denumireField.setMargin(new Insets(0, 0, 0, 0));
        authorsField.setMargin(new Insets(0, 0, 0, 0));
        Border empty = new EmptyBorder(0, 0, 0, 0);
        denumireField.setBorder(empty);
        authorsField.setBorder(empty);
        
        authorsField.setEditable(false);
        denumireField.setEditable(false);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        genreBookLabel = new javax.swing.JLabel();
        edituraLabel = new javax.swing.JLabel();
        idBookLabel = new javax.swing.JLabel();
        denumireField = new javax.swing.JTextField();
        authorsField = new javax.swing.JTextField();
        ISBNField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 77));
        jPanel5.setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Cardul cărtii");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(7, 7, 7))
        );

        jPanel2.setBackground(new java.awt.Color(153, 102, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(580, 720));

        Label1.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        Label1.setForeground(java.awt.SystemColor.controlHighlight);
        Label1.setText("Id-ul cărtii:");

        Label2.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        Label2.setForeground(java.awt.SystemColor.controlHighlight);
        Label2.setText("ISBN:");

        Label3.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        Label3.setForeground(java.awt.SystemColor.controlHighlight);
        Label3.setText("Denumirea cărtii:");

        Label4.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        Label4.setForeground(java.awt.SystemColor.controlHighlight);
        Label4.setText("Numele autorului:");

        Label5.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        Label5.setForeground(java.awt.SystemColor.controlHighlight);
        Label5.setText("Genul:");

        Label7.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        Label7.setForeground(java.awt.SystemColor.controlHighlight);
        Label7.setText("Editura:");

        genreBookLabel.setBackground(new java.awt.Color(255, 255, 255));
        genreBookLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        genreBookLabel.setForeground(java.awt.SystemColor.controlHighlight);

        edituraLabel.setBackground(new java.awt.Color(255, 255, 255));
        edituraLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        edituraLabel.setForeground(java.awt.SystemColor.controlHighlight);

        idBookLabel.setBackground(new java.awt.Color(255, 255, 255));
        idBookLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        idBookLabel.setForeground(java.awt.SystemColor.controlHighlight);

        denumireField.setBackground(new java.awt.Color(153, 102, 0));
        denumireField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        denumireField.setForeground(java.awt.SystemColor.controlHighlight);
        denumireField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        denumireField.setToolTipText("");
        denumireField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        denumireField.setMargin(new java.awt.Insets(4, 6, 4, 6));
        denumireField.setPreferredSize(new java.awt.Dimension(0, 30));

        authorsField.setBackground(new java.awt.Color(153, 102, 0));
        authorsField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        authorsField.setForeground(java.awt.SystemColor.controlHighlight);
        authorsField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        authorsField.setToolTipText("");
        authorsField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        authorsField.setMargin(new java.awt.Insets(4, 6, 4, 6));
        authorsField.setPreferredSize(new java.awt.Dimension(0, 30));

        ISBNField.setBackground(new java.awt.Color(255, 255, 255));
        ISBNField.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        ISBNField.setForeground(java.awt.SystemColor.controlHighlight);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label5)
                    .addComponent(Label4)
                    .addComponent(Label7)
                    .addComponent(Label3)
                    .addComponent(Label2)
                    .addComponent(Label1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ISBNField, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(denumireField, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorsField, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edituraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Label1)
                        .addGap(23, 23, 23)
                        .addComponent(Label2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(idBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ISBNField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Label3)
                    .addComponent(denumireField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label4)
                    .addComponent(authorsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label5)
                    .addComponent(genreBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label7)
                    .addComponent(edituraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ISBNField;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label7;
    private javax.swing.JTextField authorsField;
    private javax.swing.JTextField denumireField;
    private javax.swing.JLabel edituraLabel;
    private javax.swing.JLabel genreBookLabel;
    private javax.swing.JLabel idBookLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
