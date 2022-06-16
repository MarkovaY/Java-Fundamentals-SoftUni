package Excercise.ConditionalStatementsAndLoops;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int currentNumber = firstNumber; currentNumber <= lastNumber; currentNumber++) {
            System.out.print(currentNumber + " ");
            sum += currentNumber;
        }
        System.out.printf("%nSum: %d", sum);
    }
}
