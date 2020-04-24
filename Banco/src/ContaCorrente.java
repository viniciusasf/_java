
import static java.lang.Math.abs;

public class ContaCorrente {

    int numeroConta;
    double saldo;
    double saldoLimite;
    double valorDeposito;
    double saque;
    Clientes cliente;

    public void ContaCorrente(int numeroConta, double saldo, double saldoLimite, double valorDeposito, double saque, Clientes cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.saldoLimite = saldoLimite;
        this.valorDeposito = valorDeposito;
        this.saque = saque;

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoLimite() {
        return saldoLimite;
    }

    public double getvalorDeposito() {
        return valorDeposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaque() {
        return saque;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public void setSaldoLimite(double saldoLimite) {
        this.saldoLimite = saldoLimite;
    }

    public void setSaldo() {
        this.saldo = saldo;
    }

    public void setSaque() {
        this.saque = saque;
    }

    //public void saca(double valorSaque) {
    //    double novoSaldo = this.saldo - valorSaque;
    //   this.saldo = novoSaldo;
    void deposita() {
        this.saldo += this.valorDeposito;
        System.out.println("O VALOR ATUAL DO SALDO É: " + getSaldo() + "\nMAIS UM LIMITE DE: " + getSaldoLimite());
    }

    void imprimeAtualizaDepositoSaldo(double novoSaldo) {
        novoSaldo = saldoLimite += this.saldo;
        this.saldo = novoSaldo;
        System.out.println("DEPOSITO REALIZADO!!! \nO SALDO ATUAL DA SUA CONTA É: " + getSaldo());
    }

    //void imprimeValor1() {
    //  System.out.println("O SEU NOVO SALDO É DE: \n" + getSaldo());
    //}
    void imprimeLimiteSaldo() {
        System.out.println("O SEU LIMITE É DE: \n" + getSaldoLimite());
    }
    double n;

    void saque() {
        double diferenca;
        if (this.saldo < this.saque) {

            diferenca = this.saldo -= this.saque;

            System.out.println("SAQUE REALIZADO COM SUCESSO!!!!!! FOI SACADO DO LIMITE " + diferenca + "O VALOR ATUAL DO LIMITE É");

            this.saldo -= this.saque;
            System.out.println("SAQUE REALIZADO!!!! \nO SALDO ATUAL DA SUA CONTA É: " + getSaldo());
        }
    }

}
