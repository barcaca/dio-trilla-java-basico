import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    public void ordenarNumerosCrescente(List<Integer> numeros) {
        List<Integer> numerosOrdenadosCrescente = numeros.stream().sorted().toList();
        System.out.println("Desafio 1 - Lista ordem crescente: " + numerosOrdenadosCrescente);
    }

    public void somarNumerosPares(List<Integer> numeros) {
        int somaPares = numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
        System.out.println("Desafio 2 - Soma dos números pares: " + somaPares);
    }

    public void imprimirNumerosPositivos(List<Integer> numeros) {
        List<Integer> numerosPositivos = numeros.stream().sorted().filter(n -> n > 0).toList();
        System.out.println("Desafio 3 - Números positivos: " + numerosPositivos);
    }

    public void imprimirNumerosPares(List<Integer> numeros) {
        List<Integer> numerosPares = numeros.stream().sorted().filter(n -> n % 2 == 0).toList();
        System.out.println("Desafio 4 - Números pares e neutro na lista: " + numerosPares);
    }

    public void calcularMediaNumerosMaioresQueCinco(List<Integer> numeros) {
        List<Integer> numerosMaioresQueCinco = numeros.stream().filter(n -> n > 5).toList();
        double media = numerosMaioresQueCinco.stream().mapToDouble(Integer::doubleValue).average()
                .orElse(0);
        if (media == 0) {
            System.out.println("Desafio 5 - Nenhum número maior que 5 encontrado");
        } else {

            System.out.println("Desafio 5 - Números maiores que 5: " + numerosMaioresQueCinco
                    + " | Média dos números maiores que 5: " + String.format("%.2f", media));
        }

    }

    public void imprimirNumerosMaioresQueDez(List<Integer> numeros) {
        List<Integer> numerosMaioresQueDez = numeros.stream().filter(n -> n > 10).toList();
        if (!numerosMaioresQueDez.isEmpty()) {
            System.out.println("Desafio 6 - Números maiores que 10: " + numerosMaioresQueDez);
        } else {
            System.out.println("Desafio 6 - Nenhum número maior que 10 encontrado");
        }
    }

    public void encontrarSegundoMaiorNumero(List<Integer> numeros) {
        Integer segundoMaiorNumero = numeros.stream().distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElse(null);
        if (segundoMaiorNumero == null) {
            System.out.println("Desafio 7 - Nenhum segundo maior número encontrado");
        } else {
            System.out.println("Desafio 7 - Segundo maior número: " + segundoMaiorNumero);
        }

    }

    public void somarDigitos(List<Integer> numeros) {
        int somaDigitos = numeros.stream().flatMapToInt(n -> Integer.toString(n).chars())
                .map(Character::getNumericValue).sum();
        System.out.println("Desafio 8 - Soma dos digitos dos números: " + somaDigitos);
    }

    public void imprimirnumerosRepetidos(List<Integer> numeros) {
        Set<Integer> numerosUnicos = new HashSet<>();
        List<Integer> numerosRepetidos =
                numeros.stream().filter(n -> !numerosUnicos.add(n)).distinct().sorted().toList();
        System.out.println("Desafio 9 - Números repetidos: " + numerosRepetidos);
    }

    public void imprimirMultiplosDeTresECinco(List<Integer> numeros) {
        List<Integer> multiplosDeTres = numeros.stream().filter(n -> n % 3 == 0).toList();
        List<Integer> multiplosDeCinco = numeros.stream().filter(n -> n % 5 == 0).toList();
        System.out.println("Desafio 10 - Múltiplos de 3: " + multiplosDeTres + " | Múltiplos de 5: "
                + multiplosDeCinco);
    }

    public void somarQuadradosDosNumeros(List<Integer> numeros) {
        int somaDosQuadrados = numeros.stream().map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(
                "Desafio 11 - Soma dos quadrados de todos os números: " + somaDosQuadrados);
    }

    public void calcularProdutoDosNumeros(List<Integer> numeros) {
        int produto = numeros.stream().reduce(1, (n1, n2) -> n1 * n2);
        System.out.println("Desafio 12 - Produto de todos os números da lista: " + produto);
    }

    public void filtrarNumerosNoIntervalo(List<Integer> numeros, int min, int max) {
        List<Integer> numerosFiltrados =
                numeros.stream().distinct().filter(n -> n >= min && n <= max).toList();
        System.out.println("Desafio 13 - Números no intervalo [" + min + ", " + max + "]: "
                + numerosFiltrados);
    }

    public static boolean isPrime(int numero) {
        if (numero <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }

    public void maiorNumeroPrimo(List<Integer> numeros) {
        Integer numerosPrimos =
                numeros.stream().sorted().filter(App::isPrime).max(Integer::compareTo).orElse(0);
        if (numerosPrimos == 0) {
            System.out.println("Desafio 14 - Nenhum número primo encontrado");
        } else {
            System.out.println("Desafio 14 - Maior número primo: " + numerosPrimos);
        }
    }

    public void imprimirNumeroNegativo(List<Integer> numeros) {
        List<Integer> numerosNegativos = numeros.stream().filter(n -> n < 0).toList();
        System.out.println("Desafio 15 - Números negativos: " + numerosNegativos);
    }

    public void imprimirNumerosParesEImpares(List<Integer> numeros) {
        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();
        List<Integer> numerosImpares = numeros.stream().filter(n -> n % 2 != 0).toList();
        System.out.println("Desafio 16 - Números pares: " + numerosPares + " | Números ímpares: "
                + numerosImpares);
    }

    public void imprimirNumerosPrimo(List<Integer> numeros) {
        List<Integer> numerosPrimos = numeros.stream().distinct().filter(App::isPrime).toList();
        System.out.println("Desafio 17 - Números primos: " + numerosPrimos);
    }

    public void verificarNumerosIguais(List<Integer> numeros) {
        boolean todosIguais = numeros.stream().distinct().count() == 1;

        if (todosIguais) {
            System.out.println("Desafio 18 - Todos os números são iguais.");
        } else {
            System.out.println("Desafio 18 - Nem todos os números são iguais.");
        }
    }

    public void somarNumeroDivisivelTresECinco(List<Integer> numeros) {
        int soma = numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).reduce(0, Integer::sum);
        System.out.println("Desafio 19 - Soma dos números divisíveis por 3 ou 5: " + soma);
    }


    public static void main(String[] args) throws Exception {
        App app = new App();

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, -9, 10, 5, 4, 3, 15, -12, 23);

        app.ordenarNumerosCrescente(numeros);
        app.somarNumerosPares(numeros);
        app.imprimirNumerosPositivos(numeros);
        app.imprimirNumerosPares(numeros);
        app.calcularMediaNumerosMaioresQueCinco(numeros);
        app.imprimirNumerosMaioresQueDez(numeros);
        app.encontrarSegundoMaiorNumero(numeros);
        app.somarDigitos(numeros);
        app.imprimirnumerosRepetidos(numeros);
        app.imprimirMultiplosDeTresECinco(numeros);
        app.somarQuadradosDosNumeros(numeros);
        app.calcularProdutoDosNumeros(numeros);
        app.filtrarNumerosNoIntervalo(numeros, 0, 10);
        app.maiorNumeroPrimo(numeros);
        app.imprimirNumeroNegativo(numeros);
        app.imprimirNumerosParesEImpares(numeros);
        app.imprimirNumerosPrimo(numeros);
        app.verificarNumerosIguais(numeros);
        app.somarNumeroDivisivelTresECinco(numeros);
    }
}
