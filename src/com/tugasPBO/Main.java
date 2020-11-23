package com.tugasPBO;

/*Nama  : Argya Aulia Fauzandika
  NIM   : 10119035
  Kelas : IF1
  Deskripsi: Program ini menampilkan volume dari bangun Ruang menggunakan konsep abstract
* */

public class Main {
    public static void main(String[] args){
        Bola bola = new Bola(7);
        bola.TampilVolume();

        Tabung tabung = new Tabung(10,21);
        tabung.TampilVolume();

        Kerucut kerucut = new Kerucut(9,14);
        kerucut.TampilVolume();
    }
}
