// Use this driver for the testing the correctness of your priority queue implementation
// You can change the add, remove sequence to test for various scenarios.
public class PriorityQueueTestDriver {
    public static void main(String[] args) {
	PriorityQueue<String> pq = new PriorityQueue<String>(1);
	
	
	//pq.display();
	int size = pq.size();
	for (int i=0; i<5; i++) {
		String s=Character.toString((char)(i+97));	
		pq.enqueue(new Node<String>(i,s));
            Node<String> n = (Node<String>) pq.dequeue();
            System.out.println(n.getValue());

	}
    }
}
