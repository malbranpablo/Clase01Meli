package Ejercicio2;

public class Multiplos {

    public static void multiplos(int n, int m){
        for (int i = 0; i <= m; i++) {
            if(i%n == 0){
                System.out.println(i);
            }
        }
    }

}
