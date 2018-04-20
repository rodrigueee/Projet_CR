/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.modele;
import java.util.Comparator;
/**
 *
 * @author Utilisateur
 */
public class InfosProjetComparator implements Comparator<Projet>{
    
    @Override
    public int compare(Projet p1, Projet p2){
        if(!p1.getDated().equals(p2.getDated())) return p1.getDated().compareTo(p2.getDated());
        if(!p1.getDatef().equals(p2.getDatef())) return p1.getDatef().compareTo(p2.getDatef());
        return p1.getTitre().compareTo(p2.getTitre());
    }
}
