/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.sql.Timestamp;

public class donhang {
    
    int iddh,id;
    String tenkh;
    Timestamp ngay;
    String trangthai;

    public donhang() {
    }

    public int getIddh() {
        return iddh;
    }

    public void setIddh(int iddh) {
        this.iddh = iddh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public Timestamp getNgay() {
        return ngay;
    }

    public void setNgay(Timestamp ngay) {
        this.ngay = ngay;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public donhang(int iddh, int id, String tenkh, Timestamp ngay, String trangthai) {
        this.iddh = iddh;
        this.id = id;
        this.tenkh = tenkh;
        this.ngay = ngay;
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "donhang{" + "iddh=" + iddh + ", id=" + id + ", tenkh=" + tenkh + ", ngay=" + ngay + ", trangthai=" + trangthai + '}';
    }
    
    
            
}
