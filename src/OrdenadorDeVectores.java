public class OrdenadorDeVectores {
    public static int[] ordenar ( int[] vector){
        int candidatoAMinimo;
        int posicionDeCandidato;
        for (int i = 0; i < vector.length; i++) {
            candidatoAMinimo= vector[i];
            posicionDeCandidato = i;

            for (int j = i; j < vector.length; j++) {

                if (vector[j]<candidatoAMinimo){
                    candidatoAMinimo=vector[j];
                    posicionDeCandidato=j;
                }

            }

            int auxiliar = vector[posicionDeCandidato];
            vector[posicionDeCandidato]=vector[i];
            vector[i]=auxiliar;



        }

    return vector;
    }

}
