package com.tugasPBO;

public class Kerucut extends BangunRuang {
    private int tinggi;
    public Kerucut(int jariJari,int tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return (Math.PI * Math.pow(super.getJariJari(), 2) * tinggi) / 3;
    }

    public int getTinggi() {
        return tinggi;
    }

    @Override
    public void TampilVolume() {
        System.out.println("Hitung Volume Bangun Ruang Kerucut");
        System.out.println("jari-jari : "+super.getJariJari());
        System.out.println("tinggi    : "+getTinggi());
        super.TampilVolume();
    }
}
