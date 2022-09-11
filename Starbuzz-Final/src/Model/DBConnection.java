/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sofía Rubie García 117520883
 * @author Donald Cordoba Campos 304950089
 * @author Kyara Ávalos Escobar 402340732
 * @author Ali Pitti Gózalez 402450140
 *
 */

/*DBConnection
Esta clase se encarga de crear la conexion a la base de datos mysql, esta se conecta al servidor LocalHost y despues a la base de datos llamada 
starbuzzdb*/
public class DBConnection {

    private static String URL = "jdbc:mysql://LocalHost/starbuzzdb";
    private static String Usuario = "root";
    private static String Contrasena = "root";

    public static Connection Conectar() {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, Usuario, Contrasena);
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);
        }

        return conexion;
    }

}
