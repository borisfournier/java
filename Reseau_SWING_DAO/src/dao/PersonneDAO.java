/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import reseau_swing_dao.*;


/**
 *
 * @author boris.fournier
 */
public class PersonneDAO extends DAO<Personne>{
    
    public PersonneDAO(Connection conn) {
        super(conn);
    }
    @Override
  public void create(Personne obj) {
        String query = "";
        try{
            System.out.println(obj.getRole());
            switch(obj.getRole()){
                case "utilisateur":
                    query = "INSERT INTO personne(prenom, nom, age, role,pseudo) VALUES(?,?,?,?,?)";
                    PreparedStatement prepare1 = this.connect.prepareStatement(query);
                    prepare1.setString(1, obj.getPrenom());
                    prepare1.setString(2, obj.getNom());
                    prepare1.setInt(3, obj.getAge());
                    prepare1.setString(4, obj.getRole());
                    prepare1.setString(5, ((Utilisateur)obj).getPseudo());
                    prepare1.executeUpdate();
                    break;
                case "moderateur":
                    query = "INSERT INTO personne(prenom, nom, age, role, pseudo, niveau) VALUES(?,?,?,?,?,?)";
                    PreparedStatement prepare2 = this.connect.prepareStatement(query);
                    prepare2.setString(1, obj.getPrenom());
                    prepare2.setString(2, obj.getNom());
                    prepare2.setInt(3, obj.getAge());
                    prepare2.setString(4, obj.getRole());
                    prepare2.setString(5, ((Moderateur)obj).getPseudo());
                    prepare2.setString(6, ((Moderateur)obj).getNiveau());
                    prepare2.executeUpdate();
                    break;
                case "directeur":
                    query = "INSERT INTO personne(prenom, nom, age, role, salaire) VALUES(?,?,?,?,?)";
                    PreparedStatement prepare3 = this.connect.prepareStatement(query);
                    prepare3.setString(1, obj.getPrenom());
                    prepare3.setString(2, obj.getNom());
                    prepare3.setInt(3, obj.getAge());
                    prepare3.setString(4, obj.getRole());
                    prepare3.setInt(5, ((Directeur)obj).getSalaire());
                    prepare3.executeUpdate();
                    break;
                default:
                    System.out.println("default case du create");
                    break;
            }            
            System.out.println("Création effectuée dans la bdd");
        }catch(Exception e){
            System.out.println("Exception de la méthode create");
            e.printStackTrace();
        }
  }
    @Override
  public void delete(int id) {
      String query = "";
        try{
            query = "DELETE FROM personne WHERE id = ?";
            PreparedStatement prepare = this.connect.prepareStatement(query);
            prepare.setInt(1, id);
            prepare.executeUpdate();
            System.out.println("Suppression effectuée");
        }catch(Exception e){
            System.out.println("Exception de la méthode delete");
            e.printStackTrace();
        }
  }
    @Override
  public boolean update(Personne obj) {
    return false;
  }
    @Override
  public Personne find(String prenom, String nom) {
      Personne personne = null;
    try {
        String query= "SELECT * FROM personne WHERE prenom = ? AND nom = ?";
        PreparedStatement prepare = this.connect.prepareStatement(query);
        prepare.setString(1, prenom);
        prepare.setString(2, nom);
        ResultSet result = prepare.executeQuery();
        if(result.first()){
            switch(result.getString("role")){
                case "utilisateur":
                    personne = new Utilisateur(result.getString("prenom"),result.getString("nom"),result.getInt("age"),result.getString("role"),result.getString("pseudo"));
                    break;
                case "moderateur":
                    personne = new Moderateur(result.getString("prenom"),result.getString("nom"),result.getInt("age"),result.getString("role"),result.getString("pseudo"),result.getString("niveau"));
                    break;
                case "directeur":
                    personne = new Directeur(result.getString("prenom"),result.getString("nom"),result.getInt("age"),result.getString("role"),result.getInt("salaire"));
                    break;
                default:
                    System.out.println("default case du findId");
                    break;
            }
        }          
    } catch (Exception e) {
      System.out.println("Exception de la méthode findId");
    }
    return personne;
  }  
    @Override
  public ArrayList<Personne> findAll(){
      ArrayList<Personne> liste = new ArrayList();
      try {
        String query= "SELECT * FROM personne";
        PreparedStatement prepare = this.connect.prepareStatement(query);
        ResultSet result = prepare.executeQuery();
        while(result.next()){
            liste.add(this.find(result.getString("prenom"), result.getString("nom")));
        }
    } catch (Exception e) {
      System.out.println("exception findAll");
    }
      return liste;
  }
}
