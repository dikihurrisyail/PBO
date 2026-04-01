class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private int semester;
    private  MataKuliah mk1;
    private  MataKuliah mk2;

    public Mahasiswa(String nama, String nim, String prodi, int semester, MataKuliah mk1, MataKuliah mk2) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        setSemester(semester);
        this.mk1 = mk1;
        this.mk2 = mk2;
    }

    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public String getProdi() {
        return prodi;
    }
    public int getSemester() {
        return semester;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
     public void setNim(String nim) {
        this.nim = nim;
    }
     public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public void setSemester(int semester){
        if (semester < 1) {
            System.out.println("Semester tidak boleh kurang dari 1");
        } else {
            this.semester = semester;
        }
    }

    public void tampilkanData() {
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Prodi       : " + prodi);
        System.out.println("Semester    : " + semester);
        System.out.println("Mata Kuliah: ");
        System.out.println("- " + mk1.getNamaMK() + " " + mk1.getSKS() + " SKS");
        System.out.println("- " + mk2.getNamaMK() + " " + mk2.getSKS() + " SKS");
        System.out.println("------------------------------------------");
    }
}