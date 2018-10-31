public class VerificarAnagrama {
    public static boolean sonAnagramas(String palabra,String otraPalabra){


        if (palabra.length()!=otraPalabra.length()) return false;

         char[] vector= otraPalabra.toCharArray();
         int contador=-1;
        for (int i = 0; i <palabra.length() ; i++) {

            for (int j = 0; j <vector.length ; j++) {
                if (palabra.charAt(i)==vector[j]){
                    vector[j]='-';
                    contador++;
                    break;
                   }

                }
                if (contador!=i) return false;

            }

        return true;
    }
}
