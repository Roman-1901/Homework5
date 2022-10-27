public class Task4 {
    public static void main(String[] args) {
        int deliveryDistance = 60;
        int interval = 40;
        int countDay = 1;
        if (deliveryDistance % interval < 20) {
            countDay += deliveryDistance / interval;
            System.out.println("Потребуется дней: " + countDay);
        }else {
            countDay += deliveryDistance / interval + 1;
            System.out.println("Потребуется дней: " + countDay);
        }
    }
}
