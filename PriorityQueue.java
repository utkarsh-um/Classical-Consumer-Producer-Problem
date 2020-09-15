
public class PriorityQueue<V> implements QueueInterface<V>{

    private NodeBase<V>[] queue;
    private int capacity, currentSize;
	
   
    public PriorityQueue(int capacity) {    
        this.capacity=capacity;
        currentSize=0;
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
    		
    	
        
        queue[currentSize]=node;
        currentSize++;

    	}
    }

    // In case of priority queue, the dequeue() should 
    // always remove the element with minimum priority value
    public NodeBase<V> dequeue() {  
        
        NodeBase<V> rnode=null;
        
        	
        	if(this.isEmpty()!=true)
        	{
        		int pos=0,pri=queue[0].getPriority();
        for(int i=0;i<currentSize;i++)
        {
            if(pri>queue[i].getPriority())
            {
                pos=i;
                pri=queue[i].getPriority();
            }

        }
        rnode=queue[pos];
        for(int i=pos;i<currentSize-1;i++)
            queue[i]=queue[i+1];
        currentSize--;
        }
        
        return rnode;
    }

    public void display () {
	if (this.isEmpty()) {
            System.out.println("Queue is empty");
	}
	for(int i=0; i<currentSize; i++) {
            queue[i].show();
	}
    }
}

