/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import beveragePackage.*;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Bill {

    private static Bill uniqueInstance;
    private String userName;
    private String clientName;
    private String status;
    private int orderId;

    public static Bill instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Bill();
        }
        return uniqueInstance;
    }

    ArrayList<IBeverage> bebidas;

    private Bill() {
        bebidas = new ArrayList<>();
    }

    public Bill(String userName, String clientName, String status) {
        this.userName = userName;
        this.clientName = clientName;
        this.status = status;
    }

    public ArrayList<IBeverage> getBeverage() {
        return bebidas;
    }

    public String precioTotal() {

        double cost = 0.0;
        for (int i = 0; i < bebidas.size(); i++) {
            cost = bebidas.get(i).getCost();

        }
        return "Cost: " + cost;
    }

    public static Bill getUniqueInstance() {
        return uniqueInstance;
    }

    public static void setUniqueInstance(Bill uniqueInstance) {
        Bill.uniqueInstance = uniqueInstance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<IBeverage> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<IBeverage> bebidas) {
        this.bebidas = bebidas;
    }

    public int getOrderId() {
        return orderId + 1;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

}
