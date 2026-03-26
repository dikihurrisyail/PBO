class Matkul{
    String namaMK;
    int sks;

    Matkul (String namaMK, int sks){
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void tampilkanData(){
        System.out.println("Mata Kuliah : " + namaMK);
        System.out.println("SKS         : "+ sks);
        System.out.println();
    }
}

public class MainMatkul {
    public static void main(String[] args) {
        Matkul mk1 = new Matkul("Pemrograman Berorientasi Objek", 3);
        Matkul mk2 = new Matkul("Sistem Operasi", 3);

        mk1.tampilkanData();
        mk2.tampilkanData();
    }
}
