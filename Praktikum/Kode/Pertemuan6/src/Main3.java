abstract class Hewan{
    String nama;

    public Hewan(String nama){
        this.nama = nama;
    }

    abstract void suara();
}

interface Terbang{
    void terbang();
}

class Burung extends Hewan implements Terbang {
    public Burung(String nama){
        super(nama);
    }

    @Override
    void suara() {
        System.out.println(nama + " bersuara: cuit cuit cuit");
    }

    @Override
    public void terbang(){
        System.out.println(nama + " terbang dengan sayap.");
    }
}

class Kucing extends Hewan {
    public Kucing(String nama){
        super(nama);
    }

    @Override
    void suara(){
        System.out.println(nama + " bersuara: meong meong meong");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Hewan h1 = new Burung("Atha");
        Hewan h2 = new Kucing("Duta");

        h1.suara();
        if (h1 instanceof Terbang){
            Terbang t = (Terbang) h1;
            t.terbang();
        }
        System.out.println("---------------------------------");

        h2.suara();
        if (h2 instanceof Terbang){
            Terbang t = (Terbang) h2;
            t.terbang();
        } else {
            System.out.println(h2.nama + " tidak bisa Terbang");
        }
        System.out.println("----------------------------------");
    }
}