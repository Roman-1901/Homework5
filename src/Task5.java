public class Task5 {
    public static void main(String[] args) { //вариант задания, выводящий так же названия месяцев
        int monthNumber = 8;
        String monthName = "название месяца";
        String textOutWinter = " - данный месяц относится к зиме";
        String textOutSpring = " - данный месяц относится к весне";
        String textOutSummer = " - данный месяц относится к лету";
        String textOutAutumn = " - данный месяц относится к осени";
        switch (monthNumber) {
            case 1:
                monthName = "Январь";
                System.out.println(monthName + textOutWinter);
                break;
            case 2:
                monthName = "Февраль";
                System.out.println(monthName + textOutWinter);
                break;
            case 3:
                monthName = "Март";
                System.out.println(monthName + textOutSpring);
                break;
            case 4:
                monthName = "Апрель";
                System.out.println(monthName + textOutSpring);
                break;
            case 5:
                monthName = "Май";
                System.out.println(monthName + textOutSpring);
                break;
            case 6:
                monthName = "Июнь";
                System.out.println(monthName + textOutSummer);
                break;
            case 7:
                monthName = "Июль";
                System.out.println(monthName + textOutSummer);
                break;
            case 8:
                monthName = "Август";
                System.out.println(monthName + textOutSummer);
                break;
            case 9:
                monthName = "Сентябрь";
                System.out.println(monthName + textOutAutumn);
                break;
            case 10:
                monthName = "Октябрь";
                System.out.println(monthName + textOutAutumn);
                break;
            case 11:
                monthName = "Ноябрь";
                System.out.println(monthName + textOutAutumn);
                break;
            case 12:
                monthName = "Декабрь";
                System.out.println(monthName + textOutWinter);
                break;
            default:
                System.out.println("Неверный номер месяца");
        }
    }
}
