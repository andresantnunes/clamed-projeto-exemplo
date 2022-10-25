package domain.medicacao;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Medicacao {
    private String nome;
    private String uso;
    private Integer tempoUsoDias;

    public Medicacao(String nome, String uso, Integer tempoUsoDias) {
        this.nome = nome;
        this.uso = uso;
        this.tempoUsoDias = tempoUsoDias;
    }

    @Override
    public String toString() {
        return "Medicacao{" +
                "nome='" + nome + '\'' +
                ", uso='" + uso + '\'' +
                ", tempoUsoDias=" + tempoUsoDias +
                '}';
    }
}
