package tauanbenevides.cap_02.listing;

/**
 * Listing 2.7
 * 
 * Use the System.currentTimeMillis() method to get the current time in
 * milliseconds
 */

public class ShowCurrentTime {

    public static void main(String[] args) {

        // Obtém o total de milissegundos desde meia-noite de 1º de janeiro de 1970
        // (época Unix)
        long totalMilliseconds = System.currentTimeMillis();
        System.out.println(totalMilliseconds);

        // Obtém o total de segundos desde meia-noite de 1º de janeiro de 1970 (época
        // Unix)
        long totalSeconds = totalMilliseconds / 1000;
        System.out.println(totalSeconds);

        // Calcula o segundo atual (resto da divisão dos segundos totais por 60)
        long currentSecond = totalSeconds % 60;
        System.out.println(currentSecond);

        // Obtém o total de minutos (dividindo os segundos totais por 60)
        long totalMinutes = totalSeconds / 60;
        System.out.println(totalMinutes);

        // Calcula o minuto atual (resto da divisão dos minutos totais por 60)
        long currentMinute = totalMinutes % 60;
        System.out.println(currentMinute);

        // Obtém o total de horas (dividindo os minutos totais por 60)
        long totalHours = totalMinutes / 60;
        System.out.println(totalHours);

        // Calcula a hora atual (resto da divisão das horas totais por 24, para obter
        // ahora no formato 24h
        long currentHour = totalHours % 24;
        System.out.println(currentHour);

        // Exibe a hora atual no formato HH : MM : SS
        System.out.println("Current time is " + currentHour + " : " + currentMinute + " : " + currentSecond);

    }
}
