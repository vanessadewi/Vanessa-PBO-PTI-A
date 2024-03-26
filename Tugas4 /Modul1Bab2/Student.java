package Constructor;

//1. Lakukan percobaan constructor diatas dan benahi jika menemukan kesalahan!

public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;

    //5. Bagaimana cara menghitung banyaknya objek yang kita buat dari sebuah menginstance objek dari mein class? 
    //Tuliskan kodenya kemudian tampilkan informasinya dengan memanggil method jumlahObjek() bertipe void! 
    private static int jumlahObjek = 0;

    public Student(){ //1. student dengan s huruf kecil saya rubah menjadi S huruf besar
    name = "";
    address = "";
    age = 0;
    jumlahObjek++; //5. Meningkatkan nilai variabel
    }

    public Student(String n, String a, int ag){
    name = n;
    address = a;
    age = ag;
    jumlahObjek++; //5. Meningkatkan nilai variabel
    }

    //2. Tambahkan constructor pada class Student dengan parameter yang mempunyai parameter masing masing 
    //nilai dari mata pelajaran yang ada! Kemudian buat contoh objeknya pada main Class!
    public Student(double math, double english, double science){
    mathGrade = math;
    englishGrade = english;
    scienceGrade = science;
    jumlahObjek++; //5. Meningkatkan nilai variabel
    }

    public void setName(String n){
        name = n;
    }
    public void setAddress(String a){
    address = a;
    }
    public void setAge(int ag){
    age = ag;
    }
    public void setMath(int math){
    mathGrade = math;
    }
    public void setEnglish(int english){
    englishGrade = english;
    }
    public void setScience(int science){
    scienceGrade = science;
    }
    private double getAverage(){
    double result = 0;
    result = (mathGrade+scienceGrade+englishGrade)/3;
    return result;
    }

    //3. Tambahkan method dengan nilai balikan berupa boolean pada class student bernama statusAkhir untuk 
    //menentukan apakah siswa tersebut remidi atau tidak. Ketentuannya adalah jika nilai lebih dari atau sama 
    //dengan 61 adalah lolos sedangkan nilai kurang dari atau sama dengan 60 adakah remidi. Nilai yang di cari 
    //adalah nilai rata rata untuk semua mapel. Kemudian nilai pada method statusAkhir tampilkan pada method 
    //displayMessage! 
    public boolean statusAkhir() {
        return getAverage() >= 61;
    }

    public void displayMessage(){
    System.out.println("Siswa dengan nama "+name);
    System.out.println("beramalat di "+address);
    System.out.println("berumur "+age);
    System.out.println("mempunyai nilai rata rata"+getAverage());

    //3. Menampilkan status akhir siswa
    if (statusAkhir()) {
        System.out.println("Status Akhir: Lolos");
    } else {
        System.out.println("Status Akhir: Remidi");
    }
}

    //5. Bagaimana cara menghitung banyaknya objek yang kita buat dari sebuah menginstance objek dari mein class? 
    //Tuliskan kodenya kemudian tampilkan informasinya dengan memanggil method jumlahObjek() bertipe void! 

    public static void jumlahObjek() {
    System.out.println("Jumlah objek Student yang telah dibuat: " + jumlahObjek);
}

}

