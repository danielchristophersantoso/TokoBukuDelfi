import java.util.ArrayList;

public class TokoBuku {
    private Kasir kasir;
    private ArrayList<Koleksi> daftarKoleksi = new ArrayList<>();
    private ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();
    private ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();

    public TokoBuku(Kasir kasir) {
        this.kasir = kasir;

        // dummy pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Pelanggan1", "PL0001", 12);
        Pelanggan pelanggan2 = new Pelanggan("Pelanggan2", "PL0002", 10);
        Pelanggan pelanggan3 = new Pelanggan("Pelanggan3", "PL0003", 8);
        daftarPelanggan.add(pelanggan1);
        daftarPelanggan.add(pelanggan2);
        daftarPelanggan.add(pelanggan3);
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
