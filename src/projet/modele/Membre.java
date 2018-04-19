package projet.modele;

import java.util.*;

/**
 *
 */
public class Membre {

    /**
     * Default constructor
     */
    private String nomM = "";
    private String prenomM = "";
    private String gsm = "";
    private String email = "";

    public Membre() {
    }

    public Membre(String nomM, String prenomM) {
        this.nomM = nomM;
        this.prenomM = prenomM;
    }

    public Membre(String nomM, String prenomM, String gsm, String email) {  //constructeur basé sur les informations d'identification
        this.nomM = nomM;
        this.prenomM = prenomM;
        this.gsm = gsm;
        this.email = email;
    }

    public String getNomM() {
        // TODO implement here
        return nomM;
    }

    /**
     * @return
     */
    public String getPrenomM() {
        // TODO implement here
        return prenomM;
    }

    /**
     * @return
     */
    public String getGsm() {
        // TODO implement here
        return gsm;
    }

    /**
     * @param value
     */
    public void setGsm(String gsm) {
        // TODO implement here
        this.gsm = gsm;
    }

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return email;
    }

    /**
     * @param value
     */
    public void setEmail(String email) {
        // TODO implement here
        this.email = email;
    }

    @Override
    public String toString() {
        return "Membre{" + "Nom= " + nomM + ", prenom= " + prenomM + ", gsm= " + gsm + ", email= " + email + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nomM);
        hash = 23 * hash + Objects.hashCode(this.prenomM);
        hash = 23 * hash + Objects.hashCode(this.gsm);
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
        final Membre other = (Membre) obj;
        if (!Objects.equals(this.nomM, other.nomM)) {
            return false;
        }
        if (!Objects.equals(this.prenomM, other.prenomM)) {
            return false;
        }
        if (!Objects.equals(this.gsm, other.gsm)) {
            return false;
        }
        return true;
    }

}
