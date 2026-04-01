public class Program {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("Pemrograman Berorientasi Objek", 3);
        MataKuliah mk2 = new MataKuliah("Sistem Operasi", 3);
        MataKuliah mk3 = new MataKuliah("Basis Data", 3);

        Mahasiswa m1 = new Mahasiswa("Diki Hurrisyail", "124140088", "Teknik Informatika", 4, mk1, mk2);
        Mahasiswa m2 = new Mahasiswa("Alfath Atha Muhana", "124140032", "Teknik Informatika", 4, mk2, mk3);
        Mahasiswa m3 = new Mahasiswa("Raka Putra Ariel", "124140033", "Teknik Informatika", 4, mk1, mk3);

        m1.tampilkanData();
        m2.tampilkanData();
        m3.tampilkanData();
    }
}
