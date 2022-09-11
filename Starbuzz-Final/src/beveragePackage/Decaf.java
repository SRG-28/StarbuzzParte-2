/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beveragePackage;

/**
 *
 * @author Donald
 */
public class Decaf extends IBeverage {
    public Decaf() {
        description = "Decaf Coffee";
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getCost() {
        return 800;
    }
}
