package tauanbenevides.cap_01;

public class Exercise01_12 {

    public static void main(String[] args) {

        double speedInMiles = 24;
        double speedInKilometers = speedInMiles * 1.6;

        double hour = 1;
        double minutes = 40.0;
        double seconds = 35.0;

        double minutesInHours = minutes / 60;
        double secondsInHours = seconds / (60 * 60);

        double totalTimeInHours = hour + minutesInHours + secondsInHours;

        double avarageSpeed = speedInKilometers / totalTimeInHours;
        System.out.printf("The avarege speed per hours is %1.2f", avarageSpeed);
        System.out.println();

    }
}
