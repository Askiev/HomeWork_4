public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");

    }

    public static void task2() {
        int clientOS = 1;
        int clienDeviceYear = 2015;

        if (clienDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clienDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");


        }
    }
    public static void task3() {
        int year = 2021;
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)){
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(year + " год является високосным");
        }
    }
    public  static void task4() {
        int deliveryDistance = 95;

        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
            System.out.println("потребуется дней:" + deliveryDays);
        }

    }
    public  static void task5() {
        int monthsNumber =12;

        switch (monthsNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("некорректный месяц:" + monthsNumber);
        }
    }
}