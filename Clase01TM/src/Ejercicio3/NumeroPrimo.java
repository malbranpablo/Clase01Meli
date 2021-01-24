package Ejercicio3;

public class NumeroPrimo {
    public static void esPrimo(int n){
        int contador = 0;
        for (int i = 1; i <= n ; i++) {
            if(n%i == 0){
                contador++;
            }
        }
        if(contador == 2){
            System.out.println(n+" es numero Primo");
        }else{
            System.out.println(n+" no es numero Primo");
        }
    }
}
