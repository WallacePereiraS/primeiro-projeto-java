import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int menuEscolhido = 0;
        String nome = "Odete do Carmo";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        String mensagemSaldo = String.format("Saldo Inicial:   R$ %.2f ", saldo);

        System.out.println("************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome:            " + nome);
        System.out.println("Tipo conta:      " + tipoConta);
        System.out.println(mensagemSaldo);
        System.out.println("************************************");

        String menu = """
                
                Operações:
                
                1- Consultar saldos
                2- Receber valor
                3. Transferir valor
                4. Sair
                
                Digite a opção desejada:
                """;

        while (menuEscolhido != 4) {
            System.out.println(menu);
            menuEscolhido = leitura.nextInt();

            if (menuEscolhido == 1) {
                String resposta = String.format("O saldo atual é: R$ %.2f ", saldo);
                System.out.println(resposta);

            } else if (menuEscolhido == 2) {
                System.out.println("Informe o valor a receber:");
                double depositar = leitura.nextDouble();
                saldo += depositar;
                String resposta = String.format("Saldo atualizado: R$ %.2f ", saldo);
                System.out.println(resposta);

            } else if (menuEscolhido == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                double tranferir = leitura.nextDouble();

                if (tranferir > saldo) {
                    System.out.println("Não há saldo suficiente para fazer esta transferência.");
                } else {
                    saldo -= tranferir;
                }

            } else if (menuEscolhido == 4) {
                System.out.println("Aplicação encerrada");
            }
            else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
