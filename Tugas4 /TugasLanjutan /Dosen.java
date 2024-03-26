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

    public Dosen(String nidn, String nama, String bidangKeahlian) {
        this(nidn, nama, bidangKeahlian, "");
    }

    public Dosen(String nidn, String nama) {
        this(nidn, nama, "", "");
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

    public void setBidangKeahlian() {
        this.bidangKeahlian = "";
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public Dosen getInfo() {
        return this;
    }
}
