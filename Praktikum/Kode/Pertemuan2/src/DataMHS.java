class Mahasiswa{
    String nama;
    String nim;
    String prodi;

    Mahasiswa(String nama, String nim, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    void tampilkanData(){
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Prodi   : " + prodi);
        System.out.println("-------------------------------");
    }
}

public class DataMHS {
    public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa("Diki Hurrisyail","124140088", "Teknik Informatika");
    Mahasiswa mhs2 = new Mahasiswa("Kevin Savero","124140143", "Teknik Informatika");
    Mahasiswa mhs3 = new Mahasiswa("Samuel Purba","124140185", "Teknik Informatika");

    System.out.println("======================DATA MAHASISWA======================");
    mhs1.tampilkanData();
    mhs2.tampilkanData();
    mhs3.tampilkanData();
    }
}
