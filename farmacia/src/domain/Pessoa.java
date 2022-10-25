package domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String endereço;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento, String endereço) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereço = endereço;
        this.idade = calculaIdade();
    }

    public Pessoa() {
    }

    public Integer calculaIdade(){
        this.idade = LocalDate.now().getYear() - dataNascimento.getYear();
        return  this.idade;
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

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereço='" + endereço + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
