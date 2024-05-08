//1. Ketikkan kode ini
//Jalankan Main.java untuk polymorfisme Employee, analisis dan jelaskan keluaran program tersebut!
// public class Main {
//     public static void main(String[] args) {
//     Employee employee = new Employee();
//     }
//    }
//1. Kode yang diberikan akan menyebabkan kesalahan kompilasi karena tidak dapat membuat objek dari 
//kelas abstrak secara langsung. Kelas Employee adalah kelas abstrak, yang berarti tidak dapat diinisialisasi 
//sendiri. Sebagai gantinya, perlu membuat instansi dari subclass konkret dari Employee, seperti HourlyEmployee, 
//SalariedEmployee, CommissionEmployee, atau BasePlusCommissionEmployee.   

//2. Jalankan program dengan main sebagai berikut. 
//Analisis dan jelaskan output program (berdasarkan konsep polimorfisme)! 

import java.time.LocalDate;

public class Main { 
    public static void main(String[] args) { 
    
    //no 4
    SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", LocalDate.of(2004, 8, 5), 800.00); 
    HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", LocalDate.of(2003, 3, 25), 16.75, 40); 
    CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", LocalDate.of(1994, 4, 8), 10000, .06); 
    BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", LocalDate.of(1993, 7, 5), 5000, .04, 300); 

    //no 5
    ProductionEmployee productionEmployee = new ProductionEmployee("Dewi", "584", 100, 2.50);

    System.out.println("Employees diproses secara terpisah:\n"); 
    System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan: ", salariedEmployee.earnings()); 
    System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings()); 
    System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ", commissionEmployee.earnings()); 
    System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings()); 

    //no 5
    System.out.printf("%s\n%s: $%,.2f\n\n", productionEmployee, "earned", productionEmployee.earnings());
    
    Employee[] employees = new Employee[4]; 
    employees[0] = salariedEmployee; 
    employees[1] = hourlyEmployee;
    employees[2] = commissionEmployee; 
    employees[3] = basePlusCommissionEmployee; 
    
    System.out.println("Employees diproses secara polimorfisme:\n"); 
    for (Employee currentEmployee : employees) { 
    System.out.println(currentEmployee); 
    if (currentEmployee instanceof BasePlusCommissionEmployee) { 
    BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee; 
    employee.setBaseSalary(1.10 * employee.getBaseSalary()); 
    System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n", employee.getBaseSalary()); 
    } 
    System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings()); 
    } 
    for (int j = 0; j < employees.length; j++) { 
    System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName()); 
    } 

    //3. Buat objek dari method Employee? Jelaskan hasil dari output program tersebut! 
    // Employee employee = new Employee("Vanessa", "1234") { 
    // @Override
    // public double earnings() { 
    // return 1; 
    // } 
    // }; 
    //System.out.println(employee.toString());
    //3. Membuat objek baru dengan nama employee yang berisi parameter nama dan KTP, Vanessa No. KTP 1234  
    //harus meng override metod earnings dan metod ini tidak boleh kosong. Membuat output system.out.println untuk 
    //menampilkan employee.toString().

    } 
    }

//2. Output program menunjukkan penggunaan polimorfisme di mana objek-objek dari berbagai jenis kelas diproses 
//menggunakan referensi superclass Employee. Meskipun diproses menggunakan referensi yang sama, metod yang sesuai 
//dengan jenis objeknya dipanggil secara dinamis pada saat runtime. Misalnya, karyawan dengan jenis 
//BasePlusCommissionEmployee memiliki gaji pokok yang ditingkatkan, menunjukkan bahwa metod spesifik kelas turunan 
//dapat diakses melalui referensi superclass.
