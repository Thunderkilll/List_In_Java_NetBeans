/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package list3a7;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author khaled22
 */
public class EspritTreeSet implements GestionEnseignant {
    
    TreeSet<Enseignant> enseignats;
        
    
    
    public EspritTreeSet (){
        enseignats = new TreeSet<>();
    }
    

    @Override
    public void ajouterEnseignant(Enseignant e) {
        enseignats.add(e);
    
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        
        return enseignats.contains(e);
        
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        
      //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    for(Enseignant e: enseignats){
        if(e.getId() == id)return true;
    }return false;
    
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        enseignats.remove(e);
    }

    @Override
    public void displayEnseignants() {
      
           for(Enseignant e: enseignats){
            
            System.out.println(e.toString());
        }


// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
