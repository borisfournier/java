/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_swing_dao;

import dao.Connexion;
import dao.DAO;
import dao.PersonneDAO;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author boris.fournier
 */
public class Model extends AbstractTableModel{
        DAO<Personne> persDAO = new PersonneDAO(Connexion.getInstance());
        
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return persDAO.findAll().size();
	}

        
        private final String[] entetes = { "Prénom", "Nom", "Age", "Rôle", "Pseudo", "Niveau modérateur", "Salaire directeur" };	
	
	@Override
	public int getColumnCount() {
		return entetes.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return entetes[columnIndex];
	}
        
        @Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {

		case 0:
			// Prénom
			if(persDAO.findAll().get(rowIndex).getPrenom() == null) {
                            return "";
                        }else {
                            return persDAO.findAll().get(rowIndex).getPrenom();
                        }
		case 1:
			// Prenom
			if (persDAO.findAll().get(rowIndex).getNom() == null)
                        {
                            return "";
                        }else {
                            return persDAO.findAll().get(rowIndex).getNom();
                        }
		case 2:
			// Age
                        return persDAO.findAll().get(rowIndex).getAge();
                case 3:
                        // role
			if(persDAO.findAll().get(rowIndex).getRole() == null){
                            return "";
                        }else {
                            return persDAO.findAll().get(rowIndex).getRole();
                        }
               case 4:
			// Pseudo
                        if("directeur".equals(persDAO.findAll().get(rowIndex).getRole())){
                            return "";
                        }else if(((Utilisateur)persDAO.findAll().get(rowIndex)).getPseudo() == null){
                            return "";
                        }else{
                            return ((Utilisateur)persDAO.findAll().get(rowIndex)).getPseudo();
                        }
                case 5:
			// Niveau Modérateur
                    if("moderateur".equals(persDAO.findAll().get(rowIndex).getRole()) && ((Moderateur)persDAO.findAll().get(rowIndex)).getNiveau() != null){
                        return ((Moderateur)persDAO.findAll().get(rowIndex)).getNiveau();
                    }
                    else{
                        return "";
                    }
		default:
			// Salaire directeur
                    if("directeur".equals(persDAO.findAll().get(rowIndex).getRole())){
                        return ((Directeur)persDAO.findAll().get(rowIndex)).getSalaire();
                    }
                    else{
                        return "";
                    } 
		}
	}
}

