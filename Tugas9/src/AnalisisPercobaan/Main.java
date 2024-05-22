//1. Lakukan percobaan diatas dan benahi jika menemukan kesalahan serta jelaskan!

//7. Ubah source code diatas menjadi proses meminta inputan dari user dan buat menjadi interaktif! 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan menu pilihan
        System.out.println("Silahkan pilih identitas yang ingin Anda masukkan:");
        System.out.println("1. Manusia");
        System.out.println("2. Hewan");
        System.out.print("Pilihan = ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:

                System.out.print("Masukkan nama manusia: ");
                String namaManusia = scanner.next();
                System.out.print("Masukkan umur manusia: ");
                int umurManusia = scanner.nextInt();

                Manusia manusiaBaru = new Manusia(namaManusia, umurManusia);

                System.out.println("\nNama: " + namaManusia + ", Umur: " + umurManusia);
                manusiaBaru.makan();
                manusiaBaru.berjalan();
                manusiaBaru.bersuara();
                manusiaBaru.tampilkanNama();
                manusiaBaru.tampilkanUmur();
                break;

            case 2:

                System.out.print("Masukkan nama hewan: ");
                String namaHewan = scanner.next();
                System.out.print("Masukkan umur hewan (dalam bulan): ");
                int umurHewan = scanner.nextInt();

                Hewan hewanBaru = new Hewan(namaHewan, umurHewan);


                System.out.println("\nNama Hewan: " + namaHewan + ", Umur: " + umurHewan + " bulan");
                hewanBaru.makan();
                hewanBaru.berjalan();
                hewanBaru.bersuara();
                hewanBaru.tampilkanNama();
                hewanBaru.tampilkanUmur();
                break;

            default:
 
                System.out.println("Pilihan tidak valid.");
        }

//8. Buat objek selain objek diatas dengan menggunakan method yang berbeda dengan yang 
//diatas! (min.1 contoh) 
        Hewan hewanDefault = new Hewan("Tanpa Nama", 0);
        hewanDefault.makan();
        hewanDefault.bersuara();
        hewanDefault.berjalan();
    }
}

//2. Apakah class yang berbentuk Interface bisa diinstansiasi menjadi sebuah objek? Jelaskan 
//alasannya! 
//Tidak, kelas yang berbentuk interface tidak bisa diinstansiasi menjadi sebuah objek. Interfaces 
//hanya berisi definisi metode tanpa implementasi konkret. Mereka berfungsi sebagai kontrak untuk 
//kelas-kelas lain yang mengimplementasikan metode-metode yang didefinisikan di dalamnya. Sebagai 
//gantinya, Anda harus membuat kelas yang mengimplementasikan interface tersebut, dan kemudian Anda 
//dapat membuat objek dari kelas tersebut. Dengan demikian, interface sebenarnya adalah sebuah blueprint atau 
//template untuk membuat kelas-kelas yang menyediakan implementasi konkret dari metode-metode yang didefinisikan 
//dalam interface.

//3. Apakah suatu class dapat mengimplementasi class interface yang jumlahnya lebih dari 
//satu? Jelaskan alasannya! 
//Sebuah class dalam bahasa pemrograman Java dapat mengimplementasikan lebih dari satu interface sekaligus. 
//Ini disebut sebagai multiple interface implementation. Kemampuan ini memungkinkan sebuah class untuk mewarisi 
//perilaku dari lebih dari satu sumber, memungkinkan fleksibilitas yang lebih besar dalam desain dan struktur 
//program. Dengan mengimplementasikan beberapa interface, sebuah class dapat mengadopsi dan menyesuaikan perilaku 
//sesuai dengan kebutuhan aplikasi, memungkinkan untuk penggunaan yang lebih luas dan lebih spesifik dalam berbagai 
//konteks. Hal ini memungkinkan pengembang untuk memisahkan kontrak atau konsep yang berbeda menjadi unit-unit yang 
//lebih kecil dan terpisah, meningkatkan kohesi dan keterbacaan kode.
