import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> validEmails = new ArrayList<>();
        String email;
        do {
            System.out.print("Email:");
            email = scanner.nextLine().toLowerCase();
            Pattern pattern = Pattern.compile("@gmail.com$");
            Matcher matcher = pattern.matcher(email);
            while (matcher.find()) {
                validEmails.add(email);
            }
        } while (!email.isEmpty());
        System.out.println("Valid Emails\n" + validEmails);
    }

}

