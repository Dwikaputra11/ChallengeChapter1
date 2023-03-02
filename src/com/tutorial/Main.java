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
            System.out.println("\n\n");

        }
    }

    public static void luas() {
        System.out.println("\n\n\n");
        System.out.println("------------------------------------");
        System.out.println("Pilih bidang yang akan dihitung");
        System.out.println("------------------------------------");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.println("4. Persegi Panjang");
        System.out.println("0. Kembali ke menu sebelumnya");
        var input = setInput("Pilih");
    }

    public static void volume() {

    }
}
