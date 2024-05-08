public class KueJadi extends Kue {
    private int jumlah;

    public KueJadi(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * jumlah * 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jumlah: " + jumlah;
    }
}
