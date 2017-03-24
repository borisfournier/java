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
 * Permet d'afficher toutes les personnes enregistrées sauf la personne elle-même
 * 
     * @param p la personne qui cherche à ajouter un ami à ses contacts
     * @return vrai si il y a au moins un ami afficher
 */    
    public static boolean afficherAmisPossible(Personne p) {
        boolean ok = false;
        if(!mesUtilisateurs.isEmpty()){
            int moi = mesUtilisateurs.indexOf(p);
            System.out.println("Liste des personnes existantes: ");
            for(int i = 0; i < mesUtilisateurs.size(); i++){
                if(moi != i){
                    System.out.println("Personne numéro " + i + " : " + mesUtilisateurs.get(i).getPrenom()+ " " + mesUtilisateurs.get(i).getNom());
                    ok = true;
                }
            }
        }else{
            System.out.println("Aucun ami à ajouter!!");
            ok = false;
        }
        return ok;
    }  
    
        /**
 * Permet d'afficher toutes les personnes enregistrées sauf la personne elle-même
 * 
 */    
    public static void  afficherListPersonnes(){
        if(!mesUtilisateurs.isEmpty()){
            System.out.println("Liste des personnes existantes: ");
            for(int i = 0; i < mesUtilisateurs.size(); i++){
                System.out.println("Personne numéro " + i + " : " + mesUtilisateurs.get(i).getPrenom()+ " " + mesUtilisateurs.get(i).getNom());
            }
        }else{
            System.out.println("Aucune personnes existantes.");
        }
    } 

        /**
 * Permet d'afficher toutes les personnes enregistrées sauf la personne elle-même
 * 
 */    
    public static void  rechercherPersonnes(){
        if(!mesUtilisateurs.isEmpty()){
            System.out.println("Entrer le prénom de la personne recherchée: ");
            String n = scan.nextLine();      
            for(int i = 0; i < mesUtilisateurs.size(); i++){
                if( n.equals(mesUtilisateurs.get(i).getPrenom())){
                    System.out.println("Profil trouvé: " + mesUtilisateurs.get(i).getPrenom()+ " " + mesUtilisateurs.get(i).getNom() + "   " + mesUtilisateurs.get(i).getAge() + " ans \n");
                }else{
                    System.out.println("Cette personne n'existe pas.");
                }
            }
        }else{
            System.out.println("Aucune personne existante.");
        }
    }
    
/**
 * Permet de choisir un utilisateur parmi la liste des utilisateurs existants qui ne soit pas l'utilisateur en question
     * @param b un booleen qui est vrai si il est possible d'ajouter des amis
 * @return un objet utilisateur choisi
 */    
    public static Personne choisirUtilisateur(boolean b) {
        if(b){
            System.out.println("\nChoisissez un numéro d'utilisateur: ");
            int numéro = scan.nextInt();
            scan.nextLine();
            Personne u = mesUtilisateurs.get(numéro);
            return u;
        }else{
            System.out.println("Il n'y a aucun utilisateur existant.");
            return null;
        }
    }
    
/**
 * Permet de retourner un objet personne destinée à un message en particulier
     * @param m objet message 
 * @return un objet utilisateur choisi
 */    
    public static Personne destinataireMessage(Message m) {
        Personne pers = null;
        for(Personne p: mesUtilisateurs){
            if(m.getDestinataire().equals(p.getPrenom())){
                pers = p;
            }
        }
        return pers;
    }
    
/**
 * Permet de supprimer un utilisateur parmi la liste des utilisateurs existants
     * @param b booleen 
 */    
    public static void supprimerUtilisateur(boolean b) {
        
        Personne u = choisirUtilisateur(b);
        mesUtilisateurs.remove(u);
    }
}
