/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.DAOUserImpl;
/**
 *
 * @author Donald
 */
public class ControllerUser {
    DAOUserImpl u = new DAOUserImpl();
    
    public String read(String user, String pass){
        return u.read(user, pass);
    }
}
