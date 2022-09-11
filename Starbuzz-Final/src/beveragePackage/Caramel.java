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
public class Caramel extends IExtras {
    IBeverage beverage;

    public Caramel(IBeverage beverage) {
        this.beverage = beverage;
    }
    
    
    @Override
    public String getDescription() {
        return beverage.getDescription()+ " with Caramel ";
    }

    @Override
    public double getCost() {
        return 500 + beverage.getCost();
    }
}
