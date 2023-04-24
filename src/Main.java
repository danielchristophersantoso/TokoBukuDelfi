public class Main {
    private static void main(String[] args) {
        String namaKasir = new String("Budi Budiman");
        String idKasir = new String("BD1981");
        String passwordKasir = new String("akuCintaOOP123");
        Kasir kasir = new Kasir(namaKasir, idKasir, passwordKasir);
        TokoBuku tokoBuku = new TokoBuku(kasir);
        new MenuUtama(tokoBuku);
//        new Masuk(tokoBuku);
    }
}