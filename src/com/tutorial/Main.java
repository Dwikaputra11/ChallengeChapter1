package com.tutorial;

public class Main {
    public static java.util.Scanner input = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        menuUtama();
    }

    public static String setInput(String info) {
        System.out.print(info + " : " );
        return input.nextLine();
    }

    public static void menuUtama() {
        label:
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

            switch (input) {
                case "1":
                    luas();
                    break;
                case "2":
                    volume();
                    break;
                case "0":
                    break label;
                default:
                    System.out.println("Pilihan tidak dimengerti");
                    break;
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

            switch (input) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":
                    luasSegitiga();
                    ulang = false;
                    break;
                case "4":
                    luasPersegiPanjang();
                    ulang = false;
                    break;
                case "0":
                    ulang = false;
                    break;
                default:
                    System.out.println("Pilihan tidak dimengerti");
                    break;
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

            switch (input) {
                case "1":

                    break;
                case "2":
                    volumeBalok();
                    break;
                case "3":
                    volumeTabung();
                    ulang = false;
                    break;
                case "0":
                    ulang = false;
                    break;
                default:
                    System.out.println("Pilihan tidak dimengerti");
                    break;
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
