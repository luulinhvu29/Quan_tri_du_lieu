/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class food {
    int id;
    String ten;
    int idloai;
    double gia;
    String donvi;

    public food() {
    }

    public food(int id, String ten, int idloai, double gia, String donvi) {
        this.id = id;
        this.ten = ten;
        this.idloai = idloai;
        this.gia = gia;
        this.donvi = donvi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getIdloai() {
        return idloai;
    }

    public void setIdloai(int idloai) {
        this.idloai = idloai;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    @Override
    public String toString() {
        return "food{" + "id=" + id + ", ten=" + ten + ", idloai=" + idloai + ", gia=" + gia + ", donvi=" + donvi + '}';
    }

    
    
    
}
