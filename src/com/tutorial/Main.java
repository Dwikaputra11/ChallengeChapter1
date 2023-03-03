package com.tutorial;

public class Main {
    public static java.util.Scanner input = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        menuUtama();
    }

    public static String setInput(String info) {
        System.out.print(info + " : " );
        String data = input.nextLine();
        return data;
    }

    public static void menuUtama() {
        while (true) {
            System.out.println("------------------------------------");
            System.out.println("Kalkulator Penghitung Luas dan Volum");
            System.out.println("--------------------------------");
            System.out.println("Menu");
            System.out.println("1. Hitung Luas Bidang");
            System.out.println("2. Hitung Volum");
            System.out.println("0. Tutup Aplikasi");
            System.out.println("------------------------------------");

            var input = setInput("Pilih");

            if(input.equals("1")) {
                luas();
            } else if(input.equals("2")){
                volume();
            } else if(input.equals("0")){
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public static void luas() {
        boolean ulang = true;
        while (ulang) {
            System.out.println("------------------------------------");
            System.out.println("Pilih bidang yang akan dihitung");
            System.out.println("------------------------------------");
            System.out.println("1. Persegi");
            System.out.println("2. Lingkaran");
            System.out.println("3. Segitiga");
            System.out.println("4. Persegi Panjang");
            System.out.println("0. Kembali ke menu sebelumnya");

            var input = setInput("Pilih");

            if(input.equals("1")) {

            } else if(input.equals("2")){

            } else if(input.equals("3")){
                luasSegitiga();
                ulang = false;
            } else if(input.equals("4")){
                luasPersegiPanjang();
                ulang = false;
            } else if(input.equals("0")){
                ulang = false;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    // ---------------------------Menghitung Luas ---------------------------

    // Gani Rumus Luas Segitiga dan Luas Persegi Panjang

    public static void luasSegitiga() {
        double luas;
        System.out.println("------------------------------------");
        System.out.println("Anda memilih segitiga");
        System.out.println("------------------------------------");
        var alas = Double.valueOf(setInput("Masukkan alas"));
        var tinggi = Double.valueOf(setInput("Masukkan tinggi"));

        luas = 0.5 * alas * tinggi;

        System.out.println("Luas dari segitiga adalah " + luas);

        var keluar = setInput("Tekan ENTER untuk kembali ke menu utama");
    }

    public static void luasPersegiPanjang() {
        double luas;
        System.out.println("------------------------------------");
        System.out.println("Anda memilih persegi panjang");
        System.out.println("------------------------------------");
        var panjang = Double.valueOf(setInput("Masukkan panjang"));
        var lebar = Double.valueOf(setInput("Masukkan lebar"));

        luas = panjang * lebar;

        System.out.println("Luas dari persegi panjang adalah " + luas);

        var keluar = setInput("Tekan ENTER untuk kembali ke menu utama");
    }

    // ---------------------------Menghitung Volume ---------------------------
    public static void volume() {

    }
}
