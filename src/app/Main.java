package app;

import java.util.Scanner;

public class Main {

    private static final double CONV_KM = 0.621371;

    public static void main(String[] args) {
        System.out.println("App converting miles to kilometres and kilometres to miles");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter miles: ");
        double mil = scanner.nextDouble();

        System.out.print("Please enter kilometres: ");
        double km = scanner.nextDouble();

        double kmResult = convectMilesToKms(mil);
        double milResult = convectKmsToMiles(km);


        System.out.println("Result ist " + kmResult + " km which is equals " + mil +" miles");
        System.out.println("Result ist " + milResult + " mil which is equals " + km +" km");


    }

    private static double convectMilesToKms(double miles){
        return miles / CONV_KM;
    }

    private static double convectKmsToMiles(double kilometres){
        return kilometres * CONV_KM;
    }
}
