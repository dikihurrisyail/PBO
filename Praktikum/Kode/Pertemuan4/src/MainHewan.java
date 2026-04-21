public class MainHewan {
    public static void main(String[] args) {
        Kucing k = new Kucing("kamPUNK", "Celvin", 3);

        System.out.println("KUCING");
        System.out.println("Nama: " + k.nama);
        System.out.println("Umur: " + k.umur);
        System.out.println("Ras: " + k.ras);

        k.makan();
        k.tidur();
        k.mengeong();
        k.berburu();

        Anjing a = new Anjing("kamPUNK", "Gabriel", 2);

        System.out.println("\nAnjing");
        System.out.println("Nama: " + a.nama);
        System.out.println("Umur: " + a.umur);
        System.out.println("Golongan: " + a.jenisGolongan);

        a.makan();
        a.tidur();
        a.menggonggong();
        a.bermain();

        GoldenRetriever gr = new GoldenRetriever("Mamalia","Agit", 2);
        
        System.out.println("\nGolden Retriever");
        System.out.println("Nama: " + gr.nama);
        System.out.println("Umur: " + gr.umur);
        System.out.println("Golongan: " + gr.jenisGolongan);

        gr.makan();
        gr.tidur();

        gr.menggonggong();
        gr.bermain();

        gr.berenang();
        gr.mengambil();
    }
}