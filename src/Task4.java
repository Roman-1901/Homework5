public class Task4 {
    public static void main(String[] args) {
        int deliveryDistance = 61;
        int interval = 40;
        int firstDayDistance = 20;
        int countDay = 1;
        if (deliveryDistance % interval <= firstDayDistance) {
            countDay += deliveryDistance / interval;
            System.out.println("Потребуется дней: " + countDay);
        }else {
            countDay += deliveryDistance / interval + 1;
            System.out.println("Потребуется дней: " + countDay);
        }
    }
}
