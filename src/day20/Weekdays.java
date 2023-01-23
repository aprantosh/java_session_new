package day20;

public enum Weekdays {

    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    int abbr;
    Weekdays(int abbr) {
        this.abbr = abbr;
    }

    @Override
    public String toString() {
        return String.valueOf(this.abbr);
    }
}
