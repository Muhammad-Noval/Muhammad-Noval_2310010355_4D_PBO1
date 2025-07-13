package manajemenAsrama;
public class ManajemenAsrama {
    protected PenghuniAsrama[] daftarPenghuni;
    private int jumlah;

    public ManajemenAsrama(int kapasitas) {
        daftarPenghuni = new PenghuniAsrama[kapasitas];
        jumlah = 0;
    }

    public void tambahPenghuni(PenghuniAsrama penghuni) {
        if (jumlah < daftarPenghuni.length) {
            daftarPenghuni[jumlah] = penghuni;
            jumlah++;
            System.out.println("\nPenghuni berhasil ditambahkan!");
        } else {
            System.out.println("\nKapasitas asrama penuh!");
        }
    }

    public void tampilkanSemuaPenghuni() {
        if (jumlah == 0) {
            System.out.println("\nBelum ada penghuni.");
            return;
        }
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n[Penghuni ke-" + (i + 1) + "]");
            daftarPenghuni[i].tampilkanInfo();
        }
    }

    public void cariPenghuni(int nomorKamar) {
        
        boolean ditemukan = false;
        for (int i = 0; i < jumlah; i++) {
            if (daftarPenghuni[i].getNomorKamar() == nomorKamar) {
            daftarPenghuni[i].tampilkanInfo();
            ditemukan = true;
            break;
            }
        }
            if (!ditemukan) {
                System.out.println("\nTidak ditemukan penghuni dengan nomor kamar tersebut!");
            }
        }
}
