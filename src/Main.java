import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        //String s = "ab##", t = "c#d#";
        //String s = "a#c", t = "b";
        //String s = "y#fo##f", t = "y#f#o##f";

        // normal
        System.out.print(backspaceCompare(s,t));
    }

    // normal solution
    public static boolean backspaceCompare(String s, String t) {
        return removeCharactersNorm(s).equals(removeCharactersNorm(t));
    }

    public static Stack<Character> removeCharactersNorm(String input){
        Stack <Character> stack = new Stack<>();

        for (int i=0; i<input.length(); i++){
            if (input.charAt(i) == '#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else {
                stack.push(input.charAt(i));
            }
        }
        return stack;
    }
}