/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package métier;

/**
 *
 * @author e-boudhina
 */
public class Etudiant {
    private int id;
    private String nom,prenom;
            
            
            
    public Etudiant() {
        
    }
    
    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    
    
}
