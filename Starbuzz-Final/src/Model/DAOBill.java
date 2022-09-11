/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import beveragePackage.IBeverage;
import java.util.ArrayList;
import javax.swing.JTextArea;

/*DAOBill
Esta clase se encarga de darle los metodos necesarios a la clase DAOBillImpl para trabajar en la base de datos conocidos como CRUD*/
public interface DAOBill {

    public void create(int orderId, String user, String client, String status, ArrayList<IBeverage> lista);
    
}
