import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static String operationSystem(int year, int OS) {
        int currentYear = 2015;

        String[][] answers = {
                {"Установите облегченную версию приложения для iOS по ссылке", "Установите версию приложения для iOS по ссылке"},
                {"Установите облегченную версию приложения для Android по ссылке", "Установите версию приложения для Android по ссылке"}
        };
        return answers[OS][currentYear > year ? 0 : 1];
    }

    public static int delivery(int distance) {
        if(distance <= 20){ return 1;}
        else if(distance <= 60){ return 2;}
        else if(distance <= 100){ return 3;}
        else return -1;
    }
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2022;
        if(isLeapYear(year)) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - не високосный");
        }
        System.out.println("Год " + year + " является високосным: " + isLeapYear(year));
        System.out.println("Задание 2");
        System.out.println(operationSystem(2019, 1));
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + delivery(deliveryDistance));
    }
}