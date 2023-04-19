/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Nhan_Vien {
    int idnv;
    String ten;
    int idchucvu;
    int songaynghi;
    String diachi;
    int sdt;

    public Nhan_Vien() {
    }

    public Nhan_Vien(int idnv, String ten, int idchucvu, int songaynghi, String diachi, int sdt) {
        this.idnv = idnv;
        this.ten = ten;
        this.idchucvu = idchucvu;
        this.songaynghi = songaynghi;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public int getIdnv() {
        return idnv;
    }

    public void setIdnv(int idnv) {
        this.idnv = idnv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getIdchucvu() {
        return idchucvu;
    }

    public void setIdchucvu(int idchucvu) {
        this.idchucvu = idchucvu;
    }

    public int getSongaynghi() {
        return songaynghi;
    }

    public void setSongaynghi(int songaynghi) {
        this.songaynghi = songaynghi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "Nhan_Vien{" + "idnv=" + idnv + ", ten=" + ten + ", idchucvu=" + idchucvu + ", songaynghi=" + songaynghi + ", diachi=" + diachi + ", sdt=" + sdt + '}';
    }
    
    
}
