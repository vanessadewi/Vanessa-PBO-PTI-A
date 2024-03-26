package InstanceMethod;

//1. Lakukan percobaan Instance Method diatas dan benahi jika menemukan kesalahan! 

public class Rasional{
    private int pembilang, penyebut;
    public Rasional(){
    pembilang=0;
    penyebut=0;
    }
    public Rasional(int pbl, int pyb){
    pembilang=pbl;
    penyebut=pyb;
    }
    //mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional(){
    return (penyebut!= 0);
    }

    //3. Ubah method sederhana pada baris 25 – 30 yang awalnya adalah menggunakan while menjadi for! 
    //menyederhanakan bilangan rasional
    //public void Sederhana(){
    //int temp, A, B;
    //if (penyebut ==0){
    //return;
    //}
    //A = (pembilang<penyebut) ? penyebut:pembilang;
    //B = (pembilang<penyebut) ? pembilang:penyebut;

    //while (B != 0){
    //temp= A % B;
    //A = B;
    //B = temp;
    //}
    // pembilang /=A;
    //penyebut /=A;
    //}

    public void Sederhana() {
    int temp, A, B;
    if (penyebut == 0) {
        return;
    }
    A = (pembilang < penyebut) ? penyebut : pembilang;
    B = (pembilang < penyebut) ? pembilang : penyebut;

    for (; B != 0;) {
        temp = A % B;
        A = B;
        B = temp;
    }

    pembilang /=A;
    penyebut /=A;
    }
    public double Cast(){
    return (penyebut==0.0) ? 0.0 : (double)pembilang /
    (double)penyebut;
    }
    //oprator >
    public boolean moreThan (Rasional A){
    return (pembilang * A.penyebut > penyebut * A.pembilang);
    }
    //operator Unary- ---> A = -A
    public void negasi(){
    pembilang = - pembilang;
    }
    //operator unary += \
    public void unaryPlus(Rasional A){
    pembilang = pembilang * A.penyebut + penyebut *
    A.pembilang;
    penyebut *=A.penyebut;
    }
    public void cetak(){
    System.out.println(pembilang + "/" + penyebut);
    }

    //2. Tambahkan method untuk operator <, <=, >= ! 
    // Menambahkan method kurangDari untuk operator <
    public boolean kurangDari(Rasional A) {
    return (pembilang * A.penyebut < penyebut * A.pembilang);
    }

    // Menambahkan method kurangDariSamaDengan untuk operator <=
    public boolean kurangDariSamaDengan(Rasional A) {
    return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }

    // Menambahkan method lebihDariSamaDengan untuk operator >=
    public boolean lebihDariSamaDengan(Rasional A) {
    return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }

    //4. Tambahkan method untuk operasi -, * , / !
    // Menambahkan operator pengurangan
    public Rasional kurang(Rasional kurang) {
    int newPembilang = this.pembilang * kurang.penyebut - this.penyebut * kurang.pembilang;
    int newPenyebut = this.penyebut * kurang.penyebut;
    Rasional hasil = new Rasional(newPembilang, newPenyebut);
    hasil.Sederhana();
    return hasil;
    }

    //Menambahkan operator perkalian
    public Rasional kali(Rasional kali) {
    int newPembilang = this.pembilang * kali.pembilang;
    int newPenyebut = this.penyebut * kali.penyebut;
    Rasional hasil = new Rasional(newPembilang, newPenyebut);
    hasil.Sederhana();
    return hasil;
    }

    // Menambahkan operator pembagian
    public Rasional bagi(Rasional bagi) {
    int newPembilang = this.pembilang * bagi.penyebut;
    int newPenyebut = this.penyebut * bagi.pembilang;
    Rasional hasil = new Rasional(newPembilang, newPenyebut);
    hasil.Sederhana();
    return hasil;
    }

}

