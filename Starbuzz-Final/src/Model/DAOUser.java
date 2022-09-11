/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Sofía Rubie García 117520883
 * @author Donald Cordoba Campos 304950089
 * @author Kyara Ávalos Escobar 402340732
 * @author Ali Pitti Gózalez 402450140
 *
 */

/*DAOUser
Esta clase se encarga de darle los metodos necesarios a la clase DAOUserImpl para trabajar en la base de datos conocidos como CRUD*/
public interface DAOUser {

    public String read(String user, String pass);
}
