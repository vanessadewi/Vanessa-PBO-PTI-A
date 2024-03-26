//1. Lakukan percobaan diatas dan benahi jika menemukan kesalahan! 

//public class LIngkaranMain{  
    //public static void main(String[] args){  
    //lingkaran l = new lingkaran(3); 
    //l.setTinggi(10); 
    //l.displayMessage(); 
    //lingkaran l2 = new lingkaran(4, 10); 
    //l2.displayMessage();
    //}
//}

//3. Pada class lingkaran tambahkan constrctor dengan tipe data String alas dan String tinggi, kemudian tambahkan 
//method untuk melakukan parsing atau perubahan tipe data dari String menjadi integer. Setelah itu pada method main 
//lakukan instansiasi objek dengan nama objek Lstring dengan memanggil constructor bertipe data String. Jelaskan!
    public class LIngkaranMain {
    public static void main(String[] args) {
    lingkaran Lstring = new lingkaran("5", "10");
    Lstring.displayMessage();
    }
}


