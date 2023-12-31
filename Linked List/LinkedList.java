public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head= newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("Linked list is empty!!!");
            return;
        }

        Node temp =head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp  = temp.next;
        }
        System.out.println();
    }

    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("Linked List is empty");
            //return Integer.MIN_VALUE;
            return -1;
        }
        else {
            int val = head.data;
            //head=tail = null;
            head=head.next;
            return val;
        }
    
    }

    public int removeLast(){
        if(size==0){
            System.out.println("Linked List is emprty");
            return -1;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next=null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key)
            {
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); 
        ll.addFirst(10);
        //ll.print();
        ll.addFirst(20);
        //ll.print();
        ll.addFirst(30);
        //ll.print();
        ll.addLast(40);
        ll.print();
        ll.addMiddle(0, 25);
        ll.print();
        System.out.println(ll.size);
        //ll.removeFirst();
        ll.removeLast();
        ll.print();
        System.out.println(ll.itrSearch(15));
    }
}