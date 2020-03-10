/**
 * Stack of plates demo
 */

public class StackOfPlates {

    public static void main(String[] args) {
        SetOfStacks<Integer> plates = new SetOfStacks<>(3);
        plates.push(1); //  new pile
        plates.push(2);
        plates.push(3);
        plates.push(4); // new pile
        System.out.println(plates.pop());
        System.out.println(plates.pop()); // pile empty
        System.out.println(plates.pop());
        System.out.println(plates.pop());
        System.out.println(plates.pop()); // no plates
    }

}
