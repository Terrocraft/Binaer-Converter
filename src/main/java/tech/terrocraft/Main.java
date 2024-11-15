package tech.terrocraft;

import tech.terrocraft.Util.TextToBinery;

import java.util.Scanner;

public class Main {
    private static String output;
    public static void main(String[] args) {
        TextToBinery textToBinery = new TextToBinery();

        System.out.println("Was wollen sie convertiren (text)?");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        textToBinery.setText(text);

        System.out.println("Wollen sie den binear output convertiren (yes/no)?");
        String convert = scanner.nextLine();
        if (convert.equalsIgnoreCase("yes")) {
            textToBinery.setconvert(true);

            System.out.println("Durch was soll 0 convertirt werden (imput)?");
            String char0 = scanner.nextLine();
            System.out.println("Durch was soll 1 convertirt werden (imput)?");
            String char1 = scanner.nextLine();

            textToBinery.setchars(char0, char1);
        }
        scanner.close();
        System.out.println(textToBinery.build());
    }
}