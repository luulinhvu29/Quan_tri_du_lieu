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


public class Quan_Ly_Nhan_Vien extends javax.swing.JFrame {

    /**
     * Creates new form Quan_Ly_Nhan_Vien
     */
    
    DefaultTableModel tableModel;
    
    public Quan_Ly_Nhan_Vien() {
        initComponents();
        
        tableModel = (DefaultTableModel) jTable1.getModel();
        
        Connection conn = null;
        Statement stmt = null;
        List<Nhan_Vien> nv = new ArrayList<>();
        List<Chuc_Vu> cv = new ArrayList<>();
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection("jdbc:mysql://localhost/quantridulieu?"

        + "user=root");
        
        stmt=conn.createStatement();
        
        String sql="select * from nhanvien";
        ResultSet rs = stmt.executeQuery(sql);
        
        
        while(rs.next()){
            Nhan_Vien n = new Nhan_Vien(rs.getInt("idnv"),
                    rs.getString("ten"),
                    rs.getInt("idchucvu"),
                    rs.getInt("songaynghi"),
                    rs.getString("diachi"),
                    rs.getInt("sdt"));
            nv.add(n);
        }
                
        String sql1="select * from chucvu";
        ResultSet rs1 = stmt.executeQuery(sql1);
        
        
        while(rs1.next()){
            Chuc_Vu c = new Chuc_Vu(rs1.getInt("idchucvu"),
                    rs1.getString("tenchucvu"),
                    rs1.getDouble("hesoluong"));                 
            cv.add(c);
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
        System.out.println("Size: "+nv.size());
        for(Nhan_Vien n : nv){
            System.out.println(n);
            
            tableModel.addRow(new Object[]{
               
               n.getIdnv(),n.getTen(),n.getIdchucvu(),n.getSongaynghi(),n.getDiachi(),n.getSdt()
            });
        }
        
        tableModel = (DefaultTableModel) jTable3.getModel();
        
        for(Chuc_Vu c : cv){
            System.out.println(c);
            
            tableModel.addRow(new Object[]{
               
               c.getIdchucvu(),c.getTenchucvu(),c.getHesoluong()
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

        btnDelete1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTennv = new javax.swing.JTextField();
        txtIdchucvu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtIdnv = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSodienthoai = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();

        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QL_Nhan_Vien");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thong_tin_Nhan_Vien", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel1.setText("TenNV:");

        txtTennv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTennvActionPerformed(evt);
            }
        });

        txtIdchucvu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdchucvuActionPerformed(evt);
            }
        });

        jLabel2.setText("id_chuc_vu");

        jLabel4.setText("Dia_chi:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel5.setText("Idnv:");

        txtIdnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdnvActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel6.setText("So_dien_thoai:");

        txtSodienthoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSodienthoaiActionPerformed(evt);
            }
        });

        reset.setText("Reset \nSo Ngay Nghi");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
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
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTennv, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(txtIdnv, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtSodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
                            .addComponent(txtIdnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdNV", "Ten", "Id_chuc_vu", "So_ngay_nghi", "Dia_chi", "So_dien_thoai"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_chuc_vu", "Ten_chuc_vu", "He_so_luong"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTennvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTennvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTennvActionPerformed

    private void txtIdchucvuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdchucvuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdchucvuActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        Connection conn = null;
        CallableStatement cstmt = null;
        Statement stmt = null;
        List<Nhan_Vien> nv = new ArrayList<>();

        String idnv = txtIdnv.getText();
        String ten = txtTennv.getText();
        String idchucvu = txtIdchucvu.getText();
        String diachi = txtDiachi.getText();
        String sdt = txtSodienthoai.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quantridulieu?"

                + "user=root");

            cstmt = conn.prepareCall("{call addnhanvien(?,?,?,?,?)}");
            
            cstmt.setString(1,idnv);
            cstmt.setString(2,ten);
            cstmt.setString(3,idchucvu);
            cstmt.setString(4,diachi);
            cstmt.setString(5,sdt);
            
            cstmt.executeQuery();

            stmt=conn.createStatement();

            String sql2="select * from nhanvien";
            ResultSet rs = stmt.executeQuery(sql2);

            while(rs.next()){
            Nhan_Vien n = new Nhan_Vien(rs.getInt("idnv"),
                    rs.getString("ten"),
                    rs.getInt("idchucvu"),
                    rs.getInt("songaynghi"),
                    rs.getString("diachi"),
                    rs.getInt("sdt"));
            nv.add(n);
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
            
             if (cstmt != null) {
                try {
                    cstmt.close();
                } catch (SQLException sqlEx) { } //đoạn mã xử lý ng/lệ
                cstmt = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) { } //đoạn mã xử lý ng/lệ
                conn = null;
            }}
            
        tableModel = (DefaultTableModel) jTable1.getModel();
        int rows = tableModel.getRowCount();
        
        if(rows!=0){
            for(int i=rows-1;i>=0;i-- ){
            tableModel.removeRow(i);
        }
        }
            for(Nhan_Vien n : nv){
            System.out.println(n);
            
            tableModel.addRow(new Object[]{
               
               n.getIdnv(),n.getTen(),n.getIdchucvu(),n.getSongaynghi(),n.getDiachi(),n.getSdt()
            });
        

            }

    }//GEN-LAST:event_btnAddActionPerformed

    private void txtIdnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdnvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdnvActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        Connection conn = null;
        CallableStatement cstmt = null;
        Statement stmt=null;
        List<Nhan_Vien> nv = new ArrayList<>();
        String idnv = txtIdnv.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quantridulieu?"

                + "user=root");

            cstmt = conn.prepareCall("{call sathai(?)}");
            cstmt.setString(1,idnv);
            cstmt.executeQuery();
            
            stmt=conn.createStatement();

            String sql2="select * from nhanvien";
            ResultSet rs = stmt.executeQuery(sql2);

            while(rs.next()){
            Nhan_Vien n = new Nhan_Vien(rs.getInt("idnv"),
                    rs.getString("ten"),
                    rs.getInt("idchucvu"),
                    rs.getInt("songaynghi"),
                    rs.getString("diachi"),
                    rs.getInt("sdt"));
            nv.add(n);
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
        tableModel = (DefaultTableModel) jTable1.getModel();
        int rows = tableModel.getRowCount();
        
        if(rows!=0){
            for(int i=rows-1;i>=0;i-- ){
            tableModel.removeRow(i);
        }
        }
            for(Nhan_Vien n : nv){
            System.out.println(n);
            
            tableModel.addRow(new Object[]{
               
               n.getIdnv(),n.getTen(),n.getIdchucvu(),n.getSongaynghi(),n.getDiachi(),n.getSdt()
            });
        

            }
        

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void txtSodienthoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSodienthoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSodienthoaiActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        Statement stmt = null;
        List<Nhan_Vien> nv = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quantridulieu?"

                + "user=root");

            pstmt = conn.prepareStatement("update nhanvien set songaynghi=0");           
            pstmt.execute();
            
            stmt=conn.createStatement();
        
            String sql="select * from nhanvien";
            ResultSet rs = stmt.executeQuery(sql);


            while(rs.next()){
                Nhan_Vien n = new Nhan_Vien(rs.getInt("idnv"),
                        rs.getString("ten"),
                        rs.getInt("idchucvu"),
                        rs.getInt("songaynghi"),
                        rs.getString("diachi"),
                        rs.getInt("sdt"));
                nv.add(n);
            }

        } catch (Exception ex) { //xử lý ngoại lệ nếu có
            ex.printStackTrace();
        }

        finally {
            //giải phóng tài nguyên khi không sử dụng nữa
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException sqlEx) { } //đoạn mã xử lý ng/lệ
                pstmt = null;
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
        
        tableModel = (DefaultTableModel) jTable1.getModel();
        int rows = tableModel.getRowCount();

        if(rows!=0){
            for(int i=rows-1;i>=0;i-- ){
                tableModel.removeRow(i);
            }
        }
        
        for(Nhan_Vien n : nv){
            System.out.println(n);
            
            tableModel.addRow(new Object[]{
               
               n.getIdnv(),n.getTen(),n.getIdchucvu(),n.getSongaynghi(),n.getDiachi(),n.getSdt()
            });
        }
    }//GEN-LAST:event_resetActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        
        Connection conn = null;
        Statement stmt = null;
        List<Nhan_Vien> nv = new ArrayList<>();
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection("jdbc:mysql://localhost/quantridulieu?"

        + "user=root");
        
        stmt=conn.createStatement();
        
        String sql="select * from nhanvien";
        ResultSet rs = stmt.executeQuery(sql);
        
        
        while(rs.next()){
            Nhan_Vien n = new Nhan_Vien(rs.getInt("idnv"),
                    rs.getString("ten"),
                    rs.getInt("idchucvu"),
                    rs.getInt("songaynghi"),
                    rs.getString("diachi"),
                    rs.getInt("sdt"));
            nv.add(n);
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
        tableModel = (DefaultTableModel) jTable1.getModel();
        int rows = tableModel.getRowCount();
        
        if(rows!=0){
            for(int i=rows-1;i>=0;i-- ){
                tableModel.removeRow(i);
            }
        }
        
        for(Nhan_Vien n : nv){
            System.out.println(n);
            
            tableModel.addRow(new Object[]{
               
               n.getIdnv(),n.getTen(),n.getIdchucvu(),n.getSongaynghi(),n.getDiachi(),n.getSdt()
            });
        }
            
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(Quan_Ly_Nhan_Vien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quan_Ly_Nhan_Vien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quan_Ly_Nhan_Vien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quan_Ly_Nhan_Vien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quan_Ly_Nhan_Vien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton reset;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtIdchucvu;
    private javax.swing.JTextField txtIdnv;
    private javax.swing.JTextField txtSodienthoai;
    private javax.swing.JTextField txtTennv;
    // End of variables declaration//GEN-END:variables
}
