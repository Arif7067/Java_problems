package com.Arif;

import java.util.Scanner;

public class Switch_cases_improved_one_Practise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int emp_id = in.nextInt();
//        String department = in.next();

//        switch (emp_id){
//            case 1:
//                System.out.println("Dept ETE right");
//                break;
//            case 2:
//                System.out.println("Dept Robotics right");
//                break;
//            case 3:
//                switch (department) {
//                    case "CSE":
//                        System.out.println("So you are from CSE");
//                        break;
//                    case "ELT":
//                        System.out.println("So you are from Electrical");
//                        break;
//                    default:
//                        System.out.println("Hmmmm....... I don't get your dept.....!");
//                }
//                break;
//            default:
//                System.out.println("Ok Bye__________!!!!!!!");
//        }
//        switch (emp_id){
//            case 1 -> System.out.println("Dept ETE right");
//            case 2 -> System.out.println("Dept Robotics right");
//            case 3 ->{
//                switch (department) {
//                    case "CSE" -> System.out.println("So you are from CSE");
//                    case "ELT" -> System.out.println("So you are from Electrical");
//                    default -> System.out.println("Hmmmm....... I don't get your dept.....!");
//                }
//            }
//            default -> System.out.println("Ok Bye__________!!!!!!!");
//        }
        System.out.print("Please Enter 1 if you want to know : ");
        int day = in.nextInt();
        while(day!=8) {
            System.out.print("Enter the day no. : ");
            day = in.nextInt();
            switch (day) {
                case 1, 2, 3, 4, 6 -> System.out.println("Week days");
                case 5 -> System.out.println("Namaz day Pray to Allah Peace in life");
                case 7 -> System.out.println("Yay....!!!!    Holiday ______!!!!!! Hurrahhhhh.....!!!!!!");
            }
        }
        System.out.println("Bye bye");
    }
}
