public class Peminjaman {
    String no_pinjaman;
    String nama_peminjam;
    String nim;
    String judul_buku;

    public Peminjaman(){
        no_pinjaman = "";
        nama_peminjam = "";
        nim = "";
        judul_buku = "";
    }

    public Peminjaman(String no_pinjaman, String nama_peminjam, String nim, String judul_buku){
        this.no_pinjaman = no_pinjaman;
        this.nama_peminjam = nama_peminjam;
        this.nim = nim;
        this.judul_buku = judul_buku;
    }

    public void tampilkan_info(){
        System.out.println("No Pinjaman: " + no_pinjaman);
        System.out.println("Nama Peminjam: " + nama_peminjam);
        System.out.println("NIM: " + nim);
        System.out.println("Judul Buku: " + judul_buku);
    }

    public void konfirmasi_peminjaman(){
        System.out.println("Peminjaman buku dengan judul " + judul_buku + " dikonfirmasi untuk NIM " + nim);
    }
}
