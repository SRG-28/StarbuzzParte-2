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
public class SteamedMilk extends IExtras {
    IBeverage beverage;

    public SteamedMilk(IBeverage beverage) {
        this.beverage = beverage;
    }
    
    
    @Override
    public String getDescription() {
        return beverage.getDescription()+ " with Steamed Milk ";
    }

    @Override
    public double getCost() {
        return 350 + beverage.getCost();
    }
}
