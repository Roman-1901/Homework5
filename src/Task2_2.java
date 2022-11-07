public class Task2_2 {
    public static void main(String[] args) { //второй вариант решения
        int clientOS = 1;
        int clientDeviceYear = 2012;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Вы можете установить полную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Вы можете установить полную версию приложения для Android по ссылке");
        } else {
            System.out.println("Модель устройства не определена");
        }
    }
}
