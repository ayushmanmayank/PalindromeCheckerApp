public class UC6 import java.util.*;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters to queue and stack
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            queue.offer(ch);   // enqueue
            stack.push(ch);    // push
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        for(int i = 0; i < input.length(); i++){
            char qChar = queue.poll();  // dequeue
            char sChar = stack.pop();   // pop

            if(qChar != sChar){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}{
}
