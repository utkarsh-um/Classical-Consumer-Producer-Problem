# Classical-Consumer-Producer-Problem
Data Structures &amp; Algorithms Course, IIT Delhi
# Problem Statement:
https://drive.google.com/file/d/1QSrAfOoT2cVWgyh3LYm_12tHGFTWqn84/view?usp=sharing
# Report for my Implementation:
PRIORITY QUEUE IMPLEMENTATION:
Enqueue:
Whenever a new node is added it is added to the last of the array and increases currentSize by 1
Dequeue:
The minimum priority value(highest priority) is chosen and its position is stored in a variable and all the nodes ahead of that position are moved one position back Hence creating a hole at the end.

Queue Implementation
Enqueue:
Whenever a new node is added it is added to the head of the array(0th index) and all the pre-existing nodes are moved one position ahead and currentsize is increased by 1
Dequeue:
To remove a node the currentSize is decreased by 1 and the last node in array is returned.

Sell() (function Seller Class):
lock.lock locks the lock acquired by the current thread.
In try block if catalog is full a seller thread must wait before proceeding hence full.await() when catalog is not full the current seller thread removes the next item from inventory and adds it to the catalog. And then signal All the waiting buyers thread via empty.signalALl() 
And the in finally unlocks the lock before exiting the sell method using lock.unlock()

Buy( (function of Buyer Class):
lock.lock locks the lock acquired by the current thread.
In try block if catalog is empty a buyer thread must wait till a seller thread fills the catalog and then seller thread proceeds and dequeues an item from the catalog and prints its priority and signals all the waiting seller threads using full.signalAll()
And in finally unlocks the lock.
