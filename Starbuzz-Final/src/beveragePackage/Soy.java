/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beveragePackage;

import beveragePackage.IBeverage;
import beveragePackage.IExtras;
/**
 *
 * @author Donald
 */
public class Soy extends IExtras {
    IBeverage beverage;

    public Soy(IBeverage beverage) {
        this.beverage = beverage;
    }
    
    
    @Override
    public String getDescription() {
        return beverage.getDescription()+ " with Soy ";
    }

    @Override
    public double getCost() {
        return 300 + beverage.getCost();
    }
    
}
