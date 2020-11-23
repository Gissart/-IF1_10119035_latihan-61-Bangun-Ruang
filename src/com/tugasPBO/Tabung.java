package com.tugasPBO;

public class Tabung extends BangunRuang{
    private int tinggi;
    public Tabung(int jariJari,int tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(super.getJariJari(), 2) * tinggi;
    }

    @Override
    public void TampilVolume() {
        System.out.println("Hitung Volume Bangun Ruang Tabung");
        System.out.println("jari-jari : "+super.getJariJari());
        System.out.println("tinggi    : "+getTinggi());
        super.TampilVolume();
    }

}
