package repository;

import domain.Farmaceutico;
import domain.FarmaceuticoSenior;

import java.util.ArrayList;
import java.util.List;

public class ListaFarmaceuticoSenior {
    public static List<FarmaceuticoSenior> farmaceuticoSeniors = new ArrayList<>();

    public static void adicionar(FarmaceuticoSenior far){
        farmaceuticoSeniors.add(far);
    }

    public static FarmaceuticoSenior retornar(Integer id){
        return farmaceuticoSeniors.get(id);
    }

    public static List<FarmaceuticoSenior> retornarTodos(){
        return farmaceuticoSeniors;
    }

}
