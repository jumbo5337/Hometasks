package Java1.structure;


import Java1.structure.Exceptions.StackOverFlowException;
import Java1.structure.Exceptions.EmptyStackException;

public class Stack {
    private List stack = new List();
    private int value = 0;

    public void push() throws StackOverFlowException {
        if (value == 12) {
            throw new StackOverFlowException();
        }
        stack.add(value);
        value++;
    }

    public void pull() throws EmptyStackException {
        if (value == 0) {
            throw new EmptyStackException();
        }
        stack.remove(value);
        value--;
    }

    public void print() {
        System.out.println(stack.toString());
    }

}
