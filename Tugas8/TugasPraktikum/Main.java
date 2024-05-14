package TugasPraktikum;

public class Main {

    public static void main(String[] args) {

        // Membuat objek dari kelas PegawaiTetap
        PegawaiTetap pT1 = new PegawaiTetap("Naufal", "2109876543234567890101", 5000000);
        PegawaiTetap pT2 = new PegawaiTetap("Amin", "2109876543234567890102", 3500000);
        PegawaiTetap pT3 = new PegawaiTetap("Musyafa", "2109876543234567890103", 4000000);
        PegawaiTetap pT4 = new PegawaiTetap("Abrisam", "2109876543234567890104", 4500000);

        // Menampilkan informasi PegawaiTetap
        System.out.println(pT1.toString());
        System.out.println(pT2.toString());
        System.out.println(pT3.toString());
        System.out.println(pT4.toString());

        // Membuat objek dari kelas PegawaiHarian
        PegawaiHarian pH1 = new PegawaiHarian("Reyza", "2109876543234567890110", 5000, 46);
        PegawaiHarian pH2 = new PegawaiHarian("Nabil", "2109876543234567890111", 6000, 30);
        PegawaiHarian pH3 = new PegawaiHarian("Raisya", "2109876543234567890112", 5500, 28);
        PegawaiHarian pH4 = new PegawaiHarian("Inara", "2109876543234567890113", 6000, 35);

        // Menampilkan informasi PegawaiHarian
        System.out.println(pH1.toString());
        System.out.println(pH2.toString());
        System.out.println(pH3.toString());
        System.out.println(pH4.toString());

        // Membuat objek dari kelas Sales
        Sales sL1 = new Sales("Jung Jaehyun", "2109876543234567890120", 30, 50000);
        Sales sL2 = new Sales("Cha Eunwoo", "2109876543234567890121", 45, 60000);
        Sales sL3 = new Sales("Jeon Jungkook", "2109876543234567890122", 50, 70000);
        Sales sL4 = new Sales("Kim Mingyu", "2109876543234567890122", 35, 50000);

        // Menampilkan informasi Sales
        System.out.println(sL1.toString());
        System.out.println(sL2.toString());
        System.out.println(sL3.toString());
        System.out.println(sL4.toString());

        // Menampilkan informasi pembuat program
        System.out.println("Nama : Vanessa Dewi Agustina");
        System.out.println("NIM : 235150601111005");
        System.out.println();

        // Upcasting PegawaiTetap ke Pegawai
        Pegawai p1 = pT1;
        System.out.println(p1.toString());

        // Downcasting Pegawai ke PegawaiTetap
        PegawaiTetap pT5 = (PegawaiTetap) p1;
        System.out.println(pT5.toString());
    }
}
