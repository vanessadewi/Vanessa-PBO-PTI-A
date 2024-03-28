//1. Lakukan percobaan diatas dan benahi jika menemukan kesalahan! 

public class Student {
    //3. Setelah diperbaiki, ubahlah hak akses pada baris 4 (pada class Student)  menjadi private apa yang terjadi 
    //jika class Test dijalankan? Jelaskan! 
    //3. maka hanya class Student yang dapat mengaksesnya, class Test tidak bisa.
    private String name;
    private int mark;
    public void setName(String n){
    name=n;
    }
    public String getName(){
    return name;
    }
    public void setMark(int m){
    mark=m;
    }
    public int getMark(){
    return mark;
    }
   }
   
   //4. Jika kedua kelas diatas terdapat dalam package yang sama apakah konsep enkapsulasi tetap berfungsi? jelaskan! 
   //Tetap berfungsi, meskipun kedua kelas Student dan Test berada dalam paket yang sama. Enkapsulasi adalah konsep 
   //yang memungkinkan pembungkusan data bersama dengan metode yang beroperasi pada data tersebut dalam satu unit 
   //tunggal, atau dalam hal ini, dalam satu kelas. Itu berarti bahwa walaupun kelas Test berada dalam paket yang 
   //sama dengan kelas Student, kelas Test tidak akan secara langsung dapat mengakses atau mengubah atribut name dan
   // mark dari kelas Student tanpa menggunakan metode aksesor (getter) dan mutator (setter) yang telah diberikan
