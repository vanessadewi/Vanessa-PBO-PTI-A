    // 5. Buatlah class baru HeroMagic dengan atribut tambahan power = “Magic” serta extends semua
    // atribut dan method dari class Hero. Kemudian coba buatlah kode untuk upcasting dan downcasting
    // dari class HeroMagic ke Hero pada class Main!

    public class HeroMagic extends Hero {
        private String power;

        public HeroMagic(String name, double health) {
            super(name, health);
            this.power = "Magic";
        }

        public String getPower() {
            return power;
        }

        public void setPower(String power) {
            this.power = power;
        }

        @Override
        public void display() {
            System.out.println(getName() + " is a " + power + " hero.");
        }
    }
