// This class implements the Queue
public class Queue<V> implements QueueInterface<V>{

    //TODO Complete the Queue implementation
    private NodeBase<V>[] queue;
    private int capacity, currentSize, front, rear;
    
    public Queue(int capacity) {   
        this.capacity=capacity;
        this.currentSize=0;
        queue=new Node[capacity];
        
    
    }

    public int size() {
        return currentSize;
    }

    public boolean isEmpty() {
        if(currentSize==0)
            return true;
        else
            return false;
    }
    
    public boolean isFull() {
         if(currentSize==capacity)
             return true;
         else
             return false;

    
    }

    public void enqueue(Node<V> node) {
        
            
        if(this.isFull()!=true){
        for(int i=currentSize-1;i>=0;i--)
            queue[i+1]=queue[i];
        queue[0]=node;
        currentSize++;
        }
    
    }

    public NodeBase<V> dequeue() {
        NodeBase<V> rnode=null;
        if(this.isEmpty()!=true){
        rnode=queue[currentSize-1];
        currentSize--;}
        return rnode;
    
    }

}

