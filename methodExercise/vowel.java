package methodExercise;

import java.util.Locale;
import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printVowelCount(text.toLowerCase());

        }


        public static void printVowelCount(String text){
        int count = 0;
            for (char symbol:text.toCharArray()) {
                if (symbol =='a'|| symbol == 'e' ||
                symbol == 'i' || symbol == 'o' || symbol == 'u'){
                    count++;

                }


            }

            System.out.println(count);
        }
    }

