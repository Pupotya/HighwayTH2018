package lesson12;

public class WeekDayWorker {
    public static void main(String[] args) {
        sendMessage(WeekDay.SATURDAY);
    }

    public static void sendMessage(WeekDay weekDay){
        System.out.println(""+ weekDay + weekDay.getDayInt());
    }
}
