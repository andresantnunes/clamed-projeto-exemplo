package domain;

import domain.medicacao.Medicacao;
import repository.ListaPessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Farmaceutico extends Funcionario{
    private List<Medicacao> medicamentos = new ArrayList<>();
    public Farmaceutico(String nome, LocalDate dataNascimento, String endereço) {
        super(nome, dataNascimento, endereço);
    }

    @Override
    public void criarMedicacao(Medicacao medicacao){
        medicamentos.add(medicacao);
        System.out.println("Medicacao Criada por Farmaceutico");
        System.out.println(medicacao);
        System.out.println(medicamentos);

    };


}
