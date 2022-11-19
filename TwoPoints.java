import java.util.Scanner;
public class TwoPoints {
    public Node head = null;
    public Node tail = null;
    public class Node{
        int val;
        Node next;
        public Node(int data) {
            this.val = data;
        }
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    public int computePointOfInterception(int x, int y) {
        Node temp1=head,temp2=head;
        while(temp1.val!=x) {
            temp1=temp1.next;
        }
        while(temp2.val!=y) {
            temp2=temp2.next;
        }
        while(temp1!=temp2) {
            temp1=temp1.next;
            temp2=temp2.next.next;
        }
        return temp1.val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        TwoPoints ob = new TwoPoints();
        for(int i=1;i<=12;i++)
            ob.add(i);
        System.out.println(ob.computePointOfInterception(x,y));
    }
    }
