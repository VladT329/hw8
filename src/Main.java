import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int [] salary = {10_000, 20_000, 30_000, 40_000, 50_000};
        int salaryAmount = 0;
        for (int i = 0; i < salary.length; i++) {
            salaryAmount = salaryAmount + salary [i];
        }
        System.out.println("Сумма трат за месяц составила " + salaryAmount + " рублей");
        System.out.println();

        System.out.println("Задание 2");
        int [] weeklyWaste = {25_000, 3260, 95600, 26500, 16000};
        Arrays.sort(weeklyWaste);
        System.out.println("Минимальная сумма трат за неделю составила " + weeklyWaste[0] + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + weeklyWaste[weeklyWaste.length-1] + " рублей");
        System.out.println();

        System.out.println("Задание 3");
        int [] weeklySpend = {6962, 9965, 5685, 7250, 4522};
        int weeklySpendAmount = 0;
        for (int i = 0; i < weeklyWaste.length; i++) {
            weeklySpendAmount = weeklySpendAmount + weeklySpend[i];
        }
        System.out.println("Сумма трат " + weeklySpendAmount);
        System.out.println("Количество недель " + weeklyWaste.length);
        double averageWeeklySpend = weeklySpendAmount / weeklyWaste.length; //не понимаю, почему остаток получается 0!!!
        System.out.println("Средняя сумма трат за месяц составила " + averageWeeklySpend + " рублей");
        System.out.println();

        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}