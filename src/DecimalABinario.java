import java.util.ArrayList;
import java.util.List;

public class DecimalABinario {
    public static Double convertirABinario(Double decimal,int decimales){
        List<Integer> resultadoEnteroLista = new ArrayList<Integer>();
        List<Integer>resultadoListaDecimal= new ArrayList<Integer>();
        int parteEntera = decimal.intValue();
        Float parteDecimal=decimal.floatValue()-parteEntera;
        while (parteEntera>0 ){
            resultadoEnteroLista.add(parteEntera%2);
            parteEntera = parteEntera/2;
        }

        int iteracion = 0;

        while (!(parteDecimal==0.0) && iteracion <= decimales){
            parteDecimal= parteDecimal*2;
            resultadoListaDecimal.add(parteDecimal.intValue());
            parteDecimal = parteDecimal - parteDecimal.intValue();
            iteracion=iteracion+1;
        }
        Double resultadoNumero=0.0;
        for (int i = resultadoEnteroLista.size()-1; i >=0 ; i--) {
            resultadoNumero=resultadoNumero + resultadoEnteroLista.get(i)* Math.pow(10,i);
        }
        for (int i = resultadoListaDecimal.size()-1; i >= 0; i--) {
            resultadoNumero=resultadoNumero + resultadoListaDecimal.get(i)* Math.pow(10,-i-1);
        }

        return resultadoNumero;

    }
}
