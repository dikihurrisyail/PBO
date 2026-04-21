class Anjing extends Hewan {
    String jenisGolongan;

    public Anjing(String jenisGolongan, String nama, int umur) {
        super(nama, umur);
        this.jenisGolongan = jenisGolongan;
    }

    void menggonggong() {
        System.out.println(nama + " menggonggong...");
    }

    void bermain() {
        System.out.println(nama + " sedang bermain");
    }
}