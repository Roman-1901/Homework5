public class Task2 {
    public static void main(String[] args) { //первый вариант решения
        int clientOS = 0;
        int clientDeviceYear = 2017;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Вы можете установить полную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Вы можете установить полную версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Модель устройства не определена");
        }
    }
}
