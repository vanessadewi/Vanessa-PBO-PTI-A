package Constructor;

//1. Lakukan percobaan constructor diatas dan benahi jika menemukan kesalahan!

import java.util.Scanner;

public class MainStudent {  

    public static void main(String[] args) { 

    //4. Bagaimana cara memasukkan jumlah siswa sesuai dengan keinginan user? Tuliskan kodenya dengan inputan user 
    //yang interaktif! (key : menggunakan array) 
    Scanner input = new Scanner(System.in);
    System.out.print("Silakan masukkan jumlah siswa: ");
    int jumlahSiswa = input.nextInt();
    Student[] siswa = new Student[jumlahSiswa];
    for (int i = 0; i < siswa.length; i++) {
    siswa[i] = new Student();
    }

    Student anna = new Student();  
    anna.setName("Anna");  
    anna.setAddress("Malang");  
    anna.setAge(20);  
    anna.setMath(100);  
    anna.setScience(89);  
    anna.setEnglish(80);  
    anna.displayMessage();  
      
    //menggunakan constructor lain  
    System.out.println("===================");  
    Student chris = new Student("Chris", "Kediri", 21);  
    chris.setMath(70);  
    chris.setScience(60);  
    chris.setEnglish(90);  
    chris.displayMessage();
    
    //siswa  dengan  nama  anna  dirubah  informasi  alamat  dan umurnya melalui constructor  
    System.out.println("===================");  
    anna = new Student("anna", "Batu", 18); //1. student dengan s huruf kecil saya rubah menjadi S huruf besar
    anna.displayMessage();  
    
    //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method  
    System.out.println("===================");  
    chris.setAddress("Surabaya");  
    chris.setAge(22);  
    chris.displayMessage();  

    //2.  Tambahkan constructor pada class Student dengan parameter yang mempunyai parameter masing masing 
    //nilai dari mata pelajaran yang ada! Kemudian buat contoh objeknya pada main Class!
    Student Vanessa = new Student(97.5, 95.0, 97.5); 

    //5. Bagaimana cara menghitung banyaknya objek yang kita buat dari sebuah menginstance objek dari mein class? 
    //Tuliskan kodenya kemudian tampilkan informasinya dengan memanggil method jumlahObjek() bertipe void! 
    Student.jumlahObjek();
    }
}
