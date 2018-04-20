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
    private static ProjetModele instance = null;

    public static ProjetModele getInstance() {
        if (instance == null) {
            return instance = new ProjetModele();
        } else {
            return instance;
        }
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
        if (c < 0) {
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

    public List<Client> tousClients() {
        mesClients.sort(new InfosClientComparator());
        return mesClients;
    }

    /*
    public List<Membre> tousMembres() {
        mesMembres.sort(new InfosMembreComparator());
        return mesMembres;
    }
     */
    public List<Projet> tousProjets() {
        mesProjets.sort(new InfosProjetComparator());
        return mesProjets;
    }

    public String suppC(Client cli) {
        int i = mesProjets.indexOf(cli);
        if (i < 0) {
            return "Client introuvable";

        } else {
            mesProjets.remove(i);
        }
        return "Suppression effectuée";
    }

    public void populate() {
        mesClients.addAll(Arrays.asList(
                new Client("Crombez", "0479267818", "Residence"),
                new Client("Rigaux", "0479267819", "Rue"),
                new Client("Urbain", "0479267820", "Pont")
        ));
        mesMembres.addAll(Arrays.asList(
                new Membre("bobo", "jean", "0456", "erer"),
                new Membre("baba", "rene", "78", "errezerz"),
                new Membre("lolo", "aha", "78456", "rezreztg")
        ));
        mesProjets.addAll(Arrays.asList(
                new Projet("java", "04/05/2018", "29/05/2018"),
                new Projet("c", "30/05/2018", "29/06/2018"),
                new Projet("compta", "30/06/2018", "29/07/2018")
        ));
    }

    boolean modifCoutMax(Projet p, double coutMax) {
        if (coutMax < 0 || coutMax > 1000000) {
            return false;
        }
        p.setCoutMax(coutMax);
        return true;
    }

}
