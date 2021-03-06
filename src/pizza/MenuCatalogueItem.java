/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author stefa
 */
public class MenuCatalogueItem extends javax.swing.JPanel {

    private double mPrice;
    private String mProductName;
    private String mProductType;

    /**
     * Creates new form MenuItem
     *
     * @param price
     * @param productName
     * @param productType
     */
    public MenuCatalogueItem(double price, String productName, String productType, ActionListener listener) {
        initComponents();

        mPrice = price;
        mProductName = productName;
        mProductType = productType;
        
        priceButton.setText(String.valueOf(price) + "€");
        priceButton.addActionListener(listener);
        productLabel.setText(productName);

//        System.out.println(productType);

        switch (productType.trim()) {
            case "pizza":
                setBackground(Color.yellow);
                break;
            case "salad":
                setBackground(Color.green);
                break;
            default:
                setBackground(Color.red);
                break;
        }

    }
    
    
    public double getPrice() {
        return mPrice;
    }

    public String getProductName() {
        return mProductName;
    }

    public String getProductType() {
        return mProductType;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        priceButton = new javax.swing.JButton();
        productLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(200, 70));
        setMinimumSize(new java.awt.Dimension(200, 70));

        priceButton.setText("25.20€");
        priceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceButtonActionPerformed(evt);
            }
        });

        productLabel.setText("---");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(productLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(priceButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceButton))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void priceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceButtonActionPerformed

//    Object[] row = {productType};
//    DefaultTableModel model = (DefaultTableModel) cart.getModel();
//    model.addRow(row);
    }//GEN-LAST:event_priceButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton priceButton;
    private javax.swing.JLabel productLabel;
    // End of variables declaration//GEN-END:variables
}
