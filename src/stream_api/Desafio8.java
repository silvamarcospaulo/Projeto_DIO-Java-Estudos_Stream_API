package stream_api;

import javax.management.StringValueExp;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio8 {
    public static void main (String [] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream().flatMapToInt(n -> String.valueOf(n).chars()).map(Character::getNumericValue).sum();

        System.out.println(somaDigitos);
    }
}