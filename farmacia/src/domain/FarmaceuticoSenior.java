package domain;

import domain.medicacao.Medicacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FarmaceuticoSenior extends Funcionario{
    private static List<Medicacao> medicamentosAprovados = new ArrayList<>();

    public FarmaceuticoSenior(String nome, LocalDate dataNascimento, String endereço) {
        super(nome, dataNascimento, endereço);
    }

    @Override
    public void criarMedicacao(Medicacao medicacao){
        medicamentosAprovados.add(medicacao);
        System.out.println("Medicacao Criada e Aprovada por FarmaceuticoSenior");
        System.out.println(medicacao);
        System.out.println(medicamentosAprovados);
    };

    public void aprovarMedicacao(Medicacao medicacao){
        System.out.println("Medicacao Aprovada por FarmaceuticoSenior");
        medicamentosAprovados.add(medicacao);
    }
}
