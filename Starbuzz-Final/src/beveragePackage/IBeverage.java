/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beveragePackage;

/**
 *
 * @author Donald, Sofia,Ali, Kyara
 */
/*
Decaf
Se extiende de la interface IBeverage
Por lo tanto implementa sobreescribe el get cost 800 colones que contiene dicha interfaz, también posee su propio constructor en donde su descripción es “Decaf Coffee ” para que cada clase sea una opción de decorador. 
*/
public abstract class IBeverage {
    String description;

    public String getDescription() {
        return description;
    }
    
    public abstract double getCost();

  
}
