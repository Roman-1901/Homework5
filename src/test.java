public class test {
    public static void main(String[] args) {
        int age = 25;
        int salary = 90_000;
        int wantedSum = 500_000;

        float rate = 10f;
        String output;

        if (age < 23) {
            rate = rate + 1;
        } else if (age < 30 && age >= 23) {
            rate = (float) (rate + 0.5);
        }
        if (salary > 80_000) {
            rate = (float) (rate - 0.7);
        }

        double monthlyPayment = ((wantedSum / 100 * rate) / 12) + wantedSum / 12;
        int maxMonthlyPayment = salary / 2;
        if (maxMonthlyPayment >= monthlyPayment) {
            output = "Одобрено";
        } else {
            output = "Отказано";
        }
        System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей.");

        System.out.println("Платеж по кредиту " + String.format("%.2f", monthlyPayment)  + " рублей. " + output + ".");
    }
}
