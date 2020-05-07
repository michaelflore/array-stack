import java.util.Scanner;

public class PrimeFactorDemo {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            ArrayStack<Integer> stack = new ArrayStack<>();

            System.out.println("Enter a number to find its prime factorization: ");
            int n = reader.nextInt();

            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    stack.push(i);
                    n /= i;
                }
            }

            if(!stack.isEmptyStack()) {
                System.out.print(stack.peek());
                stack.pop();
            }

            while(!stack.isEmptyStack()) {
                System.out.print(" * " + stack.peek());
                stack.pop();
            }
        }
        catch(StackOverflowException soe) {
            System.out.println(soe);
        }
        catch(StackUnderflowException sue) {
            System.out.println(sue);
        }
        catch(StackException se) {
            System.out.println(se);
        }
    }
}
