public class QueueUsingLinkedListMain
{
    private Node front, rear;
    private int currentSize; // number of items

    //class to define linked node
    private class Node
    {
        int data;
        Node next;
    }

    //Zero argument constructor
    public QueueUsingLinkedListMain()
    {
        front = null;
        rear = null;
        currentSize = 0;
    }

    public boolean isEmpty()
    {
        return (currentSize == 0);
    }

    //Remove item from the beginning of the list.
    public int dequeue(int i)
    {
        int data = front.data;
        front = front.next;
        if (isEmpty())
        {
            rear = null;
        }
        currentSize--;
        System.out.println(data);
        return data;
    }

    //Add data to the end of the list.
    public void enqueue(int data)
    {
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if (isEmpty())
        {
            front = rear;
        }
        else
        {
            oldRear.next = rear;
        }
        currentSize++;
        System.out.println(data);
    }
    public static void main(String a[]){

        QueueUsingLinkedListMain queue = new QueueUsingLinkedListMain();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println(queue);



    }
}
