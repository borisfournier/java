/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_social;

import java.util.ArrayList;
import static reseau_social.Menu.scan;

/**
 *
 * @author boris.fournier
 */
public class ListeUtilisateurs {
    private  static ArrayList<Personne> mesUtilisateurs = new ArrayList<>();

    public static ArrayList<Personne> getMesUtilisateurs() {
        return mesUtilisateurs;
    }

    public static void setMesUtilisateurs(ArrayList<Personne> mesUtilisateurs) {
        ListeUtilisateurs.mesUtilisateurs = mesUtilisateurs;
    }
    
    /**
 * Permet d'afficher toutes les personnes enregistrées
 * 
 */    
    public static void afficherPersonnes() {
        if(!mesUtilisateurs.isEmpty()){
            int moi = mesUtilisateurs.indexOf(p);
            int check = mesUtilisateurs.indexOf();
            System.out.println("Liste des personnes existantes: ");
            for(int i = 0; i < mesUtilisateurs.size(); i++){
                System.out.println("Personne numéro " + i + " : " + mesUtilisateurs.get(i).getPrenom()+ " " + mesUtilisateurs.get(i).getNom());
            }
        }else{
            System.out.println("Aucun ami à ajouter!!");
        }
    }   
    
/**
 * Permet de choisir un utilisateur parmi la liste des utilisateurs existants
 * @return un objet utilisateur choisi
 */    
    public static Personne choisirUtilisateur() {
        afficherPersonnes();
        System.out.println("\nChoisissez un numéro d'utilisateur: ");
        int numéro = scan.nextInt();
        scan.nextLine();
        Personne u = mesUtilisateurs.get(numéro);
        return u;
    }

    
/**
 * Permet de choisir un utilisateur parmi la liste des utilisateurs existants
 */    
    public static void supprimerUtilisateur() {
        
        Personne u = choisirUtilisateur();
        mesUtilisateurs.remove(u);
    }
}
