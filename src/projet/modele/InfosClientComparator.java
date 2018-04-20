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
public class InfosClientComparator implements Comparator<Client>{
    
    @Override
    public int compare(Client c1, Client c2){
        if(!c1.getNomC().equals(c2.getNomC())) return c1.getNomC().compareTo(c2.getNomC());
        if(!c1.getTel().equals(c2.getTel())) return c1.getTel().compareTo(c2.getTel());
        return c1.getAdresse().compareTo(c2.getAdresse());
    }
}
