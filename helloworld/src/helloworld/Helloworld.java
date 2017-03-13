/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner; 

/**
 *
 * @author boris.fournier
 */
public class Helloworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Profil t = new Profil();
        //t.setAge(34);
        //t.setNom("Fournier");
        //t.setPrenom("Boris");
        //t.setSexe("homme");
        Scanner scan = new Scanner(System.in);
        char reponse = 'N';
 
        while(reponse == 'N') {
            System.out.println("Veuillez entrer votre prénom: ");
            String prenom = scan.next();
            System.out.println("Veuillez entrer votre nom: ");
            scan.nextLine();
            String nom = scan.next();
            System.out.println("Veuillez entrer votre age: ");
            scan.nextLine();
            String age = scan.next();
            System.out.println("Veuillez entrer votre sexe: ");
            scan.nextLine();
            String sexe = scan.next();
            System.out.println("Prénom: " + prenom);
            System.out.println("nom: " + nom);
            System.out.println("Age: " + age+ " ans");
            System.out.println("Sexe: " + sexe);
            System.out.println("Souhaitez-vous quitter le programme? (O/N)");
            scan.nextLine();
            reponse = scan.nextLine().charAt(0);
                
            }
        System.out.print("Salut mec, à la prochaine!!!");
            
    }

        //System.out.println("Nom: " + t.getNom());
        //System.out.println("Age: " + t.getAge());
        //System.out.println("Sexe: " + t.getSexe());

}
    
