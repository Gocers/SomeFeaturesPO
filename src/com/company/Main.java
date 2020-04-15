package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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

    private static boolean commandExecutor(String cmd){
        switch (cmd){
            case ("exit"):
                return true;
            case("time"):
                getTime();
                break;
            case ("bin"):
                toBin();
                break;
            case ("sum"):
                sum();
                break;
            default:
                System.out.println("Unknown command");
        }
        return false;
    }

    private static void getTime(){
        System.out.println(java.time.LocalTime.now());
    }

    private static void toBin(){
        System.out.println("Enter integer number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Integer.toBinaryString(n));
    }

    private static void sum(){
        System.out.println("Enter first value");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Enter second value");
        int b = in.nextInt();
        System.out.println("= " + (a+b));
    }
}
