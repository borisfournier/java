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
public class Utilisateur extends Personne{
    protected String pseudo;
    
    /**
 * Constructeur Utilisateur 
 * @param nom le nom de l'utilisateur
 * @param prenom le prenom de l'utilisateur
 * @param age l'age de l'utilisateur
 * @param role le role de la personne (utilisateur, moderateur, directeur)
* @param pseudo le pseudo que l'utilisateur choisit
 */
    public Utilisateur(String prenom, String nom, int age, String role, String pseudo) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.pseudo = pseudo;
        this.role = role;
    }
    
//méthodes
    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

}
