import java.util.ArrayList;

public class Transaksi {
    private String namaKasir;
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private String namaPelanggan;
    private String idPelanggan;
    private Double subTotalTransaksi;

    public Transaksi(String namaKasir, ArrayList<Buku> daftarBuku, String namaPelanggan, String idPelanggan, Double subTotalTransaksi) {
        this.namaKasir = namaKasir;
        this.daftarBuku = daftarBuku;
        this.namaPelanggan = namaPelanggan;
        this.idPelanggan = idPelanggan;
        this.subTotalTransaksi = subTotalTransaksi;
    }

    public String getNamaKasir() {
        return namaKasir;
    }

    public void setNamaKasir(String namaKasir) {
        this.namaKasir = namaKasir;
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

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public Double getSubTotalTransaksi() {
        return subTotalTransaksi;
    }

    public void setSubTotalTransaksi(Double subTotalTransaksi) {
        this.subTotalTransaksi = subTotalTransaksi;
    }
}
