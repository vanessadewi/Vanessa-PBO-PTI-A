public class Dosen {
    private String nidn;
    private String nama;
    private String bidangKeahlian;
    private String jabatan;

    public Dosen(String nidn, String nama, String bidangKeahlian, String jabatan) {
        this.nidn = nidn;
        this.nama = nama;
        this.bidangKeahlian = bidangKeahlian;
        this.jabatan = jabatan;
    }

    public String getNIDN() {
        return nidn;
    }

    public String getNama() {
        return nama;
    }

    public String getBidangKeahlian() {
        return bidangKeahlian;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setBidangKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
