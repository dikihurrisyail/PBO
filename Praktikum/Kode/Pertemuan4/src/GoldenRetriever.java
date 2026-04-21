class GoldenRetriever extends Anjing {
    GoldenRetriever (String jenisGolongan, String nama, int umur){
        super(jenisGolongan, nama, umur);
    }

    void berenang() {
        System.out.println(nama + " sedang berenang");
    }

    void mengambil() {
        System.out.println(nama + " mengambil kayu");
    }
}