public class Main {

    public static void main(String[] args) {

    System.out.println(verificarBalance.estaBalanceada("()"));
    System.out.println(verificarBalance.estaBalanceada("2+((3+4*[23-2{2}]+4))"));
        System.out.println(verificarBalance.estaBalanceada("((())){{{}}}[[[[]]]]"));
        System.out.println(verificarBalance.estaBalanceada("(){}(){}(}{)}({)}({)}({)}({)("));




    }



}
