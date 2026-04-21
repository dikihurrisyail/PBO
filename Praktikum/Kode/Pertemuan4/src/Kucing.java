class Kucing extends Hewan{
    String ras;

    public Kucing(String ras, String nama, int umur) {
        super(nama, umur);
        this.ras = ras;
    }

    
    void mengeong() {
        System.out.println(nama + " mengeong...");
    }
    
    void berburu() {
        System.out.println(nama + " sedang berburu");
    }
}
