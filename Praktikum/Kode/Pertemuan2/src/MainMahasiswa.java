class Mahasiswa {
    String nama;
    String nim;
    String prodi;

    void tampilkanData(){
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Prodi   : " + prodi);
    }
}

public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.nama = "Diki Hurrisyail";
        mhs1.nim = "124140088";
        mhs1.prodi = "Teknik Informatika";

        mhs1.tampilkanData();
    }
}
