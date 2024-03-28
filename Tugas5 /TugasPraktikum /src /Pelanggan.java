import java.util.HashMap;
import java.util.Map;

public class Pelanggan {
    private String nomorPelanggan;
    private String nama;
    private double saldo;
    private int jenisRekening;
    private int pin;
    private int kesalahanAutentikasi;

    public Pelanggan(String nomorPelanggan, String nama, double saldo, int jenisRekening, int pin) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.jenisRekening = jenisRekening;
        this.pin = pin;
        this.kesalahanAutentikasi = 0;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getJenisRekening() {
        return jenisRekening;
    }

    public boolean beli(double jumlah, int pin) {
        if (autentikasi(pin)) {
            double cashback = hitungCashback(jumlah);
            saldo += (jumlah - cashback);
            return true;
        }
        return false;
    }

    public boolean topUp(double jumlah, int pin) {
        if (autentikasi(pin)) {
            saldo += jumlah;
            return true;
        }
        return false;
    }

    private boolean autentikasi(int pin) {
        if (this.pin == pin) {
            kesalahanAutentikasi = 0;
            return true;
        } else {
            kesalahanAutentikasi++;
            if (kesalahanAutentikasi >= 3) {
                System.out.println("Akun Anda telah diblokir karena terlalu banyak kesalahan dalam autentikasi.");
                return false;
            }
            System.out.println("PIN salah. Silakan coba lagi.");
            return false;
        }
    }

    private double hitungCashback(double jumlah) {
        if (jumlah > 1000000) {
            switch (jenisRekening) {
                case 38:
                    return 0.05 * jumlah;
                case 56:
                    return (0.07 * jumlah > 0.02 * jumlah) ? 0.07 * jumlah : 0.02 * jumlah;
                case 74:
                    return (0.10 * jumlah > 0.05 * jumlah) ? 0.10 * jumlah : 0.05 * jumlah;
                default:
                    return 0.02 * jumlah;
            }
        } else {
            switch (jenisRekening) {
                case 38:
                case 56:
                    return 0.02 * jumlah;
                case 74:
                    return 0.05 * jumlah;
                default:
                    return 0.02 * jumlah;
            }
        }
    }
}

class Supermarket {
    private Map<String, Pelanggan> daftarPelanggan;
  
    public Supermarket() {
        daftarPelanggan = new HashMap<>();
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        daftarPelanggan.put(pelanggan.getNomorPelanggan(), pelanggan);
    }

    public boolean beli(String nomorPelanggan, double jumlah, int pin) {
        if (daftarPelanggan.containsKey(nomorPelanggan)) {
            Pelanggan pelanggan = daftarPelanggan.get(nomorPelanggan);
            if (pelanggan.beli(jumlah, pin)) {
                if (pelanggan.getSaldo() >= 10000) {
                    return true;
                } else {
                    System.out.println("Saldo tidak mencukupi. Transaksi dibatalkan.");
                }
            }
        } else {
            System.out.println("Pelanggan tidak ditemukan.");
        }
        return false;
    }

    public boolean topUp(String nomorPelanggan, double jumlah, int pin) {
        if (daftarPelanggan.containsKey(nomorPelanggan)) {
            Pelanggan pelanggan = daftarPelanggan.get(nomorPelanggan);
            return pelanggan.topUp(jumlah, pin);
        } else {
            System.out.println("Pelanggan tidak ditemukan.");
            return false;
        }
    }
}import java.util.HashMap;
import java.util.Map;

public class Pelanggan {
    private String nomorPelanggan;
    private String nama;
    private double saldo;
    private int jenisRekening;
    private int pin;
    private int kesalahanAutentikasi;

    public Pelanggan(String nomorPelanggan, String nama, double saldo, int jenisRekening, int pin) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.jenisRekening = jenisRekening;
        this.pin = pin;
        this.kesalahanAutentikasi = 0;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getJenisRekening() {
        return jenisRekening;
    }

    public boolean beli(double jumlah, int pin) {
        if (autentikasi(pin)) {
            double cashback = hitungCashback(jumlah);
            saldo += (jumlah - cashback);
            return true;
        }
        return false;
    }

    public boolean topUp(double jumlah, int pin) {
        if (autentikasi(pin)) {
            saldo += jumlah;
            return true;
        }
        return false;
    }

    private boolean autentikasi(int pin) {
        if (this.pin == pin) {
            kesalahanAutentikasi = 0;
            return true;
        } else {
            kesalahanAutentikasi++;
            if (kesalahanAutentikasi >= 3) {
                System.out.println("Akun Anda telah diblokir karena terlalu banyak kesalahan dalam autentikasi.");
                return false;
            }
            System.out.println("PIN salah. Silakan coba lagi.");
            return false;
        }
    }

    private double hitungCashback(double jumlah) {
        if (jumlah > 1000000) {
            switch (jenisRekening) {
                case 38:
                    return 0.05 * jumlah;
                case 56:
                    return (0.07 * jumlah > 0.02 * jumlah) ? 0.07 * jumlah : 0.02 * jumlah;
                case 74:
                    return (0.10 * jumlah > 0.05 * jumlah) ? 0.10 * jumlah : 0.05 * jumlah;
                default:
                    return 0.02 * jumlah;
            }
        } else {
            switch (jenisRekening) {
                case 38:
                case 56:
                    return 0.02 * jumlah;
                case 74:
                    return 0.05 * jumlah;
                default:
                    return 0.02 * jumlah;
            }
        }
    }
}

class Supermarket {
    private Map<String, Pelanggan> daftarPelanggan;
  
    public Supermarket() {
        daftarPelanggan = new HashMap<>();
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        daftarPelanggan.put(pelanggan.getNomorPelanggan(), pelanggan);
    }

    public boolean beli(String nomorPelanggan, double jumlah, int pin) {
        if (daftarPelanggan.containsKey(nomorPelanggan)) {
            Pelanggan pelanggan = daftarPelanggan.get(nomorPelanggan);
            if (pelanggan.beli(jumlah, pin)) {
                if (pelanggan.getSaldo() >= 10000) {
                    return true;
                } else {
                    System.out.println("Saldo tidak mencukupi. Transaksi dibatalkan.");
                }
            }
        } else {
            System.out.println("Pelanggan tidak ditemukan.");
        }
        return false;
    }

    public boolean topUp(String nomorPelanggan, double jumlah, int pin) {
        if (daftarPelanggan.containsKey(nomorPelanggan)) {
            Pelanggan pelanggan = daftarPelanggan.get(nomorPelanggan);
            return pelanggan.topUp(jumlah, pin);
        } else {
            System.out.println("Pelanggan tidak ditemukan.");
            return false;
        }
    }
}
