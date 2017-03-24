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
public class Message {
    
    private String message;
    private String expediteur;
    private String destinataire;
    
    public Message(String message, String expediteur, String destinataire) {
        this.message = message;
        this.expediteur = expediteur;
        this.destinataire = destinataire;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getExpediteur() {
        return expediteur;
    }
    public void setExpediteur(String expediteur) {
        this.expediteur = expediteur;
    }
    public String getDestinataire() {
        return destinataire;
    }
    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }
}
