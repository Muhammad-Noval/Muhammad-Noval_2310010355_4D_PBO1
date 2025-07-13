# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `PenghuniAsrama`, `PenghuniVIP`, `ManajemenAsrama`, dan 'AplikasiAsrama' adalah contoh dari class.

```bash
public class PenghuniAsrama {
    ...
}

public class PenghuniVIP extends PenghuniAsrama {
    ...
}

public class ManajemenAsrama {
    ...
}

public class AplikasiAsrama {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `ManajemenAsrama[i] = new ManajemenAsrama(Kapasitas);` adalah contoh pembuatan object.

```bash
  ManajemenAsrama asrama = new ManajemenAsrama(kapasitas);
```

3. **Atribut** adalah variabel yang ada dalam class PenghuniAsrama. Pada kode ini, `nama`, `asal`, dan 'nomorKamar' adalah contoh atribut.

```bash
protected String nama;
protected String asal;
protected int nomorKamar;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `penghuniAsrama` dan `PenghuniVIP`.

```bash
    public PenghuniAsrama(String nama, String asal, int nomorKamar) {
        this.nama = nama;
        this.asal = asal;
        this.nomorKamar = nomorKamar;
}

public PenghuniVIP(String nama, String asal, int nomorKamar, String fasilitas) {
        super(nama, asal, nomorKamar);
        this.fasilitas = fasilitas;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setAsal`, dan 'setNomorKamar adalah contoh method mutator.

```bash
 public void setNama(String nama) {
    this.nama = nama;
}

public void setAsal(String asal) {
        this.asal = asal;
}

public void setNomorKamar(int nomorKamar) {
        this.nomorKamar = nomorKamar;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNomorKamar` adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
}

public int getNomorKamar() {
        return nomorKamar;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `asal`, dan 'nomorKamar' dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    protected String nama;
    protected String asal;
    protected int nomorKamar;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PenghuniVIP` mewarisi `PenghuniAsrama` dengan sintaks `extends`.

```bash
public class PenghuniVIP extends PenghuniAsrama {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo()` di `penghuniVIP` merupakan override dari method `tampilkanInfo` di `penghuniAsrama`.

```bash
public void tampilkanInfo() {
        System.out.println("Nama        : " + nama);
        System.out.println("Asal Daerah : " + asal);
        System.out.println("Nomor Kamar : " + nomorKamar);
}

@Override
public void tampilkanInfo() {
    super.tampilkanInfo();
        System.out.println("Fasilitas   : " + fasilitas);
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `tambahPenghuni` dan seleksi `switch` dalam class `AplikasiAsrama`.

```bash
public void tambahPenghuni(PenghuniAsrama penghuni) {
        if (jumlah < daftarPenghuni.length) {
            daftarPenghuni[jumlah] = penghuni;
            jumlah++;
            System.out.println("\nPenghuni berhasil ditambahkan!");
        } else {
            System.out.println("\nKapasitas asrama penuh!");
        }
}

while (true) {
            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. Tambah Penghuni");
            System.out.println("2. Lihat Semua Penghuni");
            System.out.println("3. Cari Penghuni (berdasarkan nomor kamar)");
            System.out.println("4. Edit Data Penghuni");
            System.out.println("5. Keluar");
            System.out.println("Pilih Menu 1-5: ");


            try {
                int pilihan = Integer.parseInt(input.nextLine());
                //seleksi switch
                switch (pilihan) {
                    case 1:
                        System.out.println("\nJenis Penghuni:");
                        System.out.println("1. Reguler");
                        System.out.println("2. VIP");
                        System.out.print("Pilih jenis (1/2): ");
                        int jenis = Integer.parseInt(input.nextLine());

                        System.out.print("Nama: ");
                        String nama = input.nextLine();
                        System.out.print("Asal Daerah: ");
                        String asal = input.nextLine();
                        System.out.print("Nomor Kamar: ");
                        int kamar = Integer.parseInt(input.nextLine());
                        //seleksi if
                        if (jenis == 1) {
                            PenghuniAsrama penghuni = new PenghuniAsrama(nama, asal, kamar);
                            asrama.tambahPenghuni(penghuni);
                        } else if (jenis == 2) {
                            System.out.print("Fasilitas Tambahan: ");
                            String fasilitas = input.nextLine();
                            PenghuniVIP penghuniVIP = new PenghuniVIP(nama, asal, kamar, fasilitas);
                            asrama.tambahPenghuni(penghuniVIP);
                        } else {
                            System.out.println("\nJenis tidak valid.");
                        }
                        break;

                    case 2:
                        asrama.tampilkanSemuaPenghuni();
                        break;

                    case 3:
                        System.out.print("\nMasukkan nomor kamar yang dicari: ");
                        int noKamar = Integer.parseInt(input.nextLine());
                        asrama.cariPenghuni(noKamar);
                        break;
                    case 4:
                        System.out.print("Masukkan nomor kamar yang ingin diedit: ");
                        int editKamar = Integer.parseInt(input.nextLine());
                        boolean ditemukan = false;

                        for (int i = 0; i < kapasitas; i++) {
                            PenghuniAsrama p = asrama.daftarPenghuni[i];
                            if (p != null && p.getNomorKamar() == editKamar) {
                                System.out.println("\nData saat ini:");
                                p.tampilkanInfo();
                                System.out.println("\nPilih data yang ingin diedit:");
                                System.out.println("1. Nama");
                                System.out.println("2. Asal Daerah");
                                System.out.println("3. Nomor Kamar");
                                if (p instanceof PenghuniVIP) {
                                    System.out.println("4. Fasilitas (VIP)");
                                }
                                System.out.print("Masukkan pilihan: ");
                                int editPilihan = Integer.parseInt(input.nextLine());

                                switch (editPilihan) {
                                    case 1:
                                        System.out.print("Nama baru: ");
                                        p.setNama(input.nextLine());
                                        break;
                                    case 2:
                                        System.out.print("Asal daerah baru: ");
                                        p.setAsal(input.nextLine());
                                        break;
                                    case 3:
                                        System.out.print("Nomor kamar baru: ");
                                        p.setNomorKamar(Integer.parseInt(input.nextLine()));
                                        break;
                                    case 4:
                                        if (p instanceof PenghuniVIP) {
                                            PenghuniVIP vip = (PenghuniVIP) p;
                                            System.out.print("Fasilitas baru: ");
                                            vip.setFasilitas(input.nextLine());
                                        } else {
                                            System.out.println("Bukan penghuni VIP.");
                                        }
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid.");
                                }
                                System.out.println("Data berhasil diperbarui.");
                                ditemukan = true;
                                break;
                            }
                        }
                        if (!ditemukan) {
                            System.out.println("Penghuni dengan nomor kamar tersebut tidak ditemukan.");
                        }
                        break;

                    case 5:
                        System.out.println("Terima kasih telah menggunakan sistem.");
                        return;
                }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < jumlah; i++) {
            System.out.println("\n[Penghuni ke-" + (i + 1) + "]");
            daftarPenghuni[i].tampilkanInfo();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);

        System.out.println("===== SISTEM MANAJEMEN ASRAMA =====");
        System.out.print("Masukkan kapasitas maksimal asrama: ");
        int kapasitas = 0;

        while (kapasitas <= 0) {
            try {
                kapasitas = Integer.parseInt(input.nextLine());
                if (kapasitas <= 0) {
                    System.out.print("Kapasitas harus lebih dari 0. Coba lagi: ");
                }
                //Error handling biasa
            } catch (Exception e) {
                System.out.print("Input tidak valid. Masukkan angka: ");
            }
        }
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `penghuniAsrama[] daftarPenghuni = new penghuniAsrama[kapasitas];` adalah contoh penggunaan array.

```bash
daftarPenghuni = new PenghuniAsrama[kapasitas];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
catch (Exception e) {
System.out.print("Input tidak valid. Masukkan angka: ");
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

Nama: Muhammad Noval
NPM: 2310010355
