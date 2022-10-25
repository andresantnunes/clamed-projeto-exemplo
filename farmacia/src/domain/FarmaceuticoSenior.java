package domain;

import domain.medicacao.Medicacao;
import repository.ListaFarmaceutico;
import repository.ListaFarmaceuticoSenior;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FarmaceuticoSenior extends Funcionario{
    private static Integer contador = 0;
    private static List<Medicacao> medicamentosAprovados = new ArrayList<>();
    private static List<Medicacao> medicamentosPendente = new ArrayList<>();

    public FarmaceuticoSenior(String nome, LocalDate dataNascimento, String endereço) {
        super(contador++, nome, dataNascimento, endereço);
        ListaFarmaceuticoSenior.adicionar(this);
    }

    @Override
    public void adicionarMedicacao(Medicacao medicacao){
        medicamentosAprovados.add(medicacao);
        System.out.println("Medicacao Criada");
        System.out.println(medicacao);
        System.out.println(medicamentosAprovados);
    };


    public void aprovarMedicacao(Medicacao medicacao){
        System.out.println("Medicacao Aprovada por FarmaceuticoSenior, nome: " + this.getNome());
        medicamentosAprovados.add(medicacao);
    }
}
