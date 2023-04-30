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

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
