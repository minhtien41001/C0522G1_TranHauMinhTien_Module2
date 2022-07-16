package ss_11_stack_queue.thuc_hanh.practice2;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            return true;
        }
        return status;
    }

    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            return true;
        }
        return status;
    }

    public void enqueue(){
        if (isQueueFull()){
            System.out.println("Underflow");
        }
    }
}
