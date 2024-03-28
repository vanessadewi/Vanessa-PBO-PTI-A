//1. Lakukan percobaan diatas dan benahi jika menemukan kesalahan! 

public class Test {
    public static void main(String [] args) {
    Student s1=new Student();
    s1.setName("Enkapsulasi");
    //s1.setMark("90");

    s1.setMark(90); //1. Menghilangkan tanda "" untuk menggunakan nilai int bukan string

    //2. Jika pada baris 6 s1.setName diubah menjadi s1.getName apa yang terjadi? jelaskan! 
    //2. sebelum dirubah tadi error, setelah dirubah tidak error lagi 

    //System.out.println("s1Name is "+s1.setName());
    System.out.println("s1Name is "+s1.getName()); //1. merubah metod mutator menjadi metod aksesor

    //System.out.println("s1Mark is "+s1.setMark());
    System.out.println("s1Mark is "+s1.getMark()); //1. merubah metod mutator menjadi metod aksesor

    //System.out.println("name dan mark "+name+" "+mark);
    System.out.println("name dan mark "+s1.getName()+" "+s1.getMark());
    }
   }
   
