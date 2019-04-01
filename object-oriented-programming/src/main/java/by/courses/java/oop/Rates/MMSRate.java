package by.courses.java.oop.Rates;

    public class MMSRate extends SimpleRate{
        private Integer mmsCount;

        public MMSRate(Integer customers, Integer minutesCount, Integer smsCount, Integer mmsCount) {
            super(customers, minutesCount, smsCount);
            this.mmsCount = mmsCount;
        }

        public Integer getMMSCount() {
            return mmsCount;
        }

        public String toString(){
            return super.toString() + ", MMS : " + mmsCount ;
        }
    }
