package tauanbenevides.cap_01;

public class Exercise01_10 {

    public static void main(String[] args) {

        double kilometers = 14.0;
        double miles = kilometers / 1.6;

        double minutes = 45;
        double seconds = 30;

        double timeInHours = minutes / 60 + seconds / 3600;

        double averageSpeed = miles / timeInHours;
        System.out.printf("The avarageSpeed in miles is: %.2f", averageSpeed);
    }
}
