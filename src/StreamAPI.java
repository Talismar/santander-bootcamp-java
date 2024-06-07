import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numeros.forEach(item -> {
            if (item % 2 == 0) {
                System.out.println(item);
            }
        });
        
        List<String> listaSaudacoes = Stream.generate(() -> "Saudações").limit(5).collect(Collectors.toList());
        System.out.println(listaSaudacoes);

        List<Integer> numerosDobrados = numeros.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(numerosDobrados);

        /* 
         * Predicate o objetivo é retornar um boolean 
         */
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        /* 
         * BinaryOperator<T> semelhante ao reduce do JavaScript
         */

         BinaryOperator<Integer> somar = (n1, n2) -> n1 + n2;

         Integer soma = numeros.stream().reduce(0, somar);
         System.out.println(soma);
     }
}
