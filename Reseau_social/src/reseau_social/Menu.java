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
 */
public class Menu {
    private ArrayList<Utilisateur> mesUtilisateurs = new ArrayList<>();
    
    public Menu(){
        
    }

/**
 * Sert à créer un nouvel utilisateur possédant un nom, un prénom, un age et un sexe
 * Exception: on ne peut pas saisir autre chose qu'un entier pour l'age grace au try/catch
 * @return une instance d'un utilisateur
 * 
 */    
    public Utilisateur creerUtilisateur() {
        Scanner scan = new Scanner(System.in);
        int age = 0;
        boolean entier=true;
        
        System.out.println("Veuillez entrer votre prénom: ");
        String prenom = scan.nextLine();
        System.out.println("Veuillez entrer votre nom: ");
        String nom = scan.nextLine();
        System.out.println("Veuillez entrer votre age: ");
        while(entier == true){    
        try{
            age = scan.nextInt();
            scan.nextLine();
            entier = false;
        }catch(Exception e) {
                System.out.println("L'age doit être un nombre entier, veuillez recommencer: ");
                scan.nextLine();
            }
        }
        System.out.println("Veuillez renseigner votre sexe (homme/femme/autre): ");
        String sexe = scan.nextLine();
        
        Utilisateur u = new Utilisateur(nom, prenom, age, sexe);
        mesUtilisateurs.add(u);
        System.out.println("\nUtilisateur enregistré avec succès");
        return u;
    }

/**
 * 
 * @return Un tableau d'utilisateur de type collection contennant tous les utilisateurs enregistrés
 */
    public ArrayList<Utilisateur> tableauUtilisateurs() {
        Scanner scan = new Scanner(System.in);
        char reponse = 'O';
        while(reponse == 'O') {
            System.out.println("Souhaitez-vous créer un autre utilisateur? (O/N)");
            reponse = scan.nextLine().charAt(0);
        }
        return mesUtilisateurs;
    }

/**
 * Permet de choisir un utilisateur parmi la liste des utilisateurs existants
 * @return Un utilisateur 
 */    
    public void choisirUtilisateur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Liste des utilisateurs existants: ");
        for(int i = 0; i<mesUtilisateurs.size(); i++){
            System.out.println("Utilisateur numéro " + i +" : " + mesUtilisateurs.get(i).getPrenom()+ " " + mesUtilisateurs.get(i).getNom());
        }
        System.out.println("\nChoisissez un numéro d'utilisateur: ");
        int numéro = scan.nextInt();
        scan.nextLine();
        Utilisateur u = mesUtilisateurs.get(numéro);
        menu(u);
    }
    
    
 /**
* 
* Sert à afficher le menu et a effectuer la navigation en faisant appelle à différentes classes et méthodes
* @see Utilisateur#afficherProfil()
* @see Utilisateur#afficherProfil() 
* @see Utilisateur#ajouterMessage()
* @see Utilisateur#afficherMessages() 
* @see Utilisateur#afficherUnMessage(int)
* @see Utilisateur#ajouterAmi() 
* @see Utilisateur#afficherUnAmi(int) 
* @see Utilisateur#afficherAmis() 
* @see choisirUtilisateur()
* @see creerUtilisateur()
* @see tableauUtilisateurs()
* @param u de type utilisateur
* 
 */
    public void menu(Utilisateur u){
        Scanner scan = new Scanner(System.in);
        Ami ami =new Ami();
        int choix;
        
        char reponse = 'N';
        while(reponse == 'N') {
            System.out.print("\nChoisissez parmi les options suivantes: \n"
                    + "1: Afficher votre profil\n"
                    + "2: Modifier votre profil\n"
                    + "3: Ecrire un message\n"
                    + "4: Afficher tous vos messages\n"
                    + "5: Afficher un seul message\n"
                    + "6: Ajouter un ami\n"
                    + "7: Afficher tous mes amis\n"
                    + "8: Afficher le nom d'un ami\n"
                    + "9: Changer d'Utilisateur\n"
                    + "10: Créer d'autres utilisateurs\n"
                    + "11: Quitter l'application\n");
            try{
                choix = scan.nextInt();
                } catch(Exception e) {
                    choix = 100;
                }
            scan.nextLine();

            switch(choix){
                case 1:
                    u.afficherProfil();
                    break;
                case 2:
                    u.modifierProfil();
                    break;
                case 3:
                    u.ajouterMessage();
                    break;
                case 4:
                    u.afficherMessages();
                    break;
                case 5:
                    System.out.print("Choisissez un indice de message à afficher: \n");
                    int i = scan.nextInt();
                    scan.nextLine();
                    u.afficherUnMessage(i);
                    break;
                case 6:
                    u.ajouterAmi();
                    break;
                case 7:
                    u.afficherAmis();
                    break;
                 case 8:
                    System.out.print("Choisissez un numéro d'ami à afficher: \n");
                    int j = scan.nextInt();
                    scan.nextLine();
                    u.afficherUnAmi(j);
                    break;
                case 9:
                    choisirUtilisateur();
                    break;
                case 10:
                    creerUtilisateur();
                    tableauUtilisateurs();
                    break;
                case 11:
                    System.out.println("Etes-vous sur de vouloir quitter cette fantastique application? (O/N)");
                    reponse = scan.nextLine().charAt(0);
                    break;
                default: 
                    System.out.print("Veuillez entrer un choix conforme au menu"); 
            }     
        }
    }
}
