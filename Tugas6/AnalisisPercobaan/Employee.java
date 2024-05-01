//1. Jalankan code program diatas dan benahi jika menemukan kesalahan! 
//Sudah aman tidak ada kesalahan

import java.util.*; 
public class Employee { 
    private String name; 
    private double salary; 
    private Date hireday; 

    //5. Untuk apa digunakan keyword this pada class manager dan employee? Hapus keyword 
    //this dan amati apa yang terjadi? 
    public Employee(String name, double salary, int year,int month, int day){ 
        this.name = name; 
        this.salary = salary; 
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day); 
        this.hireday = calendar.getTime(); 
    //Saat menginstansiasi kelas Manager dan Employee di Main, keduanya diberi parameter name, 
    //salary, year, month, dan day. Ketika menginstansiasi Manager, itu menggunakan konstruktor 
    //dari kelas Manager yang memanggil konstruktor Employee. Konstruktor Employee yang 
    //dimodifikasi tidak menggunakan kata kunci "this", yang berarti variabel global Employee tetap 
    //memiliki nilai default di setiap instansinya. Saat menggunakan metode getter di Main, itu 
    //menggunakan variabel global. Namun, karena variabel global tersebut belum diinisialisasi 
    //(masih default), maka nilainya menjadi null meskipun telah diisi nilai pada konstruktor.
    } 

    //3. Tambahkan constructor pada class Employee dengan parameter String name! amati 
    //perubahan apa yang terjadi, jelaskan jawaban anda!
    //6. Tambahkan constructor pada class Employee dengan parameter Bertipe data string 
    //bernama name yang nantinya bila constructor ini akan dipanggil akan menginisialisasi 
    //variable name! Amati perubahannya pada class anak dan jelaskan! Benahi bila terjadi 
    //kesalahan! 
    public Employee(String name) {
        //this.name = name;
        this.name = name;
    }
    //3. Tidak ada efek yang terjadi pada kelas `main` karena tidak ada panggilan konstruktor yang 
    //membutuhkan parameter lainnya selain `String`. Dalam hal ini, konstruktor yang hanya 
    //menerima `String` tidak menghasilkan kesalahan. 
    //6. Di konstruktor Manager, meskipun parameter sesuai dengan yang ada di kelas Main, saat 
    //metode super dipanggil untuk memanggil konstruktor di Employee, hanya parameter name 
    //yang diteruskan. Oleh karena itu, parameter lainnya seperti salary, month, day, dan year tidak 
    //diteruskan ke konstruktor Employee. Ini mengakibatkan pada saat instansiasi Manager dengan 
    //parameter boss, hanya nama yang berubah, sementara nilai lainnya tetap menggunakan nilai 
    //default. Ketika metode getter dipanggil, nilai salary awalnya adalah 0. Namun, karena ada 
    //metode di Main yang mengubah nilai salary menjadi 5000, nilai akhir dari salary boss menjadi 
    //5000. Di sisi lain, pada instansi konstruktor Employee bernama staff, proses berjalan seperti 
    //biasa karena langsung memanggil konstruktor di Employee tanpa melalui subclass Manager 
    //terlebih dahulu. 

    //8. Ubahlah acces modifier method pada kelas employee menjadi : 
    //a. Private 
    //b. Protected 
    //Amati perubahan apa yang terjadi? Jelaskan jawaban anda dengan detail! 
    // public Date getHireDay(){ 
    //     return hireday; 
    // } 
    // public String getName(){ 
    //     return name; 
    // } 
    // public double getSalary(){ 
    //     return salary; 
    // } 
    // private Date getHireDay(){ 
    //     return hireday; 
    // } 
    // private String getName(){ 
    //     return name; 
    // } 
    // private double getSalary(){ 
    //     return salary; 
    // } 
    //Ketika method-method diubah menjadi private, itu berarti method-method tersebut hanya dapat diakses oleh 
    //kelas Employee itu sendiri. Dengan kata lain, tidak ada kelas lain yang dapat mengakses method-method ini 
    //secara langsung, bahkan kelas turunan (subclass) dari Employee.
    protected Date getHireDay(){ 
        return hireday; 
    } 
    protected String getName(){ 
        return name; 
    } 
    protected double getSalary(){ 
        return salary; 
    } 
    //Ketika method-method diubah menjadi protected, itu berarti method-method tersebut dapat diakses oleh kelas 
    //Employee itu sendiri, kelas dalam paket yang sama, dan juga oleh kelas turunannya (subclass) di paket yang 
    //berbeda.
    
    public void raiseSalary(double byPercent){ 
        double raise = salary * byPercent/100; 
        salary+=raise; 
    } 
} 
