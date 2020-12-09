/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BScustomerLogin;

import Business.Enterprise.BookstoreEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.OrderSystem.Book;
import Business.OrderSystem.Order;
import Business.OrderSystem.OrderItem;
import Business.Organization.BS_BookManagementOrganization;
import Business.Organization.BS_SecondHandOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static userinterface.MainJFrame.system;

/**
 *
 * @author wangcong
 */
public class CustomerSellingJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount customer;
    /**
     * Creates new form CustomerSellingJPanel
     */
    public CustomerSellingJPanel(JPanel container,UserAccount customer) {
        
        this.container = container;
        this.customer = customer;
        initComponents();
        txtCustomerAddress.setText(customer.getAddress());
        populateCombo();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboNetwork = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboBookStore = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCustomerAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtExpectedPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtComment = new javax.swing.JTextField();

        jLabel4.setText("jLabel4");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Seeling Your Book");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnOrder.setText("Order!");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        jLabel5.setText("Select your location:");

        comboNetwork.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboNetworkItemStateChanged(evt);
            }
        });

        jLabel3.setText("Select your wanted bookstore:");

        jLabel2.setText("Number of Second-hand book:");

        jLabel6.setText("Customer Address:");

        jLabel7.setText("Expected Price:");

        jLabel8.setText("Extra:");

        txtComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtExpectedPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCustomerAddress)
                                    .addComponent(txtNumber)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 53, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(comboBookStore, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnOrder)
                .addGap(239, 239, 239))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBookStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtExpectedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtComment, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrder)
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        container.remove(this);        
        CardLayout layout=(CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    public void populateCombo() {
        //populate the location option
        comboNetwork.removeAllItems();
        for (Network nt : system.getNetworkDirectory().getNetworkList()) {
            comboNetwork.addItem(nt);
        }

        //populate all boosktores
        comboBookStore.removeAllItems();
        Network network = (Network) comboNetwork.getSelectedItem();
        for (Enterprise en : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (en.getEnterpriseType().equals("Type-BookStore")) {
                comboBookStore.addItem((BookstoreEnterprise) en);
            }
        }
    }
    
    private void comboNetworkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboNetworkItemStateChanged
        //make two comboBox related
        comboBookStore.removeAllItems();
        Network network = (Network) comboNetwork.getSelectedItem();
        if (network == null) {
            return;
        }
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().equals("Type-BookStore")) {
                comboBookStore.addItem((BookstoreEnterprise) enterprise);
            }
        }
    }//GEN-LAST:event_comboNetworkItemStateChanged

    private void txtCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommentActionPerformed

    }//GEN-LAST:event_txtCommentActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        Network network = (Network)comboNetwork.getSelectedItem();
        BookstoreEnterprise bookstore = (BookstoreEnterprise)comboBookStore.getSelectedItem();
        int number = Integer.parseInt(txtNumber.getText());
        String address = customer.getAddress();
        String expectedPrice = txtExpectedPrice.getText();
        String FinalPrice = null;
        String extraInfo = txtComment.getText();
        
        /*new order*/
        Order order = new Order();
        order.setUserAccount(customer);
        order.setExpectedPrice(expectedPrice);
        order.setFinalPrice(FinalPrice);
        order.setSellingNumber(number);
        order.setStatus("prepared");
        /*方便user更改地址*/
        order.setAddress(address);
        order.setComments(extraInfo);
        
        /*new workRequest to customer*/
        customer.getUserorderlist().add(order);
        WorkRequest workRequest = new WorkRequest();
        workRequest.setOrder(order);
        workRequest.setSenderUserAccount(customer);
        workRequest.setReceiverEnterprise(bookstore);
        workRequest.setStatus("Uncompleted");
        workRequest.setMessage(txtComment.getText());
        customer.getWorkQueue().addNewCusToSHBSRequest(workRequest);
        
        
        /*add the workrequest to the BS_SecondHandOrganization*/
        ArrayList<Organization> bookManageList = bookstore.getOrganizationDirectory().getOrganizationList();
        if(bookManageList == null){
            JOptionPane.showMessageDialog(null,"The book does not have second-hand service!");
            return;
        }
        BS_SecondHandOrganization bookstoreOrg=null;
        for (Organization org : bookManageList) {
            if (org.getOrgtypename().equals("BS_SecondHandOrganization")) {
                bookstoreOrg = (BS_SecondHandOrganization) org;
                bookstoreOrg.getWorkQueue().addNewCusToSHBSRequest(workRequest);
                JOptionPane.showMessageDialog(null, "The Order Has been sent to the bookstore. The bookstore will reply you in 7 days");
        
            }
        }
        if(bookstoreOrg==null){
            JOptionPane.showMessageDialog(null,"The book does not have second-hand service!");
        }
        
        
    }//GEN-LAST:event_btnOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOrder;
    private javax.swing.JComboBox<BookstoreEnterprise> comboBookStore;
    private javax.swing.JComboBox<Network> comboNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtExpectedPrice;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}