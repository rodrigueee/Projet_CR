package projet.controleur;

import java.util.List;
import java.util.Scanner;
import projet.modele.Client;
import projet.modele.Membre;
import projet.modele.Projet;
import projet.vue.ProjetVue;
import projet.modele.ProjetModele;

public class Controleur {

    /**
     * Declaration de variables des types
     */
    private ProjetModele pm;
    private ProjetVue pv;

    /**
     * Constructeur par defaut
     */
    public Controleur() {

    }

    /**
     * Constructeur paramétré
     *
     * @param pm
     * @param pv
     */
    public Controleur(ProjetModele pm, ProjetVue pv) {

        this.pm = pm;
        this.pv = pv;
    }

    public void gestion() {
        int ch, ch2;

        do {
            ch = pv.menuP();

            switch (ch) {
                case 1:
                    do {
                        ch2 = pv.sousMenu();
                        switch (ch2) {
                            case 1:
                                ajoutClient();
                                break;
                            case 2:
                                modifClient();
                                break;
                            case 3: //recherClient();
                                break;
                            case 4: //listeClient();
                                break;
                            case 5: //suppClient();
                                break;
                            case 6:
                                pv.affMsg("Retour");
                                break;

                        }
                    } while (ch2 != 6);
                    break;
                case 2:
                    do {
                        ch2 = pv.sousMenu();
                        switch (ch2) {
                            case 1:
                                ajoutMembre();
                                break;
                            case 2:
                                modifMembre();
                                break;
                            case 3: //recherMembre();
                                break;
                            case 4: //listeMembre();
                                break;
                            case 5: //suppMembre();
                                break;
                            case 6:
                                pv.affMsg("Retour");
                                break;

                        }
                    } while (ch2 != 6);
                    break;
                case 3:
                    do {
                        ch2 = pv.sousMenu();
                        switch (ch2) {
                            case 1:
                                ajoutProjet();
                                break;
                            case 2:
                                modifProjet();
                                break;
                            case 3: //recherProjet();
                                break;
                            case 4: //listeProjet();
                                break;
                            case 5: //suppProjet();
                                break;
                            case 6:
                                pv.affMsg("Retour");
                                break;

                        }
                    } while (ch2 != 6);
                    break;
                case 4:
                    pv.affMsg("Bye");
                    break;
                default:
                    pv.affMsg("Choix Invalide");

            }
        } while (ch != 4);
    }

    public void ajoutClient() {
        Client cl = pv.encodeClient();
        String msg = pm.ajouterClient(cl);
        pv.affMsg(msg);
    }

    public void ajoutMembre() {
        Membre mb = pv.encodeMembre();
        String msg = pm.ajouterMembre(mb);
        pv.affMsg(msg);
    }

    public void ajoutProjet() {
        Projet pj = pv.encodeProjet();
        String msg = pm.ajouterProjet(pj);
        pv.affMsg(msg);
    }

    public void modifClient() {

        Client cliRech = rechClient();
        if (cliRech == null) {
            pv.affMsg("Client introuvable");
            return;
        }
        pv.affClient(cliRech);
        String nvadr = pv.getMsg("nouvelle adresse : ");
        String msg = pm.modifClient(cliRech, nvadr);
        pv.affMsg(msg);
    }

    public void modifMembre() {

        Membre mbRech = rechMembre();
        if (mbRech == null) {
            pv.affMsg("Membre introuvable");
            return;
        }
        pv.affMembre(mbRech);
        String nvgsm = pv.getMsg("nouveau GSM : ");
        String nvemail = pv.getMsg("nouvelle email : ");
        String msg = pm.modifMembre(mbRech, nvgsm, nvemail);
        pv.affMsg(msg);
    }

    public void modifProjet() {

        Projet pjRech = rechProjet();
        if (pjRech == null) {
            pv.affMsg("Projet introuvable");
            return;
        }
        pv.affProjet(pjRech);
        String nvdated = pv.getMsg("nouvelle date de debut : ");
        String nvdatef = pv.getMsg("nouvelle date de fin : ");
        String msg = pm.modifProjet(pjRech, nvdated, nvdatef);
        pv.affMsg(msg);
    }

    public Client rechClient() {
        Client cRech = pv.formRechClient();
        return pm.getClient(cRech);
    }

    public Membre rechMembre() {
        Membre mRech = pv.formRechMembre();
        return pm.getMembre(mRech);
    }

    public Projet rechProjet() {
        Projet pRech = pv.formRechProjet();
        return pm.getProjet(pRech);
    }
    /*
    public void listeClients() {
        List<Client> lc = pm.tousClients();
        pv.affListe(lc);
    }

    public void listeMembres() {
        List<Membres> lm = pm.tousMembres();
        pv.affListe(lm);
    }
     */
}
