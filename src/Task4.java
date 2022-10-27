public class Task4 {
    public static void main(String[] args) {// В данном коде число дней не ограниченно. Рассматривается любая дистанция с учетом определенного интервала
        int deliveryDistance = 95;
        int interval = 40; //Так как в задаче учитывается интервал расстояния от 20 до 60, от 60 до 100, а это получается 40, то выделена отдельная переменная с данным значением
        int firstDayDistance = 20;
        int countDay = 1;
        if (interval < firstDayDistance) {
            System.out.println("Интервал не может быть меньше допустимого значения "+ firstDayDistance); //Доставка в пределах 20км занимает сутки, интервал на текущий момент равен 40км, его можно менять, но он не должен быть меньше значения расстояния, которое учитывается за первые сутки.
        } else {
            if (deliveryDistance % interval < firstDayDistance) {
                countDay += deliveryDistance / interval;
                System.out.println("Потребуется дней: " + countDay);
            } else {
                countDay += (deliveryDistance / interval + 1);
                System.out.println("Потребуется дней: " + countDay);
            }
        }
    }
}
