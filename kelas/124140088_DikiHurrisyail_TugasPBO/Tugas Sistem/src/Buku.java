public class Buku {
    String judul;
    String penulis;
    int tahun_terbit;

    public Buku(){
        judul = "";
        penulis = "";
        tahun_terbit = 0;
    }

    public Buku(String judul, String penulis, int tahun_terbit){
        this.judul = judul;
        this.penulis = penulis;
        this.tahun_terbit = tahun_terbit;
    }

    public void tampilkan_info(){
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahun_terbit);
    }

    public void info_singkat(){
        System.out.println(judul + "-" + penulis + "-" + tahun_terbit);
    }
}
