/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityFacadeSessionBeans;

import entityBeans.Categorie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author client
 */
@Local
public interface CategorieFacadeLocal {

    void create(Categorie categorie);

    void edit(Categorie categorie);

    void remove(Categorie categorie);

    Categorie find(Object id);

    List<Categorie> findAll();

    List<Categorie> findRange(int[] range);

    int count();
    
}
