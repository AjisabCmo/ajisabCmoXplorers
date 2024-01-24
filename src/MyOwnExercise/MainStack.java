package MyOwnExercise;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<String>stack = new Stack<String>();

        stack.push("pooh");
        stack.push("cindarella");
//        stack.push("sunlight");
//        stack.push("love");
        System.out.println(stack);

        stack.pop();
        System.out.println(stack.pop());


        stack.push("sunlight");
        stack.push("love");
       System.out.println(stack);
        stack.pop();
      System.out.println(stack.pop());

    }
}
