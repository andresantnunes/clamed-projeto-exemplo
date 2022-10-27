package domain;

import domain.medicacao.Medicacao;
import repository.ListaFarmaceuticoSenior;
import repository.ListaPessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//            Filho=sub          Pai=super
public abstract class Funcionario extends Pessoa {
    private List<Medicacao> medicamentos = new ArrayList<>();

    public Funcionario(Integer identificador, String nome, LocalDate dataNascimento, String endereco) {
        super(identificador, nome, dataNascimento, endereco); //construtor com parametros de Pessoa
        ListaPessoa.adicionar(this);

    }

    public void adicionarMedicacao(Medicacao medicacao) {
        medicamentos.add(medicacao);
        System.out.println("Medicacao Criada");
    }

    public void pedirAprovacaoMedicacao(Integer idAprovador, Integer idMedicacao) {
        return;
    }
}
