public class Pelanggan {
    private String nama;
    private String id;
    private Integer jumlahBuku;

    public Pelanggan(String nama, String id, int jumlahBuku) {
        this.nama = nama;
        this.id = id;
        this.jumlahBuku = jumlahBuku;
    }
    public Pelanggan(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public Integer getJumlahBuku() {
        return jumlahBuku;
    }

    public void setJumlahBuku(Integer jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }
}
