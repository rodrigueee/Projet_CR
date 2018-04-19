package main;

import projet.controleur.Controleur;
import projet.vue.ProjetVue;
import projet.modele.ProjetModele;

public class Main {

    private Controleur ct;
    private ProjetModele pjm;
    private ProjetVue pjv;

    public Main() {

        pjv = new ProjetVue();
        pjm = new ProjetModele();
        ct = new Controleur(pjm, pjv);
        ct.gestion();

    }

    public static void main(String[] args) {
        Main m = new Main();
    }

}
