import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> validEmails = new ArrayList<>();
        String email;
        do {
            System.out.print("Email:");
            email = scanner.nextLine().toLowerCase();
            boolean matches = email.matches("[a-zA-Z]{1,30}@gmail.com$");
                if (matches){
                    validEmails.add(email);
            }
        } while (!email.isEmpty());
        System.out.println("Valid Emails\n" + validEmails);
    }

}

