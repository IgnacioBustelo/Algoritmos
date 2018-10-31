import java.util.ArrayList;
import java.util.List;

public class VerificarAnagramaConLista {
    public static boolean sonAnagramas(String palabra, String otraPalabra){
        if(palabra.length()!=otraPalabra.length()) return false;
        List<Character> palabraAComparar = new ArrayList<Character>();
        for (int i = 0; i < otraPalabra.length(); i++) {
            palabraAComparar.add(otraPalabra.charAt(i));

        }
            int verificador;
        for (int i = 0; i <palabra.length() ; i++) {
            verificador= palabraAComparar.size();
            for (int j = 0; j < verificador ; j++) {
                if (palabra.charAt(i)==palabraAComparar.get(j)){
                    palabraAComparar.remove(j);
                    break;
                }

            }
            if (palabraAComparar.size()==verificador) return false;
        }
        return palabraAComparar.isEmpty();
    }
}
