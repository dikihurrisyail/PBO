class MataKuliah {
    private String namaMK;
    private int sks;

    public MataKuliah(String namaMK, int sks) {
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public String getNamaMK() {
        return namaMK;
    }
    public int  getSKS() {
        return sks;
    }
    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }
    public void  setSKS(int sks) {
        this.sks = sks;
    }
}
