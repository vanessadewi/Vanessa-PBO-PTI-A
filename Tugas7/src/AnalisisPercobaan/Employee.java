import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;

    //no 5
    public Employee(String name, String noKTP) {
        this.name = name;
        this.noKTP = noKTP;
    }

    //4. Tambahkan atribut tanggal lahir di Kelas Employee, serta tambahkan method 
    //pendukungnya (accesor dan mutator). Modifikasi program agar sesuai. Asumsikan gaji 
    //yang diterima adalah per bulan, buat kelas uji untuk menguji program yang sudah anda 
    //modifikasi, kemudian buat objek dari semua class (salariedEmployee, hourlyEmployee, 
    //commissionEmployee, basePlusCommissionEmployee dan hitung gajinya secara 
    //polimorfisme, serta tambahkan gajinya sebesar 100.000 jika bulan ini adalah bulan ulang tahunnya. 
    private LocalDate tanggalLahir;
    public Employee(String name, String noKTP, LocalDate tanggalLahir){

    this.name = name;
    this.noKTP = noKTP;
    //no 4
    this.tanggalLahir = tanggalLahir;
    }

    public String getName(){
    return name;
    }
    public String getNoKTP(){
    return noKTP;
    }

    //no 4
    public LocalDate getTanggalLahir() { //aksesor tanggal lahir
        return tanggalLahir;
    }
    public void setTanggalLahir(LocalDate tanggalLahir) { //mutator tanggal lahir
        this.tanggalLahir = tanggalLahir;
    }

    public String toString(){
    return String.format("\nNama: "+getName()+"\nNo. KTP:"+getNoKTP()+"\nTanggal Lahir:"+getTanggalLahir());
    }
    public abstract double earnings();//pendapatan
   }
   
