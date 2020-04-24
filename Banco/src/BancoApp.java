
import java.util.Scanner;

public class BancoApp {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Clientes cliente = new Clientes();
        ContaCorrente minhaconta = new ContaCorrente();
        cliente.titular = minhaconta;

        minhaconta.saldoLimite = 2000;

        System.out.println(" ************************************************* ");
        
        System.out.println("INSIRA SEU NOME");
        cliente.nome = ler.nextLine();

        System.out.println("TODO LIMITE PARA CONTA NOVA É DE:" + minhaconta.saldoLimite);
        System.out.println("DEPOSITE UM VALOR NA CONTA");
        minhaconta.saldo = ler.nextDouble();

        // minhaconta.imprimeLimiteSaldo();
        System.out.println("O QUE DESEJA FAZER? (1) DEPOSITO: (2) SAQUE:");
        int valor = ler.nextInt();

        switch (valor) {

            case 0:
                minhaconta.imprimeAtualizaDepositoSaldo(0);
                System.out.println("DESEJA FAZER OUTRA OPERAÇÃO? DIGITE 9 ");
                break;
            case 1:
                System.out.println(" ************VINICIUS************************************* ");
                System.out.println("DEPOSITE UM VALOR: ");
                minhaconta.valorDeposito = ler.nextDouble();
                System.out.println(" ************************************************* ");
                minhaconta.deposita();
                System.out.println("DESEJA FAZER OUTRA OPERAÇÃO? DIGITE 9 ");
                break;
            case 2:
                System.out.println(" ************************************************* ");
                System.out.print("O SEU SALDO ATUAL :" + minhaconta.getSaldo() + "\nSAQUE UM VALOR R$ : ");
                minhaconta.saque = ler.nextDouble();   
                System.out.println(" ************************************************* ");
                minhaconta.saque();
                System.out.println("DESEJA FAZER OUTRA OPERAÇÃO? DIGITE 9 ");
                break;
            default:
                System.out.println("Opção inválida. Escolha novamente.");
        }
        System.out.println("OBRIGADO" + cliente.nome + "POR USAR NOSSO APLICATIVO");
    }

    // System.out.println("DEPOSITE UM VALOR INICIAL:");
    // minhaconta.saldo = ler.nextInt();
    // minhaconta.imprimeAtualizaDepositoSaldo();
    // System.out.println("DEPOSITE UM VALOR ADICIONAL");
    //  minhaconta.valorDeposito = ler.nextInt();
    //  minhaconta.deposita();
    //  System.out.println("SAQUE UM VALOR AGORA MENOR QUE " + minhaconta.getSaldo());
    //  minhaconta.saque = ler.nextInt();
    //  minhaconta.saque();
    //minhaconta.saldo = 1000;
    //cliente.nome = "ROBERTO";
    //minhaconta.deposita(500.50);
    //minhaconta.saca(200);
    //cliente.imprimeSaldo();
    //minhaconta.imprimeSaldo();
    //System.out.println("O SEU NOME É: \n" + cliente.nome + "\nO VALOR do SALDO É: \n " + minhaconta.saldo);
}
