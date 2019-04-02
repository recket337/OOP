package by.courses.java.oop.Rates;

    public class MMSRate extends SimpleRate{
        private Integer mmsCount;

        public MMSRate(int customers, int minutesCount, int smsCount, int mmsCount) {
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
