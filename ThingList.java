import java.util.Random;

public class ThingList {
    private Node head;

    private class Node {
        Thing data;
        Node next;

        Node(Thing t) {
            data = t;
            next = null;
        }
    }

    public void addThing(Thing t) {
        Node n = new Node(t);
        n.next = head;
        head = n;
    }

    public void moveAll(Random rand) {
        Node cur = head;
        while (cur != null) {
            cur.data.turnYes(rand);
            cur.data.step();
            cur = cur.next;
        }
    }

    public void printAll() {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data.lab + " at " + cur.data.retrive());
            cur = cur.next;
        }
    }
}