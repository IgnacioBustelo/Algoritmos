import java.util.ArrayList;
import java.util.List;

public class EliminarDuplicadosDeUnVector {
    public static List<Integer> eliminarDuplicados(int[] vector){

        List<Integer> resultado = new ArrayList<Integer>();
        boolean esRepetido=false;
        for (int i = 0; i <vector.length ; i++) {

            for (int j = 0; j <resultado.size() ; j++) {
                if (vector[i]==resultado.get(j)){
                    esRepetido=true;
                    break;
                }

            }
            if (!esRepetido){
                resultado.add(vector[i]);
            }
            esRepetido=false;
        }

        return resultado;
    }
}
