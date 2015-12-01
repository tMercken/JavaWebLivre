/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeansPackage;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sessionBeans.NewSessionBeanRemote;

/**
 *
 * @author client
 */
@ManagedBean
@SessionScoped
public class MyManagedBean {
    @EJB
    private NewSessionBeanRemote newSessionBean;

    /**
     * Creates a new instance of MyManagedBean
     */
    public MyManagedBean() {
    }
    
}
