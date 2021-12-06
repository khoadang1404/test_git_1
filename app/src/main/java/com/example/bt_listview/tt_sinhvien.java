package com.example.bt_listview;

public class tt_sinhvien {
    private String malop;
    private String name;
    private String lop;
    private int anhsv;

    public tt_sinhvien(String malop, String name, String lop, int anhsv) {
        this.malop = malop;
        this.name = name;
        this.lop = lop;
        this.anhsv = anhsv;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getAnhsv() {
        return anhsv;
    }

    public void setAnhsv(int anhsv) {
        this.anhsv = anhsv;
    }
}
