import domain.Farmaceutico;
import domain.Funcionario;
import domain.Pessoa;
import domain.medicacao.Medicacao;
import repository.ListaPessoa;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Farmaceutico func = new Farmaceutico(
                "Aroudo Vasconcelos Lima",
                LocalDate.of(2012,1,1),
                "rua das lamentações 17"
        );

        System.out.printf(ListaPessoa.retornar(0).toString());

//        System.out.println(func);
//        func.criarMedicacao(new Medicacao(
//                "Metrixzoraimer",
//                "uso adulto",
//                10
//        ));
//        func.criarMedicacao(new Medicacao(
//                "Metrixzoraimer",
//                "uso adulto",
//                10
//        ));
//        func.criarMedicacao(new Medicacao(
//                "Metrixzoraimer",
//                "uso adulto",
//                10
//        ));
//        func.criarMedicacao(new Medicacao(
//                "Metrixzoraimer",
//                "uso adulto",
//                10
//        ));
    }
}