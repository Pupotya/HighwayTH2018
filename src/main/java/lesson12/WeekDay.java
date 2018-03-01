package lesson12;

public enum WeekDay {
    MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7),SANDAY(1);

    public int getDayInt() {
        return dayInt;
    }

    int dayInt;
    WeekDay(int dayInt){
        this.dayInt = dayInt;
    }
}
