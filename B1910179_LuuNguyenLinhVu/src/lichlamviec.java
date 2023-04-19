/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */


public class lichlamviec {
    String thu;
    int idnv;
    int idcalam;

    public lichlamviec(String thu, int idnv, int idcalam) {
        this.thu = thu;
        this.idnv = idnv;
        this.idcalam = idcalam;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public int getIdnv() {
        return idnv;
    }

    public void setIdnv(int idnv) {
        this.idnv = idnv;
    }

    public int getIdcl() {
        return idcalam;
    }

    public void setIdcl(int idcalam) {
        this.idcalam = idcalam;
    }

    public lichlamviec() {
    }

    @Override
    public String toString() {
        return "lichlamviec{" + "thu=" + thu + ", idnv=" + idnv + ", idcalam=" + idcalam + '}';
    }
    
    
}
