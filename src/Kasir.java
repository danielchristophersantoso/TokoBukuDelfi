public class Kasir {
    private String nama;
    private String id;
    private String password;

    public Kasir(String nama, String id, String password){
        this.nama = nama;
        this.id = id;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
