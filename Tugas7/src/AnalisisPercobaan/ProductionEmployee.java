// 5. Perusahaan yang mengaplikasikan program polimorfisme diatas ingin menambahkan 
// kriteria baru untuk penggajian karyawannya, yaitu penggajian berdasarkan banyaknya 
// barang yang diproduksi. Dengan ketentuan gaji karyawan tersebut adalah hasil dari 
// banyaknya barang yang dipoduksi per minggu dikalikan upah per barangnya.  
// a. Analisis dan jelaskan proses modifikasi program diatas (dimulai dari pemilihan jenis 
// class, perancangan class, dan penempatan class) 
//Membuat kelas baru yang mewakili karyawan yang gajinya ditentukan berdasarkan banyaknya barang yang diproduksi. 
//Membuat atribut untuk menyimpan jumlah barang yang diproduksi per minggu dan upah per barang. 
//Kelas ini juga akan memiliki metode untuk menghitung pendapatan karyawan berdasarkan jumlah barang yang diproduksi dan upah per barangnya.
//Kelas ProductionEmployee akan ditempatkan di dalam paket yang sama dengan kelas-kelas lainnya, di mana 
//kelas-kelas tersebut mengimplementasikan polimorfisme untuk mengelola karyawan.

// b. Implementasi hasil analisis tersebut ke dalam program dan buat kelas uji dengan 
// minimal 4 objek yang dibentuk. 

public class ProductionEmployee extends Employee {
    private int producedItems; // jumlah barang yang diproduksi per minggu
    private double itemWage; // upah per barang

    public ProductionEmployee(String name, String noKTP, int producedItems, double itemWage) {
        super(name, noKTP);
        this.producedItems = producedItems;
        this.itemWage = itemWage;
    }
    public void setProducedItems(int producedItems) {
        this.producedItems = producedItems;
    }
    public int getProducedItems() {
        return producedItems;
    }
    public void setItemWage(double itemWage) {
        this.itemWage = itemWage;
    }
    public double getItemWage() {
        return itemWage;
    }
    @Override
    public double earnings() {
        return producedItems * itemWage;
    }
    @Override
    public String toString() {
        return String.format("Production employee: %s\nProduced items: %d\nItem wage: %.2f", super.toString(), producedItems, itemWage);
    }
}
