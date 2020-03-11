package PA.pratica.ficha1;

import java.util.*;

public class Ex1 {
    public static int randvalue() {
        return (int) (Math.random() * 100);
    }

    public static void JogoRandom() {
        System.out.println("\t-------JOGO DO ALEATORIO-------");
        int random = randvalue(), input, tentativa = 0, debug = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("A calcular numero aleatorio  beep boop done");
        System.out.println("Tenta advinhar um número entre 1 e 100:");

        do {

            input = -1;++tentativa;
            if(tentativa == 20){
                System.out.println("Mais do que "+ 20 +"  tentativas.");
                break;
            }
            try {
                input = sc.nextInt();
            } catch (IllegalStateException e) {
                System.out.println("O input foi fechado.");
                break;
            } catch (InputMismatchException e) {
                if(debug!=0)
                    System.out.println("valor: " + input );
                System.out.println("Porfavor escreva um numero entre 1 e 100:");
                sc.nextLine();
                continue;
            } catch (Exception e) {
                System.out.println("Uma excepcao foi detectada.");
                break;
            }
            if (input < 0 || input > 100) {
                System.out.println("Escreva um número entre 0 e 100.");
            } else if (input == random) {
                System.out.println("Sucksexo!!!");
            } else if (input < random) {
                System.out.println("O número é maior do que " + input + ".");
            } else if (input > random) {
                System.out.println("O número é menor do que " + input + ".");
            }
        } while (input != random);
    }
}
