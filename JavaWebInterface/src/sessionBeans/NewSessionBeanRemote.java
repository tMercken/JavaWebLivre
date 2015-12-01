/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import javax.ejb.Remote;

/**
 *
 * @author client
 */
@Remote
public interface NewSessionBeanRemote {

    String businessMethod01(String param);
    
}
