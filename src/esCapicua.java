public class esCapicua {

    public static boolean seraCapicua(String palabra){

        for (int i = 1; i <palabra.length()/2 ; i++) {
              if (!(palabra.charAt(i-1)==palabra.charAt(palabra.length()-i))){
                return false;
            }

        }
        return true;
    }
}
