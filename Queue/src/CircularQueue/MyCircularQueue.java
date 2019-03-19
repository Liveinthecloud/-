package CircularQueue;
class MyCircularQueue {
    /** Initialize your data structure here. Set the size of the queue to be k. */
    int [] queue=null;
    int head=-1;
    int tail=-1;
    int size=0;

    public MyCircularQueue(int k) {
        queue=new int [k];
        size=queue.length;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        if(head==-1)
            head=0;
        tail=(tail+1)%size;
        queue[tail]=value;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (!isEmpty()){
            head=(head+1)%size;
            if (head==tail){
                head=-1;
                tail=-1;
                size=0;
            }
            return true;
        }

        return false;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return queue[head];
        }
        return -1;
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()){
            return queue[tail];
        }
        return -1;
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        /*if(head==-1)
            return true;
        return false;*/
        return head==-1;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        /*if(head==(tail+1)%size){
            return true;
        }
        return false;*/

        return (head==(tail+1)%size);
    }
    public static void main(String[] arge){
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3


        System.out.println(circularQueue.enQueue(1));
        System.out.println(circularQueue.enQueue(2));
        System.out.println(circularQueue.enQueue(3));
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
        System.out.println(circularQueue.isFull());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
