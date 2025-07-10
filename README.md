# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa merek sepeda dan warna sepeda, dan memberikan output berupa informasi detail dari sepeda tersebut seperti ukuran frame, berat pengguna, rata-rata berat pengguna dan kategori sepeda cocok untuk pengguna berat atau ringan .

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Sepeda`, `SepedaFixie`, dan `SepedaFixieBeraksi` adalah contoh dari class.

```bash
public class Sepeda {
    ...
}

public class SepedaFixie extends Sepeda {
    ...
}

public class SepedaFixieBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `koleksi[i] = new SepedaFixie(merek, warna, ukuran, beratPengguna);` adalah contoh pembuatan object.

```bash
koleksi[i] = new SepedaFixie(merek, warna, ukuran, beratPengguna);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merek`, `warna`, `ukuranFrame` dan `beratPengguna` adalah contoh atribut.

```bash
String merek;
String warna;

String ukuranFrame;
int[] beratPengguna;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Sepeda` dan `SepedaFixie`.

```bash
public Sepeda(String merek, String warna) {
    this.merek = merek;
    this.warna = warna;
}

public SepedaFixie(String merek, String warna, String ukuranFrame, int[] beratPengguna) {
    super(merek, warna);
    this.ukuranFrame = ukuranFrame;
    this.beratPengguna = beratPengguna;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerek` dan `setWarna` adalah contoh method mutator.

```bash
public void setMerek(String merek) {
    this.merek = merek;
}

public void setWarna(String warna) {
    this.warna = warna;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerek`, dan `getWarna` adalah contoh method accessor.

```bash
public String getMerek() {
    return merek;
}

public String getWarna() {
    return warna;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merek`, `warna`, `ukuranFrame` dan `beratPengguna` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merek;
private String warna;

private String ukuranFrame;
private int[] beratPengguna;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `SepedaFixie` mewarisi `Sepeda` dengan sintaks `extends`.

```bash
public class SepedaFixie extends Sepeda {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo()` di `Sepeda` merupakan overloading method `tampilkanInfo` dan `tampilkanInfo` di `SepedaFixie` merupakan override dari method `tampilkanInfo` di `Sepeda`.

```bash
public String tampilkanInfo() {
    return "Merek: " + merek + ", Warna: " + warna;
}

@Override
public String tampilkanInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `hitungRataBerat`.

```bash
if (s.hitungRataBerat() > 70) {
    System.out.println("Kategori: Cocok untuk pengguna berat");
} else {
    System.out.println("Kategori: Cocok untuk pengguna ringan");
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int j = 0; j < 3; j++) {
    System.out.print("Berat pengguna ke-" + (j + 1) + ": ");
    beratPengguna[j] = input.nextInt();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);

System.out.println("\nData Sepeda Fixie ke-" + (i + 1));
System.out.print("Merek: ");
String merek = input.nextLine();

System.out.print("Warna: ");
String warna = input.nextLine();

System.out.print("Ukuran Frame: ");
String ukuran = input.nextLine();

System.out.print("Berat pengguna ke-" + (j + 1) + ": ");
beratPengguna[j] = input.nextInt();

System.out.println("\n=== Data Sepeda Fixie ===");
for (SepedaFixie s : koleksi) {
System.out.println(s.tampilkanInfo());

if (s.hitungRataBerat() > 70) {
    System.out.println("Kategori: Cocok untuk pengguna berat");
} else {
    System.out.println("Kategori: Cocok untuk pengguna ringan");
}
System.out.println();
}
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `SepedaFixie[] koleksi = new SepedaFixie[2];` adalah contoh penggunaan array.

```bash
SepedaFixie[] koleksi = new SepedaFixie[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    
} catch (InputMismatchException e) {
    System.out.println("Input tidak valid. Harus berupa angka!");
} catch (Exception e) {
    System.out.println("Terjadi kesalahan: " + e.getMessage());
} 
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: M. Irham Maulana Sari
NPM: 2310010573
