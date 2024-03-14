public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;
    private Dosen dosenPengajar;

    public MataKuliah(String kode, String nama, int sks, Dosen dosen) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.dosenPengajar = dosen;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSKS() {
        return sks;
    }

    public Dosen getDosenPengajar() {
        return dosenPengajar;
    }

    public void setDosenPengajar(Dosen dosen) {
        this.dosenPengajar = dosen;
    }
}
