package Encapsulation2;

//1. Method apakah yang menjadi accessor (getter) ? 
public class Vehicle1{

//3. Ubahlah tipe data pada atribut load dan maxload pada class Vehicle1 menjadi public.  
//Jalankan program, apakah output dari program tersebut? 
// public double load, maxLoad;
//Output dari program tersebut adalah
//Creating a vehicle with a 10,000 kg maximumload.
//Add box #1 (500kg) : true
//Add box #2 (250kg) : true
//Add box #3 (5000kg) : true
//Add box #4 (4000kg) : true
//Add box #5 (300kg) : false
//Vehicle load is 9750.0kg

//4. Ulangi instruksi pada nomer 4 dengan mengubah tipe data pada atribut load dan maxload pada class Vehicle1 
//menjadi protected. 
// protected double load, maxLoad;


//5. Ulangi instruksi pada nomer 4 dengan mengubah tipe data pada atribut load dan maxload pada class Vehicle1 
//menjadi default. 
double load, maxLoad;



public Vehicle1 (double max){
this.maxLoad = max;
}
public double getLoad(){ //1.Method accessor untuk atribut load
return this.load;
}
public double getMaxLoad(){ //1. Method accessor untuk atribut maxLoad
return this.maxLoad;
}
public boolean addBox(double weight){
double temp = 0.0D;
temp = this.load + weight;
if(temp <= maxLoad){
this.load = this.load + weight;
return true;
}
else
{
return false;
}
}
}
