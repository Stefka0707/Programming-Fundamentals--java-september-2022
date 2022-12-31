package ListLab;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Double> numLIst = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());


        for (int i = 0; i < numLIst.size() - 1; i++) {
            double currentNum = numLIst.get(i);
            double nextNum = numLIst.get(i + 1);
            if (currentNum == nextNum) {
                numLIst.set(i, currentNum + nextNum);
                numLIst.remove(i + 1);
                i =-1;
            }
        }
        System.out.println(joinItemsByDelimiter(numLIst, " "));
    }

    public static String joinItemsByDelimiter(List<Double> lIst, String delimiter) {

        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for (double item : lIst) {
            String numDF = df.format(item) + delimiter;
            result += numDF;

        }
        return result;
    }

}





