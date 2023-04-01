import java.util.ArrayList;

public class Koleksi {
    private String namaKoleksi;
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public Koleksi(String namaKoleksi, ArrayList<Buku> daftarBuku) {
        this.namaKoleksi = namaKoleksi;
        this.daftarBuku = daftarBuku;
    }

    public String getNamaKoleksi() {
        return namaKoleksi;
    }

    public void setNamaKoleksi(String namaKoleksi) {
        this.namaKoleksi = namaKoleksi;
    }

    public ArrayList<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public void addDaftarBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void removeDaftarBuku(Integer index) {
        daftarBuku.remove(index);
    }
}
