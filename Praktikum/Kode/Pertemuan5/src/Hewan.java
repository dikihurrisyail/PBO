class Hewan {
    String nama;
    String jenis;

    Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    String suara() {
        return "Hewan bersuara";
    }

    void tampilkanData() {
        System.out.println("Nama: " + nama +
                           " | Jenis: " + jenis +
                           " | Suara: " + suara());
    }
}

class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama, "Kucing");
    }

    String suara() {
        return "Mengeong";
    }
}

class Anjing extends Hewan {
    Anjing(String nama) {
        super(nama, "Anjing");
    }

    String suara() {
        return "Menggonggong";
    }
}

class Burung extends Hewan {
    Burung(String nama) {
        super(nama, "Burung");
    }

    String suara() {
        return "Berkicau";
    }
}