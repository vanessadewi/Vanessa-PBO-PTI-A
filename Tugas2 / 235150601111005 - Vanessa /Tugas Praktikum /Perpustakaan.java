public class Perpustakaan {
    private String namaBuku;
    private int tahunBuku;
    private String penulis;
    private String penerbit;

    public void tampilkanSesuaiKategori(int pilihan) {
        System.out.print("Kategori : ");
        switch (pilihan) {
            case 1:
                System.out.println("Teknologi\n");
                tampilkanBuku("Clean code: A Handbook of Agile Software Craftsmansip", "Robert C. Martin", "Prentice Hall");
                tampilkanBuku("Buku Pengantar Teknologi Informasi - Teknik Informatika", "Buhori Muslim", "Buku Pendidikan Deepublish");
                tampilkanBuku("Computer Architecture: A Quantitative Approach", "David A., Patterson dan John L.", "Philadelphia");
                tampilkanBuku("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, dan  John Vlissides", "Addison Wesley");
                tampilkanBuku("The Pragmatic Programmer: Your Journey to Mastery", "Andrew Hunt dan David Thomas", "Addison Wesley");
                tampilkanBuku("The Hidden Language of Computer Hardware and Software", "Charles Petzold", "Microsoft Press");
                break;
            case 2:
                System.out.println("Filsafat\n");
                tampilkanBuku("Buku Filsafat Dunia Sophie", "Jostein Gaarder", "H.W. Wilson Company");
                tampilkanBuku("Kutipan Buku Filosofi Teras", "Henry Manampiring", "PT Kompas Media Nusantara");
                tampilkanBuku("Sophie's World: A Novel About The History of Philosophy", "jostein Gaarder", "Farrar, Straus and Giroux");
                tampilkanBuku("Meditations", "Marcus Aurelius", "Noura Books Publishing");
                tampilkanBuku("Critique of pure Reason (Kritik der reinen Vernunft)", "Immanuel Kant", "Johann Friedrich Hartknoch");
                tampilkanBuku("Thus Spoke Zarathustra", "Friedrich Nietzsche", "Ernst Schmeitzner");
                break;
            case 3:
                System.out.println("Sejarah\n");
                tampilkanBuku("Guns, Germs, and Steel", "Jared Diamond", "W. W. Norton & Company");
                tampilkanBuku("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "McClelland & Stewart");
                tampilkanBuku("A People's History of the United States", "Howard Zinn", "Harper & Row");
                tampilkanBuku("The Silk Roads: A New History of the World", "Peter Frankopan", "Bloomsbury Publishing");
                tampilkanBuku("The Rise and Fall of the Third Reich: A History of Nazi Germany", "William L. Shirer", "Simon & Schuster");
                tampilkanBuku("1491: New Revelations of the Americas Before Columbus", " Charles C. Mann", " Alfred A. Knopf");
                break;

            case 4:
                System.out.println("Agama\n");
                tampilkanBuku("Fikih Wanita: Panduan Praktis Muslimah Sehari-hari", "Dr. Husin Shahab.", "Aqwam");
                tampilkanBuku("Bahasa Arab", "Anis", "Erlangga");
                tampilkanBuku("Tafsir Al-Mishbah: Pesan, Kesan, dan Keserasian Al-Qur'an", "Prof. Dr. Muhammad Quraish Shihab.", "Lentera Hati");
                tampilkanBuku("Islam dan Hak Asasi Manusia", "Prof. Dr. H. Achmad Ali.", "Gramedia Pustaka Utama");
                tampilkanBuku("Islam: A Short History", "Karen Armstrong", "Modern Library");
                tampilkanBuku("What Everyone Needs to Know About Islam", "John L. Esposito", "Oxford University Press");
                break;

            case 5:
                System.out.println("Psikologi\n");
                tampilkanBuku("Magnet Kepribadian", "Laksana Candra", "Araska Publisher");
                tampilkanBuku("Psikologi Remaja", "Asrori", "Rajawali Pers");
                tampilkanBuku("Psikologi Pendidikan: Teori dan Praktik", "Dr. M. Arifin Budi Susilo.", "Jakarta Indeks");
                tampilkanBuku("Psikologi Sosial: Perspektif Baru", "Dr. Sri Hastjarjo.", "Rineka Cipta");
                tampilkanBuku("Mengungkap Kepribadian dengan Tes Psikologi", "Ananda Sukarlan.", "Media Nusa Creative");
                tampilkanBuku("Buku Saku Psikologi", "Roy F. Baumeister dan Brad J. Bushman, diterjemahkan oleh Tim TBI UGM.", "Pbk");
                break;

            case 6:
                System.out.println("Politik\n");
                tampilkanBuku("Keadaban Politik", "Kurniawan", "Intrans Publishing");
                tampilkanBuku("Politik Kekuasaan", "Imron wassi", "Kepustakaan Populer Gramedia");
                tampilkanBuku("Pengantar Ilmu Politik", "Miriam Budiardjo", "Gramedia Pustaka");
                tampilkanBuku("Sistem Politik Indonesia: Kebijakan, Struktur, dan Proses", "Miriam Budiardjo", "CV Pustaka Setia");
                tampilkanBuku("The Communist Manifesto", "Karl Marx dan Friedrich Engels", "Penguin Classics");
                tampilkanBuku("The Conscience of a Conservative", "Barry Goldwater", "Victor Publishing Company");
                break;

            case 7:
                System.out.println("Fiksi\n");
                tampilkanBuku("Laskar Pelangi", "Andrea Hirata", "Bentang Pustaka");
                tampilkanBuku("Milea", "Pidi Baiq", "Pastel Books");
                tampilkanBuku("Bumi Manusia", "Pramoedya Ananta Toer", "Hasta Mitra");
                tampilkanBuku("Perahu Kertas", "Dewi Lestari", "Bentang Pustaka");
                tampilkanBuku("Ayat-Ayat Cinta", " Habiburrahman El Shirazy", "Pustaka Arafah");
                tampilkanBuku("Pulang ", "Tereliye", "Republika");
                break;
        }
    }

    public void tampilkanBuku(String judulBuku, String penulis, String penerbit) {
        System.out.println("Judul   : " + judulBuku);
        System.out.println("Penulis : " + penulis);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("");
    }
}
