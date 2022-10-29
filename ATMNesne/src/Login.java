import java.sql.SQLOutput;
import java.util.Scanner;

public class Login {
    public boolean login(Hesap h1){
        Scanner scanner=new Scanner(System.in);
        String user_name;
        String youPassword;

        System.out.println("Kullanıcı Adı: ");
        user_name=scanner.nextLine();
        System.out.println("Parola: ");
        youPassword=scanner.nextLine();

        if(user_name.equals(h1.getUsername()) && youPassword.equals(h1.getPassword())){
            return true;
        }
        else {
            return false;
        }
    }
}
