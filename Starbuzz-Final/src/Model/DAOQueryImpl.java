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
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*DAOQueryImpl
Esta clase se encarga de implementar los metodos necesarios definidos en DAOQuery para trabajar en la base de datos conocidos como CRUD*/
public class DAOQueryImpl implements DAOQuery {

    private static Connection conexion;
    private static PreparedStatement sentencia_preparada;
    private static ResultSet resultado;

    @Override
    public void readPendings(JTextArea text) {
        try {
            conexion = DBConnection.Conectar();
            String consulta = "SELECT * FROM facturas WHERE Status = 'Pendiente'";
            sentencia_preparada = conexion.prepareStatement(consulta);
            resultado = sentencia_preparada.executeQuery();
            while (resultado.next()) {

                text.append("Order ID: " + resultado.getString(1) + "\n");
                text.append("User Name: " + resultado.getString(2) + "\n");
                text.append("Client Name: " + resultado.getString(3) + "\n");
                text.append("Status: " + resultado.getString(4) + "\n");
                text.append("Detail: \n" + resultado.getString(5));
                text.append("Cost: " + resultado.getString(6) + "\n");
                text.append("\n");
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOQueryImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void readProcessed(JTextArea text) {
        try {
            conexion = DBConnection.Conectar();
            String consulta = "SELECT * FROM facturas WHERE Status = 'Finalizado'";
            sentencia_preparada = conexion.prepareStatement(consulta);
            resultado = sentencia_preparada.executeQuery();
            while (resultado.next()) {

                text.append("Order ID: " + resultado.getString(1) + "\n");
                text.append("User Name: " + resultado.getString(2) + "\n");
                text.append("Client Name: " + resultado.getString(3) + "\n");
                text.append("Status: " + resultado.getString(4) + "\n");
                text.append("Detail: \n" + resultado.getString(5));
                text.append("Cost: " + resultado.getString(6) + "\n");
                text.append("\n");
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOQueryImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void read(String id, JTextArea text) {
        try {
            conexion = DBConnection.Conectar();
            String consulta = "SELECT * FROM facturas WHERE OrderId = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1, id);
            resultado = sentencia_preparada.executeQuery();

            while (resultado.next()) {
                text.append("Order ID: " + resultado.getString(1) + "\n");
                text.append("User Name: " + resultado.getString(2) + "\n");
                text.append("Client Name: " + resultado.getString(3) + "\n");
                text.append("Status: " + resultado.getString(4) + "\n");
                text.append("Detail: \n" + resultado.getString(5));
                text.append("Cost: " + resultado.getString(6) + "\n");
                text.append("\n");
            }

            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOQueryImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void update(String id) {
        try {
            conexion = DBConnection.Conectar();
            String consulta = "UPDATE facturas SET Status = ? WHERE OrderId = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1, "Finalizado");
            sentencia_preparada.setString(2, id);
            int i = sentencia_preparada.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Status has changed");
            } else {
                JOptionPane.showMessageDialog(null, "Status cannot be changed");
            }

            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOQueryImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
