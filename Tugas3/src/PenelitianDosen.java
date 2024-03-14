public class PenelitianDosen {
    private String judul;
    private int tahunMulai;
    private int tahunSelesai;
    private String status;
    private Dosen dosen;

    public PenelitianDosen(String judul, int tahunMulai, int tahunSelesai, String status, Dosen dosen) {
        this.judul = judul;
        this.tahunMulai = tahunMulai;
        this.tahunSelesai = tahunSelesai;
        this.status = status;
        this.dosen = dosen;
    }
    
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTahunMulai() {
        return tahunMulai;
    }

    public void setTahunMulai(int tahunMulai) {
        this.tahunMulai = tahunMulai;
    }

    public int getTahunSelesai() {
        return tahunSelesai;
    }

    public void setTahunSelesai(int tahunSelesai) {
        this.tahunSelesai = tahunSelesai;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }
}
