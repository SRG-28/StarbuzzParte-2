/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beveragePackage;

/**
 *
 * @author Sofía Rubie García 117520883
 * @author Donald Cordoba Campos 304950089
 * @author Kyara Ávalos Escobar 402340732
 * @author Ali Pitti Gózalez 402450140
 *  
 */

/*
//Beverage 
//DarkRoast
//Este paquete contiene la clase DarkRoast, en la que se trabaja el decorador de las bebidas principales de este decorador como lo son Decaf, Espresso y HouseBlend
En donde el Patrón de Diseño Decorador pertenece a los patrones estructurales, que permite adjuntar nuevos comportamientos a los objetos, en este caso el decorador base recibe el comportamiento de un bebida o combinación extra.
*/
public class DarkRoast extends IBeverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getCost() {
        return 900;
    }
}
