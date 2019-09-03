/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list3a7;

/**
 *
 * @author esprit
 */
public class Etudiant implements Comparable<Etudiant> {

    private int id;
    private String nom;
    private String prenom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    
    
    
    public Etudiant() {
    }

    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
  
    public boolean equals(Object obj) {

        if (obj instanceof Etudiant && obj != null) {
            Etudiant e = (Etudiant) obj;

            if (this.id == e.id) {
                return true;
            }

        }
        return false;

    }

    @Override
    public String toString() {
        return "id : "+id+" nom : "+nom+" prenom : "+prenom; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Etudiant o) {
    
    return this.id-o.id;
    }

 
    
    
}
