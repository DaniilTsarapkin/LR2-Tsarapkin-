import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Second {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            {
                System.out.println("Введите пароль:");
                String password = scanner.nextLine();  
                Pattern pt= Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[0-9a-zA-Z_]{8,}");
                Matcher m=pt.matcher(password);
                if ( m.matches() == true){
                    System.out.println("Пароль надежен");
                }else{
                    System.out.println("Ненадежный пароль, повторить ввод");
            }
        }
    }
}
}