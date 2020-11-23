package com.tugasPBO;

public class Bola extends BangunRuang {

    public Bola(int jariJari) {
        super(jariJari);
    }

    @Override
    public double volume() {
        return (4 * Math.PI *Math.pow(super.getJariJari(), 3)) / 3;
    }

    @Override
    public void TampilVolume() {
        System.out.println("Hitung Volume Bangun Ruang Bola");
        System.out.println("jari-jari : "+super.getJariJari());
        super.TampilVolume();
    }
}
