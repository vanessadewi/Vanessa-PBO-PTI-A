public interface Identitas { 

//4. Pada interface Identitas.java hapus method tampilkan nama, amati apa yang terjadi dan 
//mengapa demikian?
public void tampilkanNama(); 
//public void tampilkanNama(); 
//Jika metode `tampilkanNama()` dihapus dari interface `Identitas`, akan terjadi kesalahan kompilasi 
//pada setiap kelas yang mencoba mengimplementasikan interface tersebut. Ini terjadi karena setiap kelas 
//yang mengimplementasikan sebuah interface harus menyediakan implementasi untuk semua metode yang didefinisikan 
//dalam interface tersebut. Dengan menghapus metode tersebut, kita melanggar kontrak yang telah ditetapkan oleh 
//interface, yang mengharuskan semua kelas yang mengimplementasikannya untuk menyediakan implementasi untuk metode 
//tersebut. Sebagai hasilnya, penghapusan metode tersebut menyebabkan ketidaksesuaian antara interface dan 
//implementasinya, dan mengakibatkan kesalahan kompilasi.

public void tampilkanUmur(); 
} 
