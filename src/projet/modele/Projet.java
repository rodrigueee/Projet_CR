package projet.modele;

import java.util.ArrayList;
import java.util.*;

/**
 *
 */
public class Projet {

    /**
     * Default constructor
     */
    protected String titre = "";
    protected String dated = "";
    protected String datef = "";
    //protected ArrayList<Client> cli = new ArrayList();
    private Client cli;

    public Projet() {
    }

    public Projet(String titre) {
        this.titre = titre;

    }

    public Projet(String titre, String dated, String datef, Client cli) {
        this.titre = titre;
        this.dated = dated;
        this.datef = datef;
        this.cli = cli;
    }

    public String getTitre() {
        // TODO implement here
        return titre;
    }

    /**
     * @param value
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return
     */
    public Client getClient() {

        return cli;
    }

    /**
     * @param value
     */
    public void setClient(Client cli) {
        this.cli = cli;
    }

    /**
     * @return
     */
    public String getDated() {
        // TODO implement here
        return dated;
    }

    /**
     * @param value
     */
    public void setDated(String dated) {
        this.dated = dated;
    }

    /**
     * @return
     */
    public String getDatef() {
        // TODO implement here
        return datef;
    }

    /**
     * @param value
     */
    public void setDatef(String datef) {
        this.datef = datef;
    }

    @Override
    public String toString() {
        return "Projet{" + "Titre= " + titre + ", date de debut = " + dated + ", date de fin = " + datef + ", client " + cli + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.titre);

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
        final Projet other = (Projet) obj;
        if (!Objects.equals(this.titre, other.titre)) {
            return false;
        }

        return true;
    }

}
