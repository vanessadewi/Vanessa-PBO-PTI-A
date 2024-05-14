public class HeroAgility extends Hero {
// 4. Ubahlah modifier atribut type pada class HeroIntel dan HeroAgility menjadi public, lalu coba akses
//langsung melalui class Main. Apakah atribut bisa diakses langsung atau tidak, jelaskan!
    //String type;
    public String type;

    public HeroAgility(String name, double health){
    super(name, health);
    this.type = "Agility";
    }
    public void display(){
    System.out.println(this.getName() + " is a " + this.type + " Hero.");
    }
    }
    
