public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Задача 3");
        for (int i = 2; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }
        System.out.println(" ");
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.printf(i + " ");
        }
        System.out.println(" ");
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.printf(i + " ");
        }
        System.out.println(" ");
        System.out.println("Задача 8");
        int depositAmount = 29_000;
        int totalDeposit = 0;
        for (int i = 1; i <= 12; i++) {
            totalDeposit = totalDeposit + depositAmount;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalDeposit + ".");
        }
        System.out.println(" ");
        System.out.println("Задача 9");
        int depositAmount2 = 29_000;
        int totalDeposit2 = 0;
        for (int i = 1; i <= 12; i++) {
            totalDeposit2 = totalDeposit2 + depositAmount + totalDeposit2 / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalDeposit2 + ".");
        }
        System.out.println(" ");
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (i * 2));
        }
    }
}