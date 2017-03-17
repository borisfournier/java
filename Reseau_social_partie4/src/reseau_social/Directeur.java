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
public class Directeur extends Employe implements Relation{
    //attributs
    private final ArrayList<Employe> mesEmployes = new ArrayList<>();

    //constructeur
    public Directeur(String nom, String prenom, int age, String sexe, String poste, int salaire){
        super(nom, prenom, age, sexe, poste, salaire);
    }

    
    //méthodes
/**
 * Permet à l'utilisateur actuel de se créer un ami 
 * Instancie un objet a de la classe Ami et l'ajoute au tableau des amis
 * @see Ami 
 * @see Ami#setAmi(java.lang.String) 
 */  
    @Override
    public void ajouterPersonne() {
        boolean  entier = true;
        boolean entier1=true;
        int sal=0;
        int duree=0;
        String poste1;
        System.out.println("Veuillez entrer le prénom de votre employé: ");
        String prenom1 = scan.nextLine();
        System.out.println("Veuillez entrer le nom de votre employé: ");
        String nom1 = scan.nextLine();
        System.out.println("Veuillez entrer l'age de votre employé: ");
        int age1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Veuillez renseigner le sexe de votre employé: ");
        String sexe1 = scan.nextLine();
        System.out.println("Quel sera le salaire mensuel de votre employé: ");
        while(entier == true){    
            try{
                sal = scan.nextInt();
                scan.nextLine();
                entier = false;
            }catch(Exception e){
                    System.out.println("Le salaire doit être un nombre entier, veuillez recommencer: ");
                    scan.nextLine();
            }
        }
        System.out.println("Veuillez entrer la durée de son contrat: ");
        while(entier1 == true){    
            try{
                duree = scan.nextInt();
                scan.nextLine();
                entier1 = false;
            }catch(Exception e){
                    System.out.println("Le salaire doit être un nombre entier, veuillez recommencer: ");
                    scan.nextLine();
            }
        }
        System.out.println("Voulez-vous embaucher un développeur (tapez d), ou un marketeur (tapez m)?");
        char reponse = scan.nextLine().charAt(0);
        boolean encore=true;
        while(encore){
            switch (reponse) {
                case 'd':
                    poste1 = "Developpeur";
                    Employe e1 = new Developpeur(prenom1, nom1, age1, sexe1 , poste1, sal, duree);
                    mesEmployes.add(e1);
                    System.out.println("Développeur engagé avec succès.");
                    encore=false;
                    break;
                case 'm':
                    poste1 = "Marketeur";
                    Employe e2 = new Marketeur(prenom1, nom1, age1, sexe1 , poste1, sal, duree);
                    mesEmployes.add(e2);
                    System.out.println("Marketeur engagé avec succès.");
                    encore=false;
                    break;
                default:
                    System.out.println("Veuiller taper 'd' pour developpeur, ou 'm' pour marketeur.");
                    break;
            }
        }
    }

/**
 * Permet d'afficher un ami choisit par l'utilisateur
 */
    @Override
    public void afficherUnePersonne() {
        if(mesEmployes.isEmpty()) {
            System.out.println(mesEmployes);
            System.out.println("\nVous n'avez aucun employé!!!\n");
        }else{
            afficherPersonnes();
            System.out.print("Choisissez un numéro d'employé à afficher: \n");
            int i = scan.nextInt();
            scan.nextLine();
            System.out.println("\nEmployé numéro"+ i +": " + mesEmployes.get(i).getNom()+ "\n");
        }
    }

/**
 * Affiche tous les amis de l'utilisateur
 */
    @Override
    public void afficherPersonnes() {
        if(mesEmployes.isEmpty()) {
            System.out.println("\nVous n'avez aucun employé!!!\n");
        }else{
            System.out.println("\nVous avez " + mesEmployes.size() + " employes.");
            for(int i = 0; i < mesEmployes.size(); i++ ){
                System.out.println("\nEmployé numéro "+ i +" au poste de " + mesEmployes.get(i).getPoste()
                + " : " +mesEmployes.get(i).getPrenom()+ mesEmployes.get(i).getNom()+ "\n"); 
            }
        }
    }
    
    @Override
    public void recevoirPaiement(){
        System.out.println("Vous percevez un salaire mensuel de " + salaire + " euros....veinard!!!\n");
    }
}
