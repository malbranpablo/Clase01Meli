package Ejercicio5;

public class Naturales {
    public static boolean cumpleCondicion(int i, int m, int d){
        String s = Integer.toString(i);
        char c = (char) (d+48);
        return charCount(s,c) == m;
    }

    public static int charCount(String s, char c){
        int count = 0;
        for(int j = 0; j < s.length(); j++) {
            if(s.charAt(j) == c)
                count++;
        }
        return count;
    }
}
