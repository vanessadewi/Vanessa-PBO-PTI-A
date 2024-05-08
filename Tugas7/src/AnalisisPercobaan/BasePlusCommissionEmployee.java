import java.time.LocalDate;

public class BasePlusCommissionEmployee extends
CommissionEmployee {
 private double baseSalary;//gaji pokok tiap minggu

 //no 4
 public BasePlusCommissionEmployee(String name, String noKTP, LocalDate tanggalLahir, double sales, double rate, double salary) {
 super(name, noKTP, tanggalLahir, sales, rate);

 setBaseSalary(salary);
 }
 public void setBaseSalary(double salary) {
 baseSalary = salary;
 }
 public double getBaseSalary() {
 return baseSalary;
 }

 //no 4
 @Override
 public double earnings() {
 return getBaseSalary() + super.earnings();
 }
 @Override
 public String toString() {
    return String.format("Base-Salaried " +super.toString() + "\nbase salary:" + getBaseSalary());
 }
}
