/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list3a7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author esprit
 */
public class EspritArrayList implements University{

    
    ArrayList<Etudiant> etudiants ;

    public EspritArrayList() {
        etudiants =new ArrayList<>();
    }
    
    
    
    @Override
    public void ajouterEtudiant(Etudiant e) {
   etudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
   return etudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
   
//    for(Etudiant e : etudiants){
//        if(e.getNom().equals(nom))return true;
//    }
        
        
        for(int i=0 ; i<etudiants.size(); i++){
            
           if( etudiants.get(i).getNom().equals(nom))return true;
        }
    return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
   
        etudiants.remove(e);
    
    }

    @Override
    public void displayEtudiants() {
       for(Etudiant e: etudiants){
           
           System.out.println(e);
       }
    }

    @Override
    public void trierEtudiantsParId() {
        
   Collections.sort(etudiants);
    
    
    
    }

    @Override
    public void trierEtudiantsParNom() {
       
       // Collections.sort(etudiants , new Comparer1());
etudiants.sort(new Comparer1());
        
    }
    
}
