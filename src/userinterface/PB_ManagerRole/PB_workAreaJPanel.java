/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PB_ManagerRole;

import Business.OrderSystem.OrderDirectory;
import Business.OrderSystem.OrderItem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.table.JTableHeader;
/**
 *
 * @author admin
 */
public class PB_workAreaJPanel extends javax.swing.JPanel {

    private JPanel container;
    private UserAccount user;
    //private OrderDirectory orderDirectory;
    public PB_workAreaJPanel( JPanel container, UserAccount user) {
        initComponents();
        this.container=container;
        this.user=user;
        labelUser.setText(user.getUsername());
        labelRole.setText(user.getEmployee().getEnterprise().getEnterpriseName()+" "+user.getEmployee().getOrganization().getOrgtypename());
//        JTableHeader head = tblQueue.getTableHeader(); // 创建表格标题对象
//        head.setPreferredSize(new Dimension(head.getWidth(), 36));// 设置表头大小
//        head.setFont(new Font("楷体", Font.PLAIN, 36));// 设置表格字体
//        JTableHeader head1 = tblOrderItem.getTableHeader(); // 创建表格标题对象
//        head1.setPreferredSize(new Dimension(head1.getWidth(), 36));// 设置表头大小
//        head1.setFont(new Font("楷体", Font.PLAIN, 36));// 设置表格字体

//user.getEmployee().getOrganization().getWorkQueue().g
        populate();
    }
    
    public void populate(){
        DefaultTableModel dtm=(DefaultTableModel)tblQueue.getModel();
        dtm.setRowCount(0);
        for(WorkRequest wr:user.getEmployee().getOrganization().getWorkQueue().getWorkRequestList()){
            if(wr.getStatus().equals("Uncompleted")){
                Object[] row=new Object[6];
                row[0]=wr.getRequestDate().toString();
                if(wr.getSenderEnterprise()!=null){
                    row[1]=wr.getSenderEnterprise().getEnterpriseName();
                    row[2]=wr.getSenderEnterprise().getPhone();               
                }else{
                    row[1]=wr.getSenderUserAccount().getUsername();
                    row[2]=wr.getSenderUserAccount().getPhone();
                }           
                row[3]=wr.getStatus();
                row[4]=wr.getMessage();
                row[5]=wr;
                dtm.addRow(row);
            }            
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
        labelUser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQueue = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderItem = new javax.swing.JTable();
        btnOrder = new javax.swing.JButton();
        labelRole = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnUnfinished = new javax.swing.JButton();
        btnAll = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Welcome! ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        labelUser.setText("labelUser");
        add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 150, 20));

        tblQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestDate", "Sender", "phone", "Status", "Message", "Order ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblQueue);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 880, 160));

        btnDetails.setText("Detials");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });
        add(btnDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        tblOrderItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookName", "Quantity", "Per Price", "Total Price"
            }
        ));
        jScrollPane2.setViewportView(tblOrderItem);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 880, 160));

        btnOrder.setText("New Order to PT");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, -1, -1));

        labelRole.setText("jLabel2");
        add(labelRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 170, 20));

        jLabel2.setText("Work Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        btnUnfinished.setText("Unfinished");
        btnUnfinished.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnfinishedActionPerformed(evt);
            }
        });
        add(btnUnfinished, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        btnAll.setText("All");
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });
        add(btnAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        int row=tblQueue.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a work reuqest", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            WorkRequest wr=(WorkRequest)tblQueue.getValueAt(row, 5);
            DefaultTableModel dtm=(DefaultTableModel)tblOrderItem.getModel();
            dtm.setRowCount(0);
            for(OrderItem oi:wr.getOrder().getOrderItems()){
                Object[] r=new Object[4];
                r[0]=oi;
                r[1]=oi.getQuantity()+"";
                r[2]=oi.getPrice()+"";
                BigDecimal quantity=new BigDecimal(Double.toString(oi.getQuantity()));
                BigDecimal price=new BigDecimal(Double.toString(oi.getPrice()));
                r[3]=price.multiply(quantity).intValue()+"";
                dtm.addRow(r);
            }
        }
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        int row=tblQueue.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a work reuqest", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            WorkRequest wr=(WorkRequest)tblQueue.getValueAt(row, 5);
            PB_newRequestJPanel jp=new PB_newRequestJPanel(container,wr,user);
            CardLayout l=(CardLayout)container.getLayout();
            container.add(jp);
            l.next(container);
        }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnUnfinishedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnfinishedActionPerformed
        populate();
    }//GEN-LAST:event_btnUnfinishedActionPerformed

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)tblQueue.getModel();
        dtm.setRowCount(0);
        for(WorkRequest wr:user.getEmployee().getOrganization().getWorkQueue().getWorkRequestList()){
            Object[] row=new Object[6];
            row[0]=wr.getRequestDate().toString();
            if(wr.getReceiverEnterprise()!=null){
                row[1]=wr.getReceiverEnterprise().getEnterpriseName();
                row[2]=wr.getReceiverEnterprise().getPhone();               
            }else{
                row[1]=wr.getReceiverUserAccount().getUsername();
                row[2]=wr.getReceiverUserAccount().getPhone();
            }           
            row[3]=wr.getStatus();
            row[4]=wr.getMessage();
            row[5]=wr;
            dtm.addRow(row);
        }
    }//GEN-LAST:event_btnAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAll;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnUnfinished;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelRole;
    private javax.swing.JLabel labelUser;
    private javax.swing.JTable tblOrderItem;
    private javax.swing.JTable tblQueue;
    // End of variables declaration//GEN-END:variables
}