/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.korhangui;

/**
 *
 * @author kemer
 */
public class Sign_in extends javax.swing.JFrame {
    boolean patientButton = true;
    boolean doctorButton = false;
    /**
     * Creates new form Sign_in
     */
    public Sign_in() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signOption = new javax.swing.ButtonGroup();
        signAsPatient = new javax.swing.JRadioButton();
        signAsDoctor = new javax.swing.JRadioButton();
        usernameText = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        signInButton = new javax.swing.JButton();
        mainMenuButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signOption.add(signAsPatient);
        signAsPatient.setSelected(true);
        signAsPatient.setText("Sign as patient");
        signAsPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signAsPatientActionPerformed(evt);
            }
        });

        signOption.add(signAsDoctor);
        signAsDoctor.setText("Sign as doctor");
        signAsDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signAsDoctorActionPerformed(evt);
            }
        });

        username.setText("Username :");

        password.setText("Password :");

        exitButton.setText("Exit");

        signInButton.setText("Sign-in");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        mainMenuButton.setText("Main Menu");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Sign - in");

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username)
                            .addComponent(password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameText)
                            .addComponent(passwordText, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(signAsPatient)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(signInButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(signAsDoctor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signAsPatient)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signAsDoctor)
                    .addComponent(password)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainMenuButton)
                    .addComponent(exitButton)
                    .addComponent(signInButton))
                .addGap(27, 27, 27))
        );

        jCheckBox1.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
     LaunchAccount();
    }//GEN-LAST:event_signInButtonActionPerformed

    private void signAsPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signAsPatientActionPerformed
        doctorButton = false;
        patientButton = true;
    }//GEN-LAST:event_signAsPatientActionPerformed

    private void signAsDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signAsDoctorActionPerformed
        doctorButton = true;
        patientButton = false;
    }//GEN-LAST:event_signAsDoctorActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        this.toBack();
        this.setVisible(false);
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
        mm.toFront();
    }//GEN-LAST:event_mainMenuButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_in().setVisible(true);
            }
        });
    }
    
    public boolean searchAccount(String address)
    {        
        SearchAccount search_acc = new SearchAccount(address, usernameText.getText(), passwordText.getText());
        return search_acc.SearchResult();
    }
    
    public boolean areFieldsEmpty()
    {
        return (usernameText.equals(null) || passwordText.equals(null));       
    }
    
    //---------------------------------------------------//
    public void LaunchDoctorAccount()
    {
        this.toBack();
        this.setVisible(false);
        DoctorAccount dr_acc = new DoctorAccount();
        dr_acc.setVisible(true);
        dr_acc.toFront();        
    }
    public void LaunchPatientAccount()
    {
        this.toBack();
        this.setVisible(false);
        PatientAccount pt_acc = new PatientAccount();
        pt_acc.setVisible(true);
        pt_acc.toFront();        
    }
    //---------------------------------------------------//
    
    
    public void LaunchAccount()
    {
        if(!areFieldsEmpty())
        { 
            System.out.println("level 1");
             if(patientButton)
          { System.out.println("level 2");
              if(searchAccount("PatientAccountDatabase.txt"))
              { System.out.println("level 3");
                 Current_account.username = usernameText.getText();
                 Current_account.password = passwordText.getText();
                 LaunchPatientAccount();
              }   
          }
             else
          {  System.out.println("level 2");
              if(searchAccount("DoctorAccountDatabase.txt"))
              { System.out.println("level 3");
                 Current_account.username = usernameText.getText();
                 Current_account.password = passwordText.getText();
                LaunchDoctorAccount();  
              }  
          }  
        }
        
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JRadioButton signAsDoctor;
    private javax.swing.JRadioButton signAsPatient;
    private javax.swing.JButton signInButton;
    private javax.swing.ButtonGroup signOption;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}