/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAOBillImpl;
import beveragePackage.IBeverage;
import java.util.ArrayList;

/**
 *
 * @author Donald
 */
public class ControllerBill {
    DAOBillImpl bill = new DAOBillImpl();
    
    public void create(int orderId, String user, String client, String status, ArrayList<IBeverage> lista){
        bill.create(orderId, user, client, status, lista);
    }
}
