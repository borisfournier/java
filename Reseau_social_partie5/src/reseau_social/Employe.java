/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_social;

/**
 *
 * @author boris.fournier
 */
public class Employe extends Personne implements Salarie {
    //attributs
    protected int salaire;
    protected int dureeContrat;
    protected String poste;

    
    //constructeur
    public Employe(String nom, String prenom, int age, String sexe, String poste, int salaire){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        this.poste = poste;
        this.salaire = salaire;
    }
    public Employe(String nom, String prenom, int age, String sexe, String poste, int salaire, int dureeContrat){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        this.poste = poste;
        this.salaire= salaire;
        this.dureeContrat= dureeContrat;
    }

    //méthodes

    public String getPoste() {
        return poste;
    }
    public void setPoste(String poste) {
        this.poste = poste;
    } 
    public int getSalaire() {
        return salaire;
    }
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
    public int getDureeContrat() {
        return dureeContrat;
    }
    public void setDureeContrat(int dureeContrat) {
        this.dureeContrat = dureeContrat;
    }
    
    @Override
    public void recevoirPaiement(){
        System.out.println("Vous percevez un paiement de " + this.salaire + "\n");
    }
    public void travailler(){
        
    }

}
