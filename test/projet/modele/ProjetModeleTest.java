/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.modele;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Utilisateur
 */
public class ProjetModeleTest {
    
    public ProjetModeleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class ProjetModele.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ProjetModele expResult = null;
        ProjetModele result = ProjetModele.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterClient method, of class ProjetModele.
     */
    @Test
    public void testAjouterClient() {
        System.out.println("ajouterClient");
        Client cl = null;
        ProjetModele instance = new ProjetModele();
        String expResult = "";
        String result = instance.ajouterClient(cl);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of ajouterMembre method, of class ProjetModele.
     */
    @Test
    public void testAjouterMembre() {
        System.out.println("ajouterMembre");
        Membre mb = null;
        ProjetModele instance = new ProjetModele();
        String expResult = "";
        String result = instance.ajouterMembre(mb);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of ajouterProjet method, of class ProjetModele.
     */
    @Test
    public void testAjouterProjet() {
        System.out.println("ajouterProjet");
        Projet pj = null;
        ProjetModele instance = new ProjetModele();
        String expResult = "";
        String result = instance.ajouterProjet(pj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of modifClient method, of class ProjetModele.
     */
    @Test
    public void testModifClient() {
        System.out.println("modifClient");
        Client cl = null;
        String adr = "";
        ProjetModele instance = new ProjetModele();
        String expResult = "";
        String result = instance.modifClient(cl, adr);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of modifMembre method, of class ProjetModele.
     */
    @Test
    public void testModifMembre() {
        System.out.println("modifMembre");
        Membre mb = null;
        String gsm = "";
        String email = "";
        ProjetModele instance = new ProjetModele();
        String expResult = "";
        String result = instance.modifMembre(mb, gsm, email);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of modifProjet method, of class ProjetModele.
     */
    @Test
    public void testModifProjet() {
        System.out.println("modifProjet");
        Projet pj = null;
        String dated = "";
        String datef = "";
        ProjetModele instance = new ProjetModele();
        String expResult = "";
        String result = instance.modifProjet(pj, dated, datef);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getClient method, of class ProjetModele.
     */
    @Test
    public void testGetClient() {
        System.out.println("getClient");
        Client cRech = null;
        ProjetModele instance = new ProjetModele();
        Client expResult = null;
        Client result = instance.getClient(cRech);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getMembre method, of class ProjetModele.
     */
    @Test
    public void testGetMembre() {
        System.out.println("getMembre");
        Membre mRech = null;
        ProjetModele instance = new ProjetModele();
        Membre expResult = null;
        Membre result = instance.getMembre(mRech);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getProjet method, of class ProjetModele.
     */
    @Test
    public void testGetProjet() {
        System.out.println("getProjet");
        Projet pRech = null;
        ProjetModele instance = new ProjetModele();
        Projet expResult = null;
        Projet result = instance.getProjet(pRech);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of tousClients method, of class ProjetModele.
     */
    @Test
    public void testTousClients() {
        System.out.println("tousClients");
        ProjetModele instance = new ProjetModele();
        List<Client> expResult = null;
        List<Client> result = instance.tousClients();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of tousProjets method, of class ProjetModele.
     */
    @Test
    public void testTousProjets() {
        System.out.println("tousProjets");
        ProjetModele instance = new ProjetModele();
        List<Projet> expResult = null;
        List<Projet> result = instance.tousProjets();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of suppC method, of class ProjetModele.
     */
    @Test
    public void testSuppC() {
        System.out.println("suppC");
        Client cli = null;
        ProjetModele instance = new ProjetModele();
        String expResult = "";
        String result = instance.suppC(cli);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of populate method, of class ProjetModele.
     */
    @Test
    public void testPopulate() {
        System.out.println("populate");
        ProjetModele instance = new ProjetModele();
        instance.populate();
        
    }
    
    public void testModifProjetMax() {
        System.out.println("modifProjetMax");
        Projet pj = new Projet();
        pj.setCoutMax(1000000);
        int ProjetMax = 20;
        ProjetModele instance = new ProjetModele();
        boolean expResult = true;
        boolean result = instance.modifCoutMax(pj, ProjetMax);
        assertEquals(expResult, result);
    
}
}