package pbo;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SepedaFixieBeraksi {
    public static void main(String[] args) {
        // IO sederhana
        Scanner input = new Scanner(System.in);
        
        // Array
        SepedaFixie[] koleksi = new SepedaFixie[2];

        // Error Handling
        try {
            // Perulangan
            for (int i = 0; i < koleksi.length; i++) {
                System.out.println("\nData Sepeda Fixie ke-" + (i + 1));
                System.out.print("Merek: ");
                String merek = input.nextLine();

                System.out.print("Warna: ");
                String warna = input.nextLine();

                System.out.print("Ukuran Frame: ");
                String ukuran = input.nextLine();

                int[] beratPengguna = new int[3];
                
                // Perulangan
                for (int j = 0; j < 3; j++) {
                    System.out.print("Berat pengguna ke-" + (j + 1) + ": ");
                    beratPengguna[j] = input.nextInt();
                }
                input.nextLine(); // Buang newline

                // Objek
                koleksi[i] = new SepedaFixie(merek, warna, ukuran, beratPengguna);
            }

            // Output data
            System.out.println("\n=== Data Sepeda Fixie ===");
            for (SepedaFixie s : koleksi) {
                System.out.println(s.tampilkanInfo());

                // Seleksi
                if (s.hitungRataBerat() > 70) {
                    System.out.println("Kategori: Cocok untuk pengguna berat");
                } else {
                    System.out.println("Kategori: Cocok untuk pengguna ringan");
                }
                System.out.println();
            }

        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Harus berupa angka!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
