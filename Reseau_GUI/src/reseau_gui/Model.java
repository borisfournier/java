/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_gui;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author boris.fournier
 */
public class Model extends AbstractTableModel{
        
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return ListePersonnes.getPersonnes().size();
	}

        
        private final String[] entetes = { "Prénom", "Nom", "Age", "Rôle" };	
	
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
			// Nom
			return ListePersonnes.getPersonnes().get(rowIndex).getNom();

		case 1:
			// Prenom
			return ListePersonnes.getPersonnes().get(rowIndex).getPrenom();

		case 2:
			// Annee
			return ListePersonnes.getPersonnes().get(rowIndex).getAge();

		default:
			// Sexe
			return ListePersonnes.getPersonnes().get(rowIndex).getRole();

		}
	}
}

