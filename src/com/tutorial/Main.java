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
            System.out.println("2. Hitung Volume");
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
            System.out.println("\n\n");

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

    public static void volume() {
        var ulang = true;
        while(ulang){
            System.out.println("------------------------------------");
            System.out.println("Pilih bidang yang akan dihitung");
            System.out.println("------------------------------------");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("0. Kembali ke menu sebelumnya");

            var input = setInput("Pilih");

            if(input.equals("1")) {

            } else if(input.equals("2")){
                volumeBalok();
            } else if(input.equals("3")){
                volumeTabung();
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
        System.out.println("Anda memilih Segitiga");
        System.out.println("------------------------------------");
        var alas = Double.valueOf(setInput("Masukkan alas"));
        var tinggi = Double.valueOf(setInput("Masukkan tinggi"));

        luas = 0.5 * alas * tinggi;

        System.out.println("Luas dari segitiga adalah " + luas);

        setInput("Tekan ENTER untuk kembali ke menu utama");
    }

    public static void luasPersegiPanjang() {
        double luas;
        System.out.println("------------------------------------");
        System.out.println("Anda memilih Persegi Panjang");
        System.out.println("------------------------------------");
        var panjang = Double.valueOf(setInput("Masukkan panjang"));
        var lebar = Double.valueOf(setInput("Masukkan lebar"));

        luas = panjang * lebar;

        System.out.println("Luas dari persegi panjang adalah " + luas);

        setInput("Tekan ENTER untuk kembali ke menu utama");
    }

    // ---------------------------Menghitung Volume ---------------------------

    // Dwika Rumus Volume Balok dan Volume Tabung
    public static void volumeBalok(){
        double volume;
        System.out.println("------------------------------------");
        System.out.println("Anda memilih Balok");
        System.out.println("------------------------------------");

        var panjang = Double.valueOf(setInput("Masukkan panjang"));
        var lebar = Double.valueOf(setInput("Masukkan lebar"));
        var tinggi = Double.valueOf(setInput("Masukkan tinggi"));

        volume = panjang*tinggi*lebar;
        System.out.println("Volume dari Balok adalah " + volume);

        setInput("Tekan ENTER untuk kembali ke menu utama");

    }

    private static void volumeTabung() {
        double volume;
        System.out.println("------------------------------------");
        System.out.println("Anda memilih Tabung");
        System.out.println("------------------------------------");

        var tinggi = Double.valueOf(setInput("Masukkan tinggi"));
        var jari = Double.valueOf(setInput("Masukkan jari-jari"));

        volume = tinggi*jari*3.14;
        System.out.println("Volume dari Tabung adalah " + volume);

        setInput("Tekan ENTER untuk kembali ke menu utama");
    }
}
