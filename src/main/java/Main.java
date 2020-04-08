import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String input = scanner.nextLine();
        System.out.println(input.isBlank());
        System.out.println(chomp());


    }

    private static boolean chomp() {
    }

}
