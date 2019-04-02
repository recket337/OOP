package by.courses.java.oop.Rates;

    public class InternetRate extends SimpleRate {
        private Integer megabytesCount;

        public InternetRate(int customers, int minutesCount, int smsCount, int megabytesCount ) {
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

