package domain;

import domain.medicacao.Medicacao;
import repository.ListaFarmaceutico;
import repository.ListaFarmaceuticoSenior;
import repository.ListaPessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Farmaceutico extends Funcionario{
    private static Integer contador = 0;
    private List<Medicacao> medicamentos = new ArrayList<>();
    public Farmaceutico(String nome, LocalDate dataNascimento, String endereço) {
        super(contador++,nome, dataNascimento, endereço);
        ListaFarmaceutico.adicionar(this);
    }

    @Override
    public void adicionarMedicacao(Medicacao medicacao){
        medicamentos.add(medicacao);
        System.out.println("Medicacao Criada por Farmaceutico");
        System.out.println(medicacao);
        System.out.println(medicamentos);
    };

    public void pedirAprovacaoMedicacao(Integer idAprovador, Integer idMedicacao){
        FarmaceuticoSenior aprovador = ListaFarmaceuticoSenior.retornar(idAprovador);
        aprovador.aprovarMedicacao(
                medicamentos.get(idMedicacao)
        );
    }


}
