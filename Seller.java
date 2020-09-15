import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Seller<V> extends SellerBase<V> {
    
    public Seller (int sleepTime, int catalogSize, Lock lock, Condition full, Condition empty, PriorityQueue<V> catalog, Queue<V> inventory) {
        this.setSleepTime(sleepTime);
        this.catalog=catalog;
        this.inventory=inventory;
        this.full=full;
        this.empty=empty;
        this.lock=lock;
        
    }
    
    public void sell() throws InterruptedException {
        
        lock.lock();
        
        
    try {
        while(catalog.isFull())

        {
            full.await();
        }
        if(inventory.isEmpty()!=true)
        {catalog.enqueue((Node<V>) inventory.dequeue());
        empty.signalAll();}
    } catch(Exception e) {
            e.printStackTrace();
    } finally {
        
        lock.unlock();
    }       
    }
}
