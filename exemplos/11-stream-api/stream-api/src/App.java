import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {

    public void ordenarNumerosCrescente(List<Integer> numeros) {
        List<Integer> numerosOrdenadosCrescente = numeros.stream().sorted().toList();
        System.out.println("Desafio 1 - Lista ordem crescente: " + numerosOrdenadosCrescente);
    }

    public void imprimirSomarNumerosPares(List<Integer> numeros) {
        int somaPares = numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
        System.out.println("Desafio 2 - Soma dos números pares: " + somaPares);
    }

    public void verificarNumerosPositivos(List<Integer> numeros) {
        List<Integer> numerosPositivos = numeros.stream().sorted().filter(n -> n > 0).toList();
        System.out.println("Desafio 3 - Números positivos: " + numerosPositivos);
    }

    public void removerNumerosImpares(List<Integer> numeros) {
        List<Integer> numerosImpares = numeros.stream().sorted().filter(n -> n % 2 == 0).toList();
        System.out.println("Desafio 4 - Números pares e neutro na lista: " + numerosImpares);
    }

    public void calcularMediaNumeroMaiorQueCinco(List<Integer> numeros) {
        List<Integer> numerosMaiorQueCinco = numeros.stream().filter(n -> n > 5).toList();
        double media =
                numerosMaiorQueCinco.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
        if (media == 0) {
            System.out.println("Desafio 5 - Nenhum número maior que 5 encontrado");
        } else {

            System.out.println("Desafio 5 - Números maiores que 5: " + numerosMaiorQueCinco
                    + "| Média dos números maiores que 5: " + media);
        }

    }

    public void verificarNumeroMaiorQueDez(List<Integer> numeros) {
        List<Integer> numerosMaiorQueDez = numeros.stream().filter(n -> n > 10).toList();
        if (!numerosMaiorQueDez.isEmpty()) {
            System.out.println("Desafio 6 - Números maiores que 10: " + numerosMaiorQueDez);
        } else {
            System.out.println(
                    "Desafio 6 - Números maiores que 10: Nenhum número maior que 10 encontrado");
        }
    }

    public void encontrarSegundoMaiorNumeroDaLista(List<Integer> numeros) {
        Integer segundoNumeroMaior = numeros.stream().distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElse(null);
        if (segundoNumeroMaior == null) {
            System.out.println("Desafio 7 - Nenhum segundo maior número encontrado");
        } else {
            System.out.println("Desafio 7 - Segundo maior número: " + segundoNumeroMaior);
        }

    }

    public static void main(String[] args) throws Exception {
        App app = new App();

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, -9, 10, 5, 4, 3, 15, 12);

        app.ordenarNumerosCrescente(numeros);
        app.imprimirSomarNumerosPares(numeros);
        app.verificarNumerosPositivos(numeros);
        app.removerNumerosImpares(numeros);
        app.calcularMediaNumeroMaiorQueCinco(numeros);
        app.verificarNumeroMaiorQueDez(numeros);
        app.encontrarSegundoMaiorNumeroDaLista(numeros);
    }
}
