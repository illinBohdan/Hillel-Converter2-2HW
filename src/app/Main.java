package app;

import java.util.Scanner;

public class Main {

    private static final double CONV_KM = 0.621371;

    public static void main(String[] args) {
        System.out.println("App converting miles to kilometres");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter miles: ");
        double mil = scanner.nextDouble();

        double kmResult = convectMilesToKms(mil);


        System.out.println("Result ist " + kmResult + " km which is equals " + mil +" miles");



    }

    private static double convectMilesToKms(double miles){
        return miles / CONV_KM;
    }
}
