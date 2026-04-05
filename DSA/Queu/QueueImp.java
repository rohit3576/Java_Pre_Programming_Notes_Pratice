class SimpleQueue{
    int[] queue;
    int front, rear, size, capacity;

    // Const
    SimpleQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;

    }

    // Enquee
    void enqueue(int data){
        if(size==capacity){
            System.out.println("Queue is Full");
            return;
        }
        rear = (rear+1)%capacity;
        System.out.println("Rear value "+rear);
        queue[rear] = data;
        size++;
        System.out.println(data+" added to queue");
    }
    // Dequee
    int dequeue(){
        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        int item = queue[front];
        front=(front+1)%capacity;
        System.out.println("Front value "+front);
        size--;
        return item;
    }
    
}

public class QueueImp {
    public static void main(String[] args) {
        SimpleQueue q1 = new SimpleQueue(10);

        q1.enqueue(12);
        q1.enqueue(134);
        q1.enqueue(135);

        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        
    }
}
