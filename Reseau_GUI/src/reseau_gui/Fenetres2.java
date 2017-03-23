/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_gui;

import java.util.ArrayList;

/**
 *
 * @author boris.fournier
 */
public class Fenetres2 extends javax.swing.JFrame {

    /**
     * Creates new form fenetres2
     */

    public Fenetres2() {
        initComponents();
        this.setTitle("Reseau_social Boris");   //titre de la fenetre
        this.setSize(350,700);  //taille de la fenetre
        this.setLocationRelativeTo(null);//position au centre
        Putilisateur.setVisible(true);
        Pmoderateur.setVisible(false);
        Pdirecteur.setVisible(false);
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Utilisateur = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Prenom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Role = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        Putilisateur = new javax.swing.JPanel();
        Pseudo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Pmoderateur = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Niveau = new javax.swing.JComboBox<>();
        Pdirecteur = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        Salaire = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Utilisateur.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Inscription: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nom:");

        Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Prenom:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Age:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Rôle:");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Utilisateur", "Moderateur", "Directeur" }));
        Role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleActionPerformed(evt);
            }
        });

        jButton2.setText("Retour");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Putilisateur.setBackground(new java.awt.Color(102, 102, 102));

        Pseudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PseudoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Pseudo:");

        javax.swing.GroupLayout PutilisateurLayout = new javax.swing.GroupLayout(Putilisateur);
        Putilisateur.setLayout(PutilisateurLayout);
        PutilisateurLayout.setHorizontalGroup(
            PutilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PutilisateurLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pseudo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        PutilisateurLayout.setVerticalGroup(
            PutilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PutilisateurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PutilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pseudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Pmoderateur.setBackground(new java.awt.Color(102, 102, 102));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Niveau:");

        Niveau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Niveau 1", "Niveau 2" }));

        javax.swing.GroupLayout PmoderateurLayout = new javax.swing.GroupLayout(Pmoderateur);
        Pmoderateur.setLayout(PmoderateurLayout);
        PmoderateurLayout.setHorizontalGroup(
            PmoderateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PmoderateurLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Niveau, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        PmoderateurLayout.setVerticalGroup(
            PmoderateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PmoderateurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PmoderateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Niveau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Pdirecteur.setBackground(new java.awt.Color(102, 102, 102));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Salaire:");

        javax.swing.GroupLayout PdirecteurLayout = new javax.swing.GroupLayout(Pdirecteur);
        Pdirecteur.setLayout(PdirecteurLayout);
        PdirecteurLayout.setHorizontalGroup(
            PdirecteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PdirecteurLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Salaire, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        PdirecteurLayout.setVerticalGroup(
            PdirecteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PdirecteurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PdirecteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UtilisateurLayout = new javax.swing.GroupLayout(Utilisateur);
        Utilisateur.setLayout(UtilisateurLayout);
        UtilisateurLayout.setHorizontalGroup(
            UtilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UtilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(UtilisateurLayout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addGroup(UtilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(UtilisateurLayout.createSequentialGroup()
                            .addGroup(UtilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(8, 8, 8))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(UtilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1)
                        .addComponent(Nom, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Prenom, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Role, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Age, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGroup(UtilisateurLayout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(Putilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(UtilisateurLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addGroup(UtilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Pdirecteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(UtilisateurLayout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)))))
            .addGroup(UtilisateurLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Pmoderateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UtilisateurLayout.setVerticalGroup(
            UtilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UtilisateurLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(UtilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UtilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(UtilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(UtilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(Putilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pmoderateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pdirecteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(UtilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Utilisateur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Utilisateur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomActionPerformed

    private void PseudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PseudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PseudoActionPerformed

    private void RoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleActionPerformed
        // TODO add your handling code here:
        if(Role.getSelectedItem()=="Utilisateur"){
            Putilisateur.setVisible(true);
            Pmoderateur.setVisible(false);
            Pdirecteur.setVisible(false);
        }else if(Role.getSelectedItem()=="Moderateur"){
            Putilisateur.setVisible(true);
            Pmoderateur.setVisible(true);
            Pdirecteur.setVisible(false);
        }else{
            Putilisateur.setVisible(false);
            Pmoderateur.setVisible(false);
            Pdirecteur.setVisible(true);     
        }
    }//GEN-LAST:event_RoleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ArrayList<Personne> Personnes = ListePersonnes.getPersonnes();
        String nom;
        String prenom;
        int age = 0;
        String role;
        role ="Utilisateur";
        int salaire =0;
        String pseudo;
        String niveau = "Niveau 1";
        nom = Nom.getText();
        prenom = Prenom.getText();
       
            try{
            age = Integer.parseInt(Age.getText());
            }catch(Exception e){
                Age.setText("");   
            }
        
        
        if(Role.getSelectedItem()=="Utilisateur"){
            role = Role.getSelectedItem().toString();
            pseudo = Pseudo.getText();
            System.out.println(role);
            Personne u = new Utilisateur (nom, prenom, age, role, pseudo);
            Personnes.add(u);
            System.out.println(Personnes.size());
            Age.setText("");
            Nom.setText("");
            Prenom.setText("");
            Pseudo.setText("");
       }else if(Role.getSelectedItem()=="Moderateur"){
            niveau = Niveau.getSelectedItem().toString();
            role = Role.getSelectedItem().toString();
            pseudo = Pseudo.getText();
            System.out.println(role);
            Personne m = new Moderateur (nom, prenom, age, role, pseudo, niveau);
            Personnes.add(m);
            System.out.println(Personnes.size());
            Age.setText("");
            Nom.setText("");
            Prenom.setText("");
            Pseudo.setText("");
       }else{

                try{
                salaire = Integer.parseInt(Salaire.getText());
                }catch(Exception e){
                    Salaire.setText("");   
                }
            
            role = Role.getSelectedItem().toString();
            System.out.println(role);
            Personne d = new Directeur (nom, prenom, age, role,salaire);
            Personnes.add(d);
            System.out.println(Personnes.size());
            Age.setText("");
            Nom.setText("");
            Prenom.setText("");
            Salaire.setText("");
       }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Fenetres1 f = new Fenetres1();
        f.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

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
            java.util.logging.Logger.getLogger(Fenetres2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetres2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetres2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetres2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenetres2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JComboBox<String> Niveau;
    private javax.swing.JTextField Nom;
    private javax.swing.JPanel Pdirecteur;
    private javax.swing.JPanel Pmoderateur;
    private javax.swing.JTextField Prenom;
    private javax.swing.JTextField Pseudo;
    private javax.swing.JPanel Putilisateur;
    private javax.swing.JComboBox<String> Role;
    private javax.swing.JTextField Salaire;
    private javax.swing.JPanel Utilisateur;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}