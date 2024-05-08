import java.time.LocalDate;

public class CommissionEmployee extends Employee {
    private double grossSales;//penjualan per minggu
    private double commissionRate;//komisi

    //no 4
    public CommissionEmployee(String name, String noKTP, LocalDate tanggalLahir, double sales, double rate){
        super(name, noKTP, tanggalLahir);

        setGrossSales(sales);
        setCommissionRate(rate);
        }
        public void setGrossSales(double sales){
        grossSales = sales;
        }
        public double getGrossSales(){
        return grossSales;
        }
        public void setCommissionRate(double rate){
        commissionRate = rate;
        }
        public double getCommissionRate(){
        return commissionRate;
        }

        //no 4
        @Override
        public double earnings(){
        return getCommissionRate()*getGrossSales();
        }
        @Override
        public String toString(){
        return String.format("Commision employee:"+super.toString()+"\ngross sales:"+getGrossSales()+"\ncommission rate:"+getCommissionRate());
        }
       }
