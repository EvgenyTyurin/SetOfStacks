import java.util.Stack;

/**
 * Some piles of plates relized via stack of stacks (piles)
 * @param <T>
 */

public class SetOfStacks<T> {

    int threshold; // maximum pile size
    Stack<Stack<T>> piles = new Stack<>(); // piles

    public SetOfStacks(int threshold) {
        this.threshold = threshold;
    }

    public void push(T plate) {
        if (piles.empty() || piles.peek().size() >= threshold) {
            System.out.println("New pile on " + plate);
            piles.push(new Stack<T>());
        }
        piles.peek().push(plate);
    }

    public T pop() {
        if (piles.peek().empty()) {
            piles.pop();
            if (piles.size() == 0) {
                System.out.println("No plates!!!");
                return null;
            }
            System.out.println("Pile empty before " + piles.peek().peek());
        }
        return piles.peek().pop();
    }

}
