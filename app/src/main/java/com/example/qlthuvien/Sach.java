package com.example.qlthuvien;

public class Sach {
    String maHD, tenSach, maSach, danhMuc, soTrang, gia, tacGia, tenNXB, language, NV, SL, NXB, CC;

    public Sach(String maHD, String tenSach, String maSach, String danhMuc, String soTrang, String gia, String tacGia, String tenNXB, String language, String NV, String SL, String NXB, String CC) {
        this.maHD = maHD;
        this.tenSach = tenSach;
        this.maSach = maSach;
        this.danhMuc = danhMuc;
        this.soTrang = soTrang;
        this.gia = gia;
        this.tacGia = tacGia;
        this.tenNXB = tenNXB;
        this.language = language;
        this.NV = NV;
        this.SL = SL;
        this.NXB = NXB;
        this.CC = CC;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(String soTrang) {
        this.soTrang = soTrang;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getNV() {
        return NV;
    }

    public void setNV(String NV) {
        this.NV = NV;
    }

    public String getSL() {
        return SL;
    }

    public void setSL(String SL) {
        this.SL = SL;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maHD='" + maHD + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", maSach='" + maSach + '\'' +
                ", danhMuc='" + danhMuc + '\'' +
                ", soTrang='" + soTrang + '\'' +
                ", gia='" + gia + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", tenNXB='" + tenNXB + '\'' +
                ", language='" + language + '\'' +
                ", NV='" + NV + '\'' +
                ", SL='" + SL + '\'' +
                ", NXB='" + NXB + '\'' +
                ", CC='" + CC + '\'' +
                '}';
    }
}
