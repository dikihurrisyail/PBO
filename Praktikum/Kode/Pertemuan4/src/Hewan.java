class Hewan {
    String nama;
    int umur;

    Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    
    void makan(){
        System.out.println(nama + " sedang makan");
    }

    void tidur(){
        System.out.println(nama + " sedang tidur");
    }
}
