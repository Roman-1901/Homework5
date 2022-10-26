public class Task1_Switch {
    public static void main(String[] args) { //первое задание с использованием метода switch
        int операционка = 1;
        switch (операционка) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
