/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_swing_dao;

/**
 *
 * @author boris.fournier
 */
public class Moderateur extends Utilisateur {
    private String niveau;
    
    
    //constructeur   
    public Moderateur(String prenom, String nom, int age, String role, String pseudo, String niveau){
        super(prenom,nom,age,role,pseudo);
        this.niveau = niveau;
    }
    
    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    
}
