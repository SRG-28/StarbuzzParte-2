/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beveragePackage;
//package view;
import beveragePackage.IBeverage;
import beveragePackage.IExtras;
/**
 *
 * @author Donald
 */
public class Mocha extends IExtras {
    IBeverage beverage;

    public Mocha(IBeverage beverage) {
        this.beverage = beverage;
    }
    
    
    @Override
    public String getDescription() {
        return beverage.getDescription()+ " with Mocha ";
    }

    @Override
    public double getCost() {
        return 400 + beverage.getCost();
    }
}
