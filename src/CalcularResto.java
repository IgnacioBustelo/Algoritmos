public class CalcularResto {
    public static int restoDeDividirXporY(int x,int y){

        while (x>0){
            x=x-y;
        }
        if (x==0)
            return 0;
        else
        return x+y;
    }
}
