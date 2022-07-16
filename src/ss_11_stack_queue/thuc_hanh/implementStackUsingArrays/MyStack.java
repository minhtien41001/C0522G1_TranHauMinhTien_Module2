package ss_11_stack_queue.thuc_hanh.implementStackUsingArrays;

public class MyStack {
    private int array[];
    private int size;
    private int index =0;

    public MyStack(int size){
        this.size = size;
        array = new int[size];
    }

    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack is full");
        }
        array[index] = element;
        index++;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is full");
        }
        return array[--index];
    }

    public int size(){
        return index;
    }

    public boolean isEmpty(){
        if (index == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if (index == size){
            return true;
        }
        return false;
    }
}
