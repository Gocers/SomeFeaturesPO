package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("Enter the command");
            String cmd = in.nextLine();
            if (commandExecutor(cmd)) break;
        }
    }

    public static boolean commandExecutor(String cmd){
        switch (cmd){
            case ("exit"):
                return true;
            case("time"):
                System.out.println(getTime());
                break;
            case ("bin"):
                System.out.println("Enter integer number");
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                System.out.println(toBin(n));                
                break;
            case ("sum"):
                System.out.println("Enter first value");
                Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                System.out.println("Enter second value");
                int b = in.nextInt();
                System.out.println(sum(a, b));
                break;
            default:
                System.out.println("Unknown command");
        }
        return false;
    }

    public static Date getTime(){
        Calendar calendar = new GregorianCalendar();

        return calendar.getTime();
    }

    public static String toBin(int a){
        return Integer.toBinaryString(a);
    }

    public static int sum(int a, int b){ return a + b;}

}
