public class Main {
    public static void main(String[] args) {
        Manusia Naufal = new Manusia("Naufal Amin Musyafa", "111", true, true);
        System.out.println(Naufal + "\n");

        Manusia Vanessa = new Manusia("Vanessa Dewi Agustina", "112", false, true);
        System.out.println(Vanessa + "\n");

        Manusia Aurora = new Manusia("Aurora Nisa Kusyanto", "113", false, false);
        System.out.println(Aurora + "\n");

        MahasiswaFILKOM Anggy = new MahasiswaFILKOM("235150601111021", 2.8, "Anggy Sasmita", "213", false, false);
        System.out.println(Anggy + "\n");

        System.out.println("");

        MahasiswaFILKOM Agus = new MahasiswaFILKOM("235150401111032", 3.4, "Agus Al Hauzan", "212", true, false);
        System.out.println(Agus + "\n");

        MahasiswaFILKOM Yanto = new MahasiswaFILKOM("235150601111001", 3.6, "Yanto Baskara", "211", true, false);
        System.out.println(Yanto + "\n");

        Pekerja Admin = new Pekerja(1000, 2022, 3, 2, 2, "Kekeyi", "313", false, true);
        System.out.println(Admin + "\n");

        Pekerja Kasir = new Pekerja(1000, 2015, 10, 5, 0, "Onichang", "314", true, false);
        System.out.println(Kasir + "\n");

        Pekerja Sales = new Pekerja(2000, 2004, 1, 20, 10, "Arif Kun", "315", true, true);
        System.out.println(Sales + "\n");

        Manager Tumiran = new Manager("HRD", 7500, 2009, 2, 14, 0, "Tumiran", "411", true, false);
        System.out.println(Tumiran + "\n");
    }
}
