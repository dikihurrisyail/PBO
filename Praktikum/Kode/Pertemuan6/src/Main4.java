abstract class Hewan {
    String nama;

    public Hewan(String nama){
        this.nama = nama;
    }

    abstract void suara();

    void tampilkanInfo(){
        System.out.println("Nama: " + nama);
    }
}

interface Terbang {
    void terbang();
}

class Kucing extends Hewan{
    public Kucing(String nama){
        super(nama);
    }

    @Override
    void suara(){
        System.out.println(nama + " bersuara meong meong");
    }
}

class Anjing extends Hewan {
    public Anjing(String nama){
        super(nama);
    }
    
    @Override
    void suara(){
        System.out.println(nama + " bersuara guk guk");
    }
}

class Burung extends Hewan implements Terbang{
    public Burung(String nama){
        super(nama);
    }

    @Override
    void suara(){
        System.out.println(nama + " bersuara cuit cuit");
    }

    @Override
    public void terbang(){
        System.out.println("Bisa terbang");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Hewan[] daftarHewan = {
            new Kucing("Duta"),
            new Anjing("Yowen"),
            new Burung("Atha"),
            new Kucing("Kepin"),
            new Anjing("Agit")
        };

        for (Hewan h : daftarHewan){
            h.tampilkanInfo();
            h.suara();

            if (h instanceof Terbang) {
                Terbang t = (Terbang) h;
                t.terbang();
            } else {
                System.out.println(h.nama + " tidak bisa terbang");
            }
            System.out.println("----------------------------------");
        }
    }
}
