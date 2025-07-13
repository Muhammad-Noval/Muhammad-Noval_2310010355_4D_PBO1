package manajemenAsrama;
public class PenghuniAsrama {
    protected String nama;
    protected String asal;
    protected int nomorKamar;

    // Constructor
    public PenghuniAsrama(String nama, String asal, int nomorKamar) {
        this.nama = nama;
        this.asal = asal;
        this.nomorKamar = nomorKamar;
    }
    
    
    // Mutator
    public void setNama(String nama) {
    this.nama = nama;
    }
    public void setAsal(String asal) {
        this.asal = asal;
    }
    public void setNomorKamar(int nomorKamar) {
        this.nomorKamar = nomorKamar;
    }
    
    
    // Accessor
    public String getNama() {
        return nama;
    }
    public int getNomorKamar() {
        return nomorKamar;
    }


    // Polymorphism
    public void tampilkanInfo() {
        System.out.println("Nama        : " + nama);
        System.out.println("Asal Daerah : " + asal);
        System.out.println("Nomor Kamar : " + nomorKamar);
    }
}
