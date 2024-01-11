package aliPackage;


public class Queue
{
    /* Member variable declaration */
    private final int maxSize;
    private final int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;
    /* Constructor */
    public Queue(int size)
    {
        this.maxSize = size;
        this.queueArray = new int[size];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }
    /* Queue:Insert Operation */
    public void insert(int item)
    {
        /* Checks whether the queue is full or not */
        if(isQueueFull())
        {
            System.out.println("Queue is full!");
            return;
        }
        if(rear == maxSize - 1)
        {
            rear = -1;
        }
        /* increment rear then insert element to queue */
        queueArray[++rear] = item;
        currentSize++;
        System.out.println("Item added to queue: " + item);
    }
    /* Queue:Delete Operation */
    public int delete()
    {
        /* Checks whether the queue is empty or not */
        if(isQueueEmpty())
        {
            throw new RuntimeException("Queue is empty");
        }
        /* retrieve queue element then increment */
        int temp = queueArray[front++];
        if(front == maxSize)
        {
            front = 0;
        }
        currentSize--;
        return temp;
    }
    /* Queue:Peek Operation */
    public int peek()
    {
        return queueArray[front];
    }
    /* Queue:isFull Operation */
    public boolean isQueueFull()
    {
        return (maxSize == currentSize);
    }
    /* Queue:isEmpty Operation */
    public boolean isQueueEmpty()
    {
        return (currentSize == 0);
    }

}


