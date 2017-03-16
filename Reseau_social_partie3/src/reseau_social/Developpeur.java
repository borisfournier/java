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
public class Developpeur extends Employe {
    //constructeur
    public Developpeur(String nom, String prenom, int age, String sexe,String poste, int salaire, int dureeContrat){
        super(nom,prenom,age,sexe,poste,salaire, dureeContrat);
    }
}
