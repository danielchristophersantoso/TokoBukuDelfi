import java.util.ArrayList;

public class TokoBuku {
    private Kasir kasir;
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private ArrayList<Koleksi> daftarKoleksi = new ArrayList<>();
    private ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();
    private ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();

    public TokoBuku(Kasir kasir, ArrayList<Buku> daftarBuku, ArrayList<Koleksi> daftarKoleksi, ArrayList<Transaksi> daftarTransaksi, ArrayList<Pelanggan> daftarPelanggan) {
        this.kasir = kasir;
        this.daftarBuku = daftarBuku;
        this.daftarKoleksi = daftarKoleksi;
        this.daftarTransaksi = daftarTransaksi;
        this.daftarPelanggan = daftarPelanggan;
    }

    public Kasir getKasir() {
        return kasir;
    }

    public void setKasir(Kasir kasir) {
        this.kasir = kasir;
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

    public ArrayList<Koleksi> getDaftarKoleksi() {
        return daftarKoleksi;
    }

    public void addDaftarKoleksi(Koleksi koleksi) {
        daftarKoleksi.add(koleksi);
    }

    public void removeDaftarKoleksi(Integer index) {
        daftarKoleksi.remove(index);
    }

    public ArrayList<Transaksi> getDaftarTransaksi() {
        return daftarTransaksi;
    }

    public void addDaftarTransaksi(Transaksi transaksi) {
        daftarTransaksi.add(transaksi);
    }

    public void removeDaftarTransaksi(Integer index) {
        daftarTransaksi.remove(index);
    }

    public ArrayList<Pelanggan> getDaftarPelanggan() {
        return daftarPelanggan;
    }

    public void addDaftarPelanggan(Pelanggan pelanggan) {
        daftarPelanggan.add(pelanggan);
    }

    public void removeDaftarPelanggan(Integer index) {
        daftarPelanggan.remove(index);
    }
}
