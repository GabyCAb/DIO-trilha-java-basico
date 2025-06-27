public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //ToDo 1: conhecer e importar a classe Scanner
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        //Todo 2: Exibir as mensagens para o nosso Usuário
        System.out.println("Bem-vindo ao Banco Java!");

        //ToDo 3: Obter o nome do cliente
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        
        //ToDo 4: Obter pela Scanner os valores digitados no termnal
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Por favor, digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();

        //Todo 5: Inserir dados de saldo
        System.out.print("Por favor, digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        //ToDo 5: Exibir mensagem com os dados do cliente
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua Agência é" + numeroAgencia + ", conta " + numeroConta + "e seu saldo de R$ " + saldoInicial + " já está disponível para saque.");

    }
}
