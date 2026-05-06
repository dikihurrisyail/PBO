abstract class Hewan {
    String nama;

    public Hewan(String nama){
        this.nama = nama;
    }

    abstract void suara();
    void makan(){
        System.out.println(nama + " sedang makan.");
    }
}

class Kucing extends  Hewan{
    public Kucing(String nama){
        super(nama);
    }

    @Override
    void suara(){
        System.out.println(nama + " bersuara: meong meong meong.");
    }
}

class Anjing extends Hewan {
    public Anjing(String nama){
        super(nama);
    }

    @Override
    void suara(){
        System.out.println(nama + " bersuara: guk guk guk.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Hewan k = new Kucing("Duta");
        Hewan a = new Anjing("Yowen");

        k.suara();
        k.makan();

        a.suara();
        a.makan();
    }
}