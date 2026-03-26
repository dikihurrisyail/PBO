class Dosen {
    String nama;
    String nidn;
    String prodi;

    void tampilkanData(){
        System.out.println("Nama: " + nama);
        System.out.println("NIDN: " + nidn);
        System.out.println("Prodi: " + prodi);
    }
}

public class MainDosen {
    public static void main(String[] args) {
        Dosen dsn1 = new Dosen();
        Dosen dsn2 = new Dosen();

        dsn1.nama = "Arkham Zahri Rakhman, S.Kom., M.Eng.";
        dsn1.nidn = "0604049001";
        dsn1.prodi = "Teknik Informatika";

        dsn2.nama = "Martin Clinton Tosima Manullang, Ph.D.";
        dsn2.nidn = "0009019302";
        dsn2.prodi = "Teknik Informatika";

        dsn1.tampilkanData();
        System.out.println();
        dsn2.tampilkanData();
    }
}
