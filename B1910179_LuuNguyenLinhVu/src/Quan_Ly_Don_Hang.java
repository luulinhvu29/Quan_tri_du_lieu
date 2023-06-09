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

public class Quan_Ly_Don_Hang extends javax.swing.JFrame {

    /**
     * Creates new form Quan_Ly_Don_Hang
     */
    DefaultTableModel tableModel;
    
    public Quan_Ly_Don_Hang() {
        initComponents();
        
        tableModel = (DefaultTableModel) jTable1.getModel();
        
        Connection conn = null;
        Statement stmt = null;
        List<food> food = new ArrayList<>();
        List<donhang> dh = new ArrayList<>();
        
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
                
        String sql1="select * from donhang";
        ResultSet rs1 = stmt.executeQuery(sql1);
        
        
        while(rs1.next()){
            donhang d = new donhang(rs1.getInt("iddh"),
                    rs1.getInt("id"),
                    rs1.getString("tenkh"),
                    rs1.getTimestamp("ngay"),
                    rs1.getString("trangthai"));                 
            dh.add(d);
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
        
        for(donhang d : dh){
            System.out.println(d);
            
            tableModel.addRow(new Object[]{
               
               d.getIddh(),d.getId(),d.getTenkh(),d.getNgay(),d.getTrangthai()
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtTenkh = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtIddh = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        txtNgay = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnComplete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QL_Don_Hang");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thong_tin_Don_Hang", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel1.setText("Idfood:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtTenkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenkhActionPerformed(evt);
            }
        });

        jLabel2.setText("TenKH:");

        btnAdd.setText("Them DH");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel5.setText("idDH:");

        txtIddh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIddhActionPerformed(evt);
            }
        });

        btnDelete.setText("Xoa DH");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayActionPerformed(evt);
            }
        });

        jLabel3.setText("Ngay:");

        btnComplete.setText("Hoan_Thanh");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTenkh, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(txtIddh, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIddh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                "idDH", "idFood", "Ten_khach_hang", "Ngay", "Trang_Thai"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Thong_tin_Don_hang");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtTenkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenkhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenkhActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        Connection conn = null;
        CallableStatement cstmt = null;
        Statement stmt = null;
        List<donhang> dh = new ArrayList<>();

        String iddh = txtIddh.getText();
        String id = txtId.getText();
        String tenkh = txtTenkh.getText();
        String ngay = txtNgay.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quantridulieu?"

                + "user=root");

            cstmt = conn.prepareCall("{call adddonhang(?,?,?,?)}");

            cstmt.setString(1,iddh);
            cstmt.setString(2,id);
            cstmt.setString(3,tenkh);
            cstmt.setString(4,ngay);

            cstmt.executeQuery();
            
             stmt=conn.createStatement();
        
            String sql1="select * from donhang";
            ResultSet rs1 = stmt.executeQuery(sql1);

            while(rs1.next()){
                donhang d = new donhang(rs1.getInt("iddh"),
                        rs1.getInt("id"),
                        rs1.getString("tenkh"),
                        rs1.getTimestamp("ngay"),
                        rs1.getString("trangthai"));                 
                dh.add(d);
            }


        } catch (Exception ex) { //xử lý ngoại lệ nếu có
            ex.printStackTrace();
        }

        finally {
            //giải phóng tài nguyên khi không sử dụng nữa

            if (cstmt != null) {
                try {
                    cstmt.close();
                } catch (SQLException sqlEx) { } //đoạn mã xử lý ng/lệ
                cstmt = null;
            }
            
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
        
        tableModel = (DefaultTableModel) jTable2.getModel();
        
        int rows = tableModel.getRowCount();
        
        if(rows!=0){
            for(int i=rows-1;i>=0;i-- ){
                tableModel.removeRow(i);
            }
        }
        
        for(donhang d : dh){
            System.out.println(d);
            
            tableModel.addRow(new Object[]{
               
               d.getIddh(),d.getId(),d.getTenkh(),d.getNgay(),d.getTrangthai()
            });
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void txtIddhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIddhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIddhActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        Connection conn = null;
        CallableStatement cstmt = null;
        Statement stmt = null;
        List<donhang> dh = new ArrayList<>();

        String iddh = txtIddh.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quantridulieu?"

                + "user=root");

            cstmt = conn.prepareCall("{call huydonhang(?)}");

            cstmt.setString(1,iddh);
            

            cstmt.executeQuery();
            
             stmt=conn.createStatement();
        
            String sql1="select * from donhang";
            ResultSet rs1 = stmt.executeQuery(sql1);

            while(rs1.next()){
                donhang d = new donhang(rs1.getInt("iddh"),
                        rs1.getInt("id"),
                        rs1.getString("tenkh"),
                        rs1.getTimestamp("ngay"),
                        rs1.getString("trangthai"));                 
                dh.add(d);
            }


        } catch (Exception ex) { //xử lý ngoại lệ nếu có
            ex.printStackTrace();
        }

        finally {
            //giải phóng tài nguyên khi không sử dụng nữa

            if (cstmt != null) {
                try {
                    cstmt.close();
                } catch (SQLException sqlEx) { } //đoạn mã xử lý ng/lệ
                cstmt = null;
            }
            
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
        
        tableModel = (DefaultTableModel) jTable2.getModel();
        
        int rows = tableModel.getRowCount();
        
        if(rows!=0){
            for(int i=rows-1;i>=0;i-- ){
                tableModel.removeRow(i);
            }
        }
        
        for(donhang d : dh){
            System.out.println(d);
            
            tableModel.addRow(new Object[]{
               
               d.getIddh(),d.getId(),d.getTenkh(),d.getNgay(),d.getTrangthai()
            });
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        
        Connection conn = null;
        CallableStatement cstmt = null;
        Statement stmt = null;
        List<donhang> dh = new ArrayList<>();

        String iddh = txtIddh.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quantridulieu?"

                + "user=root");

            cstmt = conn.prepareCall("{call hoanthanh(?)}");

            cstmt.setString(1,iddh);

            cstmt.executeQuery();
            
             stmt=conn.createStatement();
        
            String sql1="select * from donhang";
            ResultSet rs1 = stmt.executeQuery(sql1);

            while(rs1.next()){
                donhang d = new donhang(rs1.getInt("iddh"),
                        rs1.getInt("id"),
                        rs1.getString("tenkh"),
                        rs1.getTimestamp("ngay"),
                        rs1.getString("trangthai"));                 
                dh.add(d);
            }


        } catch (Exception ex) { //xử lý ngoại lệ nếu có
            ex.printStackTrace();
        }

        finally {
            //giải phóng tài nguyên khi không sử dụng nữa

            if (cstmt != null) {
                try {
                    cstmt.close();
                } catch (SQLException sqlEx) { } //đoạn mã xử lý ng/lệ
                cstmt = null;
            }
            
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
        
        tableModel = (DefaultTableModel) jTable2.getModel();
        
        int rows = tableModel.getRowCount();
        
        if(rows!=0){
            for(int i=rows-1;i>=0;i-- ){
                tableModel.removeRow(i);
            }
        }
        
        for(donhang d : dh){
            System.out.println(d);
            
            tableModel.addRow(new Object[]{
               
               d.getIddh(),d.getId(),d.getTenkh(),d.getNgay(),d.getTrangthai()
            });
        }
        
    }//GEN-LAST:event_btnCompleteActionPerformed

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
            java.util.logging.Logger.getLogger(Quan_Ly_Don_Hang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quan_Ly_Don_Hang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quan_Ly_Don_Hang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quan_Ly_Don_Hang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quan_Ly_Don_Hang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIddh;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtTenkh;
    // End of variables declaration//GEN-END:variables
}
