/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*DAOUserImpl
Esta clase se encarga de implementar los metodos necesarios definidos en DAOUser para trabajar en la base de datos conocidos como CRUD*/
public class DAOUserImpl implements DAOUser {

    private static Connection conexion;
    private static PreparedStatement sentencia_preparada;
    private static ResultSet resultado;

    @Override
    public String read(String user, String pass) {
        String mensaje = null;
        try {
            conexion = DBConnection.Conectar();
            String consulta = "SELECT Username, Password FROM usuarios WHERE Username = ? AND Password = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1, user);
            sentencia_preparada.setString(2, pass);
            resultado = sentencia_preparada.executeQuery();

            if (resultado.next()) {
                mensaje = "Usuario encontrado";
            } else {
                mensaje = "Usuario no encontrado";
            }

            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOUserImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }
}
