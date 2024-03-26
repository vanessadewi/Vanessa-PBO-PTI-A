//1. Lakukan percobaan diatas dan benahi jika menemukan kesalahan! 

    public class lingkaran{  
    int alas, tinggi;  
    public lingkaran(int alas){  
    this.alas = alas;  
    }

    public lingkaran(int alas, int tinggi){  
    this.alas = alas; 
    this.tinggi = tinggi;  
    }  

    //2. Pada class lingkaran Tambahkan constructor dengan parameter int tinggi, apa yang terjadi dan jelaskan! 
    //public lingkaran(int tinggi){
    //this.tinggi = tinggi;
    //}
    //2. terjadi error karena jumlah dan tipe parameternya sama

    //3. Pada class lingkaran tambahkan constrctor dengan tipe data String alas dan String tinggi, kemudian tambahkan 
    //method untuk melakukan parsing atau perubahan tipe data dari String menjadi integer. Setelah itu pada method main 
    //lakukan instansiasi objek dengan nama objek Lstring dengan memanggil constructor bertipe data String. Jelaskan!
    public lingkaran(String stringAlas, String stringTinggi){
    this.alas = Integer.parseInt(stringAlas);
    this.tinggi = Integer.parseInt(stringTinggi);
    }
    //konstruktor menerima dua parameter bertipe data String, konstruktor melakukan konversi tipe data String
    //untuk menginisialisasi nilai alas dan tinggi
    public void setAlas(int alas){  
    this.alas = alas;  
    }  
    public void setTinggi(int tinggi){  
    this.tinggi = tinggi;  
    }  
    public int getAlas(){  
    return alas;  
    } 
    public int getTinggi(){  
    return tinggi;  
    }  
    public double hitungLuas(){  
    double hasil = (double)(getTinggi()*getAlas())/2; 
    return hasil; 
    }
    public void displayMessage(){ 
    System.out.println("Hitung Luas : "+hitungLuas());
    }
}
