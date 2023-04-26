public class Main {
    public static void main(String[] args) {
        String namaKasir = new String("Budi Budiman");
        String idKasir = new String("BD1981");
        String passwordKasir = new String("akuCintaOOP123");
        Kasir kasir = new Kasir(namaKasir, idKasir, passwordKasir);
        TokoBuku tokoBuku = new TokoBuku(kasir);
        //Dummy Data Start
            //Cek data kasir masuk/ga
//            System.out.println(tokoBuku.getKasir().getNama());
            //Add Koleksi
            Koleksi koleksi1 = new Koleksi("Koleksi 1");
            tokoBuku.addDaftarKoleksi(koleksi1);
            Koleksi koleksi2 = new Koleksi("Koleksi 2");
            tokoBuku.addDaftarKoleksi(koleksi2);
            Koleksi koleksi3 = new Koleksi("Koleksi 3");
            tokoBuku.addDaftarKoleksi(koleksi3);
            //Cek data koleksi masuk/ga
//            System.out.println(tokoBuku.getDaftarKoleksi().get(0).getNamaKoleksi());
            //Add Buku
            Buku buku0 = new Buku("Buku0", 100, "Daniel");
            tokoBuku.getDaftarKoleksi().get(0).getDaftarBuku().add(buku0);
            Buku buku0a = new Buku("Buku0a", 100, "Daniel");
            tokoBuku.getDaftarKoleksi().get(0).getDaftarBuku().add(buku0a);
            Buku buku1 = new Buku("Buku1", 100, "Shamgod");
            tokoBuku.getDaftarKoleksi().get(1).getDaftarBuku().add(buku1);
            Buku buku1a = new Buku("Buku1a", 100, "Shamgod");
            tokoBuku.getDaftarKoleksi().get(1).getDaftarBuku().add(buku1a);
            Buku buku2 = new Buku("Buku2", 100, "Delpin");
            tokoBuku.getDaftarKoleksi().get(2).getDaftarBuku().add(buku2);
            Buku buku2a = new Buku("Buku2a", 100, "Delpin");
            tokoBuku.getDaftarKoleksi().get(2).getDaftarBuku().add(buku2a);
            //Cek data buku masuk/ga
//            System.out.println(tokoBuku.getDaftarKoleksi().get(0).getDaftarBuku().get(0).getJudulBuku());
            //Add Pelanggan
            Pelanggan pelanggan0 = new Pelanggan("Daniel", "12345");
            tokoBuku.addDaftarPelanggan(pelanggan0);
            Pelanggan pelanggan1 = new Pelanggan("Shamgar", "23456");
            tokoBuku.addDaftarPelanggan(pelanggan1);
            Pelanggan pelanggan2 = new Pelanggan("Delvin", "34567");
            tokoBuku.addDaftarPelanggan(pelanggan2);
            //Cek data pelanggan masuk/ga
//            System.out.println(tokoBuku.getDaftarPelanggan().get(0).getNama());
            //Add Transaksi
            Transaksi transaksi0 = new Transaksi("AAA", tokoBuku.getKasir().getNama(), tokoBuku.getDaftarKoleksi().get(0).getDaftarBuku(), tokoBuku.getDaftarPelanggan().get(0).getNama(), tokoBuku.getDaftarPelanggan().get(0).getId(), 1200000.0);
            tokoBuku.addDaftarTransaksi(transaksi0);
            Transaksi transaksi1 = new Transaksi("BBB", tokoBuku.getKasir().getNama(), tokoBuku.getDaftarKoleksi().get(1).getDaftarBuku(), tokoBuku.getDaftarPelanggan().get(1).getNama(), tokoBuku.getDaftarPelanggan().get(1).getId(), 1700000.0);
            tokoBuku.addDaftarTransaksi(transaksi1);
            Transaksi transaksi2 = new Transaksi("CCC", tokoBuku.getKasir().getNama(), tokoBuku.getDaftarKoleksi().get(2).getDaftarBuku(), tokoBuku.getDaftarPelanggan().get(2).getNama(), tokoBuku.getDaftarPelanggan().get(2).getId(), 1900000.0);
            tokoBuku.addDaftarTransaksi(transaksi2);
            //Cek data transaksi masuk/ga
//            System.out.println(tokoBuku.getDaftarTransaksi().get(0).getIdTransaksi());
        //Dummy Data End
        new MenuUtama(tokoBuku);
//        new Masuk(tokoBuku);
    }
}