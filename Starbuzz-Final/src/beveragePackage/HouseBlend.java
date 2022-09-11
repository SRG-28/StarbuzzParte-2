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
public class HouseBlend extends IBeverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getCost() {
        return 1000;
    }
    
}
