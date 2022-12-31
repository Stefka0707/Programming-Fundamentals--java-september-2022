package methodLab;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printRecept(scanner.nextLine());
        printBody("Hello");

    }

        public static void printRecept(String text) {
            System.out.println("recurion");

        }


    public static void printHeader () {
        System.out.println("--------------");

    }

    public static void printBody(String text) {
        System.out.println(text);

    }


}