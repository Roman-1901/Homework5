public class test {
    public static void main(String[] args) {
        int age = 25;
        double salary = 79251;
        double wantedSum = 330_000;

        double rate = 10;
        String output;

        if (salary > 80_000) {
            rate = (rate - 0.7);
        } else {
            if (age < 23) {
                rate = rate + 1;
            } else if (age < 30) {
                rate = (rate + 0.5);
            }
        }


        double monthlyPayment = ((wantedSum / 100 * rate) / 12) + wantedSum / 12;
        double maxMonthlyPayment = salary / 2;
        if (maxMonthlyPayment >= monthlyPayment) {
            output = "Одобрено";
        } else {
            output = "Отказано";
        }
        System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей.");

        System.out.println("Платеж по кредиту " + String.format("%.2f", monthlyPayment) + " рублей. " + output + ".");
    }
}
