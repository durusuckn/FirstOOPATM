public class Hesap {
    private String username;
    private String password;
    private int balance;


    public Hesap(String username, String password, int balance){
        this.username=username;
        this.password=password;
        this.balance=balance;
    }
    public String getUsername(){
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void investMoney(int plus){
        this.balance+=plus;
        System.out.println("Yeni Bakiyeniz: "+ this.balance);
    }
    public void withdrawMoney(int plus){
        if(plus>this.balance){
            System.out.println("Hesabınızda Yeterli miktarda para bulunmuyor..." +this.balance);
        }
        else{
            this.balance-=plus;
            System.out.println("Yeni Bakiyeniz: "+this.balance);
        }
    }
}
