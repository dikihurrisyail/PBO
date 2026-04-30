public class Main5 {
    public static void main(String[] args) {
        Hewan[] daftarHewan = {
            new Kucing("Milo"),
            new Anjing("Buddy"),
            new Burung("Rio"),
            new Kucing("Luna"),
            new Anjing("Rocky")
        };

        System.out.println("Data Hewan");
        for (Hewan h : daftarHewan) {
            h.tampilkanData();
        }
    }
}