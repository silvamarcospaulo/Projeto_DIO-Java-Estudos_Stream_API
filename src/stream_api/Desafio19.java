package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Desafio19 {
    public static void main (String [] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int filtro = numeros.stream().filter(n -> (n % 5 == 0) && (n % 3 == 0)).mapToInt(Integer::intValue).sum();

        System.out.println(filtro);
    }
}