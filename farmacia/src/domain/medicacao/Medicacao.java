package domain.medicacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Medicacao {
    private Long identificador;
    private String nome;
    private String uso;
    private Integer tempoUsoDias;

    public Medicacao(String nome, String uso, Integer tempoUsoDias) {
        this.nome = nome;
        this.uso = uso;
        this.tempoUsoDias = tempoUsoDias;
        this.identificador = RandomGenerator.getDefault().nextLong();
    }

    @Override
    public String toString() {
        return "Medicacao{" +
                "nome='" + nome + '\'' +
                ", uso='" + uso + '\'' +
                ", tempoUsoDias=" + tempoUsoDias +
                '}';
    }

    public Long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public Integer getTempoUsoDias() {
        return tempoUsoDias;
    }

    public void setTempoUsoDias(Integer tempoUsoDias) {
        this.tempoUsoDias = tempoUsoDias;
    }
}
