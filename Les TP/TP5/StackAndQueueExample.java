import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class StackAndQueueExample {
    public static void main(String[] args) {
        // Utilisation d'une pile pour inverser une chaîne de caractères
        String inputString = "Hello, World!";
        String reversedString = reverseStringUsingStack(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);

        // Utilisation d'une file pour simuler un traitement par ordre d'arrivée
        simulateQueueProcessing();
    }

    // Fonction pour inverser une chaîne de caractères en utilisant une pile
    static String reverseStringUsingStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    // Fonction pour simuler un traitement par ordre d'arrivée en utilisant une file
    static void simulateQueueProcessing() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Task 1");
        queue.offer("Task 2");
        queue.offer("Task 3");

        System.out.println("Processing tasks in order of arrival:");
        while (!queue.isEmpty()) {
            String task = queue.poll();
            System.out.println("Processing: " + task);
        }
    }
}
