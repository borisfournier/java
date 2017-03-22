/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_gui;

import java.util.ArrayList;

/**
 *
 * @author boris.fournier
 */
public class ListePersonnes {
    private  static ArrayList<Personne> Personnes = new ArrayList<>();

    public static ArrayList<Personne> getPersonnes() {
        return Personnes;
    }

    public static void setPersonnes(ArrayList<Personne> Personnes) {
        ListePersonnes.Personnes = Personnes;
    }

    
}
