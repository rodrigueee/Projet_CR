/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.modele;

import java.util.*;

public class ProjetModele {

    /**
     * liste
     */
    protected List<Client> mesClients = new ArrayList<>();
    protected List<Membre> mesMembres = new ArrayList<>();
    protected List<Projet> mesProjets = new ArrayList<>();

    /**
     * Constructeur par défaut
     */
    public ProjetModele() {

    }

    /**
     *
     */
    public String ajouterClient(Client cl) {
        if (cl == null) {
            return "Client inexistant";
        }
        if (mesClients.contains(cl)) {
            return "Client déjà crée";
        }
        mesClients.add(cl);
        return "Ajout du client";
    }

    /**
     *
     */
    public String ajouterMembre(Membre mb) {
        if (mb == null) {
            return "Membre inexistant";
        }
        if (mesMembres.contains(mb)) {
            return "Membre déjà crée";
        }
        mesMembres.add(mb);
        return "Ajout du membre";
    }

    /**
     *
     */
    public String ajouterProjet(Projet pj) {
        if (pj == null) {
            return "Projet inexistant";
        }
        if (mesProjets.contains(pj)) {
            return "Projet déjà crée";
        }
        mesProjets.add(pj);
        return "Ajout du Projet";
    }

    /**
     *
     */
    public String modifClient(Client cl, String adr) {
        cl.setAdresse(adr);
        return "Changement d'adrese effectué";
    }

    public String modifMembre(Membre mb, String gsm, String email) {
        mb.setGsm(gsm);
        mb.setEmail(email);
        return "Changement effectué";
    }

    public String modifProjet(Projet pj, String dated, String datef) {
        pj.setDated(dated);
        pj.setDatef(datef);
        return "Changement effectué";
    }

    /**
     *
     */
    public Client getClient(Client cRech) {
        int c = mesClients.indexOf(cRech);
        if (c< 0) {
            return null;
        } else {
            return mesClients.get(c);
        }
    }

    public Membre getMembre(Membre mRech) {
        int m = mesMembres.indexOf(mRech);
        if (m < 0) {
            return null;
        } else {
            return mesMembres.get(m);
        }
    }

    public Projet getProjet(Projet pRech) {
        int p = mesProjets.indexOf(pRech);
        if (p < 0) {
            return null;
        } else {
            return mesProjets.get(p);
        }
    }

}
