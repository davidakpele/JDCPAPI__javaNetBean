package jdcpapi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class UpdateData extends javax.swing.JDialog {
private Pattern regexPattern;
 private Matcher regMatcher;
  
@SuppressWarnings("OverridableMethodCallInConstructor")
    public UpdateData(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setClean();
    }

@SuppressWarnings("static-access")
    public void setClean(){
        this.NewUserID.setText("");
        this.Firstname.setText("");
        this.Lastname.setText("");
        this.Email.setText("");
        this.Address.setText("");
        this.Gender.setSelectedItem("");
        this.Username.setText("");
        this.Password.setText("");
        
        //this.HeaderTitle.setText("");
        this.NewUserID.setText(FunctionValidate.extractIDMAX());
  
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BodyPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        HeaderTitle = new javax.swing.JLabel();
        Firstname = new javax.swing.JTextField();
        Lastname = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Gender = new javax.swing.JComboBox<>();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        fnamelabell = new javax.swing.JLabel();
        lnamelabel = new javax.swing.JLabel();
        lnamelabel1 = new javax.swing.JLabel();
        Genderlabel = new javax.swing.JLabel();
        usernamelabel = new javax.swing.JLabel();
        lnamelabel4 = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        Cancelbtn = new javax.swing.JButton();
        NewUserID = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        Addresslabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BodyPanel.setBackground(new java.awt.Color(239, 239, 239));
        BodyPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        HeaderPanel.setBackground(new java.awt.Color(153, 0, 204));

        HeaderTitle.setFont(new java.awt.Font("Franklin Gothic Book", 1, 20)); // NOI18N
        HeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        HeaderTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderTitle.setText("Updating  User");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(HeaderTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        Lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastnameActionPerformed(evt);
            }
        });

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));

        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        fnamelabell.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fnamelabell.setForeground(new java.awt.Color(102, 102, 102));
        fnamelabell.setText("Firstname:*");

        lnamelabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lnamelabel.setForeground(new java.awt.Color(102, 102, 102));
        lnamelabel.setText("Lastname:*");

        lnamelabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lnamelabel1.setForeground(new java.awt.Color(102, 102, 102));
        lnamelabel1.setText("Email:*");

        Genderlabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Genderlabel.setForeground(new java.awt.Color(102, 102, 102));
        Genderlabel.setText("Gender:*");

        usernamelabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usernamelabel.setForeground(new java.awt.Color(102, 102, 102));
        usernamelabel.setText("Username:*");

        lnamelabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lnamelabel4.setForeground(new java.awt.Color(102, 102, 102));
        lnamelabel4.setText("Password:*");

        SubmitBtn.setBackground(new java.awt.Color(51, 153, 0));
        SubmitBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        SubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        SubmitBtn.setText("Submit");
        SubmitBtn.setToolTipText("Submit Form");
        SubmitBtn.setBorder(null);
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        Cancelbtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        Cancelbtn.setText("Cancel");
        Cancelbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelbtnActionPerformed(evt);
            }
        });

        NewUserID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewUserID.setText("NewID");

        Addresslabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Addresslabel.setForeground(new java.awt.Color(102, 102, 102));
        Addresslabel.setText("Address:*");

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyPanelLayout.createSequentialGroup()
                        .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fnamelabell, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lnamelabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Genderlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernamelabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lnamelabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Addresslabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyPanelLayout.createSequentialGroup()
                        .addComponent(lnamelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyPanelLayout.createSequentialGroup()
                            .addComponent(Cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                        .addComponent(Gender, javax.swing.GroupLayout.Alignment.TRAILING, 0, 288, Short.MAX_VALUE)
                        .addComponent(Firstname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                        .addComponent(Email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                        .addComponent(Username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                        .addComponent(Lastname, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnamelabell))
                .addGap(21, 21, 21)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnamelabel)
                    .addComponent(Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnamelabel1)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Genderlabel))
                .addGap(18, 18, 18)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addresslabel)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyPanelLayout.createSequentialGroup()
                        .addComponent(usernamelabel)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyPanelLayout.createSequentialGroup()
                        .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnamelabel4))
                .addGap(18, 18, 18)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NewUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        getContentPane().add(BodyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void LastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastnameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void CancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelbtnActionPerformed
       this.dispose();
    }//GEN-LAST:event_CancelbtnActionPerformed

@SuppressWarnings("static-access")
    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
      //How to validate ComBox input and check if it empty, if it is, Prompt Error Camp for users. else return True and Next();
        String fname = Firstname.getText();
        String lname = Lastname.getText();
        String Usemail = Email.getText();
        String gender = (String) Gender.getSelectedItem();
        String addr = Address.getText();
        String username = Username.getText();
        String pass = String.valueOf(Password.getPassword());
        //Email Regex
       regexPattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
       regMatcher   = regexPattern.matcher(Usemail);
        //Telephone Num Java Regex
        //regexPattern = Pattern.compile("^\\+[0-9]{2,3}+-[0-9]{10}$");
        //regMatcher   = regexPattern.matcher(mobileNumber);
        if(fname.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your First-Name.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(lname.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your Last-Name", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(Usemail.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your Email Address", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(!regMatcher.matches()){
            JOptionPane.showMessageDialog(this, "Invalid Email Address", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(gender.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Select Your Gender", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(addr.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your Address", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(username.isEmpty()){
            JOptionPane.showMessageDialog(this, "Provide Your Username", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(pass.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Your Password", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            ValiateData run = new ValiateData();
            
            run.setID(this.NewUserID.getText());
            run.setFirstname(this.Firstname.getText());
            run.setLastname(this.Lastname.getText());
            run.setEmail(this.Email.getText());
            run.setAddress(this.Address.getText());
            run.setGender((String) this.Gender.getSelectedItem());
            run.setUsername(this.Username.getText());
            run.setPassword(String.valueOf(this.Password.getPassword()));
            
         if(FunctionValidate.isUpdateData(run)){
            setClean();
            FunctionValidate.setLists("");
            JOptionPane.showMessageDialog(this, "Succesfully Updated", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
         }else{
            JOptionPane.showMessageDialog(this, "Fail To Update Data", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
         }
        }        
    }//GEN-LAST:event_SubmitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            UpdateData dialog = new UpdateData(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Address;
    private javax.swing.JLabel Addresslabel;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JButton Cancelbtn;
    public static javax.swing.JTextField Email;
    public static javax.swing.JTextField Firstname;
    public static javax.swing.JComboBox<String> Gender;
    private javax.swing.JLabel Genderlabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel HeaderTitle;
    public static javax.swing.JTextField Lastname;
    public static javax.swing.JLabel NewUserID;
    public static javax.swing.JPasswordField Password;
    private javax.swing.JButton SubmitBtn;
    public static javax.swing.JTextField Username;
    private javax.swing.JLabel fnamelabell;
    private javax.swing.JLabel lnamelabel;
    private javax.swing.JLabel lnamelabel1;
    private javax.swing.JLabel lnamelabel4;
    private javax.swing.JLabel usernamelabel;
    // End of variables declaration//GEN-END:variables
}
