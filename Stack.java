public class Stack {
    class Node {
        Node next;
        String value;

        Node(String value) {
            this.value = value;
        }
    }

    Node top;
    int length;

    public void GetLength() {
        System.out.println("Length: " + length);
    }

    public void PrintStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void Push(String value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        length++;
    }

    public void Pop() {
        Node temp = top;
        top = temp.next;
        temp.next = null;
        length--;
    }

    public Node Peek() {
        return top;
    }
}
