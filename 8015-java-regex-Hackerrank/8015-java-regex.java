import java.util.Scanner;
import java.util.regex.Pattern;

class MyRegex {
    String pattern = "((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[01]?[0-9][0-9]?)";
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();

        while (in.hasNext()) {
            System.out.println(Pattern.matches(myRegex.pattern, in.next()));
        }

        in.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna