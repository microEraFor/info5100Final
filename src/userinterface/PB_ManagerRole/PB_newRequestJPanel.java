/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PB_ManagerRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.PrinterEnterprise;
import Business.OrderSystem.OrderItem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Deli_ManRole.DeliMan_workAreaJpanel;

/**
 *
 * @author admin
 */
public class PB_newRequestJPanel extends javax.swing.JPanel {

    private JPanel container;
    private WorkRequest wr;
    private UserAccount ua;
    //EcoSystem system;
    public PB_newRequestJPanel(JPanel container,WorkRequest wr,UserAccount ua) {
        initComponents();
        this.container=container;
        this.wr=wr;
        this.ua=ua;
        populate();
        for(Enterprise pe:ua.getEmployee().getEnterprise().getNetwork().getEnterpriseDirectory().getEnterpriseList()){
            if(pe.getEnterpriseType().equals("Type-Printer") && pe.getNetwork().getNetworkID()==ua.getEmployee().getEnterprise().getNetwork().getNetworkID()){ 
                comboPrint.addItem(pe.toString());
            }
        }
    }
    
    public void populate(){
        DefaultTableModel dtm=(DefaultTableModel)tblOrderItem.getModel();
        dtm.setRowCount(0);
        for(OrderItem oi:wr.getOrder().getOrderItems()){
            Object[] row=new Object[4];
            row[0]=oi;
            row[1]=oi.getQuantity()+"";
            row[2]=oi.getPrice()+"";
            BigDecimal quantity=new BigDecimal(Double.toString(oi.getQuantity()));
            BigDecimal price=new BigDecimal(Double.toString(oi.getPrice()));
            row[3]=price.multiply(quantity).intValue()+"";
            dtm.addRow(row);
        }
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
        javax.swing.JButton btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderItem = new javax.swing.JTable();
        btnQuantity = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboPrint = new javax.swing.JComboBox<>();
        btnCommit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("New Request To Print Plant");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        tblOrderItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookName", "Quantity", "Per Price", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(tblOrderItem);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 530, 140));

        btnQuantity.setText("Change Quantity To:");
        btnQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuantityActionPerformed(evt);
            }
        });
        add(btnQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 50, 30));

        jLabel2.setText("Choose a Print Plant:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        add(comboPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        btnCommit.setText("Commit");
        btnCommit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommitActionPerformed(evt);
            }
        });
        add(btnCommit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        container.remove(this);
        Component[] coms=container.getComponents();
        Component c=(Component)coms[coms.length-1];
        PB_workAreaJPanel jp=(PB_workAreaJPanel)c;
        jp.populate();
        CardLayout l=(CardLayout)container.getLayout();
        l.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuantityActionPerformed
        int row=tblOrderItem.getSelectedRow();
        int quan=Integer.parseInt(txtQuantity.getText());
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        }else if(quan<=0){
            JOptionPane.showMessageDialog(null, "The Quantity can not be less than 1", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            OrderItem oi=(OrderItem)tblOrderItem.getValueAt(row, 0);
            for(OrderItem o:wr.getOrder().getOrderItems()){
                if(o.equals(oi)){
                    o.setQuantity(quan);
                }
            }
            populate();
        }
    }//GEN-LAST:event_btnQuantityActionPerformed

    private void btnCommitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommitActionPerformed
        String printer=(String)comboPrint.getSelectedItem();
        Enterprise selectedPrint=null;
        for(Enterprise e:ua.getEmployee().getEnterprise().getNetwork().getEnterpriseDirectory().getEnterpriseList()){
            if(e.getEnterpriseName().equals(printer)){
                selectedPrint=e;
            }
        }
        if(selectedPrint!=null){
            for(Enterprise e:ua.getEmployee().getEnterprise().getNetwork().getEnterpriseDirectory().getEnterpriseList()){
                if(e.equals(selectedPrint)){
                    for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                        if(o.getOrgtypename().equals("PT_ManagementOrganization")){
                            WorkRequest newReq=new WorkRequest();
                            newReq.setOrder(wr.getOrder());
                            newReq.setSenderEnterprise(ua.getEmployee().getEnterprise());
                            newReq.setStatus("Uncompleted");
                            newReq.setReceiverEnterprise(e);
                            
                            //message
                            int check=JOptionPane.YES_NO_OPTION;
                            String mesg = JOptionPane.showInputDialog(null,"Message: \n","Mesg",check);        
                            if(check==JOptionPane.YES_OPTION){
                                newReq.setMessage(mesg);
                                JOptionPane.showMessageDialog(null, "A new work request has been sent out successfully.");
                                wr.setStatus("Completed");
                            }
                            o.getWorkQueue().addNewRequest(newReq);
                        }
                    }
                }           
            }            
        }
        
        txtQuantity.setEnabled(false);
        btnQuantity.setEnabled(false);
        btnDelete.setEnabled(false);
        comboPrint.setEnabled(false);
    }//GEN-LAST:event_btnCommitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row=tblOrderItem.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            int dialogBtn=JOptionPane.YES_NO_OPTION;
            int dialogRes=JOptionPane.showConfirmDialog(null, "Would you like to delete this one?","Warning",dialogBtn);
            if(dialogRes==JOptionPane.YES_OPTION){
                OrderItem oi=(OrderItem)tblOrderItem.getValueAt(row, 0);
                wr.getOrder().deleteOrderItem(oi);
                populate();
                JOptionPane.showMessageDialog(null, "Delete the order item successfully");       
            }          
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommit;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnQuantity;
    private javax.swing.JComboBox<String> comboPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrderItem;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}