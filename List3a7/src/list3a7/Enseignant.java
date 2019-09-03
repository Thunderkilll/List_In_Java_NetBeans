/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package list3a7;

/**
 *
 * @author khaled22
 */
public class Enseignant implements Comparable<Enseignant>{
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

    public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Enseignant() {
        id= 0;
        nom="nom    ";
        prenom="prenom";
    }

    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Enseignant && obj!=null){
            
            Enseignant e = (Enseignant) obj;
            if( this.id == e.id ) {
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
    public int hashCode() {
       return 5;
    }

    @Override
    public int compareTo(Enseignant o) {
        
return o.nom.compareTo(this.getNom());
    
  }
}