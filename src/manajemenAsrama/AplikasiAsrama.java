package manajemenAsrama;
import java.util.Scanner;
public class AplikasiAsrama {
    public static void main(String[] args) {
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

        ManajemenAsrama asrama = new ManajemenAsrama(kapasitas);

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

            } catch (Exception e) {
                System.out.println("\nInput tidak valid. Coba lagi.");
            }
        }
    }
}   
