import java.util.ArrayList;

public class Transaksi {
    private String idTransaksi;
    private String namaKasir;
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private String namaPelanggan;
    private String idPelanggan;
    private Double subTotalTransaksi;

    public Transaksi(String idTransaksi, String namaKasir, ArrayList<Buku> daftarBuku, String namaPelanggan, String idPelanggan, Double subTotalTransaksi) {
        this.idTransaksi = idTransaksi;
        this.namaKasir = namaKasir;
        this.daftarBuku = daftarBuku;
        this.namaPelanggan = namaPelanggan;
        this.idPelanggan = idPelanggan;
        this.subTotalTransaksi = subTotalTransaksi;
    }

    public String getIdTransaksi(){
        return idTransaksi;
    }

    public String getNamaKasir() {
        return namaKasir;
    }

    public ArrayList<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public Double getSubTotalTransaksi() {
        return subTotalTransaksi;
    }
}
