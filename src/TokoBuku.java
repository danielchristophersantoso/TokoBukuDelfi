import java.util.ArrayList;

public class TokoBuku {
    private Kasir kasir;
    private ArrayList<Koleksi> daftarKoleksi = new ArrayList<>();
    private ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();
    private ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();

    public TokoBuku(Kasir kasir) {
        this.kasir = kasir;
    }

    public Kasir getKasir() {
        return kasir;
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

    public ArrayList<Pelanggan> getDaftarPelanggan() {
        return daftarPelanggan;
    }

    public void addDaftarPelanggan(Pelanggan pelanggan) {
        daftarPelanggan.add(pelanggan);
    }
}
