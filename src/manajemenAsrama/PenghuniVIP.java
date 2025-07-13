package manajemenAsrama;
public class PenghuniVIP extends PenghuniAsrama {
    private String fasilitas;
    
    //constructor
    public PenghuniVIP(String nama, String asal, int nomorKamar, String fasilitas) {
        super(nama, asal, nomorKamar);
        this.fasilitas = fasilitas;
    }

    // Polymorphism: override method tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Fasilitas   : " + fasilitas);
    }
    
    // Mutator
    public void setFasilitas(String fasilitas) {
    this.fasilitas = fasilitas;
    }
}



