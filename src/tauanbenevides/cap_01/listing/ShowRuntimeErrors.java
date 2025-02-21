package tauanbenevides.cap_01.listing;

/**
 * Listing 1.5
 * 
 * Display the cause a runtime error
 */

/*
 * RuntimeErrors são erros que ocorrem enquanto um programa está em execução.
 * São erros que fazem com o que o programa encerre de forma anormal devido a
 * execução de uma operação que é impossivel de ser realizada, como por exemplo,
 * a divisão de algum número por 0.
 */

public class ShowRuntimeErrors {

    public static void main(String[] args) {

        System.out.println(1 / 0);

    }
}
