/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author boris.fournier
 */
public class Connexion {
    //URL de connexion
    private String url = "jdbc:mysql://localhost:3306/java_bdd";
    //Nom du user
    private String user = "root";
    //Mot de passe de l'utilisateur
    private String passwd = "root";
    //driver
    //private String driver = "com.mysql.jdbc.Driver";
    //Objet Connection
    private static Connection connect;

    //Constructeur privé
    private Connexion(){
      try {
          //Class.forName(driver).newInstance();
            connect = DriverManager.getConnection(url, user, passwd);
      } catch (Exception e) {
            System.out.println("Connexion échouée");
      }
    }

    //Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
     public static Connection getInstance(){
      if(connect == null){
        new Connexion();
        System.out.println("Connexion nouvelle");
      }else{
          System.out.println("Connexion deja existante");
      }
      return connect;   
    }   
}
