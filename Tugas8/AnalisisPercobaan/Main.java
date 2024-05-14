//1. Jelaskan apa fungsi dari extends dan super pada kode subclass?
//Pada kode subclass, kata kunci extends dan super memiliki fungsi yang berbeda namun saling terkait dalam 
//hirarki pewarisan antar kelas. 
//Extends digunakan untuk menyatakan hubungan pewarisan antara kelas subclass dan superclass. Subclass 
//mewarisi semua atribut dan metode yang didefinisikan dalam superclass (kecuali yang dideklarasikan private). 
//Subclass dapat menambahkan atribut dan method baru yang tidak ada di superclass.  
//Sedangkan  Super digunakan untuk mengakses atribut dan metode dari superclass, digunakan dalam konstruktor 
//subclass untuk menginisialisasi atribut-atribut dari superclass, dan digunakan dalam method subclass untuk 
//memanggil method dari superclass.

//2. Untuk apa digunakan keyword this pada constructor, setter dan getter?
//Dalam constructor, this digunakan untuk merujuk kepada instance dari kelas tersebut.
//Dalam setter, this digunakan untuk merujuk kepada instance saat ini dan memperbarui nilai atributnya dengan 
//nilai yang diberikan.
//Dalam getter, this tidak umumnya digunakan, tetapi dalam beberapa kasus digunakan untuk membuat kode lebih 
//eksplisit atau untuk menghindari kebingungan dengan variabel lokal yang memiliki nama yang sama dengan atribut.

public class Main {
    public static void main(String[] args) {
        // casting
        // double angka = 5.4;
        // int angka_int = (int)angka;
        // System.out.println(angka_int);
        // Object dengan class HeroIntel
        HeroIntel hero1 = new HeroIntel("Ucup", 100);
        hero1.display();
        // upcasting
        Hero heroUp = (Hero) hero1;
        heroUp.display();
        // System.out.println(heroUp.getType()); //ini error
        // Object dgn class Hero
        Hero heroReg = new Hero("Boy", 100);
        heroReg.display();
        // downcasting
        // HeroAgility heroDown = (HeroAgility) heroReg; //ini error
        // heroDown.display();
        // heroUp dikembalikan ke hero1
        HeroIntel hero2 = (HeroIntel) heroUp;
        hero2.display(); // ini berhasil downcasting

        // 3. Tambahkan dan jalankan kode ini di kelas Main, lalu amati apa yang
        // terjadi?
        // HeroAgility hero3 = (HeroAgility) heroUp;
        // hero3.display();
        // class HeroIntel cannot be cast to class HeroAgility: Error ini menunjukkan
        // ingin mencoba mengubah
        // objek bertipe HeroIntel menjadi objek bertipe HeroAgility. Terjadi error
        // karena kelas tersebut tidak pada
        // satu garis keturunan. Casting hanya berfungsi jika objek yang di casting
        // benar-benar dalam satu garis keturunan

        // 4. Ubahlah modifier atribut type pada class HeroIntel dan HeroAgility menjadi
        // public, lalu coba akses
        // langsung melalui class Main. Apakah atribut bisa diakses langsung atau tidak,
        // jelaskan!
        // Tidak error tetapi terjadi kesalahan karena objek heroUp diinisialisasi
        // dengan objek HeroIntel pada baris Hero
        // heroUp = (Hero)hero1; dalam metode main. Kemudian, mencoba melakukan casting
        // dari heroUp ke HeroAgility
        // menggunakan HeroAgility hero3 = (HeroAgility) heroUp;.
        // Namun, karena objek heroUp adalah instance dari HeroIntel, bukan HeroAgility,
        // casting tersebut tidak dapat
        // dilakukan, dan ClassCastException dilemparkan. Dalam Java, casting objek dari
        // kelas ke kelas lain hanya dapat
        // dilakukan jika hubungan pewarisan antara kelas tersebut benar-benar ada
        // (yaitu, objek dari kelas yang lebih
        // spesifik ke kelas yang lebih umum atau sebaliknya).
        System.out.println();
        HeroAgility hero4 = new HeroAgility("Vanessa", 100);
        //System.out.println(hero4.type);
        hero4.display();
        HeroIntel hero5 = new HeroIntel("Vanessa Agustina", 90);
        //System.out.println(hero5.type);
        hero5.display();

        // 5. Buatlah class baru HeroMagic dengan atribut tambahan power = “Magic” serta
        // extends semua atribut dan
        // method dari class Hero. Kemudian coba buatlah kode untuk upcasting dan
        // downcasting dari class HeroMagic ke
        // Hero pada class Main!
        HeroMagic hero6 = new HeroMagic("Vanesss", 100);
        hero6.display();
        // Upcasting
        Hero heroUp2 = (Hero) hero6;
        System.out.println("\nUpcasting");
        heroUp2.display();
        // Downcasting
        HeroMagic heroDown = (HeroMagic) heroUp2;
        System.out.println("\nDowncasting");
        heroDown.display();

    }
}
