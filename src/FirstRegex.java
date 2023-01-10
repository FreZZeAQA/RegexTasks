import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> wordsStartsWithA = new ArrayList<>();
        String word;
        System.out.println("Write words,if you want to leave the program press <ENTER>");
        do {
            System.out.print("Word:");
            word = scanner.nextLine().toLowerCase();
            Pattern pattern = Pattern.compile("^a");
            Matcher matcher = pattern.matcher(word);
            while (matcher.find()) {
                wordsStartsWithA.add(word);
            }
        } while (!word.isEmpty());
        System.out.println("Array of words starts with <A> letter\n"+wordsStartsWithA);
    }
}

