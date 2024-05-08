import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double wage; //upah per jam
    private double hours; //jumlah jam tiap minggu

    //no 4
    public HourlyEmployee(String name, String noKTP, LocalDate tanggalLahir, double hourlyWage, double hoursWorked) {
    super(name, noKTP, tanggalLahir);

    setWage(hourlyWage);
    setHours(hoursWorked);
    }
    public void setWage(double hourlyWage){
    wage = hourlyWage;
    }
    public double getWage(){
    return wage;
    }
    public void setHours(double hoursWorked){
    hours = hoursWorked;
    }
    public double getHours(){
    return hours;
    }

    //no 4
    @Override
    public double earnings(){
    if(getHours()<=40)
    return getWage() * getHours();
    else
    return 40 * getWage() + ( getHours()-40) * getWage() * 1.5;
    }
    @Override
    public String toString(){
    return String.format("Hourly employee: "+super.toString() +"\nhourly wage: "+getWage()+"\nhours worked: "+getHours());
    }
   }
   
