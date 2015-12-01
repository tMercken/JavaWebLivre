/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityFacadeSessionBeans;

import entityBeans.Auteur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author client
 */
@Local
public interface AuteurFacadeLocal {

    void create(Auteur auteur);

    void edit(Auteur auteur);

    void remove(Auteur auteur);

    Auteur find(Object id);

    List<Auteur> findAll();

    List<Auteur> findRange(int[] range);

    int count();
    
}
