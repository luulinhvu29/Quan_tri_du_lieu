/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Quan_Ly_Thuc_An extends javax.swing.JFrame {
    
    DefaultTableModel tableModel;
    /**
     * Creates new form Quan_Ly_Quan_An
     */
    public Quan_Ly_Thuc_An() {
        initComponents();
        
        tableModel = (DefaultTableModel) jTable1.getModel();
        
        Connection conn = null;
        Statement stmt = null;
        List<food> food = new ArrayList<>();
        List<loai> loai = new ArrayList<>();
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection("jdbc:mysql://localhost/quantridulieu?"

        + "user=root");
        
        stmt=conn.createStatement();
        
        String sql="select * from food";
        ResultSet rs = stmt.executeQuery(sql);
        
        
        while(rs.next()){
            food f = new food(rs.getInt("id"),
                    rs.getString("ten"),
                    rs.getInt("idloai"),
                    rs.getDouble("gia"),
                    rs.getString("donvi"));
            food.add(f);
        }
                
        String sql1="select * from loai";
        ResultSet rs1 = stmt.executeQuery(sql1);
        
        
        while(rs1.next()){
            loai l = new loai(rs1.getInt("idloai"),
                    rs1.getString("Ten"));                 
            loai.add(l);
        }

        } catch (Exception ex) { //xử lý ngoại lệ nếu có
        ex.printStackTrace();
        }
        
        finally {
            //giải phóng tài nguyên khi không sử dụng nữa
            if (stmt != null) {
            try {
            stmt.close();
            } catch (SQLException sqlEx) { } //đoạn mã xử lý ng/lệ
            stmt = null;
            }

            if (conn != null) {
            try {
            conn.close();
            } catch (SQLException sqlEx) { } //đoạn mã xử lý ng/lệ
            conn = null;
            }}
        System.out.println("Size: "+food.size());
        for(food f : food){
            System.out.println(f);
            
            tableModel.addRow(new Object[]{
               
               f.getId(),f.getTen(),f.getIdloai(),f.getGia(),f.getDonvi() 
            });
        }
        
        tableModel = (DefaultTableModel) jTable2.getModel();
        
        for(loai l : loai){
            System.out.println(l);
            
            tableModel.addRow(new Object[]{
               
               l.getIdloai(),l.getTen() 
            });
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtidloai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDonvi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Them_mon_an");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thong_tin_mon_an_moi", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel1.setText("Ten:");

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        txtidloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidloaiActionPerformed(evt);
            }
        });

        jLabel2.setText("id_Loai");

        jLabel3.setText("Gia:");

        jLabel4.setText("Don_vi");

        btnAdd.setText("Them mon an");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel5.setText("Id:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnDelete.setText("Xoa mon an");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDonvi, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidloai, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDonvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Ten", "id_loai", "Gia", "Don_vi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idloai", "Ten loai"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Thong_tin_mon_an");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void txtidloaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidloaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidloaiActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        Statement stmt = null;
        List<food> food = new ArrayList<>();
        
        String id = txtId.getText();
        String ten = txtTen.getText();
        String idloai = txtidloai.getText();
        String gia = txtGia.getText();
        String donvi = txtDonvi.getText();        
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection("jdbc:mysql://localhost/quantridulieu?"

        + "user=root");
        
        String sql = "insert into food values(?,?,?,?,?)";
        pstmt=conn.prepareStatement(sql);
        
        pstmt.setString(1, id);        
        pstmt.setString(2, ten); 
        pstmt.setString(3, idloai); 
        pstmt.setString(4, gia); 
        pstmt.setString(5, donvi); 
        
        pstmt.execute();
        
        stmt=conn.createStatement();
        
        String sql2="select * from food";
        ResultSet rs = stmt.executeQuery(sql2);
        
        
        while(rs.next()){
            food f = new food(rs.getInt("id"),
                    rs.getString("ten"),
                    rs.getInt("idloai"),
                    rs.getDouble("gia"),
                    rs.getString("donvi"));
            food.add(f);
        }

        } catch (Exception ex) { //xử lý ngoại lệ nếu có
        ex.printStackTrace();
        }
        
        finally {
            //giải phóng tài nguyên khi không sử dụng nữa
            if (stmt != null) {
            try {
            stmt.close();
            } catch (SQLException sqlEx) { } //đoạn mã xử lý ng/lệ
            stmt = null;
            }

            if (conn != null) {
            try {
            conn.close();
            } catch (SQLException sqlEx) { } //đoạn mã xử lý ng/lệ
            conn = null;
            }}
        System.out.println("Size: "+food.size());
        
        tableModel = (DefaultTableModel) jTable1.getModel();
        int rows = tableModel.getRowCount();
        
        if(rows!=0){
            for(int i=rows-1;i>=0;i-- ){
                tableModel.removeRow(i);
            }
        }
        
        for(food f : food){
            System.out.println(f);
            
            tableModel.addRow(new Object[]{
               
               f.getId(),f.getTen(),f.getIdloai(),f.getGia(),f.getDonvi() 
            });
        }
    
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        Connection conn = null;
        CallableStatement cstmt = null;
        Statement stmt = null;
        
        String id = txtId.getText();
        String ten = txtTen.getText();
        String idloai = txtidloai.getText();
        String gia = txtGia.getText();
        String donvi = txtDonvi.getText();
        List<food> food = new ArrayList<>();
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection("jdbc:mysql://localhost/quantridulieu?"

        + "user=root");
        
        cstmt = conn.prepareCall("{call deletefood(?)}");
        cstmt.setString(1,id);
        cstmt.executeQuery(); 
        
        stmt=conn.createStatement();
        
        String sql2="select * from food";
        ResultSet rs = stmt.executeQuery(sql2);
        
        
        while(rs.next()){
            food f = new food(rs.getInt("id"),
                    rs.getString("ten"),
                    rs.getInt("idloai"),
                    rs.getDouble("gia"),
                    rs.getString("donvi"));
            food.add(f);
        }

        } catch (Exception ex) { //xử lý ngoại lệ nếu có
        ex.printStackTrace();
        }
        
        finally {
            //giải phóng tài nguyên khi không sử dụng nữa
            if (stmt != null) {
            try {
            stmt.close();
            } catch (SQLException sqlEx) { } //đoạn mã xử lý ng/lệ
            stmt = null;
            }

            if (conn != null) {
            try {
            conn.close();
            } catch (SQLException sqlEx) { } //đoạn mã xử lý ng/lệ
            conn = null;
            }}
        System.out.println("Size: "+food.size());
        
        tableModel = (DefaultTableModel) jTable1.getModel();
        int rows = tableModel.getRowCount();
        
        if(rows!=0){
            for(int i=rows-1;i>=0;i-- ){
                tableModel.removeRow(i);
            }
        }
        
        for(food f : food){
            System.out.println(f);
            
            tableModel.addRow(new Object[]{
               
               f.getId(),f.getTen(),f.getIdloai(),f.getGia(),f.getDonvi() 
            });
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Quan_Ly_Thuc_An.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quan_Ly_Thuc_An.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quan_Ly_Thuc_An.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quan_Ly_Thuc_An.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quan_Ly_Thuc_An().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtDonvi;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtidloai;
    // End of variables declaration//GEN-END:variables
}
