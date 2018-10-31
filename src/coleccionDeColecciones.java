import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class coleccionDeColecciones {
    public static List<List<Integer>> dividirEnColecciones(List<Integer> lista, int tamanio){

        List<List<Integer>> resultado=new LinkedList<List<Integer>>();
        for (int i =0 ; i < lista.size()/tamanio ; i++) {
            resultado.add(new LinkedList<Integer>());
        }
        if (lista.size()%tamanio!=0){
            resultado.add(new LinkedList<Integer>());
        }

        for (int i = 0; i <lista.size() ; i++) {
            resultado.get(i/tamanio).add(lista.get(i));

        }



return resultado;
        }
    }

