package problem_solving.Div2;

import java.util.Scanner;
import java.util.Stack;

public class RegularBracketSequence {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();
        String bracket= in.next();
        int length=0;

        for (int i = 0; i < bracket.length(); i++) {
            if (bracket.charAt(i) == '('){
                stack.push('(');
            }else {
                if (!stack.isEmpty()){
                    stack.pop();
                    length+=2;
                }
            }
        }

        System.out.println(length);
    }
}
