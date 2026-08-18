package primeiroexemplo;

public class Banco {
    private String nome;
    private String cpf;
    private Double saldo;

    public Banco (String novoNome, String novoCpf, double novoSaldo){

        this.nome = novoNome;
        this.cpf = novoCpf;
        this.saldo = novoSaldo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Banco (){
        this.nome = "Sem nome";
        this.cpf = "Sem CPF";
        this.saldo = 0.0;
    }
}
