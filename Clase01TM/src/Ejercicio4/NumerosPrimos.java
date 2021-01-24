package Ejercicio4;

public class NumerosPrimos {
    
    public static void numerosPrimos(int n){

        for (int i = 1; i < n; i++) {
            int contador = 0;
            for (int j = 1; j <= i ; j++) {
                if(i%j == 0){
                    contador++;
                }
            }
            if(contador == 2){
                System.out.println(i);
            }
        }
    }
    
}
