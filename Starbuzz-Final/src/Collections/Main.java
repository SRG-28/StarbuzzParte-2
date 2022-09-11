/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;
import Controller.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 * @author Sofía Rubie García 117520883
 * @author Donald Cordoba Campos 304950089
 * @author Kyara Ávalos Escobar 402340732
 * @author Ali Pitti Gózalez 402450140
 */

/*Control
//En este paquete se encuentra la  clase encargada de brindar al usuario la posibilidad de ingresar datos, así
como la funcionalidad de brindar los por medio de la interacción existente entre el paquete modelo
y este con el paquete vista que brindan la información, fungiendo este paquete y clase como el back end de la aplicación.*/
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Starbuzz buzz=new Starbuzz();
       buzz.startApplication();   
    }
}
