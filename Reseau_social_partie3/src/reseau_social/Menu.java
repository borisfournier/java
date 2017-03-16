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
    private final ArrayList<Utilisateur> mesUtilisateurs = new ArrayList<>();
    private final ArrayList<Directeur> directeurs = new ArrayList<>();

    static Scanner scan = new Scanner(System.in);
    
    public Menu(){  
    }

    public void checkUtilisateur(){
        if(!mesUtilisateurs.isEmpty()){
            System.out.println("Il y a au moins un utilisateur enregistré, souhaitez-vous consulter la liste? (O/N)");
            char reponse=scan.nextLine().charAt(0);
            if(reponse == 'O'){
                Utilisateur choixU = choisirUtilisateur();
                menu(choixU);
            }
        }else{
            System.out.println("Il n'y a aucun utilisateur enregistré.");
        }
    }
    
    public void checkDirecteur(){
         if(!directeurs.isEmpty()){
            System.out.println("Il y au moins un directeur existant, souhaitez-vous consulter la liste? (O/N)");
            char reponse=scan.nextLine().charAt(0);
            if(reponse == 'O'){
                Directeur choixD = choisirDirecteur();
                menu(choixD);
            }
        }else{
            System.out.println("Il n'y aucun directeur existant.");
        }
    }

    public int typeUtilisateur(){
        boolean entier = true;
        int t=0;
        System.out.println("Bonjour et bienvenue sur cette application.\n"
                + "Quel type de personne voulez-vous créer?\n"
                + "0: Créer un utilisateur.\n"
                + "1: Créer un modérateur de niveau 1.\n"
                + "2: Créer un modérateur de niveau 2.\n"
                + "3: Créer un directeur.\n");
              
        while(entier == true){    
            try{
                t = scan.nextInt();
                scan.nextLine();
                entier = false;
            }catch(Exception e) {
                    System.out.println("Veuillez saisir une valeur correspondant au menu.");
                    scan.nextLine();
            }
        }
        return t;
    }
    

/**
 * Sert à créer un nouvel utilisateur possédant un nom, un prénom, un age et un sexe
 * Exception: on ne peut pas saisir autre chose qu'un entier pour l'age grace au try/catch
 * @return une instance d'un utilisateur
 * @param type est un entier qui donne des informations sur le type d'utilisateur (utilisateru, moderateru 1 ou 2)
 * 
 */    
    public Personne creerUtilisateur(int type) {
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
            }catch(Exception e){
                    System.out.println("L'age doit être un nombre entier, veuillez recommencer: ");
                    scan.nextLine();
            }
        }
        System.out.println("Veuillez renseigner votre sexe (homme/femme/autre): ");
        String sexe = scan.nextLine();
        if(type==1){
            Personne m1 = new Moderateur(nom, prenom, age, sexe, type);
            System.out.println("\nModérateur de niveau 1 enregistré avec succès");
            return m1;
        }else if(type==2){
            Personne m2 = new Moderateur(nom, prenom, age, sexe, type);
            System.out.println("\nModérateur de niveau 2 enregistré avec succès");
            return m2;
        }else if(type==3){
            String poste = "Directeur";
            Directeur dir = new Directeur(nom, prenom, age, sexe, poste);
            directeurs.add(dir);
            System.out.println("\nDirecteur créé avec succès");
            return dir;
        }else{
            System.out.println("Choisissez-vous un pseudo: ");
            String pseudo = scan.nextLine();
            Utilisateur u = new Utilisateur(nom, prenom, age, sexe, pseudo);
            mesUtilisateurs.add(u);
            System.out.println("\nUtilisateur enregistré avec succès");
            return u;
        }
    }


/**
 * Permet de choisir un utilisateur parmi la liste des utilisateurs existants
 * @return un objet utilisateur choisi
 */    
    public Utilisateur choisirUtilisateur() {
        System.out.println("Liste des utilisateurs existants: ");
        for(int i = 0; i<mesUtilisateurs.size(); i++){
            System.out.println("Utilisateur numéro " + i +" : " + mesUtilisateurs.get(i).getPrenom()+ " " + mesUtilisateurs.get(i).getNom());
        }
        System.out.println("\nChoisissez un numéro d'utilisateur: ");
        int numéro = scan.nextInt();
        scan.nextLine();
        Utilisateur u = mesUtilisateurs.get(numéro);
        return u;
    }
    
/**
 * Permet de choisir un directeur parmi la liste des directeurs existants
 * @return un objet directeur choisi
 */    
    public Directeur choisirDirecteur() {
        System.out.println("Liste des directeurs existants: ");
        for(int i = 0; i<directeurs.size(); i++){
            System.out.println("Directeur numéro " + i +" : " + directeurs.get(i).getPrenom()+ " " + directeurs.get(i).getNom());
        }
        System.out.println("\nChoisissez un numéro de directeur: ");
        int numéro1 = scan.nextInt();
        scan.nextLine();
        Directeur d = directeurs.get(numéro1);
        return d;
    }
    
/**
 * Permet de choisir un utilisateur parmi la liste des utilisateurs existants
 */    
    public void supprimerUtilisateur() {
        
        Utilisateur u = choisirUtilisateur();
        mesUtilisateurs.remove(u);
    }
    
    
 /**
* 
* Sert à afficher le menu et a effectuer la navigation en faisant appelle à différentes classes et méthodes
* @param u
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
* 
 */
   
    public void menu(Personne u){
        int choix;
        char reponse = 'N';
        
        while(reponse == 'N') { 
            System.out.print("Choisissez parmi les options suivantes: \n"
                    + "1: Afficher votre profil\n"
                    + "2: Modifier votre profil\n"
                    + "3: Ecrire un message\n"
                    + "4: Afficher tous vos messages\n"
                    + "5: Afficher un seul message\n"
                    + "6: supprimer un message\n");
            if("reseau_social.Utilisateur".equals(u.getClass().getName())){
                System.out.print("7: Ajouter un ami\n"
                    + "8: Afficher tous mes amis\n"
                    + "9: Afficher le nom d'un ami\n"
                    +"20: Retour au menu principal\n"
                    + "30: Quitter l'application\n");
            } else if ("reseau_social.Moderateur".equals(u.getClass().getName()) && ((Moderateur)u).getDroit()==1){
                System.out.print("7: Ajouter un ami\n"
                    + "8: Afficher tous mes amis\n"
                    + "9: Afficher le nom d'un ami\n"
                    + "11: Modifier les messages des utilisateurs\n"
                    + "12: Supprimer les messages des utilisateurs\n"
                    + "20: Retour au menu principal\n"
                    + "30: Quitter l'application\n");
            }else if ("reseau_social.Moderateur".equals(u.getClass().getName()) && ((Moderateur)u).getDroit()==2){
                System.out.print("7: Ajouter un ami\n"
                    + "8: Afficher tous mes amis\n"
                    + "9: Afficher le nom d'un ami\n"
                    + "11: Modifier les messages des utilisateurs\n"
                    + "12: Supprimer les messages des utilisateurs\n"
                    + "13: Supprimer un utilisateur\n"
                    + "20: Retour au menu principal\n"
                    + "30: Quitter l'application\n");
            }else{
                System.out.print("7: Ajouter un employe\n"
                    + "8: Afficher tous mes employés\n"
                    + "9: Afficher le nom d'un employé\n"
                    + "20: Retour au menu principal\n"
                    + "30: Quitter l'application\n");
            }
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
                    u.afficherUnMessage();
                    break;
                case 6:
                    u.afficherMessages();
                    u.supprimerMessage();
                    break;
                case 7:
                    if("Directeur".equals(u.getClass().getSimpleName())){
                        ((Directeur)u).ajouterPersonne();
                    }else{
                        ((Utilisateur)u).ajouterPersonne();
                    }
                    break;
                case 8:
                    if("Directeur".equals(u.getClass().getSimpleName())){
                        ((Directeur)u).afficherPersonnes();
                    }else{
                        ((Utilisateur)u).afficherPersonnes();
                    }
                    break;
                 case 9:
                    if("Directeur".equals(u.getClass().getSimpleName())){
                        ((Directeur)u).afficherUnePersonne();
                    }else{
                        ((Utilisateur)u).afficherUnePersonne();
                    }
                    break;
                /*case 10:
                    Utilisateur u1 =choisirUtilisateur();
                    menu(u1);
                    break;*/
                case 11:
                    if("reseau_social.Moderateur".equals(u.getClass().getName()) && ((Moderateur)u).getDroit()==1){
                        Utilisateur message_u = choisirUtilisateur();
                        ((Moderateur)u).modifierMessage(message_u);    
                    }else{
                        System.out.println("Vous n'avez pas le droit de modifier un message d'utilisateur, petit malin!!!");
                    }
                    break;
                case 12:
                    if("reseau_social.Moderateur".equals(u.getClass().getName()) && ((Moderateur)u).getDroit()==1){
                        Utilisateur supprimer_mess = choisirUtilisateur();
                    ((Moderateur)u).supprimerMessages(supprimer_mess);
                    }else{
                        System.out.println("Vous n'avez pas le droit de supprimer un message d'utilisateur, petit malin!!!");
                    }
                    break;
                case 13:
                    if( "reseau_social.Moderateur".equals(u.getClass().getName())&& ((Moderateur)u).getDroit()==2){
                        supprimerUtilisateur();
                    }else{
                        System.out.println("Vous n'avez pas le droit de supprimer un utilisateur, petit malin!!!");
                    }
                    break;
                case 20:
                    checkDirecteur();
                    checkUtilisateur();
                    int t=typeUtilisateur();
                    Personne u2 = creerUtilisateur(t);
                    menu(u2);
                    break;
                case 30:
                    System.out.println("Etes-vous sur de vouloir quitter cette fantastique application? (O/N)");
                    reponse = scan.nextLine().charAt(0);
                    break;
                default: 
                    System.out.print("Veuillez entrer un choix conforme au menu"); 
            }     
        }
    }
}
