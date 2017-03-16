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
    protected ArrayList<Ami> amis = new ArrayList<>();

    
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
 * @see Ami 
 * @see Ami#setAmi(java.lang.String) 
 */  
    @Override
    public void ajouterPersonne() {
        Ami a = new Ami();
        System.out.println("\nVeuillez entrer le prénom de votre ami: ");
        String ami = scan.nextLine(); 
        a.setAmi(ami);
        amis.add(a);
    }

/**
 * Permet d'afficher un ami choisit par l'utilisateur
 */
    @Override
    public void afficherUnePersonne() {
        if(amis.isEmpty()) {
            System.out.println("Vous n'avez aucun ami!!!\n");
        }else{
            afficherPersonnes();
            System.out.print("Choisissez un numéro d'ami à afficher: \n");
            int i = scan.nextInt();
            scan.nextLine();
            System.out.println("Ami numéro"+ i +": " + amis.get(i).getAmi()+ "\n");
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
                System.out.println("Ami("+ i +"): " + amis.get(i).getAmi()+ "\n"); 
            }
        }
    }   
}


