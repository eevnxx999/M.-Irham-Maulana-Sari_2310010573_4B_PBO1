package pbo;

// Class induk
public class Sepeda {
    // Atribut (dengan enkapsulasi)
    private String merek;
    private String warna;

    // Constructor
    public Sepeda(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }

    // Mutator
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Accessor
    public String getMerek() {
        return merek;
    }

    public String getWarna() {
        return warna;
    }

    // Polymorphism (method bisa dioverride)
    public String tampilkanInfo() {
        return "Merek: " + merek + ", Warna: " + warna;
    }
}
