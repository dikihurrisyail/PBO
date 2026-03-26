public class Anggota {
    String nama;
    String nim;
    int jumlah_huruf_nama;

    public Anggota(){
        nama = "";
        nim = "";
        jumlah_huruf_nama = 0;
    }

    public Anggota(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
        this.jumlah_huruf_nama = nama.length();
    }

    public void tampilkan_info(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jumlah Huruf Nama: " + jumlah_huruf_nama);
    }

    public void sapa(){
        System.out.println("\nHaloo " + nama + ". Selamat Datang di Perpustakaan\n");
    }
}
