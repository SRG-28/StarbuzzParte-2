/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JTextArea;

/*DAOQuery
Esta clase se encarga de darle los metodos necesarios a la clase DAOQueryImpl para trabajar en la base de datos conocidos como CRUD*/
public interface DAOQuery {
    public void read(String id, JTextArea text);
    public void update(String id);
    public void readPendings(JTextArea text);
    public void readProcessed(JTextArea text);
}
