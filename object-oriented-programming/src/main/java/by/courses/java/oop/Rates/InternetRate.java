package by.courses.java.oop.Rates;

    public class InternetRate extends SimpleRate {
        private Integer megabytesCount;
        InternetRate(Integer customers, Integer minutesCount, Integer smsCount, Integer megabytesCount ) {
            super(customers, minutesCount, smsCount);
            this.megabytesCount = megabytesCount;
        }

        public Integer getMegabytesCount() {
            return megabytesCount;
        }

        public String toString(){
            return super.toString() + ", Megabytes :" + megabytesCount ;
        }
    }

