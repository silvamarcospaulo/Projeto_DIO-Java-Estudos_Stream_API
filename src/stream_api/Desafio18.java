package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main (String [] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean iguais = numeros.stream().allMatch(n -> n.equals(numeros.get(0)));

        System.out.print(iguais);
    }
}