/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Chuc_Vu {
    int idchucvu;
    String tenchucvu;
    double hesoluong;

    public Chuc_Vu(int idchucvu, String tenchucvu, double hesoluong) {
        this.idchucvu = idchucvu;
        this.tenchucvu = tenchucvu;
        this.hesoluong = hesoluong;
    }

    public Chuc_Vu() {
    }

    public int getIdchucvu() {
        return idchucvu;
    }

    public void setIdchucvu(int idchucvu) {
        this.idchucvu = idchucvu;
    }

    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

    @Override
    public String toString() {
        return "Chuc_Vu{" + "idchucvu=" + idchucvu + ", tenchucvu=" + tenchucvu + ", hesoluong=" + hesoluong + '}';
    }
    
    
}
