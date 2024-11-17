public class Main {
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static String operationSystem(int year, int OS) {
        int currentYear = 2015;
        String answer = "";
        if (OS == 0) {
            if (currentYear > year) {
                answer = "Установите облегченную версию приложения для iOS по ссылке";
            } else answer = "Установите версию приложения для iOS по ссылке";
        } else if (OS == 1) {
            if (currentYear > year) {
                answer = "Установите облегченную версию приложения для Android по ссылке";
            } else answer = "Установите версию приложения для Android по ссылке";
        }
        return answer;


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