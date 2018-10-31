import java.util.ArrayList;
import java.util.List;

public class InvertirPosicionDePalabras {

    public static String invertir (String frase){
        List<String> palabras = new ArrayList<String>();
        frase+=' ';
        int indiceDelUltimoEspacio=-1;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==' '){
                String palabra= new String();
                for (int j = indiceDelUltimoEspacio+1; j <i ; j++) {
                    palabra+=frase.charAt(j);
                    }
                    palabras.add(palabra);
                indiceDelUltimoEspacio=i;
            }

        }
        String resultado = new String();
        for (int i = palabras.size()-1; i>=0 ; i--) {
            resultado+= ' '+palabras.get(i);
        }

        return resultado;
    }
}
