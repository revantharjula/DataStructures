package QueueDS;

public class QueueMain {

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.insert(6);
        q.insert(6);
        q.insert(6);
        q.insert(6);
        q.insert(6);
        q.insert(6);
        q.insert(6);
        q.insert(6);
        q.insert(6);
        q.view();
    }
}
