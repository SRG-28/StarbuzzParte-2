/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import java.util.ArrayList;
import beveragePackage.*;
import Controller.Starbuzz;

/**
 *
 * @author Sofía Rubie García 117520883
 * @author Donald Cordoba Campos 304950089
 * @author Kyara Ávalos Escobar 402340732
 * @author Ali Pitti Gózalez 402450140
 *
 */

/*BeverageJFrame
Está clase see encarga de mostrarle al usuario la ventana en donde solicita el nombre del usuario,
también muestra las bebidas de los decoradores de las bebidas base, 
también muestra las posibles bebidas extra y la selección del Whipped Cream o no del mismo, en caso que el usuario no lo desee */
public class BeverageView extends javax.swing.JFrame {

    IBeverage beverage;
    IExtras extra;
    int orderId;
    ArrayList<IBeverage> beverageList;
    public Starbuzz buzz;
    InvoiceView commercial;
    /**
     * Creates new form BeverageView
     */
    ImagenFondo3 fondoBeve = new ImagenFondo3();

    public BeverageView() {
        this.setContentPane(fondoBeve);
        initComponents();
        this.setExtendedState(6);
        BeverageList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setLocationRelativeTo(null);
        beverageList = new ArrayList<>();
        buzz = new Starbuzz();
        commercial = new InvoiceView();
        clear();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back3 = new javax.swing.JButton();
        Back4 = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        LookButton = new javax.swing.JButton();
        BillButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BeverageList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ExtrasList = new javax.swing.JList<>();
        BaseLabel = new javax.swing.JLabel();
        ExtrasLabel = new javax.swing.JLabel();
        SelectionLabel = new javax.swing.JLabel();
        RemoveTextField = new javax.swing.JTextField();
        RemoveLabel = new javax.swing.JLabel();
        ClientLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        InfoTextArea = new javax.swing.JTextArea();

        Back3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Look.PNG"))); // NOI18N
        Back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back3ActionPerformed(evt);
            }
        });

        Back4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Look.PNG"))); // NOI18N
        Back4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Add.PNG"))); // NOI18N
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Back.PNG"))); // NOI18N
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        LookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Look.PNG"))); // NOI18N
        LookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LookButtonActionPerformed(evt);
            }
        });

        BillButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Invoice.PNG"))); // NOI18N
        BillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillButtonActionPerformed(evt);
            }
        });

        RemoveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Remove.PNG"))); // NOI18N
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        BeverageList.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        BeverageList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "House Blend", "Dark Roast", "Decaf", "Espresso" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(BeverageList);

        ExtrasList.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ExtrasList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Caramel", "Mocha", "Soy", "Steamed Milk", "Whipped Cream" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ExtrasList);

        BaseLabel.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        BaseLabel.setForeground(new java.awt.Color(70, 47, 4));
        BaseLabel.setText("Base Drink");

        ExtrasLabel.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ExtrasLabel.setForeground(new java.awt.Color(70, 47, 4));
        ExtrasLabel.setText("Extras");

        SelectionLabel.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        SelectionLabel.setText("For multiple selection ctrl+click");

        RemoveLabel.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        RemoveLabel.setForeground(new java.awt.Color(70, 47, 4));
        RemoveLabel.setText("Remove Drink(Index)");

        ClientLabel.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ClientLabel.setForeground(new java.awt.Color(70, 47, 4));
        ClientLabel.setText("Client Name");

        InfoTextArea.setColumns(20);
        InfoTextArea.setRows(5);
        jScrollPane3.setViewportView(InfoTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SelectionLabel)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RemoveTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RemoveLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BaseLabel)
                                    .addComponent(ClientLabel)
                                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ExtrasLabel))))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(272, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BaseLabel)
                    .addComponent(ExtrasLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SelectionLabel)
                        .addGap(67, 67, 67)
                        .addComponent(ClientLabel)
                        .addGap(18, 18, 18)
                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RemoveLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RemoveTextField)
                                .addGap(18, 18, 18)
                                .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(497, 497, 497))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public final void clear() {
        ExtrasList.clearSelection();
        BeverageList.clearSelection();
        NameTextField.setText("");
        beverageList.clear();
        buzz.getList().clear();
    }

    private void LookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LookButtonActionPerformed
        // TODO add your handling code here:
        InfoTextArea.setText("");
        for (int i = 0; i < beverageList.size(); i++) {
            InfoTextArea.append("Index:" + i + "\nDescription: " + beverageList.get(i).getDescription() + "\nCost: " + beverageList.get(i).getCost() + "\n");
        }
    }//GEN-LAST:event_LookButtonActionPerformed

    private void Back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Back3ActionPerformed

    private void Back4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Back4ActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        // TODO add your handling code here:
        int indx = Integer.parseInt(RemoveTextField.getText());
        beverageList.remove(indx);
        buzz.removeIndex(indx);
        RemoveTextField.setText("");
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        clear();
        InicioView venD = new InicioView();
        venD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        int opc = 0;
        if (BeverageList.isSelectionEmpty()) {
            beverage = null;
        }
        if (BeverageList.isSelectedIndex(0)) {
            beverage = new HouseBlend();
        }
        if (BeverageList.isSelectedIndex(1)) {
            beverage = new DarkRoast();
        }
        if (BeverageList.isSelectedIndex(2)) {
            beverage = new Decaf();
        }
        if (BeverageList.isSelectedIndex(3)) {
            beverage = new Espresso();
        }

        if (ExtrasList.isSelectionEmpty()) {
            beverage = null;
        }
        if (ExtrasList.isSelectedIndex(0)) {
            beverage = new Caramel(beverage);
        }
        if (ExtrasList.isSelectedIndex(1)) {
            beverage = new Mocha(beverage);

        }
        if (ExtrasList.isSelectedIndex(2)) {
            beverage = new Soy(beverage);
        }
        if (ExtrasList.isSelectedIndex(3)) {
            beverage = new SteamedMilk(beverage);
        }
        if (ExtrasList.isSelectedIndex(4)) {
            beverage = new WhippedCream(beverage);
        }

        buzz.agregarBebida(this.beverage);

        if (beverageList.add(this.beverage)) {
            System.out.println("Drink added correctly... ");
        } else {
            System.out.println("Could not add the drink... ");
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void BillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillButtonActionPerformed
        // TODO add your handling code here:
        buzz.agregarFactura(NameTextField.getText(), "Pendiente");
        setVisible(false);
        commercial.setVisible(true);
    }//GEN-LAST:event_BillButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BeverageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BeverageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BeverageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BeverageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BeverageView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton Back3;
    private javax.swing.JButton Back4;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BaseLabel;
    private javax.swing.JList<String> BeverageList;
    private javax.swing.JButton BillButton;
    private javax.swing.JLabel ClientLabel;
    private javax.swing.JLabel ExtrasLabel;
    private javax.swing.JList<String> ExtrasList;
    private javax.swing.JTextArea InfoTextArea;
    private javax.swing.JButton LookButton;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JLabel RemoveLabel;
    private javax.swing.JTextField RemoveTextField;
    private javax.swing.JLabel SelectionLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}

class ImagenFondo3 extends JPanel {

    //Atributos
    private Image imagen;

    //Metodos
    @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource("/Imagen/Beverage.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
