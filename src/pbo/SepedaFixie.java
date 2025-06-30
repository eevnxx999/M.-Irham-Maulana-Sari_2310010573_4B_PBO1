package pbo;

// Inheritance dari Sepeda
public class SepedaFixie extends Sepeda {
    private String ukuranFrame;
    private int[] beratPengguna; // Array berat pengguna (kg)

    // Overriding
    public SepedaFixie(String merek, String warna, String ukuranFrame, int[] beratPengguna) {
        super(merek, warna);
        this.ukuranFrame = ukuranFrame;
        this.beratPengguna = beratPengguna;
    }

    // Hitung rata-rata berat pengguna
    public double hitungRataBerat() {
        int total = 0;
        for (int berat : beratPengguna) {
            total += berat;
        }
        return (double) total / beratPengguna.length;
    }

    // Polymorphism overriding
    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + ", Ukuran Frame: " + ukuranFrame + 
               ", Rata-rata Berat Pengguna: " + hitungRataBerat() + " kg";
    }
}
