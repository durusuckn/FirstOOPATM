public class Main {
    public static void main(String[] args) {

        ATM atm=new ATM();
        Hesap hesap=new Hesap("Duru Su Çakan","123456",4000);
        atm.work(hesap);
        System.out.println("Programdan çıkılıyor");


    }
}