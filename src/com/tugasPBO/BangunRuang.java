package com.tugasPBO;

public abstract class BangunRuang {
    protected int jariJari;
    public BangunRuang(int jariJari){
        this.jariJari = jariJari;
    }

    public int getJariJari() {
        return jariJari;
    }

    public abstract double volume();
    public void TampilVolume(){
        System.out.println("Hasil : V ="+ volume()+" cm\n");
    }
}
