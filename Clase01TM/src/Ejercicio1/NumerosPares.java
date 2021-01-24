package Ejercicio1;

public class NumerosPares {
    public static void numerosPares(int numero){
        for (int i = 0; i < numero ; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
