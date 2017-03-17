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
    //private ArrayList<Personne> mesUtilisateurs = new ArrayList<>();

    static Scanner scan = new Scanner(System.in);
    ArrayList<Personne> users = ListeUtilisateurs.getMesUtilisateurs();

    public Menu(){  
    }

    public void menuPrincipal(){
        int choix;
        char reponse = 'N';
        while(reponse!='O'){
            System.out.println("Se connecter: 1 \n"
                    + "Inscription: 2 \n"
                    + "Liste des personnes: 3 \n"
                    + "Quitter l'application: 4 \n");
            try{
                choix=scan.nextInt();
                } catch(Exception e) {
                    choix = 100;
                }
            scan.nextLine();

            switch(choix){
                case 1:
                    System.out.println(users);
                    if(users.isEmpty()){
                        char encore;
                        do{
                            System.out.println("Veuillez saisir votre prenom: \n");
                            String prenom = scan.nextLine();
                            System.out.println("Veuillez saisir votre nom: \n");
                            String nom=scan.nextLine();
                            for(int i=0; i<users.size(); i++){
                                if((users.get(i).getNom().equals(nom)) && (users.get(i).getPrenom().equals(prenom))){
                                    menu(users.get(i));
                                }else{
                                    System.out.println("Personne inexistante!!\n");
                                }
                            }
                            System.out.println("Voulez-vous retenter? (O/N)");
                            encore = scan.nextLine().charAt(0);
                        }while(encore=='O');

                    }else{
                        System.out.println("Aucune personne enregistrée!!\n");
                        menuPrincipal();
                    }
                break;
                case 2:
                    int type = typeUtilisateur();
                    Personne p = creerUtilisateur(type);
                    menu(p);
                break;
                case 3:
                    if(!users.isEmpty()){
                        ListeUtilisateurs.afficherPersonnes();
                    }else{
                        System.out.println("Il n'y a aucune personne enregistrée.\n");
                    }
                break;
                case 4:
                    System.out.println("Etes-vous sur de vouloir quitter cette fantastique application? (O/N)");
                    reponse = scan.nextLine().charAt(0);
                    break;
                default: 
                        System.out.print("Veuillez entrer un choix conforme au menu.\n");
            }
        }
    }
    
    public int typeUtilisateur(){
        boolean entier = true;
        int t=0;
        System.out.println("Quel type de personne voulez-vous créer?\n"
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
                    System.out.println("Veuillez saisir une valeur correspondant au menu.\n");
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
        int salaire = 0;
        boolean entier=true;
        boolean entier1=true;
        boolean entier2=true;
        boolean entier3=true;
        
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
            System.out.println("Nombre de cheques cadeaux perçu: ");
            while(entier1 == true){    
                try{
                    salaire = scan.nextInt();
                    scan.nextLine();
                    entier1 = false;
                }catch(Exception e){
                        System.out.println("Le nombre de cheques cadeaux doit être un entier, veuillez recommencer: ");
                        scan.nextLine();
                }
            }
            Personne m1 = new Moderateur(nom, prenom, age, sexe, type,salaire);
            users.add(m1);
            System.out.println("\nModérateur de niveau 1 enregistré avec succès\n");
            return m1;
        }else if(type==2){
            System.out.println("Nombre de cheques cadeaux perçu: ");
            while(entier2 == true){    
                try{
                    salaire = scan.nextInt();
                    scan.nextLine();
                    entier2 = false;
                }catch(Exception e){
                        System.out.println("Le nombre de cheques cadeaux doit être un entier, veuillez recommencer: ");
                        scan.nextLine();
                }
            }
            Personne m2 = new Moderateur(nom, prenom, age, sexe, type, salaire);
            users.add(m2);
            System.out.println("\nModérateur de niveau 2 enregistré avec succès\n");
            return m2;
        }else if(type==3){
            System.out.println("Veuillez entrer votre salaire: ");
            while(entier3 == true){    
                try{
                    salaire = scan.nextInt();
                    scan.nextLine();
                    entier3 = false;
                }catch(Exception e){
                        System.out.println("Le salaire doit être un entier, veuillez recommencer: ");
                        scan.nextLine();
                }
            }
            String poste = "Directeur";
            Personne dir = new Directeur(nom, prenom, age, sexe, poste, salaire);
            users.add(dir);
            System.out.println("\nDirecteur créé avec succès\n");
            return dir;
        }else{
            System.out.println("Choisissez-vous un pseudo: ");
            String pseudo = scan.nextLine();
            Personne u = new Utilisateur(nom, prenom, age, sexe, pseudo);
            users.add(u);
            System.out.println("\nUtilisateur enregistré avec succès\n");
            return u;
        }
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
        boolean reponse = true;
        
        while(reponse) { 
            System.out.print("Choisissez parmi les options suivantes: \n"
                    + "1: Afficher votre profil\n"
                    + "2: Modifier votre profil\n");
            if("reseau_social.Utilisateur".equals(u.getClass().getName())){
                System.out.print("3: Ecrire un message\n"
                    + "4: Afficher tous vos messages\n"
                    + "5: Afficher un seul message\n"
                    + "6: supprimer un message\n"
                    + "7: Ajouter un ami\n"
                    + "8: Afficher tous mes amis\n"
                    + "9: Afficher le nom d'un ami\n");
            } else if ("reseau_social.Moderateur".equals(u.getClass().getName()) && ((Moderateur)u).getDroit()==1){
                System.out.print("3: Ecrire un message\n"
                    + "4: Afficher tous vos messages\n"
                    + "5: Afficher un seul message\n"
                    + "6: supprimer un message\n"
                    + "7: Ajouter un ami\n"
                    + "8: Afficher tous mes amis\n"
                    + "9: Afficher le nom d'un ami\n"
                    + "10: Modifier les messages des utilisateurs\n"
                    + "11: Supprimer les messages des utilisateurs\n");
            }else if ("reseau_social.Moderateur".equals(u.getClass().getName()) && ((Moderateur)u).getDroit()==2){
                System.out.print("3: Ecrire un message\n"
                    + "4: Afficher tous vos messages\n"
                    + "5: Afficher un seul message\n"
                    + "6: supprimer un message\n"
                    + "7: Ajouter un ami\n"
                    + "8: Afficher tous mes amis\n"
                    + "9: Afficher le nom d'un ami\n"
                    + "10: Modifier les messages des utilisateurs\n"
                    + "11: Supprimer les messages des utilisateurs\n"
                    + "13: Supprimer un utilisateur\n");
            }else{
                System.out.print("7: Ajouter un employe\n"
                    + "8: Afficher tous mes employés\n"
                    + "9: Afficher le nom d'un employé\n");
            }System.out.print("20: Deconnexion\n");
            try{
                choix = scan.nextInt();
                } catch(Exception e) {
                    choix = 100;
                }
            scan.nextLine();

            switch(choix){
                case 1:
                    u.afficherProfil();
                    if("reseau_social.Moderateur".equals(u.getClass().getName())){
                        ((Moderateur)u).recevoirPaiement();
                    }else if("reseau_social.Directeur".equals(u.getClass().getName())){
                        ((Directeur)u).recevoirPaiement();
                    }
                    break;
                case 2:
                    u.modifierProfil();
                    break;
                case 3:
                    if(!"reseau_social.Directeur".equals(u.getClass().getName())){
                        u.ajouterMessage(u.getNom());
                    }
                    break;
                case 4:
                    if(!"reseau_social.Directeur".equals(u.getClass().getName())){
                        u.afficherMessages();
                    }
                    break;
                case 5:
                    if(!"reseau_social.Directeur".equals(u.getClass().getName())){
                        u.afficherUnMessage();
                    }
                    break;
                case 6:
                    if(!"reseau_social.Directeur".equals(u.getClass().getName())){
                        u.afficherMessages();
                        u.supprimerMessage();
                    }
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
                case 10:
                    if("reseau_social.Moderateur".equals(u.getClass().getName()) && ((Moderateur)u).getDroit()==1){
                        Personne message_u = ListeUtilisateurs.choisirUtilisateur();
                        ((Moderateur)u).modifierMessage(message_u);    
                    }else{
                        System.out.println("Vous n'avez pas le droit de modifier un message d'utilisateur, petit malin!!!");
                    }
                    break;
                case 11:
                    if("reseau_social.Moderateur".equals(u.getClass().getName()) && ((Moderateur)u).getDroit()==1){
                        Personne supprimer_mess = ListeUtilisateurs.choisirUtilisateur();
                    ((Moderateur)u).supprimerMessages(supprimer_mess);
                    }else{
                        System.out.println("Vous n'avez pas le droit de supprimer un message d'utilisateur, petit malin!!!");
                    }
                    break;
                case 12:
                    if( "reseau_social.Moderateur".equals(u.getClass().getName())&& ((Moderateur)u).getDroit()==2){
                        ListeUtilisateurs.supprimerUtilisateur();
                    }else{
                        System.out.println("Vous n'avez pas le droit de supprimer un utilisateur, petit malin!!!");
                    }
                    break;
                case 20:
                    reponse = false;
                    System.out.println("Vous avez bien été déconnecté.");
                    menuPrincipal();
                    /*int t=typeUtilisateur();
                    Personne u2 = creerUtilisateur(t);
                    menu(u2);*/
                    break;
                default: 
                    System.out.print("Veuillez entrer un choix conforme au menu"); 
            }     
        }
    }
}
