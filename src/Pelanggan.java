public class Pelanggan {
    private String nama;
    private String id;
    private Integer jumlahBuku;

    public Pelanggan(String nama, String id, Integer jumlahBuku) {
        this.nama = nama;
        this.id = id;
        this.jumlahBuku = jumlahBuku;
    }
    public Pelanggan(String nama, Integer jumlahBuku) {
        this.nama = nama;
        this.jumlahBuku = jumlahBuku;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getJumlahBuku() {
        return jumlahBuku;
    }

    public void setJumlahBuku(Integer jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }
}
