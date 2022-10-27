package domain;

import domain.medicacao.Medicacao;
import repository.ListaFarmaceutico;
import repository.ListaFarmaceuticoSenior;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FarmaceuticoSenior extends Funcionario {
    private static Integer contador = 0;
    private static List<Medicacao> medicamentosAprovados = new ArrayList<>();
    private static List<Medicacao> medicamentosPendente = new ArrayList<>();

    public FarmaceuticoSenior(String nome, LocalDate dataNascimento, String endereço) {
        super(contador++, nome, dataNascimento, endereço);
        ListaFarmaceuticoSenior.adicionar(this);
    }

    @Override
    public void adicionarMedicacao(Medicacao medicacao) {
        medicamentosPendente.add(medicacao);
        System.out.println("Medicacao Criada");
        System.out.println(medicacao);
        System.out.println(medicamentosPendente);
    }

    ;


    public void aprovarMedicacao(Long idMedicamentoPendente) {
        System.out.println("Medicacao Aprovada por FarmaceuticoSenior, nome: " + this.getNome());

        for (Medicacao medicacao : medicamentosPendente) {
            if (Objects.equals(medicacao.getIdentificador(), idMedicamentoPendente)) {
                medicamentosPendente.remove(medicacao);
                medicacao.setNome("nome2");
                medicamentosAprovados.add(medicacao);
            }
        }

    }

    public void reverterMedicacaoAprovada(Long idMedicamentoAprovado) {
        System.out.println("Medicacao Revertida por FarmaceuticoSenior, nome: " + this.getNome());

        for (Medicacao medicacao :
                medicamentosAprovados) {
            if (Objects.equals(medicacao.getIdentificador(), idMedicamentoAprovado)) {
                medicamentosPendente.add(medicacao);
                medicamentosPendente.remove(medicacao);
            }
        }

    }

//    public void rejeitarMedicacao(Long idMedicamento, Integer idFarmaceutico) {
    public void rejeitarMedicacao(Long idMedicamento, Farmaceutico farmaceutico) {
//        Farmaceutico farmaceutico = ListaFarmaceutico.retornar(idFarmaceutico);

        for (Medicacao medicacao :
                medicamentosPendente) {
            if (Objects.equals(medicacao.getIdentificador(), idMedicamento)) {
                farmaceutico.adicionarMedicacao(medicacao);
                medicamentosPendente.remove(medicacao);
            }
        }
    }
}
