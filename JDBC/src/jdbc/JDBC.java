/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import DAO.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;


/**
 *
 * @author boris.fournier
 */
public class JDBC {
    static Scanner scan = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            /*                                          sans singleton:
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java_bdd";
            String user = "root";
            String passwd = "root";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            
            //Création d'un objet Statement
            Statement state = conn.createStatement();
            Statement state1 = conn.createStatement(); 
            Statement state2 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);*/
            
            Statement state = Connexion.getInstance().createStatement();
            Statement state1 = Connexion.getInstance().createStatement(); 
            Statement state2 = Connexion.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            //L'objet ResultSet contient le résultat de la requête SQL
            ResultSet result = state.executeQuery("SELECT * FROM personne");
            ResultSet result1 = state1.executeQuery("SELECT * FROM personne WHERE id=1");
            

            //On récupère les MetaData
            ResultSetMetaData resultMeta = result.getMetaData();
            
            ResultSetMetaData resultMeta1 = result1.getMetaData();
            
            
                                                                //////////////////////////////////////////////////
                                                                
            System.out.println("                                   afficher toutes les infos de la table                                            ");
            System.out.println("\n****************************************************************************************************************");
            //On affiche le nom des colonnes
            for(int i = 1; i <= resultMeta.getColumnCount(); i++)
              System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");

            System.out.println("\n*****************************************************************************************************************");

            while(result.next()){         
              for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                System.out.print("\t" + result.getObject(i).toString() + "\t |");

              System.out.println("\n---------------------------------------------------------------------------------------------------------------\n");

            }
                                                        ///////////////////////////////////////////////////////////
                                                        
            
            System.out.println("                                   afficher un utilisateur en particulier id=1                                            ");
            System.out.println("\n****************************************************************************************************************");
            //On affiche le nom des colonnes
            for(int i = 1; i <= resultMeta1.getColumnCount(); i++)
                System.out.print("\t" + resultMeta1.getColumnName(i).toUpperCase() + "\t *");
            
            System.out.println("\n*****************************************************************************************************************");

                while(result1.next()){
                    System.out.print("\t" + result1.getInt("id")+ "\t *");
                    System.out.print("\t" + result1.getString("prenom")+ "\t *");
                    System.out.print("\t" + result1.getString("nom")+ "\t *");
                    System.out.print("\t" + result1.getInt("age")+ "\t *");
                    System.out.print("\t" + result1.getString("role")+ "\t *\n");
                }
            
                                                        ///////////////////////////////////////////////////////////
                                                        
            System.out.println("\n                                   créer un utilisateur                                           ");
            int age = 0;
            boolean entier=true;
            boolean entier1 = true;
            int t=0;
            String role="";

            System.out.println("Veuillez entrer un prénom: ");
            String prenom = scan.nextLine();
            System.out.println("Veuillez entrer un nom: ");
            String nom = scan.nextLine();
            System.out.println("Veuillez entrer un age: ");
            while(entier){    
                try{
                    age = scan.nextInt();
                    scan.nextLine();
                    entier = false;
                }catch(Exception e){
                        System.out.println("L'age doit être un nombre entier, veuillez recommencer: ");
                        scan.nextLine();
                }
            }
            System.out.println("Quel type de personne voulez-vous créer?\n"
                + "1: Créer un utilisateur.\n"
                + "2: Créer un modérateur.\n"
                + "3: Créer un directeur.\n");
            while(entier1){    
                try{
                    t = scan.nextInt();
                    scan.nextLine();
                    entier1 = false;
                }catch(Exception e) {
                    System.out.println("Veuillez saisir une valeur correspondant au menu.\n");
                    scan.nextLine();
                }
            }
            if(t==1){
                role = "utilisateur";
            }else if(t==2){
                role = "modérateur";
            }else{
                role = "directeur";
            }
            String query = "INSERT INTO personne (prenom, nom, age, role) VALUES (?,?,?,?)";

            //On crée l'objet avec la requête en paramètre
            //PreparedStatement prepare = conn.prepareStatement(query);
            PreparedStatement prepare = Connexion.getInstance().prepareStatement(query);
            prepare.setString(1, prenom);
            prepare.setString(2, nom);
            prepare.setInt(3, age);
            prepare.setString(4, role);
            System.out.println(prepare.toString());
            prepare.executeUpdate();
            
            
            prepare.close();
            result.close();
            result1.close();
            state.close();
            state1.close();
            state2.close();
            //conn.close();

        } catch (Exception e) { 
        }  
    }
    
}
