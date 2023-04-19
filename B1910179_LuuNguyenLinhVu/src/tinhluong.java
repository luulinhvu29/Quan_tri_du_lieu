/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class tinhluong {
    int idnv;
    String tennhanvien;
    double luong;

    public tinhluong() {
    }

    public tinhluong(int idnv, String tennhanvien, double luong) {
        this.idnv = idnv;
        this.tennhanvien = tennhanvien;
        this.luong = luong;
    }

    public int getIdnv() {
        return idnv;
    }

    public void setIdnv(int idnv) {
        this.idnv = idnv;
    }

    public String getTennv() {
        return tennhanvien;
    }

    public void setTennv(String tennhanvien) {
        this.tennhanvien = tennhanvien;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "tinhluong{" + "idnv=" + idnv + ", tennhanvien=" + tennhanvien + ", luong=" + luong + '}';
    }
    
    
}
