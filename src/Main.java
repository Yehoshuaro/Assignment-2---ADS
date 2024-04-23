import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            reverseStack(stack);
            insert_at_Bottom(stack, top);
        }
    }
    private static void insert_at_Bottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            insert_at_Bottom(stack, stack.pop());
            stack.push(item);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] elements = input.split("\\s+");

        Stack<Integer> stack = new Stack<>();
        for (String element : elements) {
            stack.push(Integer.parseInt(element));
        }

        reverseStack(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}




