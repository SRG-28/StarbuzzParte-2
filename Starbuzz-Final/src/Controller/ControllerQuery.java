/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAOQueryImpl;
import javax.swing.JTextArea;

/**
 *
 * @author Donald
 */
public class ControllerQuery {

    DAOQueryImpl query = new DAOQueryImpl();

    public void readPendings(JTextArea text) {
        query.readPendings(text);
    }
    
    public void readProcessed(JTextArea text) {
        query.readProcessed(text);
    }
    
    public void read(String id, JTextArea text) {
        query.read(id, text);
    }
    public void update(String id) {
        query.update(id);
    }
}
