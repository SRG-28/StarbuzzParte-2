/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import beveragePackage.*;

import Model.Bill;
import View.InicioView;
import View.LogIn;
import java.util.ArrayList;

/**
 *
 * @author Donald
 */
public class Starbuzz {

    Bill m = Bill.instance();
    ArrayList<Bill> billList;
    LogIn log = new LogIn();

    public void startApplication() {
        InicioView Jframe = new InicioView();
        Jframe.setVisible(true);
    }

    public String mostrarbebidas() {
        String bebidas = "";
        int orden = 0;
        int can = m.getBeverage().size();
        for (int i = 0; i < can; i++) {

            bebidas = m.getBeverage().get(i).getDescription();

        }
        orden++;
        return "Orden:" + orden + "\n" + bebidas;
    }

    public String mostrarPrecio() {
        return m.precioTotal();
    }

    public ArrayList<IBeverage> getList() {
        return m.getBeverage();
    }

    public void agregarBebida(IBeverage description) {
        m.getBeverage().add(description);
    }

    public void removeIndex(int i) {
        m.getBeverage().remove(i);
    }

    public void agregarFactura(String n, String t) {
        m.setClientName(n);
        m.setStatus(t);
        m.setOrderId(0);
    }

    public String getUser() {
        return m.getUserName();
    }
    public void setUser(String u) {
        m.setUserName(u);
    }

    public String getClient() {
        return m.getClientName();
    }

    public String getStatus() {
        return m.getStatus();
    }

    public int getOrderId() {
        return m.getOrderId();
    }

    public void setOrderID(int id) {
        m.setOrderId(id);
    }

    public ArrayList<Bill> getBillList() {
        return billList;
    }
    
}
