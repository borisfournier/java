/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_social;

import java.util.ArrayList;
import static reseau_social.Utilisateur.scan;

/**
 *
 * @author boris.fournier
 */
public abstract class Personne {
    //attributs
    protected String nom;
    protected String prenom;
    protected int age;
    protected String sexe;
    protected ArrayList<Message> messages = new ArrayList<>();
    protected ArrayList<Message> historique = new ArrayList<>();

    //méthodes
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSexe() {
        return sexe;
    }
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    public ArrayList<Message> getMessages() {
        return messages;
    }
    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
    
    
/**
 * Permet d'afficher le profil d'un utilisateur en accédant aux attributs grace aux méthodes get
 * @see getPrenom()
 * @see getNom()
 * @see getAge()
 * @see getSexe()
 */    
    public void afficherProfil(){
        System.out.println("\nMon profil: " + getPrenom());
        System.out.println("\nPrénom: " + getPrenom());
        System.out.println("nom: " + getNom());
        System.out.println("Age: " + getAge()+ " ans");
        System.out.println("Sexe: " + getSexe()+ "\n");  
    }

/**
 * Permet à l'utilisateur actuel de modifier son profil
 */    
    void modifierProfil() {
        System.out.println("Modifier votre prénom: ");
        prenom = scan.nextLine();
        this.setPrenom(prenom);
        System.out.println("Modifier votre nom: ");
        nom = scan.nextLine();
        this.setNom(nom);
        System.out.println("Modifier votre age: ");
        age = scan.nextInt();
        scan.nextLine();
        this.setAge(age);
        System.out.println("Modifier votre sexe: ");
        sexe = scan.nextLine();
        this.setSexe(sexe);
    }

/**
 * 
     * @param exp expediteur du message
     * @param dest destinataire du message
 */     
    protected void ajouterMessage(String exp, String dest) {
        System.out.println("Contenu de votre message: ");
        String contenu = scan.nextLine();
        Message m = new Message(contenu, exp, dest);
        Message m1 = new Message(contenu, dest, exp);
        Personne destinataire = ListeUtilisateurs.destinataireMessage(m);
        destinataire.messages.add(m1);
        messages.add(m);
        historique.add(m);
        historique.add(m1);
    }

/**
 * affiche un message en particulier choisit par l'utilisateur
 */
    protected void afficherUnMessage() {
        System.out.println("\nEntrer le numéro du message que vous souhaitez afficher: \n");
        int i = scan.nextInt();
        scan.nextLine();
        System.out.println("\nMessage numéro "+ i +": " + messages.get(i).getMessage()+ "\n"); 
    }

/**
 * affiche tous les messages d'un utilisateur
 * parcours le tableau de messages et les affiche tous
 */    
    protected void afficherMessages() {
        if(messages.isEmpty()) {
            System.out.println("\nVous n'avez aucun message!!!\n");
        }else{
            System.out.println("\nVous avez " + messages.size() + " messages.");
            for(int i = 0; i < messages.size(); i++ ) {
                
            System.out.println("\nMessage numéro "+ i +": " + messages.get(i).getMessage()+ "\n"); 
            }
        } 
    }
    
/**
 * affiche tous les messages d'un utilisateur
 * parcours le tableau de messages et les affiche tous
 */    
    protected void afficherMessagesRecus() {
        if(messages.isEmpty()) {
            System.out.println("\nVous n'avez aucun message!!!\n");
        }else{
            for(Message m: messages ) {
                if(this.prenom.equals(m.getDestinataire())){
                    System.out.println("\nExpéditeur: " + m.getExpediteur() + "     Contenu du message: " + m.getMessage()+ "\n"); 
                }
            }
        } 
    }
    
/**
 * affiche tous les messages d'un utilisateur
 * parcours le tableau de messages et les affiche tous
 */    
    protected void afficherMessagesEnvoyes() {
        if(messages.isEmpty()) {
            System.out.println("\nVous n'avez aucun message!!!\n");
        }else{
            for(Message m: messages ) {
                if(this.prenom.equals(m.getExpediteur())){
                    System.out.println("\n Destinataire: " + m.getDestinataire() + "     Contenu du message: " + m.getMessage()+ "\n"); 
                }
            }
        }
    }

    /**
 * affiche tous les messages d'un utilisateur
 * parcours le tableau de messages et les affiche tous
 */    
    protected void supprimerHistorique() {
        if(historique.isEmpty()) {
            System.out.println("\nAucun messages dans l'historique\n");
        }else{
            for(int i = 0; i < historique.size(); i++ ) {
                System.out.println("Contenu de l'historique : \n");
                System.out.println("\nMessage numéro : " + i + "Destinataire: " + historique.get(i).getDestinataire() + "Expéditeur: " + historique.get(i).getExpediteur() + "     Contenu du message: " + historique.get(i).getMessage()+ "\n"); 
            }
        System.out.println("\nEntrer le numéro du message que vous souhaitez supprimer: \n");
        int message = scan.nextInt();
        scan.nextLine();
        historique.remove(message);
        System.out.println("\nLe message a bien été supprimé.\n");
        }
    }
    
/**
 * supprime un message d'un utilisateur
 * parcours le tableau de messages et supprime le message m passé en paramètre
 */    
    protected void supprimerMessage() {
        if(messages.isEmpty()){ 
            System.out.println("\nVous n'avez aucun message!");
        }
        else{
            System.out.println("\nEntrer le numéro du message que vous souhaitez supprimer: \n");
            int message = scan.nextInt();
            scan.nextLine();
            messages.remove(message);
            System.out.println("\nLe message a bien été supprimé.\n");
        }
    }    
}
   
