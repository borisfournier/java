/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import reseau_social.*;


/**
 *
 * @author boris.fournier
 */
public abstract class PersonneDAO extends DAO<Personne>{
    
    public PersonneDAO(Connection conn) {
        super(conn);
    }
    @Override
    public boolean create(Personne obj) {
    return false;
  }

    @Override
  public boolean delete(Personne obj) {
    return false;
  }
   
    @Override
  public boolean update(Personne obj) {
    return false;
  }
   
    @Override
  public Personne find(String nom, String prenom) {
      Personne personne= null;
    try {
        String query= "SELECT * FROM personne WHERE nom = ? AND prenom = ?";
        PreparedStatement prepare = this.connect.prepareStatement(query);
        prepare.setString(1, nom);
        prepare.setString(2, prenom);
        ResultSet result = prepare.executeQuery();
        
        if(result.first()){
            switch(result.getString("role")){
                case "utilisateur":
                    personne = new Utilisateur(result.getString("nom"),result.getString("prenom"),result.getInt("age"),result.getString("sexe"),result.getString("pseudo"));
                    break;
                case "moderateur":
                    personne = new Moderateur(result.getString("nom"),result.getString("prenom"),result.getInt("age"),result.getString("sexe"),result.getInt("niveau"),result.getInt("salaire"));
                    break;
                case "directeur":
                    personne = new Directeur(result.getString("nom"),result.getString("prenom"),result.getInt("age"),result.getString("sexe"),result.getString("role"),result.getInt("salaire"));
                    break;  
            }
        }      
    } catch (Exception e) {
      System.out.println("exception");
    }
    return personne;
  }
}
