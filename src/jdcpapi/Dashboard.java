package jdcpapi;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        jScrollPane1.getViewport().setBackground(Color.white);
        FunctionValidate.setLists("");

        Popupmenu.add(Menu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        Popupmenu = new javax.swing.JPopupMenu();
        HeaderPanel = new javax.swing.JPanel();
        LogoName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DataTable = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        DeleteAllBtn = new javax.swing.JButton();
        SearchData = new javax.swing.JTextField();

        Menu.setBackground(new java.awt.Color(0, 102, 0));
        Menu.setLayout(new java.awt.BorderLayout());

        EditBtn.setBackground(new java.awt.Color(0, 102, 0));
        EditBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jdcpapi/icons/icons8_edit_30px.png"))); // NOI18N
        EditBtn.setText("Edit");
        EditBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        Menu.add(EditBtn, java.awt.BorderLayout.CENTER);

        DeleteBtn.setBackground(new java.awt.Color(204, 0, 0));
        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jdcpapi/icons/icons8_Remove_30px.png"))); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        Menu.add(DeleteBtn, java.awt.BorderLayout.PAGE_START);

        Popupmenu.setComponentPopupMenu(Popupmenu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        LogoName.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        LogoName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jdcpapi/icons/icons8_active_directory_40px.png"))); // NOI18N
        LogoName.setText("Logo");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(LogoName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));

        DataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Firstname", "Lastname", "Email", "Gender", "Address", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DataTable.setComponentPopupMenu(Popupmenu);
        DataTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(DataTable);

        AddBtn.setBackground(new java.awt.Color(3, 99, 3));
        AddBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jdcpapi/icons/icons8_add_30px.png"))); // NOI18N
        AddBtn.setText("Add New");
        AddBtn.setToolTipText("Add New User");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        DeleteAllBtn.setBackground(new java.awt.Color(3, 99, 3));
        DeleteAllBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DeleteAllBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jdcpapi/icons/icons8_Remove_30px.png"))); // NOI18N
        DeleteAllBtn.setText("Delete All");
        DeleteAllBtn.setToolTipText("Add New User");
        DeleteAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAllBtnActionPerformed(evt);
            }
        });

        SearchData.setToolTipText("Search..");
        SearchData.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SearchData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchDataActionPerformed(evt);
            }
        });
        SearchData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchDataKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AddBtn)
                .addGap(34, 34, 34)
                .addComponent(DeleteAllBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchData, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchData, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        AddBox Reg = new AddBox(this, true);
        Reg.setVisible(true);
    }//GEN-LAST:event_AddBtnActionPerformed

    @SuppressWarnings("static-access")
    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        int fila = DataTable.getSelectedRow();
        UpdateData Edit = new UpdateData(this, true);

        Edit.NewUserID.setText(DataTable.getValueAt(fila, 0).toString());
        Edit.Firstname.setText(DataTable.getValueAt(fila, 1).toString());
        Edit.Lastname.setText(DataTable.getValueAt(fila, 2).toString());
        Edit.Email.setText(DataTable.getValueAt(fila, 3).toString());
        Edit.Gender.setSelectedItem(DataTable.getValueAt(fila, 4).toString());
        Edit.Address.setText(DataTable.getValueAt(fila, 5).toString());
        Edit.Username.setText(DataTable.getValueAt(fila, 6).toString());
        Edit.Password.setText(DataTable.getValueAt(fila, 7).toString());

        Edit.setVisible(true);
        dispose();
        DataTable.setVisible(true);
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        int fila = DataTable.getSelectedRow();
        ValiateData s = new ValiateData();
        s.setID(DataTable.getValueAt(fila, 0).toString());
        if (JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Delete This Data?", "",
                JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            if (FunctionValidate.isDelete(s)) {
                 FunctionValidate.setLists("");
                JOptionPane.showMessageDialog(this, "Succesfully Delete..!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                repaint();
            } else {
                JOptionPane.showMessageDialog(this, "Fail To Delete Data", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void DeleteAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAllBtnActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Delete All Data?", "",
                JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            if (FunctionValidate.isTruncate()) {
                 FunctionValidate.setLists("");
                JOptionPane.showMessageDialog(this, "Succesfully Delete..!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                repaint();
            } else {
                JOptionPane.showMessageDialog(this, "Fail To Delete Data", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_DeleteAllBtnActionPerformed

    private void SearchDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchDataKeyReleased
        FunctionValidate.setLists(this.SearchData.getText());
    }//GEN-LAST:event_SearchDataKeyReleased

    private void SearchDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchDataActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    public static javax.swing.JTable DataTable;
    private javax.swing.JButton DeleteAllBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel LogoName;
    private javax.swing.JPanel Menu;
    private javax.swing.JPopupMenu Popupmenu;
    private javax.swing.JTextField SearchData;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
