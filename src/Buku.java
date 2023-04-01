public class Buku {
    private String judulBuku;
    private Integer jumlahHalaman;
    private String penulis;

    public Buku(String judulBuku, Integer jumlahHalaman, String penulis) {
        this.judulBuku = judulBuku;
        this.jumlahHalaman = jumlahHalaman;
        this.penulis = penulis;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public Integer getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(Integer jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
}
