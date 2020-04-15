package com.company;

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
            default:
                System.out.println("Unknown command");
        }
        return false;
    }
}
