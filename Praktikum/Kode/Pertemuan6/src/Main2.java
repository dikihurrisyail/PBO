interface Terbang{
    void terbang();
}

class Burung implements Terbang{
    @Override
    public void terbang(){
        System.out.println("Burung terbang dengan sayap");
    }
}

class Pesawat implements Terbang{
    @Override
    public void terbang(){
        System.out.println("Pesawat terbang menggunakan mesin");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Terbang b = new Burung();
        Terbang p = new Pesawat();

        b.terbang();
        p.terbang();
    }
}