package by.courses.java.oop.Rates;

import java.util.ArrayList;

    public class SimpleRate {

        private Integer minutesCount;
        private Integer smsCount;
        private Integer customers;

        public SimpleRate( int customers, int minutesCount, int smsCount ) {
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

        public static void sortBySMS(ArrayList<SimpleRate> array){

            for(int i = array.size() - 1 ; i > 0 ; i--){
                for(int j = 0 ; j < i ; j++){
                    if( array.get(j).getSMSCount() > array.get(j+1).getSMSCount() ){
                        SimpleRate tmp = array.get(j);
                        array.set(j, array.get(j+1));
                        array.set(j+1, tmp);
                    }
                }
            }

        }

        public static void sortByMinutes(ArrayList<SimpleRate> array){

            for(int i = array.size() - 1 ; i > 0 ; i--){
                for(int j = 0 ; j < i ; j++){
                    if( array.get(j).getMinutesCount() > array.get(j+1).getMinutesCount() ){
                        SimpleRate tmp = array.get(j);
                        array.set(j, array.get(j+1));
                        array.set(j+1, tmp);
                    }
                }
            }


        }

        public static void findBySMS(ArrayList<SimpleRate> array, int min, int max){
            for(int i =  0 ; i < array.size() ; i++)
                if (array.get(i).getSMSCount() >= min && array.get(i).getSMSCount() <= max){
                    array.get(i).toString();
                }

        }

        public static void findByMinutes(ArrayList<SimpleRate> array, int min, int max){
            for(int i =  0 ; i < array.size() ; i++)
                if (array.get(i).getMinutesCount() >= min && array.get(i).getMinutesCount() <= max){
                    array.get(i).toString();
                }

        }

    }
