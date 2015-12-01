/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityFacadeSessionBeans;

import entityBeans.Lignecommande;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author client
 */
@Stateless
public class LignecommandeFacade extends AbstractFacade<Lignecommande> implements LignecommandeFacadeLocal {
    @PersistenceContext(unitName = "Projet03-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LignecommandeFacade() {
        super(Lignecommande.class);
    }
    
}
