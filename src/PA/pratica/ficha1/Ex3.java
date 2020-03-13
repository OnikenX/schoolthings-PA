package PA.pratica.ficha1;

import java.util.Scanner;

public class Ex3 {
    public static void ex(){
        System.out.println("Tamanho do array:");
        int size = getInt(1);
        int numeros[] = new int[size];
        //buscar os numeros
        for(int i = 0; i < size; ++i) {
            System.out.print("Numero " + i + 1 + ":");
            numeros[i] = getInt();
        }
        System.out.println("os numeros sao:");
        for(int i = 0; i < size; ++i)
            System.out.println("\t["+i+1+"]="+numeros[i]);
    }

    private static int getInt(){
        return getInt(false, 0);
    }

    private static int getInt(int min){
        return getInt(true, min);
    }

    private static int getInt(boolean verify, int min){
        Scanner sc = new Scanner(System.in);
        int number = 0;

        do{
            try{
                number = sc.nextInt();
            }catch(Exception e) {
                System.out.println("Digite um número please.[error handling incomplete]");
                continue;
            }
        }while(number >= min);
        return number;
    }
}
