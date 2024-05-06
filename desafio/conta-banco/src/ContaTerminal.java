import java.util.Locale;
import java.util.Scanner;

/**
 * Classe principal para gerenciamento de contas bancárias via terminal.
 *
 * @author Luan Barcaça
 * @version 1.0
 * @since 2024-05-06
 */
public class ContaTerminal {

    /**
     * Este é o método principal da classe ContaTerminal. Simula um sistema bancário simples onde os
     * usuários podem criar uma nova conta e visualizar os detalhes de sua conta.
     *
     * @param args Argumentos da linha de comando (não utilizados neste caso).
     * @throws Exception Exceções que podem ocorrer durante a execução do programa.
     */
    public static void main(String[] args) throws Exception {

        /*
         * Cria um objeto Scanner para ler entradas do usuário do console. Define o locale para
         * "en_US" para garantir formatação decimal correta.
         */
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicita ao usuário o número da sua conta corrente e armazena a entrada em um inteiro.
        System.out.print("Por favor, informe o número da sua Conta Corrente: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());

        // Solicita ao usuário o número da agência e armazena a entrada em uma string
        System.out.print("Por favor, digite o número da Agência: ");
        String numeroAgencia = scanner.nextLine();

        // Solicita ao usuário o nome do titular da conta e armazena a entrada em uma string
        System.out.print("Por favor, digite o nome completo do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        /*
         * Solicita ao usuário que confirme o saldo a ser depositado e armazena a entrada em um
         * double. Este método garante que apenas números decimais sejam digitados e converte
         * vírgulas em pontos decimais.
         */
        System.out.print("Ok, Sr." + nomeTitular.split(" ")[1]
                + ".Preciso que digite o saldo a ser depositado na sua conta:");
        String entradaSaldo = scanner.nextLine();
        double saldo = Double.parseDouble(entradaSaldo.replace(',', '.'));

        // Exibe uma mensagem de agradecimento ao usuário, informando os detalhes da conta e o saldo
        // disponível.
        System.out.println("Olá " + nomeTitular
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
                + ", conta " + numeroConta + " e seu saldo " + saldo
                + " já está disponível para saque");

        // Fecha o objeto Scanner para liberar recursos.
        scanner.close();
    }
}
