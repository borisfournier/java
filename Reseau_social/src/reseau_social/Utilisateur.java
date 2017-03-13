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
public class Utilisateur {
    private String nom;
    private String prenom;
    private int age;
    private String sexe;
    private ArrayList<Message> messages = new ArrayList<>();
    private ArrayList<Ami> amis = new ArrayList<>();
    
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

    public ArrayList<Message> getMessages() {
        return messages;
    }
    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
    public ArrayList<Ami> getAmis() {
        return amis;
    }
    public void setAmis(ArrayList<Ami> amis) {
        this.amis = amis;
    }
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

/**
 * Permet d'afficher le profil d'un utilisateur en accédant aux attributs grace aux méthodes get
 * @see getPrenom()
 * @see getNom()
 * @see getAge()
 * @see getSexe()
 */    
    public void afficherProfil(){
        System.out.println("\nPrénom: " + getPrenom());
        System.out.println("nom: " + getNom());
        System.out.println("Age: " + getAge()+ " ans");
        System.out.println("Sexe: " + getSexe()+ "\n");  
    }

/**
 * Permet à lutilisateur actuel de modifier son profil
 */    
     public void modifierProfil() {
        Scanner scan = new Scanner(System.in);
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
 */     
    public void ajouterMessage() {
        Message m = new Message();
        Scanner scan = new Scanner(System.in);
        System.out.println("Contenu de votre message: ");
        String contenu = scan.nextLine();
        m.setMessage(contenu);
        messages.add(m);
    }

/**
 * affiche un message en particulier choisit par l'utilisateur
 * @param i indice du tableau de messages
 */
    public void afficherUnMessage(int i) {
        System.out.println("\nMessage numéro "+ i +": " + messages.get(i).getMessage()+ "\n"); 
    }

/**
 * affiche tous les messages d'un utilisateur
 * parcours le tableau de messages et les affiche tous
 */    
    public void afficherMessages() {
        for(int i = 0; i < messages.size(); i++ ) {
            System.out.println("\nMessage numéro "+ i +": " + messages.get(i).getMessage()+ "\n"); 
        }
    }

/**
 * Permet à l'utilisateur actuel de se créer un ami 
 * Instancie un objet a de la classe Ami et l'ajoute au tableau des amis
 * @see Ami 
 * @see Ami#setAmi(java.lang.String) 
 */    
    public void ajouterAmi() {
        Ami a = new Ami();
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez entrer le prénom de votre ami: ");
        String ami = scan.nextLine(); 
        a.setAmi(ami);
        amis.add(a);
    }

/**
 * Permet d'afficher un ami choisit par l'utilisateur
 * @param i indice d'un ami du tableau d'amis
 */
    public void afficherUnAmi(int i) {
        System.out.println("\nAmi("+ i +"): " + amis.get(i).getAmi()+ "\n");
    }

/**
 * Affiche tous les amis de l'utilisateur
 */
    public void afficherAmis() {
        for(int i = 0; i < amis.size(); i++ ) {
            System.out.println("\nAmi("+ i +"): " + amis.get(i).getAmi()+ "\n"); 
        }
    }
}
