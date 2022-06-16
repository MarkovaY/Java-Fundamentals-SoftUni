package Lab.ConditionalStatementsAndLoops;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int currentMinutes = minutes + 30;
        int currentHours = hours;
        if (currentMinutes > 59){
            currentHours += 1;
            currentMinutes -= 60;
        }
        if (currentHours > 23){
            currentHours = 0;
        }
        System.out.printf("%d:%02d", currentHours, currentMinutes);
    }
}
