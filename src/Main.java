public class Main {
    public static void main(String[] args) {
        int year = 4444;
        Main homework = new Main();
        homework.isLeapYearPrint(year);

        int clientOs = 0;
        homework.ClientCheckOsPrint(clientOs, year);

        int deliveryDistance = 99;
        System.out.println(homework.calculateDeliveryDay(deliveryDistance) + " д.");

    }

    public void isLeapYearPrint(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - год високосный");
        } else {
            System.out.println(year + " - год не високосный");
        }
    }

    public void ClientCheckOsPrint(int clientOs, int year) {
        if (clientOs == 0 && year >= 2015) {
            System.out.println("Установите версию для IOS");
        } else if (clientOs == 0 && clientOs < 2015) {
            System.out.println("Установите облегчённую версию для IOS");
        } else if (clientOs == 1 && year >= 2015) {
            System.out.println("Установите версию для Android");
        } else if (clientOs == 0 && year < 2015) {
            System.out.println("Установите облегчённую версию для Android");
        } else {
            throw new RuntimeException("Ваша система не поддерживается");
        }
    }

    public int calculateDeliveryDay(int distance) {
        if (distance < 20 && distance > 0) {
            return 1;
        } else if (distance < 60 && distance >= 20) {
            return 2;
        } else if (distance < 100 && distance >= 60) {
            return 3;
        } else {
            throw new RuntimeException("Доставка ограничена");
        }
    }
}