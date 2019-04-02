package by.courses.java.oop;

import by.courses.java.oop.Rates.InternetRate;
import by.courses.java.oop.Rates.MMSRate;
import by.courses.java.oop.Rates.SimpleRate;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);

            String menu = "Menu\n" + "1 - Rates list\n" + "2 - All customers\n" + "3 - Sort by SMS\n"
                    + "4 - Sort by minutes\n" + "5 - Find by SMS\n" + "6 - Find by minutes\n";

            System.out.println(menu);

            boolean isQuit = false;
            while (!isQuit) {
                byte function = scan.nextByte();

                switch (function) {

                    case 1:
                        for(int i =  0 ; i < rates.size() ; i++)
                            System.out.println(rates.get(i).toString());
                        break;

                    case 2:
                        int sum = 0;
                        for(int i =  0 ; i < rates.size() ; i++)
                            sum+= rates.get(i).getCustomers();
                        System.out.println("There are "+ sum +" customers");
                        break;
                    case 3:
                        SimpleRate.sortBySMS(rates);
                        break;

                    case 4:
                        SimpleRate.sortByMinutes(rates);
                        break;

                    case 5:
                        Scanner in = new Scanner(System.in);
                        System.out.print("Input min SMS value: ");
                        int num = in.nextInt();
                        System.out.print("Input max SMS value: ");
                        int num2 = in.nextInt();
                        SimpleRate.findBySMS(rates, num, num2);
                        break;

                    case 6:
                        Scanner in1 = new Scanner(System.in);
                        System.out.print("Input min mins value: ");
                        num = in1.nextInt();
                        System.out.print("Input max mins value: ");
                        num2 = in1.nextInt();
                        SimpleRate.findByMinutes(rates, num, num2);
                        break;

                    default:
                        System.out.println("No such menu");
                        break;
                }

                System.out.println(menu);
            }
        }
    }