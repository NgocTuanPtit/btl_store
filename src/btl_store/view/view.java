/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_store.view;

import btl_store.controller.RmiControllerClient;
import btl_store.mapper.CustomerMapper;
import btl_store.mapper.ItemMapper;
import btl_store.model.Customer;
import btl_store.model.Item;
import btl_store.ultils.Ultils;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tony-Tuan
 */
public class view extends javax.swing.JFrame {

    private DefaultTableModel tableCustomer;
    private DefaultTableModel tableItem;
    private List<Customer> listsCustomer;
    private List<Item> listsItem;
    private Customer customerChoosed;
    private Item itemChoosed;

    public view() {
        initComponents();
        tableCustomer = (DefaultTableModel) tbl_kh.getModel();
        tableItem = (DefaultTableModel) tbl_item.getModel();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name_kh = new javax.swing.JTextField();
        addr_kh = new javax.swing.JTextField();
        phone_kh = new javax.swing.JTextField();
        add_kh = new javax.swing.JButton();
        edit_kh = new javax.swing.JButton();
        delete_kh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_kh = new javax.swing.JTable();
        birth_kh = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        name_sp = new javax.swing.JTextField();
        type_sp = new javax.swing.JTextField();
        cost_sp = new javax.swing.JTextField();
        status_sp = new javax.swing.JComboBox();
        add_sp = new javax.swing.JButton();
        update_sp = new javax.swing.JButton();
        delete_sp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_item = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("tên KH");

        jLabel3.setText("địa chỉ");

        jLabel4.setText("ngày sinh");

        jLabel5.setText("số điện thoại");

        add_kh.setText("thêm mới");
        add_kh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_khActionPerformed(evt);
            }
        });

        edit_kh.setText("sửa");
        edit_kh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_khActionPerformed(evt);
            }
        });

        delete_kh.setText("xóa");
        delete_kh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_khActionPerformed(evt);
            }
        });

        tbl_kh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "mã kh", "tên KH", "địa chỉ", "ngày sinh", "số điện thoại"
            }
        ));
        tbl_kh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_khMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_kh);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(name_kh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addr_kh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(phone_kh, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(birth_kh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_kh)
                    .addComponent(edit_kh)
                    .addComponent(delete_kh))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addr_kh, name_kh, phone_kh});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add_kh, delete_kh, edit_kh});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name_kh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(addr_kh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(birth_kh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(add_kh)
                        .addGap(18, 18, 18)
                        .addComponent(edit_kh)
                        .addGap(18, 18, 18)
                        .addComponent(delete_kh)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phone_kh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Customer", jPanel1);

        jLabel6.setText("tên SP");

        jLabel7.setText("loại SP");

        jLabel9.setText("tình trạng");

        jLabel10.setText("giá SP");

        name_sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_spActionPerformed(evt);
            }
        });

        status_sp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cũ", "mới" }));

        add_sp.setText("thêm mới");
        add_sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_spActionPerformed(evt);
            }
        });

        update_sp.setText("sửa");
        update_sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_spActionPerformed(evt);
            }
        });

        delete_sp.setText("xóa");
        delete_sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_spActionPerformed(evt);
            }
        });

        tbl_item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "mã sp", "tên sp", "loại sp", "tình trạng", "giá"
            }
        ));
        tbl_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_itemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_item);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(88, 88, 88))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name_sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(type_sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(88, 88, 88)
                                .addComponent(status_sp, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(88, 88, 88)
                                .addComponent(cost_sp, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_sp)
                            .addComponent(update_sp)
                            .addComponent(delete_sp))))
                .addGap(116, 136, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel6, jLabel7, jLabel9});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cost_sp, name_sp, type_sp});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add_sp, delete_sp, update_sp});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(name_sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(type_sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(status_sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cost_sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(add_sp)
                        .addGap(27, 27, 27)
                        .addComponent(update_sp)
                        .addGap(27, 27, 27)
                        .addComponent(delete_sp)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Item", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_khActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_khActionPerformed
        try {
            String name = name_kh.getText();
            String addr = addr_kh.getText();
            String phone = phone_kh.getText();
            Date birth = birth_kh.getDate();
            Timestamp timestamp = new Timestamp(birth.getTime());
            long num = RmiControllerClient.getServiceRMI().addCustomer(name, addr, phone, timestamp);
            String sql = "SELECT * FROM customer WHERE id=?";
            List<Customer> listResult = Ultils.query(sql, new CustomerMapper(), num);
            tableCustomer.addRow(listResult.get(0).toObject());
            loadCustomer();
            JOptionPane.showMessageDialog(this, "thêm mới dữ liệu thành công");
        } catch (NotBoundException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_add_khActionPerformed

    private void edit_khActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_khActionPerformed
        try {
            if (customerChoosed == null) {
                JOptionPane.showMessageDialog(this, "chọn thông tin khách hàng muốn sửa");
            } else {
                String name = name_kh.getText();
                String addr = addr_kh.getText();
                String phone = phone_kh.getText();
                Date birth = birth_kh.getDate();
                Timestamp timestamp = new Timestamp(birth.getTime());
                RmiControllerClient.getServiceRMI().updateCustomer(name, addr, phone, timestamp, customerChoosed.getMaKH());
                listsCustomer.clear();
                tableCustomer.setNumRows(0);
                loadCustomer();
                JOptionPane.showMessageDialog(this, "update dữ liệu thành công");
                customerChoosed = null;
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_edit_khActionPerformed

    private void tbl_khMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_khMouseClicked
        int num = tbl_kh.getSelectedRow();
        customerChoosed = listsCustomer.get(num);
        name_kh.setText(customerChoosed.getTenKH());
        addr_kh.setText(customerChoosed.getAddr());
        phone_kh.setText(customerChoosed.getPhone());
    }//GEN-LAST:event_tbl_khMouseClicked

    private void delete_khActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_khActionPerformed
        try {
            if (customerChoosed == null) {
                JOptionPane.showMessageDialog(this, "chọn khách hàng muốn xóa");
            } else {
                RmiControllerClient.getServiceRMI().deleteCustomer(customerChoosed.getMaKH());
                listsCustomer.clear();
                tableCustomer.setNumRows(0);
                loadCustomer();
                JOptionPane.showMessageDialog(this, "xóa thành công");
                customerChoosed = null;
            }

        } catch (RemoteException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delete_khActionPerformed

    private void add_spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_spActionPerformed
        try {
            String name = name_sp.getText();
            String tpye = type_sp.getText();
            String status = status_sp.getSelectedItem().toString();
            long cost = Long.parseLong(cost_sp.getText());
            long numID = RmiControllerClient.getServiceRMI().addItem(name, tpye, status, cost);
            String sql = "SELECT * FROM item WHERE id=?";
            List<Item> lists = Ultils.query(sql, new ItemMapper(), numID);
            tableItem.addRow(lists.get(0).toObject());
            loadItem();
            JOptionPane.showMessageDialog(this, "thêm sản phẩm thành công");
            customerChoosed = null;
        } catch (NotBoundException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_spActionPerformed

    private void name_spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_spActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_spActionPerformed

    private void tbl_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_itemMouseClicked
        int num = tbl_item.getSelectedRow();
        itemChoosed = listsItem.get(num);
        name_sp.setText(itemChoosed.getTenSP());
        type_sp.setText(itemChoosed.getLoaiSP());
        cost_sp.setText(itemChoosed.getGia() + "");
    }//GEN-LAST:event_tbl_itemMouseClicked

    private void update_spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_spActionPerformed
        try {
            if (itemChoosed == null) {
                JOptionPane.showMessageDialog(this, "chọn sản phẩm cần sửa");
            } else {
                String name = name_sp.getText();
                String tpye = type_sp.getText();
                String status = status_sp.getSelectedItem().toString();
                long cost = Long.parseLong(cost_sp.getText());
                long num = RmiControllerClient.getServiceRMI().updateItem(name, tpye, status, cost, itemChoosed.getMaSP());
                if (num == 1) {
                    tableItem.setNumRows(0);
                    loadItem();
                    JOptionPane.showMessageDialog(this, "update sản phẩm thành công");
                    itemChoosed = null;
                }
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_spActionPerformed

    private void delete_spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_spActionPerformed
        try {
            if (itemChoosed == null) {
                JOptionPane.showMessageDialog(this, "chọn sản phẩm để xóa");
            } else {
                int num = RmiControllerClient.getServiceRMI().deleteItem(itemChoosed.getMaSP());
                if (num == 1) {
                    tableItem.setNumRows(0);
                    loadItem();
                    JOptionPane.showMessageDialog(this, "delete sản phẩm thành công");
                    itemChoosed = null;
                }
            }
        } catch (RemoteException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delete_spActionPerformed

    public void loadData() {
        loadCustomer();
        loadItem();
    }

    public void loadCustomer() {
        tableCustomer.setNumRows(0);
        String sql = "SELECT * FROM customer";
        listsCustomer = Ultils.query(sql, new CustomerMapper());
        for (Customer i : listsCustomer) {
            tableCustomer.addRow(i.toObject());
        }
    }

    public void loadItem() {
        tableItem.setNumRows(0);
        String sql = "SELECT * FROM item";
        listsItem = Ultils.query(sql, new ItemMapper());
        for (Item i : listsItem) {
            tableItem.addRow(i.toObject());
        }
    }

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_kh;
    private javax.swing.JButton add_sp;
    private javax.swing.JTextField addr_kh;
    private com.toedter.calendar.JDateChooser birth_kh;
    private javax.swing.JTextField cost_sp;
    private javax.swing.JButton delete_kh;
    private javax.swing.JButton delete_sp;
    private javax.swing.JButton edit_kh;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField name_kh;
    private javax.swing.JTextField name_sp;
    private javax.swing.JTextField phone_kh;
    private javax.swing.JComboBox status_sp;
    private javax.swing.JTable tbl_item;
    private javax.swing.JTable tbl_kh;
    private javax.swing.JTextField type_sp;
    private javax.swing.JButton update_sp;
    // End of variables declaration//GEN-END:variables
}
