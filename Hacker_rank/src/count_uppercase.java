import java.util.Scanner;

public class count_uppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}