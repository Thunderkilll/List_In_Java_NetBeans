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
public class List3a7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Enseignant e1 =new Enseignant (001,"hhhhh","bbbbb");
    Enseignant e2 =new Enseignant (002,"cccc","aaaa");
    Enseignant e3 =new Enseignant (003,"dddd","ffff");
     System.out.println("****HASHSET********");
    EspritHashSet espritHashSet = new EspritHashSet();
    espritHashSet.ajouterEnseignant(e3);
    espritHashSet.ajouterEnseignant(e2);
    espritHashSet.ajouterEnseignant(e1);
    espritHashSet.ajouterEnseignant(e3);
    espritHashSet.displayEnseignants();
        System.out.println(" \n         ");
    
    
    EspritTreeSet enseEspritTreeSet = new EspritTreeSet();
        System.out.println("****TREESET********");
    enseEspritTreeSet.ajouterEnseignant(e1);
    enseEspritTreeSet.ajouterEnseignant(e2);
     enseEspritTreeSet.ajouterEnseignant(e3);
    enseEspritTreeSet.displayEnseignants();
    
   
    
    }
    
}
