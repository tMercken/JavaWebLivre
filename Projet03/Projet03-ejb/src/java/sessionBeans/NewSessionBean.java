/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import javax.ejb.Stateless;

/**
 *
 * @author client
 */
@Stateless
public class NewSessionBean implements NewSessionBeanRemote {

    @Override
    public String businessMethod01(String param) {
        return null;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
