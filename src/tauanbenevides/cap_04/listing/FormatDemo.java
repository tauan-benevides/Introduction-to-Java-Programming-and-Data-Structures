package tauanbenevides.cap_04.listing;

/**
 * Listing 4.6
 * <p>
 * Listing 4.6 gives a program that uses printf to display a table.
 */

public class FormatDemo {

    public static void main(String[] args) {

        /*
            Por padrão, a saída é justificada corretamente pela direita.
            Coloca-se o sinal de (-) para especificar que o item é justificado à esquerda.
         */


        // Display the header of the table
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n",
                "Degrees", "Radians", "Sine", "Cosine", "Tangent");

        // Display values for 30 degrees
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",
                degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

        // Display values for 60 degrees
        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",
                degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
    }
}
