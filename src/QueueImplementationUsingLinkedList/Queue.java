
package QueueImplementationUsingLinkedList;

public class Queue<L>
{
    private Node<L> front;
    private Node<L> rear;

    private int length;

    private static class Node<L>
    {
        private final L data;
        private Node<L> next;
        public Node(L data)
        {
            super();
            this.data = data;
            this.next = null;
        }
    }
    public void enQueue(L data)
    {
        if(front == null)
        {
            rear = new Node<>(data);
            front = rear;
        }
        else
        {
            rear.next = new Node<>(data);
            rear = rear.next;
        }
        length++;
    }
    public L deQueue()
    {
        if(front != null)
        {
            L result = front.data;
            front = front.next;
            length--;
            return result;
        }
        return null;
    }
    public int size()
    {
        return length;
    }
    public void displayQueue()
        {
        Node<L> currentNode = front;
        while (currentNode != null)
        {
            System.out.print(currentNode.data+"  ");
            currentNode = currentNode.next;
        }
        }
        public static void main(String[]args)
        {
            Queue<Integer> queue = new Queue<>();

            queue.enQueue(11);
            queue.enQueue(22);
            queue.enQueue(33);
            queue.enQueue(54);
            queue.enQueue(65);
            queue.enQueue(42);

            queue.displayQueue() ;

            System.out.println("\n Size of the Queue::" + queue.size());
            System.out.println("An item dequeued ::" + queue.deQueue());//First come in first out
        }
}
