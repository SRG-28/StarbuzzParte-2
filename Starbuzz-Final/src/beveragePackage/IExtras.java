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
Para el segundo Decorador tenemos a la Clase interfaz IExtra
Caramelo
Se extiende de la interface IExtra
Por lo tanto implementa sobreescribe el get cost 500 colones que contiene dicha interfaz, también posee su propio constructor en donde su descripción es “ Caramelo” para que cada clase sea una opción de decorador. 
*/
public abstract class IExtras extends IBeverage {
    @Override
    public abstract String getDescription();
    
    
   
}
