package problem_solving.Div2;

import java.util.Scanner;
import java.util.Stack;

public class ReplaceToMakeRegularBracketSequence {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();
        String bracket= in.next();
        int changes=0;

        for (int i = 0; i < bracket.length(); i++) {
            if (bracket.charAt(i) == '<' || bracket.charAt(i) == '(' ||
                    bracket.charAt(i) == '{' || bracket.charAt(i) == '['){
                stack.push(bracket.charAt(i));
            }else {
                if (stack.isEmpty()){
                    System.out.println("Impossible");
                    return;
                }else {
                    if (!isMatch(stack.peek(),bracket.charAt(i))){
                        changes++;
                    }
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
            System.out.println(changes);
        }else {
            System.out.println("Impossible");
        }
    }

    public static boolean isMatch(char openBracket,char closeBracket){
        if (openBracket == '(' && closeBracket == ')'){
            return true;
        }else if (openBracket == '<' && closeBracket == '>'){
            return true;
        }else if (openBracket == '{' && closeBracket == '}'){
            return true;
        }else return openBracket == '[' && closeBracket == ']';
    }
}
