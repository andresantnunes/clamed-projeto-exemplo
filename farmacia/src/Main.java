import domain.Farmaceutico;
import domain.FarmaceuticoSenior;
import repository.ListaFarmaceutico;
import repository.ListaPessoa;
import servico.Servico;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Farmaceutico farmaceutico = new Farmaceutico(
                "Aroudo Vasconcelos Lima",
                LocalDate.of(2012,1,1),
                "rua das lamentações 17"
        );

        Farmaceutico farmaceutico1 = new Farmaceutico(
                "Aroudo Vasconcelos Lima",
                LocalDate.of(2012,1,1),
                "rua das lamentações 17"
        );

        Farmaceutico farmaceutico2 = new Farmaceutico(
                "Aroudo Vasconcelos Lima",
                LocalDate.of(2012,1,1),
                "rua das lamentações 17"
        );

        Farmaceutico farmaceutico3 = new Farmaceutico(
                "Aroudo Vasconcelos Lima",
                LocalDate.of(2012,1,1),
                "rua das lamentações 17"
        );

        FarmaceuticoSenior farmaceuticoSenior = new FarmaceuticoSenior(
                "Aroudo Vasconcelos Lima",
                LocalDate.of(2012,1,1),
                "rua das lamentações 17"
        );

        FarmaceuticoSenior farmaceuticoSenior1 = new FarmaceuticoSenior(
                "Aroudo Vasconcelos Lima",
                LocalDate.of(2012,1,1),
                "rua das lamentações 17"
        );
        FarmaceuticoSenior farmaceuticoSenior2 = new FarmaceuticoSenior(
                "Aroudo Vasconcelos Lima",
                LocalDate.of(2012,1,1),
                "rua das lamentações 17"
        );
        FarmaceuticoSenior farmaceuticoSenior3 = new FarmaceuticoSenior(
                "Aroudo Vasconcelos Lima",
                LocalDate.of(2012,1,1),
                "rua das lamentações 17"
        );

        Servico servico = new Servico();

        Scanner scanner = new Scanner(System.in);

        boolean executa = true;
        while(executa){
            System.out.print("Qual o seu id: ");
            Integer id = scanner.nextInt();
            Farmaceutico usuario = ListaFarmaceutico.retornar(id);
            System.out.println();

            System.out.print("Qual operacao você deseja realizar: " +
                    "\n 1 - Criar Medicação" +
                    "\n 2 - Pedir Aprovação da Medicação" +
                    "\n Entre a opção escolhida:");

            Integer operacao = scanner.nextInt();

            switch (operacao){
                case 1:
                    servico.criarMedicacaoTela(usuario);
                    break;
                case 2:
                    servico.enviarAprovacao(usuario);
                    break;
            }


            System.out.print("Deseja Encerrar? " +
                    "\n 1 - Sim" +
                    "\n 2 - Não" +
                    "\n Entre a opção escolhida:");

            Integer encerrar = scanner.nextInt();

            switch (encerrar){
                case 1:
                    executa = false;
                    break;
                case 2:
                    executa = true;
                    break;
            }
        }
//        System.out.printf(ListaPessoa.retornarTodos().toString());
    }
}