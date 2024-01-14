public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 2
        System.out.println("Задача 2");
        clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        //Задача 3
        System.out.println("Задача 3");
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0 && year > 1584) || year % 400 == 0) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " Год является не високосным");
        }
        //Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Потребуется 4 дня");
        }
    }
}