/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_social;


/**
 *
 * @author boris.fournier
 */
public class Reseau_social {
    

    /**
     * @param args the command line arguments
     * La méthode main est la fonction principale du programme, elle appelle des classes et des méthodes extérieures
     * Instanciation de la classe Menu qui permet d'accéder a ses méthodes
     * @see Menu#creerUtilisateur() 
     * @see Menu#menu(reseau_social.Utilisateur) 
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        int type = menu.typeUtilisateur();
        Utilisateur u = menu.creerUtilisateur(type);
        menu.menu(u);
    }
}
