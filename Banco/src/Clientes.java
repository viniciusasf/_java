
public class Clientes {

    String nome, endereco;
    ContaCorrente titular;

    public void Cliente(String nome, String endereco, ContaCorrente Conta) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco() {
        this.endereco = endereco;
    }

}
