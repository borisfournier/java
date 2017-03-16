/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_social;

import java.util.Scanner;

/**
 *
 * @author boris.fournier
 */
public class Moderateur extends Utilisateur implements Salarie{
    private int droit;  //1 modifier ou supprimer des messages ( des autres utilisateurs), 2 peut en plus supprimer des utilisateurs
    private 
//attributs    
    static Scanner sc = new Scanner(System.in);
    
//constructeur   
    public Moderateur(String nom, String prenom, int age, String sexe, int droit){
        super(nom,prenom,age,sexe);
        this.droit = droit;
    }

//méthodes
    //getters setters
    public int getDroit() {
        return droit;
    }
    public void setDroit(int droit) {
        this.droit = droit;
    }
    
    //méthodes héritées d'utilisateur
    @Override
    public void afficherProfil(){
        System.out.println("\nModérateur de niveau: " + getDroit());
        super.afficherProfil();   
    }
    //méthodes implementée de l'interface Salarie
    @Override
    public void recevoirPaiement(){
        System.out.println("J'ai reçu des cheques cadeaux!!!");
    }
    
    //autres méthodes
    
    /**
 * modifie un message d'un utilisateur
 * parcours le tableau de messages et modifie le message de l'utilisateur u passé en paramètre
     * @param u un utilisateur choisit
 */    
    public void modifierMessage(Utilisateur u) {
        u.afficherMessages();
        System.out.println("\nEntrer le numéro du message que vous souhaitez modifier: \n");
        int i = sc.nextInt();
        sc.nextLine();
        System.out.println("\nModifier le message: \n");
        String m = sc.nextLine();
        u.messages.get(i).setMessage(m);
        System.out.println("\nMessage modifié: " + u.messages.get(i).getMessage() + "\n");
    }
    
    /**
 * supprime un message d'un utilisateur
 * parcours le tableau de messages et supprime le message m passé en paramètre
     * @param u récupérer un utilisateur pour pouvoir supprimer ses messages
 */    
    public void supprimerMessages(Utilisateur u) {
        u.afficherMessages();
        u.supprimerMessage();
    }
}
    
