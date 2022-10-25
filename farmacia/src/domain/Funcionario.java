package domain;

import domain.medicacao.Medicacao;
import repository.ListaPessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//            Filho=sub          Pai=super
public class Funcionario extends Pessoa{
    private List<Medicacao> medicamentos = new ArrayList<>();
    public Funcionario(Integer identificador, String nome, LocalDate dataNascimento, String endereço) {
        super(identificador, nome, dataNascimento, endereço);//construtor com parametros de Pessoa
//        super();//construtor vazio de Pessoa
        ListaPessoa.adicionar(this);

    }

    public void adicionarMedicacao(Medicacao medicacao){
        medicamentos.add(medicacao);
        System.out.println("Medicacao Criada");
    };
}
