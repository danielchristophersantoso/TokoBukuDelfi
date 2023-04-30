import java.util.ArrayList;

public class Koleksi {
    private String namaKoleksi;
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public Koleksi(String namaKoleksi) {
        this.namaKoleksi = namaKoleksi;
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
    public int searchDaftarBuku(String judulBuku, String penulis) {
        for (Buku b: daftarBuku) {
            if (b.getJudulBuku().equals(judulBuku) && b.getPenulis().equals(penulis)) {
                return daftarBuku.indexOf(b);
            }
        }
        return -1;
    }
}
