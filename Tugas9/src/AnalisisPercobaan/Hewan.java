//5. Jika pada class hewan kita hanya ingin mengimplements interface MakhlukHidup saja apa 
//yang terjadi? Jelaskan 
//Jika kelas `Hewan` hanya mengimplementasikan interface `MakhlukHidup`, maka kelas tersebut hanya perlu 
//menyediakan implementasi untuk metode-metode dalam `MakhlukHidup`, yaitu `makan()`, `berjalan()`, dan 
//`bersuara()`. Metode-metode dari interface `Identitas`, seperti `tampilkanNama()` dan `tampilkanUmur()`, 
//tidak perlu diimplementasikan lagi. Ini menyederhanakan kelas `Hewan` karena hanya berfokus pada perilaku yang 
//didefinisikan dalam `MakhlukHidup`, dan tidak terikat pada kontrak dari `Identitas`.

public class Hewan implements MakhlukHidup, Identitas { 
    
    //n0 7
    private String nama;
    private int umur;
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public Hewan() {
        this.nama = "Tanpa Nama";
        this.umur = 0;
    }

    @Override 
    public void makan() { 
        System.out.println("Makan pakai tangan dan mulut"); 
    } 
 
    @Override 
    public void berjalan() { 
        System.out.println("Jalan pakai 4 kaki"); 
    } 
 
    @Override 
    public void bersuara() { 
        System.out.println("Suaranya nggak jelas"); 
    } 
     
    public void tampilkanNama (){} 
     
    public void tampilkanUmur () {} 
} 
