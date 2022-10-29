import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static Developer developer1=new Developer("Duru Su","Çakan",123,"java");
    public static Boss boss1=new Boss("Kenan","Çakan",123,8);
    public static void YazilimciOlusturma(String isim,String soyisim,int id,String language){

        Developer developer=new Developer(isim,soyisim,id,language);
        developer.showInformation();

    }
    public static void YoneticiOlusturma(String isim, String soyisim, int id, int sorumlu){
        Boss boss=new Boss(isim,soyisim,id,sorumlu);
        boss.showInformation();
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Çalışanlar Programına Hoşgeldiniz...");

        String islemler="İşlemler....\n" +
                "1.Yazılımcı İşlemleri\n" +
                "2.Yönetici İşlemleri\n" +
                "Çıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("****************");



        while(true){
            String islem= scanner.nextLine();
            System.out.println(islemler);
            System.out.println("****************");

            if(islem.equals("1")){
                while(true){
                    System.out.println("***Yazılımcı İşlemlerine Hoşgeldiniz***\n" +
                            "Yapabileceğiniz İşlemler:\n" +
                            "0.Çalışan Bilgi Girme\n" +
                            "1.Format Atma\n" +
                            "2.Bilgileri Gösterme\n" +
                            "Çıkmak için a'ya basınız...");
                    String yazilimci_islem= scanner.nextLine();


                    if(yazilimci_islem.equals("0")){


                        System.out.println("İsim : ");
                        String isim=scanner.nextLine();
                        System.out.println("Soyisim: ");
                        String soyisim=scanner.nextLine();
                        System.out.println("ID: ");
                        int id=scanner.nextInt();
                        System.out.println("Bildiği diller: ");
                        String language1= scanner.nextLine();
                        YazilimciOlusturma(isim,soyisim,id,language1);
                        System.out.println("Yazılımcı Başarılı bir şekilde Olusturuldu.");
                        continue;


                    } else if (yazilimci_islem.equals("1")) {
                        System.out.println("Yüklemek istediğiniz OS girin: ");
                        String os=scanner.nextLine();
                       developer1.formatting(os);
                       continue;

                    } else if (yazilimci_islem.equals("2")) {

                        developer1.showInformation();
                        continue;

                    } else if (yazilimci_islem.equals("a")) {
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor...");

                        break;
                    }
                    else {
                        System.out.println("Lütfen geçerli bir işlem giriniz...");
                        continue;
                }
            }


                System.out.println(islemler);
                System.out.println("****************");

                }
            else if(islem.equals("2")){
                System.out.println("***Yönetici İşlemlerine Hoşgeldiniz***\n" +
                        "Yapabileceğiniz İşlemler:\n" +
                        "0.Çalışan Bilgi Girme\n" +
                        "1.Zam Yapma\n" +
                        "2.Bilgileri Gösterme\n" +
                        "Çıkmak için q'ya basınız...");

                while(true){
                    System.out.println("***Yönetici İşlemlerine Hoşgeldiniz***\n" +
                            "Yapabileceğiniz İşlemler:\n" +
                            "0.Çalışan Bilgi Girme\n" +
                            "1.Zam Yapma\n" +
                            "2.Bilgileri Gösterme\n" +
                            "Çıkmak için q'ya basınız...");
                    String yonetici_islem= scanner.nextLine();
                    if(yonetici_islem.equals("0")){


                        System.out.println("İsim : ");
                        String isim=scanner.nextLine();
                        System.out.println("Soyisim: ");
                        String soyisim=scanner.nextLine();
                        System.out.println("ID: ");
                        int id=scanner.nextInt();
                        System.out.println("Sorumlu Kişi Sayısı: ");
                        int sorumlu= scanner.nextInt();
                        YoneticiOlusturma(isim,soyisim,id,sorumlu);
                        System.out.println("Yönetici Başarılı bir şekilde Olusturuldu.");



                    } else if (yonetici_islem.equals("1")) {
                        System.out.println("Yapmak istediğiniz zam miktarını girin: ");
                        int zam=scanner.nextInt();
                        boss1.makeRaise(zam);
                        continue;

                    } else if (yonetici_islem.equals("2")) {

                        boss1.showInformation();
                        continue;

                    } else if (yonetici_islem.equals("q")) {
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;
                    }
                    else {
                        System.out.println("Lütfen geçerli bir işlem giriniz...");
                        continue;
                    }

                }
                System.out.println(islemler);
                System.out.println("****************");

            } else if (islem.equals("q")) {

                System.out.println("Programdan çıkılıyor....");
                break;

            }
            else {
                System.out.println("Lütfen geçerli bir işlem giriniz...");
                continue;
            }

        }
    }
}