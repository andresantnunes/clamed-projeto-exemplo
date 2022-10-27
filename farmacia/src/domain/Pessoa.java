package domain;

import java.time.LocalDate;

public class Pessoa {
    private Integer identificador;
    private String nome;
    private Integer idade;
    private String endereco;
    private LocalDate dataNascimento;

    public Pessoa(Integer identificador,
                  String nome,
                  LocalDate dataNascimento,
                  String endereço) {
        this.identificador = identificador;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereço;
        this.idade = calculaIdade();
    }

    public Pessoa() {
    }

    public Integer calculaIdade(){
        this.idade = LocalDate.now().getYear() - dataNascimento.getYear();
        return  this.idade;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "identificador=" + identificador +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereço='" + endereco + '\'' +
                ", dataNascimento=" + dataNascimento;
    }
}
