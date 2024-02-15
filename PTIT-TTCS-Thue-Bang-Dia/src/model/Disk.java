/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vduct
 */
public class Disk {
    private int ma;
    private String ten;
    private String loai;
    private int soluong;
    private int gia;
    
    //geter 
    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getLoai() {
        return loai;
    }

    public int getSoluong() {
        return soluong;
    }

    public int getGia() {
        return gia;
    }
    
    //setter

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
    //Methods
}
