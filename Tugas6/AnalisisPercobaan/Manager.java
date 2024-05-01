//1. Jalankan code program diatas dan benahi jika menemukan kesalahan! 
//Sudah aman tidak ada kesalahan

public class Manager extends Employee { 
    private double bonus; 
    public Manager(String name, double salary, int year, int month, int day){ 

    //4. Pada Class Manager baris ke 5, setelah variable day tambahkan variable bonus! Amati 
    //apa yang terjadi dan mengapa demikian?   
        // super(name, salary, year, month, day, bonus); 
    //Kode error, dikarenakan parameter dan konstruktor tidak cocok. Di konstructor Employee, 
    //ada 5 parameter, sedangkan di parameter super ada 6 parameter. Ketika konstructor Employee 
    //sudah disesuaikan dengan 6 parameter, masih terjadi error. 
        super(name, salary, year, month, day); 
        bonus = 0; 
    } 

    //5. Untuk apa digunakan keyword this pada class manager dan employee? Hapus keyword 
    //this dan amati apa yang terjadi? 
    public void setBonus(double bonus){ 
        this.bonus = bonus; 
    } 
    //Saat menginstansiasi kelas Manager dan Employee di Main, keduanya diberi parameter name, 
    //salary, year, month, dan day. Ketika menginstansiasi Manager, itu menggunakan konstruktor 
    //dari kelas Manager yang memanggil konstruktor Employee. Konstruktor Employee yang 
    //dimodifikasi tidak menggunakan kata kunci "this", yang berarti variabel global Employee tetap 
    //memiliki nilai default di setiap instansinya. Saat menggunakan metode getter di Main, itu 
    //menggunakan variabel global. Namun, karena variabel global tersebut belum diinisialisasi 
    //(masih default), maka nilainya menjadi null meskipun telah diisi nilai pada konstruktor. 

    public double getSalary(){ 
        double baseSalary = super.getSalary(); 
        return baseSalary+bonus; 
    } 
     
}
