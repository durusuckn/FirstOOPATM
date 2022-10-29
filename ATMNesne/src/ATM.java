import java.util.Scanner;

public class ATM {
    public void work(Hesap h1){

        System.out.println("ATM ye hoşgeldiniz..");

        Login login=new Login();

        Scanner scanner=new Scanner(System.in);
        System.out.println("*********************************");
        System.out.println("--Kullanıcı girişi--");
        int count=3;
        while(true){
            if (login.login(h1)){

                System.out.println("Giriş Başarılı");
                break;

            }
            else {
                count -= 1;
                System.out.println("Giriş Başarısız..\nKalan Giriş Hakkı:" + count);
                if (count == 0) {
                    break;
                }
            }}
                System.out.println("********************");
                String transactions="1.Bakiye Sorgulama\n" +
                        "2.Para Yatırma\n" +
                        "3.Para Çekme\n" +
                        "Çıkış için q ya basınız";
        System.out.println(transactions);



                while(true){
                    String transation=scanner.nextLine();
                    if(transation.equals("1")){
                        System.out.println(h1.getBalance());
                        continue;
                    } else if (transation.equals("2")) {

                        System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                        int getMoney=scanner.nextInt();
                        h1.investMoney(getMoney);
                        continue;
                    } else if (transation.equals("3")) {

                        System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                        int takeMoney=scanner.nextInt();
                        h1.withdrawMoney(takeMoney);
                        continue;

                    } else if (transation.equals("q")) {
                        break;

                    }
                    else {
                        System.out.println("Lütfen geçerli bir işlem giriniz....");
                        continue;
                    }
                }


            }




    }

