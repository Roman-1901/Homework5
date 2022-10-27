public class Task5 {
    public static void main(String[] args) { //упрощенный вариант
        int monthNumber = 4;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Данный номер месяца относится к зиме");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Данный номер месяца относится к весне");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Данный номер месяца относится к лету");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Данный номер месяца относится к осени");
                break;
            default:
                System.out.println("Неверный номер месяца");
                break;
        }
    }
}