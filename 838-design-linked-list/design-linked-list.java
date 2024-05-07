class MyLinkedList {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
           
        }
    }

    Node head;
    int size;

    public MyLinkedList() {
      
        size = 0;
    }
    public int get(int index) {
        Node temp = head;
        if (index < 0 || index >= size) return -1;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }
public void addAtTail(int val) {
    Node temp = new Node(val);
    if (head == null) {
        head = temp;
    } else {
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
    }
    size++;
}

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return; // Invalid index

        Node newNode = new Node(val);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node prev = head;
            for (int i = 0; i < index-1; i++) {
                prev = prev.next;
            }
            newNode.next  = prev.next;
         prev.next=newNode;
        }
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return; // Invalid index

        if (index == 0) {
            head = head.next; // Move head to the next node
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next; // Skip the node to be deleted
        }
        size--;
    }
}
