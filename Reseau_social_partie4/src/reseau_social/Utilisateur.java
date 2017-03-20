/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_social;

import java.util.*;

/**
 *
 * @author boris.fournier
 * Classe utilisateur ayant pour attributs : nom, prenom, age, sexe, un tableau de messages et un tableau d'ami
 * tous les atributs sont de type privé
 */
public class Utilisateur extends Personne implements Relation{
    protected String pseudo;
    protected ArrayList<Personne> amis = new ArrayList<>();

    
    static Scanner scan = new Scanner(System.in);
    
/**
 * Constructeur Utilisateur 
 * @param nom le nom de l'utilisateur
 * @param prenom le prenom de l'utilisateur
 * @param age l'age de l'utilisateur
 * @param sexe le sexe de l'utilisateur
 */
    public Utilisateur(String nom, String prenom, int age, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
    }
/**
 * Constructeur Utilisateur 
 * @param nom le nom de l'utilisateur
 * @param prenom le prenom de l'utilisateur
 * @param age l'age de l'utilisateur
 * @param sexe le sexe de l'utilisateur
* @param pseudo le pseudo que l'utilisateur choisit
 */
    public Utilisateur(String nom, String prenom, int age, String sexe, String pseudo) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        this.pseudo = pseudo;
    }
    
//méthodes
    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    
/**
 * Permet à l'utilisateur actuel de se créer un ami 
 * Instancie un objet a de la classe Ami et l'ajoute au tableau des amis
     * @param dest la personne que l'on veut ajouter comme ami
     * @param exp la personne qui fait la demande d'ami
 * @see Ami 
 * @see Ami#setAmi(java.lang.String) 
 */  
    public void ajouterPersonne(Personne dest, Personne exp) {
        ((Utilisateur)dest).amis.add(exp);
        amis.add(dest);
    }

    /**
 * Permet à l'utilisateur actuel de se créer un ami 
 * Instancie un objet a de la classe Ami et l'ajoute au tableau des amis
 * @see Ami 
 * @see Ami#setAmi(java.lang.String) 
 */  
    @Override
    public void ajouterPersonne() {
       
    }
/**
 * Permet d'afficher un ami choisit par l'utilisateur
 */
    @Override
    public void afficherUnePersonne() {
        if(amis.isEmpty()) {
            System.out.println("Vous n'avez aucun ami!!!\n");
        }else{
            System.out.print("Entrez le prénom de l'ami recherché: \n");
            String n = scan.nextLine();
            for(Personne ami: amis){
                if(n.equals(ami.getPrenom())){
                    System.out.println("Profil de votre ami: "+ ami.getPrenom()+ "  " + ami.getNom()+ " " + ami.getAge() +" ans. \n");
                }else{
                    System.out.println("Aucun ami correspondant");
                }
            } 
        }
    }

/**
 * Affiche tous les amis de l'utilisateur
 */
    @Override
    public void afficherPersonnes() {
        if(amis.isEmpty()) {
            System.out.println("Vous n'avez aucun ami!!!\n");
        }else{
            System.out.println("Vous avez " + amis.size() + " amis.");
            for(int i = 0; i < amis.size(); i++ ){
                System.out.println("Ami numéro "+ i +" : " + amis.get(i).getPrenom()+ "  " + amis.get(i).getNom() +"\n"); 
            }
        }
    }

/**
 * choix du destinataire d'un message
     * @return le nom du destinataire du message
 */
    public String choixDestinataire() {
        String s = "empty";
        if(amis.isEmpty()) {
            System.out.print("Aucun destinataire possible!! \n");
            s = "empty";
        }else{
            afficherPersonnes();
            System.out.print("Choisissez le numéro du destinataire du message: \n");
            int i = scan.nextInt();
            scan.nextLine();
            s = amis.get(i).getPrenom();
        }
        return s;
    }
    
/**
 * Affiche tous les amis de l'utilisateur
 */
    public void rechercherPersonne() {
        if(amis.isEmpty()) {
            System.out.println("Vous n'avez aucun ami!!!\n");
        }else{
            System.out.println("Vous avez " + amis.size() + " amis.");
            for(int i = 0; i < amis.size(); i++ ){
                System.out.println("Ami numéro "+ i +" : " + amis.get(i).getPrenom()+ "  " + amis.get(i).getNom() +"\n"); 
            }
        }
    }
    
    /**
 * Permet à l'utilisateur actuel de supprimer un ami 
 */  
    @Override
    public void supprimerPersonne() {
        System.out.print("Choisissez le numéro de l'ami à supprimer: \n");
        int i = scan.nextInt();
        scan.nextLine();
        amis.remove(i);
        
       // Personne u = ListeUtilisateurs.choisirUtilisateur();
       // amis.add(u);
    }

}


