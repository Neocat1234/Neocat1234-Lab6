import java.util.Random;

public class ThingList {
    private Node head;

    private class Node {
        Thing d;
        Node next;

        Node(Thing talk) {
            d = talk;
            next = null;
        }
    }

    public void addThing(Thing t) {
        Node newnode1 = new Node(t);
        newnode1.next = head;
        head = newnode1;
    }

    public void moveAll(Random random1) {
        Node cur = head;
        while (cur != null) {
            cur.d.turnYes(random1);
            cur.d.step();
            cur = cur.next;
        }
    }

    public void printAll() {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.d.x + " at " + cur.d.retrive());
            cur = cur.next;
        }
    }
}