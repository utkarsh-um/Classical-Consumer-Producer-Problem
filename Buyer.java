import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Buyer<V> extends BuyerBase<V> {
    public Buyer (int sleepTime, int catalogSize, Lock lock, Condition full, Condition empty, PriorityQueue<V> catalog, int iteration) {
        //TODO Complete the Buyer Constructor method
        // ...
        this.catalog=catalog;
        this.lock=lock; 
        this.full=full;
        this.empty=empty;
        
        this.setSleepTime(sleepTime);
        this.setIteration(iteration);
    }
    public void buy() throws InterruptedException {
        lock.lock();
       
    try {
            while(catalog.isEmpty())
            {
                empty.await();
            }
        NodeBase<V> n=catalog.dequeue();
        System.out.print("Consumed "); // DO NOT REMOVE (For Automated Testing)
            n.show(); // DO NOT REMOVE (For Automated Testing)
            // ...
            full.signalAll();
            
    } catch (Exception e) {
            e.printStackTrace();
    } finally {
        
        lock.unlock();
        
                
    }
    }
}
