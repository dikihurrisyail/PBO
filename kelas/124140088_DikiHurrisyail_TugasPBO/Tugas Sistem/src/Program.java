import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n===SISTEM PERPUSTAKAAN MINI===\n");
        System.out.print("Masukan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukan NIM: ");
        String nim = input.nextLine();
        Anggota anggota1 = new Anggota(nama, nim);
        System.out.println("Jumlah huruf nama anggota: " + anggota1.jumlah_huruf_nama);
        anggota1.sapa();

        Buku buku1 = new Buku("Manfaat MBG Bagi Generasi Muda Indonesia", "Prabowo Subianto", 2025);
        Buku buku2 = new Buku("Cara Parkir yang Baik dan Benar di Lingkungan ITERA", "Satpam ITERA", 2026);
        Buku buku3 = new Buku("Prediksi Cuaca ITERA 2026 - 2036", "Mbak Rara Pawang Hujan", 2026);

        System.out.println("\n===Daftar Buku Perpustakaan===");
        System.out.print("1. "); buku1.tampilkan_info();
        System.out.println();
        System.out.print("2. "); buku2.tampilkan_info();
        System.out.println();
        System.out.print("3. "); buku3.tampilkan_info();
        System.out.println();

        System.out.print("Pilih nomor buku yang ingin di pinjam: ");
        int pilihan = input.nextInt();
        input.nextLine();

        Buku buku_dipilih;
        switch (pilihan){
            case 1:
                buku_dipilih = buku1;
                buku_dipilih.info_singkat();
                break;

            case 2:
                buku_dipilih = buku2;
                buku_dipilih.info_singkat();
                break;

            case 3:
                buku_dipilih = buku3;
                buku_dipilih.info_singkat();
                break;
            
            default:
                System.out.println("Buku tidak ditemukan.");
                return;
        }

        System.out.print("Masukan Nomor Pinjaman: ");
        String no = input.nextLine();
        Peminjaman pinjam1 = new Peminjaman(no, anggota1.nama, anggota1.nim, buku_dipilih.judul);

        System.out.println("\n===Informasi Anggota===");
        anggota1.tampilkan_info();
        

        System.out.println("\n===Informasi Buku===");
        buku_dipilih.tampilkan_info();

        System.out.println("\n===Informasi Pinjaman===");
        pinjam1.tampilkan_info();
        pinjam1.konfirmasi_peminjaman();

        System.out.println("\n===PENJELASAN===");
        System.out.println("Object Anggota merepresentasikan peminjam.");
        System.out.println("Object Buku merepresentasikan koleksi perpustakaan.");
        System.out.println("Object Peminjaman menghubungkan Anggota dengan Buku.");
        System.out.println("Method tampilkan_info digunakan untuk menampilkan detail objek.");
        System.out.println("Method konfirmasi_peminjaman digunakan untuk memastikan proses peminjaman.");
    }
}
