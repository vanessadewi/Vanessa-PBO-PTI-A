package TugasPraktikum;

public class Pegawai {
    private String nama;
    private String noKTP;
    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }
    public String getNama() {
        return nama;
    }
    public String getNoKTP() {
        return noKTP;
    }
    @Override
    public String toString() {
        return "No KTP : " +
                this.noKTP;
    }
    public double gaji(){
        return 0 ;
    }
}
