public class Task4 {
    public static void main(String[] args) {
        int deliveryDistance = 80;
        int interval = 40;
        int firstDayDistance = 20;
        int countDay = 1;
        if (deliveryDistance % interval <= firstDayDistance) {
            countDay = countDay + deliveryDistance / interval;
            System.out.println("Потребуется дней: " + countDay);
        }else {
            countDay = countDay + (deliveryDistance / interval + 1);
            System.out.println("Потребуется дней: " + countDay);
        }
    }
}
