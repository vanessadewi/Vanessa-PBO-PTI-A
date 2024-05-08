import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double weeklySalary; //gaji/minggu

    //no 4
    public SalariedEmployee(String name, String noKTP, LocalDate tanggalLahir, double salary) {
    super(name, noKTP, tanggalLahir);

    setWeeklySalary(salary);
    }
    public void setWeeklySalary(double salary) {
    weeklySalary = salary;
    }
    public double getWeeklySalary() {
    return weeklySalary;
    }

    //no 4
    @Override
    public double earnings() {
    return getWeeklySalary();
    }
    @Override
    public String toString() {
    return String.format("Salaried employee: " +super.toString() + "\nweekly salary:" + getWeeklySalary());
    }
    }
