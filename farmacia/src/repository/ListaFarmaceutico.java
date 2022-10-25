package repository;

import domain.Farmaceutico;

import java.util.ArrayList;
import java.util.List;

public class ListaFarmaceutico {
    public static List<Farmaceutico> farmaceuticos = new ArrayList<>();

    public static void adicionar(Farmaceutico far){
        farmaceuticos.add(far);
    }

    public static Farmaceutico retornar(Integer id){
        return farmaceuticos.get(id);
    }

    public static List<Farmaceutico> retornarTodos(){
        return farmaceuticos;
    }

}
