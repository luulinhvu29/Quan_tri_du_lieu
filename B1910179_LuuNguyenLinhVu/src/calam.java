/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.sql.Time;

public class calam {
    
    int idcalam;
    double hesoluong;
    Time giobatdau; 
    Time gioketthuc;

    public calam() {
    }

    public calam(int idcalam, double hesoluong, Time giobatdau, Time gioketthuc) {
        this.idcalam = idcalam;
        this.hesoluong = hesoluong;
        this.giobatdau = giobatdau;
        this.gioketthuc = gioketthuc;
    }

    public int getIdcl() {
        return idcalam;
    }

    public void setIdcl(int idcalam) {
        this.idcalam = idcalam;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

    public Time getGiobatdau() {
        return giobatdau;
    }

    public void setGiobatdau(Time giobatdau) {
        this.giobatdau = giobatdau;
    }

    public Time getGioketthuc() {
        return gioketthuc;
    }

    public void setGioketthuc(Time gioketthuc) {
        this.gioketthuc = gioketthuc;
    }

    @Override
    public String toString() {
        return "calam{" + "idcalam=" + idcalam + ", hesoluong=" + hesoluong + ", giobatdau=" + giobatdau + ", gioketthuc=" + gioketthuc + '}';
    }

    
    
    
}
