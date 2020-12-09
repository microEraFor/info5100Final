/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BookStoreManagement;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 *
 * @author wangcong
 */
public class BSManagerMngJPanel extends javax.swing.JPanel {
    private JPanel container;
    //private EcoSystem system;
    private UserAccount bookStoreManager;
    /**
     * Creates new form BSManagerMngJPanel
     */
    public BSManagerMngJPanel(JPanel container,UserAccount bookStoreManager) {
        initComponents();
        this.container = container;
        this.bookStoreManager = bookStoreManager;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnViewOrders = new javax.swing.JButton();
        btnManageBook = new javax.swing.JButton();
        btnViewPublisherOrders = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Welcome! Book Store Manager");

        btnViewOrders.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnViewOrders.setText("Manage Customer Orders");
        btnViewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrdersActionPerformed(evt);
            }
        });

        btnManageBook.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnManageBook.setText("Manage Books");
        btnManageBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageBookActionPerformed(evt);
            }
        });

        btnViewPublisherOrders.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnViewPublisherOrders.setText("Manage Publisher Orders");
        btnViewPublisherOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPublisherOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnViewOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewPublisherOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(130, 130, 130))))
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(btnManageBook)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(btnManageBook)
                .addGap(18, 18, 18)
                .addComponent(btnViewOrders)
                .addGap(18, 18, 18)
                .addComponent(btnViewPublisherOrders)
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageBookActionPerformed
        ManageBooksJPanel manageBooksJPanel = new ManageBooksJPanel(container,bookStoreManager);
        container.add("ManageBooksJPanel", manageBooksJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManageBookActionPerformed

    private void btnViewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrdersActionPerformed
        ManageOrdersJPanel manageOrdersJPanel = new ManageOrdersJPanel(container,bookStoreManager);
        container.add("ManageOrdersJPanel", manageOrdersJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnViewOrdersActionPerformed

    private void btnViewPublisherOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPublisherOrdersActionPerformed
        List<WorkRequest> requestList = bookStoreManager.getWorkQueue().getWorkRequestBSToPBList();

        ViewPublisherOrderJPanel viewPublisherOrderJPanel = new ViewPublisherOrderJPanel(container,bookStoreManager);
        container.add("ViewPublisherOrderJPanel", viewPublisherOrderJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnViewPublisherOrdersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageBook;
    private javax.swing.JButton btnViewOrders;
    private javax.swing.JButton btnViewPublisherOrders;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}