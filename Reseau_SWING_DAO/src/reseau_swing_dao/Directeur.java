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
public class Directeur extends Personne {
    protected int salaire;
    
    //constructeur
    public Directeur(String prenom, String nom, int age, String role, int salaire){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.role = role;
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
    
    
}
