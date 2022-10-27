package service;

import domain.Farmaceutico;
import domain.FarmaceuticoSenior;
import domain.Funcionario;
import domain.medicacao.Medicacao;
import repository.ListaFarmaceuticoSenior;

import java.util.Scanner;

public class Servico {
    public void criarMedicacaoTela(Funcionario usuario){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Qual é o nome do medicamento:");
        String nome = scanner2.nextLine();
        System.out.print("Qual é o uso do medicamento:");
        String uso = scanner2.nextLine();
        System.out.print("Qual é o tempo de uso em dias do medicamento:");
        Integer tempoUso = scanner.nextInt();
        Medicacao medicacao = new Medicacao(nome, uso, tempoUso);
        usuario.adicionarMedicacao(medicacao);
    }

    public void enviarAprovacao(Farmaceutico usuario) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o identificador do Aprovador(Farmaceutico Senior):");
        Integer idAprovador = scanner.nextInt();
        System.out.print("Qual é o identificador do Medicamento:");
        Integer idMedicamento = scanner.nextInt();

        usuario.pedirAprovacaoMedicacao(idAprovador, idMedicamento);
    }

    public void enviarAprovacao(FarmaceuticoSenior usuario) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o identificador do Aprovador(Farmaceutico Senior):");
        Integer idAprovador = scanner.nextInt();
        System.out.print("Qual é o identificador do Medicamento:");
        Integer idMedicamento = scanner.nextInt();

        usuario.pedirAprovacaoMedicacao(idAprovador, idMedicamento);
    }
}
