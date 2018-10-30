import java.util.Stack;

public class verificarBalance {

    public static boolean estaBalanceada(String expresion) {
        Stack<Character> pila = new Stack<Character>();
        char poped;
        for (int i = 0; i <= expresion.length()-1 ; i++) {

            switch (expresion.charAt(i)) {
                case '(':
                    pila.push('(');
                    break;
                case '[':
                    pila.push('[');
                    break;
                case '{':
                    pila.push('{');
                    break;
                case ')':
                    if (pila.empty()){
                        return false;
                    }
                   poped= pila.pop();
                   if (!(poped=='(')){
                       return false;
                }
                    break;
                case ']':
                    if (pila.empty()){
                        return false;
                    }
                    poped= pila.pop();
                    if (!(poped=='[')){
                        return false;
                    }
                    break;
                case '}':
                    if (pila.empty()){
                        return false;
                    }
                    poped=pila.pop();

                    if (!(poped=='{')){
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        return pila.empty();
    }}

