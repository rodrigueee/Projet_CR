/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.vue;

import projet.modele.Client;
import projet.modele.Membre;
import projet.modele.Projet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ProjetVue {

    private Scanner sc = new Scanner(System.in);

    public int menuP() {
        System.out.println("1)Client");
        System.out.println("2)Membre");
        System.out.println("3)Projet");
        System.out.println("4)Quitter");
        int choix = sc.nextInt();
        return choix;
    }

    public int sousMenu() {
        System.out.println("1)Ajouter");
        System.out.println("2)Modifier");
        System.out.println("3)Rechercher");
        System.out.println("4)Liste");
        System.out.println("5)Supprimer");
        System.out.println("6)Retour");
        int choix = sc.nextInt();
        return choix;
    }

    public Client encodeClient() {
        String nomC = getMsg("Nom du client : ");
        String tel = getMsg("Numéro de tel du client : ");
        String adresse = getMsg("Adresse du client : ");
        Client cl = new Client(nomC, tel, adresse);
        return cl;
    }

    public Membre encodeMembre() {
        String nomM = getMsg("Nom du membre : ");
        String prenomM = getMsg("Prénom du membre : ");
        String gsm = getMsg("GSM du membre : ");
        String email = getMsg("Email du membre : ");
        Membre mb = new Membre(nomM, prenomM, gsm, email);
        return mb;
    }

    public Projet encodeProjet() {
        String titre = getMsg("Titre du projet : ");
        String dated = getMsg("Date du début du projet : ");
        String datef = getMsg("Date de fin du projet : ");
        Client cli = new Client();
        cli = encodeClient();
        Projet pj = new Projet(titre, dated, datef, cli);
        return pj;
    }

    public void affClient(Client cl) {
        affMsg("Nom : " + cl.getNomC());
        affMsg("Tel : " + cl.getTel());
        affMsg("Adresse : " + cl.getAdresse());
    }

    public void affMembre(Membre mb) {
        affMsg("Nom : " + mb.getNomM());
        affMsg("Prenom : " + mb.getPrenomM());
        affMsg("GSM : " + mb.getGsm());
        affMsg("Email : " + mb.getEmail());
    }

    public void affProjet(Projet pj) {
        affMsg("Titre : " + pj.getTitre());
        affMsg("Date de debut : " + pj.getDated());
        affMsg("Date de fin : " + pj.getDatef());
    }

    public String getMsg() {
        String msg = sc.nextLine();
        return msg;
    }

    public void affMsg(Object msg) {
        System.out.println(msg);
    }

    public String getMsg(String msg) {
        affMsg(msg);
        return getMsg();
    }

    public void affListe(Collection liste) {
        int i = 1;
        for (Object o : liste) {
            affMsg((i++) + "." + o);
        }
    }

    public Client formRechClient() {
        String nomC = getMsg("Nom : ");
        String tel = getMsg("Telephone : ");

        return new Client(nomC, tel);

    }

    public Membre formRechMembre() {
        String nomM = getMsg("Nom : ");
        String prenomM = getMsg("Prénom : ");

        return new Membre(nomM, prenomM);

    }

    public Projet formRechProjet() {
        String titre = getMsg("Titre : ");
        

        return new Projet(titre);

    }

}
