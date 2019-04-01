package by.courses.java.oop.Rates;

public class SimpleRate {

    private Integer minutesCount;
    private Integer smsCount;
    private Integer customers;

    public SimpleRate( Integer customers, Integer minutesCount, Integer smsCount ) {
        this.customers = customers;
        this.minutesCount = minutesCount;
        this.smsCount = smsCount;
    }

    public Integer getMinutesCount() {
        return minutesCount;
    }

    public Integer getSMSCount() {
        return smsCount;
    }

    public String toString() {
        return "Rate with" + customers + "has : Minutes: " + minutesCount + ", SMS: " + smsCount ;
    }

}
