public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Produk X", 3, 10000);
        Invoice invoice2 = new Invoice("Produk Y", 5, 5000);

        PermanentEmployee permanentEmployee = new PermanentEmployee(1, "Vanessa", 2000000, "(Plan A)");
        permanentEmployee.addInvoice(invoice1);
        permanentEmployee.addInvoice(invoice2);

        Employee.displayCompanyName();
        System.out.println("Detail Karyawan Tetap:");
        System.out.println("Nama: " + permanentEmployee.getName());
        System.out.println("Gaji Bersih: " + permanentEmployee.getPayableAmount());
        System.out.println("Detail Pekerjaan: " + permanentEmployee.workDetails());

        Intern internEmployee = new Intern(2, "Naufal", 10000000, "Mentor A", 5);
        internEmployee.addInvoice(invoice1);

        System.out.println("\nDetail Karyawan Magang:");
        System.out.println("Nama: " + internEmployee.getName());
        System.out.println("Gaji Bersih: " + internEmployee.getPayableAmount());
        System.out.println("Detail Pekerjaan: " + internEmployee.workDetails());
        internEmployee.attendTrainingSession();
        internEmployee.trackContractDuration();
    }
}
