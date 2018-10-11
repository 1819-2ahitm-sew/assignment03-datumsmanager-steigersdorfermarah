package at.htl.mydate;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String day = "";
        String month = "";
        String year = "";
        String input = "";
        int counter = 1;

        System.out.println("Date Manager");
        System.out.println("=============");

        System.out.print(counter + ". Datum: ");
        input = scanner.nextLine();

        while (!input.equals("quit")){
                counter++;



            String [] array = input.split("\\.");
             day = array[0];
             month = array[1];
             year = array[2];


            System.out.println("Day: "+ day);
            System.out.println("Month: "+ month);
            System.out.println("Year: "+ year);






            System.out.print(counter + ". Datum: ");
            input = scanner.nextLine();
        }







        // not yet implemented

    }
}
