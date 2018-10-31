import java.util.ArrayList;
import java.util.List;

public class VerificarAnagramaConLista {
    public static boolean sonAnagramas(String palabra, String otraPalabra){
        if(palabra.length()!=otraPalabra.length()) return false;
        List<Character> palabraAComparar = new ArrayList<Character>();
        for (int i = 0; i < otraPalabra.length(); i++) {
            palabraAComparar.add(otraPalabra.charAt(i));

        }

        for (int i = 0; i <palabra.length() ; i++) {

            for (int j = 0; j < palabraAComparar.size() ; j++) {
                if (palabra.charAt(i)==palabraAComparar.get(j)){
                    palabraAComparar.remove(j);
                }

            }

        }
        return palabraAComparar.isEmpty();
    }
}
