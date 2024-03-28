package Encapsulation2;

public class TestVehicle1{
    public static void main(String[] args){
    System.out.println("Creating a vehicle with a 10,000 kg maximumload.");

    //2. Tambahkan source code berikut dibawah baris ke 6 pada class TestVehicle1. 
    //System.out.println("Add load(100kg) : " + (vehicle.load=500)); 
    //Jalankan program, apakah output dari program tersebut? Kembalikan program seperti semula. 
    //System.out.println("Add load(100kg) : " + (vehicle.load=500)); 
    //Kode program akan error karena atribut load bersifat private, sehingga tidak dapat diakses langsung dari
    //luar kelas tersebut

    Vehicle1 vehicle = new Vehicle1(10000);
    System.out.println("Add box #1 (500kg) : " + vehicle.addBox(500));
    //a. Tambahkan source kode berikut dibawah baris ke 6 pada class TestVehicle1. 
    //System.out.println("Add load(100kg) : " + (vehicle.load=500)); 
    //Jalankan program, apakah output dari program tersebut? Kembalikan program seperti semula.
    System.out.println("Add load(100kg) : " + (vehicle.load=500)); 
    //Output dari program tersebut adalah
    //Creating a vehicle with a 10,000 kg maximumload.
    //Add box #1 (500kg) : true
    //Add load(100kg) : 500.0
    //Add box #2 (250kg) : true
    //Add box #3 (5000kg) : true
    //Add box #4 (4000kg) : true
    //Add box #5 (300kg) : false
    //Vehicle load is 9750.0kg

    System.out.println("Add box #2 (250kg) : " + vehicle.addBox(250));
    System.out.println("Add box #3 (5000kg) : " + vehicle.addBox(5000));
    System.out.println("Add box #4 (4000kg) : " + vehicle.addBox(4000));
    //b. Tambahkan source kode berikut dibawah baris ke 12 pada class TestVehicle1. 
    //System.out.println("Add load(100kg) : " + (vehicle.load=500)); 
    //Jalankan program, apakah output dari program tersebut? Kembalikan program seperti semula. 
    System.out.println("Add load(100kg) : " + (vehicle.load=500)); 

    //Output dari program tersebut adalah 
    //Creating a vehicle with a 10,000 kg maximumload.
    //Add box #1 (500kg) : true
    //Add load(100kg) : 500.0
    //Add box #2 (250kg) : true
    //Add box #3 (5000kg) : true
    //Add box #4 (4000kg) : true
    //Add load(100kg) : 500.0
    //Add box #5 (300kg) : true
    //Vehicle load is 800.0kg

    System.out.println("Add box #5 (300kg) : " +
    vehicle.addBox(300));
    System.out.println("Vehicle load is "
    +vehicle.getLoad() + "kg");
    }
    }
    
