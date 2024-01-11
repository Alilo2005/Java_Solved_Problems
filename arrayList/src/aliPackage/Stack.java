package aliPackage;

import java.util.ArrayList;

public class Stack {
    private int currentSize;
    private final ArrayList<Integer> stackArray;
    public Stack(){
        this.stackArray = new ArrayList<>();
        this.currentSize = 0;
    }

    public void push(Integer item)
    {
        this.stackArray.add(item);
        this.currentSize++;
        System.out.println("Item added to stack: " + item);
    }
    public int pop()
    {
        if(stackArray.isEmpty())
        {
            throw new RuntimeException("Stack is empty");
        }
            int temp = this.stackArray.remove(currentSize - 1);
            this.currentSize--;
            return temp;
    }
    public int peek()
    {
        if(stackArray.isEmpty())
        {
            throw new RuntimeException("Stack is empty");
        }
            return stackArray.get(currentSize - 1);
    }


}
