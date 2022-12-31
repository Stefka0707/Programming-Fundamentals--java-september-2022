package ArryasMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class encryptSortAndPrintArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] sumNum = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            char[] letter = scanner.nextLine().toCharArray();
            for (char let : letter) {

                if (let == 'a' || let == 'o' || let == 'e' || let == 'u' || let == 'i' || let == 'A' || let == 'O' || let == 'E' || let == 'U'
                        || let == 'I') {
                let *=letter.length;
                sum+=let;
            }else {
                let /=letter.length;
                sum +=let;
                }

            }
            sumNum[i] = sum;
            sum=0;


        }
        Arrays.sort(sumNum);
        for (int element : sumNum) {
            System.out.println(element);
        }

    }
}

