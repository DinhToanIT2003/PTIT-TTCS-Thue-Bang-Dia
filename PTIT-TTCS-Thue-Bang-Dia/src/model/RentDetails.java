/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vduct
 */
public class RentDetails {
    private String id;
    private String madia;
    private String maKh;
    private String maNv;
    private String idTra;
    private int slThue;
    private int gia;
    private String ngayThue;
    private String ngayTra;

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMadia() {
        return madia;
    }

    public void setMadia(String madia) {
        this.madia = madia;
    }

    public String getIdTra() {
        return idTra;
    }

    public void setIdTra(String idTra) {
        this.idTra = idTra;
    }

    public int getSlThue() {
        return slThue;
    }

    public void setSlThue(int slThue) {
        this.slThue = slThue;
    }

    public String getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(String ngayThue) {
        this.ngayThue = ngayThue;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }
    
    
}
