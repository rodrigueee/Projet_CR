package projet.modele;

import java.util.*;

public class Client {

    private String nomC;
    private String adresse;
    private String tel;

    /**
     * Constructeur par défaut
     */
    public Client() {

    }

    /**
     * Constructeur complet
     */
    public Client(String nomC, String tel, String adresse) {
        this.nomC = nomC;
        this.adresse = adresse;
        this.tel = tel;

    }

    /**
     * Constructeur pour la méthode changeAdresse
     */
    public Client(String nomC, String tel) {
        this.nomC = nomC;
        this.tel = tel;
    }

    public String getNomC() {
        // TODO implement here
        return nomC;
    }

    /**
     * @param value
     */
    public void setNomC(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getAdresse() {
        // TODO implement here
        return adresse;
    }

    /**
     * @param value
     */
    public void setAdresse(String adresse) {
        // TODO implement here
        this.adresse = adresse;
    }

    /**
     * @return
     */
    public String getTel() {
        // TODO implement here
        return tel;
    }

    /**
     * @param value
     */
    public void setTel(String tel) {
        // TODO implement here
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Client{" + "Nom= " + nomC + ", tel= " + tel + ", adresse= " + adresse + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nomC);
        hash = 23 * hash + Objects.hashCode(this.tel);
        hash = 23 * hash + Objects.hashCode(this.adresse);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        if (!Objects.equals(this.nomC, other.nomC)) {
            return false;
        }
        return true;
    }
}

