/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import beveragePackage.IBeverage;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*DAOBillImpl
Esta clase se encarga de implementar los metodos necesarios definidos en DAOBill para trabajar en la base de datos conocidos como CRUD*/
public class DAOBillImpl implements DAOBill {

    private static Connection conexion;
    private static PreparedStatement sentencia_preparada;
    private static ResultSet resultado;

    @Override
    public void create(int orderId, String user, String client, String status, ArrayList<IBeverage> lista) {
        int cost = 0;
        String detail = "";
        try {
            conexion = DBConnection.Conectar();
            String consulta = "INSERT INTO facturas (OrderId, User, ClientName, Status, Detail, Cost) VALUES (?,?,?,?,?,?)";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setInt(1, orderId);
            sentencia_preparada.setString(2, user);
            sentencia_preparada.setString(3, client);
            sentencia_preparada.setString(4, status);
            for (int i = 0; i < lista.size(); i++) {
                detail = detail + lista.get(i).getDescription() + "\n";
                cost += lista.get(i).getCost();
            }
            sentencia_preparada.setString(5, detail);
            sentencia_preparada.setInt(6, cost);
            int i = sentencia_preparada.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Datos guardados");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar los datos");
            }
            conexion.close();

        } catch (HeadlessException | SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOBillImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
