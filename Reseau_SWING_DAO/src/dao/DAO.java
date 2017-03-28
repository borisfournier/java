/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author boris.fournier
 * @param <P> un objet 
 */
public abstract class DAO<P> {
    protected Connection connect = null;
   
  public DAO(Connection conn){
    this.connect = conn;
  }
   
  /**
  * Méthode de création
  * @param obj 
  */
  public abstract void create(P obj);

  /**
  * Méthode pour effacer
     * @param id
  */
  public abstract void delete(int id);

  /**
  * Méthode de mise à jour
  * @param obj
  * @return boolean
  */
  public abstract boolean update(P obj);

  /**
  * Méthode de recherche des informations
     * @param prenom
     * @param nom
  * @return P
  */
  public abstract P find(String prenom, String nom);

 /**
  * Méthode d'affichage des informations
     * @return 
  */
  public abstract ArrayList<P> findAll();
}
