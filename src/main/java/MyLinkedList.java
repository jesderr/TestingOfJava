public class MyLinkedList {
    private int size = 0;
    private Node root = null;
    private Node head = null;

    public void add(int value) {
        if (root == null) {
            Node node = new Node(value, null);
            this.root = node;
            this.head = this.root;
        } else {
            Node node = new Node(value, null);
            Node newHead = head;
            newHead.next = node;
            head = node;
        }
        size++;
    }

    public int get(int value) {
        Node curRoot = root;
        while(curRoot.value != value){
            curRoot = curRoot.next;
        }
        return value;
    }


    public boolean delete(int value) {
        Node curRoot = root;
        Node prev = curRoot;
        if(curRoot.value == value){
            root = root.next;
            return true;
        }
        while(curRoot != null){
            if(curRoot.value == value){
                prev.next = curRoot.next;
                curRoot = null;
                size--;
                return true;
            }
            prev = curRoot;
            curRoot =curRoot.next;
        }

        return false;
    }

    public int size() {
        return size;
    }

    public boolean contains(int value) {
        Node curRoot = root;
        while(curRoot != null){
            if(curRoot.value == value){
                return true;
            }
            curRoot = curRoot.next;
        }
        return false;
    }

    public void print() {
        Node curRoot = root;
        while(curRoot.next != null){
            System.out.print(curRoot.value + " ");
            curRoot = curRoot.next;
        }
        System.out.print(curRoot.value + "\n");
    }
}
